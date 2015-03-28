<%@page import="mx.gob.segob.nsjp.web.login.action.LoginAction"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	
	<link type="text/css" rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/jquery.windows-engine.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/layout_complex.css" media="screen" />
	<link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/resources/css/jquery-ui.css" />
	<link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/resources/css/treeview/jquery.treeview.css" />
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/estilos.css" media="screen" />
	<link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath()%>/resources/css/jqgrid/ui.jqgrid.css" />
	<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/css/ui-lightness/jquery-ui-1.8.11.custom.css" />
	
	<script type="text/javascript" src="<%= request.getContextPath()%>/resources/js/jquery-1.5.1.js"></script>
	<script type="text/javascript" src="<%= request.getContextPath()%>/resources/js/jquery-ui-1.8.10.custom.js"></script>
	<script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/jquery.windows-engine.js"></script>
	<script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/jquery.layout-1.3.0.js"></script>
	<script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/layout_complex.js"></script>
	<script type="text/javascript" src="<%= request.getContextPath()%>/resources/js/jquery.treeview.js"></script>
	<script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/reloj.js"></script>
	<script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/jqgrid/i18n/grid.locale-en.js"></script>
	<script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/jqgrid/jquery.jqGrid.js"></script>
	
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/bloqueaTecla.js"></script>
	
	<script type="text/javascript">
	var sesionActiva = '<%= (request.getSession().getAttribute(LoginAction.KEY_SESSION_USUARIO_FIRMADO)!=null)%>';
	if(sesionActiva=="false"){
	//alert(sesionActiva);
	document.location.href="<%= request.getContextPath()%>/Logout.do";
	}
	var outerLayout, innerLayout;
	
	$(document).ready(function() {
		outerLayout = $("body").layout( layoutSettings_Outer );

		$("#accordionmenuprincipal").accordion({  fillSpace: true });
		$("#accordionmenuderprincipal").accordion({ fillSpace: true});		
		//$("#seccion1tree").treeview();
		//$("#seccion2tree").treeview();
		//$("#seccion3tree").treeview();
		//$("#seccion4tree").treeview();
		//$("#seccion5tree").treeview();
		muestraGadgets();
									
		/*******************************
		 ***  CUSTOM LAYOUT BUTTONS  ***
		 *******************************
		 *
		 * Add SPANs to the east/west panes for customer "close" and "pin" buttons
		 *
		 * COULD have hard-coded span, div, button, image, or any element to use as a 'button'...
		 * ... but instead am adding SPANs via script - THEN attaching the layout-events to them
		 *
		 * CSS will size and position the spans, as well as set the background-images
		 */

		// BIND events to hard-coded buttons in the NORTH toolbar
		outerLayout.addToggleBtn( "#tbarBtnHeaderZise", "north" );

		// save selector strings to vars so we don't have to repeat it
		// must prefix paneClass with "body > " to target ONLY the outerLayout panes
		var westSelector = "body > .ui-layout-west"; // outer-west pane
		var eastSelector = "body > .ui-layout-east"; // outer-east pane

		 // CREATE SPANs for pin-buttons - using a generic class as identifiers
		$("<span></span>").addClass("pin-button").prependTo( westSelector );
		$("<span></span>").addClass("pin-button").prependTo( eastSelector );

		// BIND events to pin-buttons to make them functional
		outerLayout.addPinBtn( westSelector +" .pin-button", "west");
		outerLayout.addPinBtn( eastSelector +" .pin-button", "east" );

		 // CREATE SPANs for close-buttons - using unique IDs as identifiers
		$("<span></span>").attr("id", "west-closer" ).prependTo( westSelector );
		$("<span></span>").attr("id", "east-closer").prependTo( eastSelector );

		// BIND layout events to close-buttons to make them functional
		outerLayout.addCloseBtn("#west-closer", "west");
		outerLayout.addCloseBtn("#east-closer", "east");
		createInnerLayout () ;
					
			$("#controlAgenda").click(creaAgenda);
			//$("#buscarCaso").click(buscarCaso);	
			//$("#buscarExpediente").click(buscarExpediente);
			//$('#casos li').click(agregaExpediente);		
			//$("#tbarBtnNuvaDenuncia").click(nuevaDenuncia);	
			//$('#casos1 li').click(justiciaRestaurativa);	
			//$("#generarDocumento").click(generarDocumentoViwe);
			//$("#entrevista").click(generaCapturaEntrevista);
				
		
		//agregamos el click para redireccionar a la valoracion de hechos
		//$("#hrefHechos").click(realizarValoracionHechos);	
		//$("#hrefAdminAsigAbogadoDef").click(administrarAsignacionAbogadoDefensor);
		//$("#hrefAdminProcJustRestaurativa").click(administrarProcuracionJusticiaRestaurativa);
		//$("#hrefAtencionTemprana").click(atencionTemprana);
		//$("#hrefAtenTemAdmin").click(atencionTempranaAdministrativaView);
		//$("#hrefAtenTemPenal").click(atencionTempranaPenalView);
		//$("#hrefCarpetaInvestigacion").click(carpetaDeInvestigacionView);
		//$("#hrefCoordinadorPerito").click(coordinadorPeritaje);
		//$("#hrefDesignarAbogDefensor").click(designarAbogadoDefensorView);
		//$("#hrefIndexDefensoriaAtencionTemprana").click(indexDefensoriaAtencionTemprana);
		//$("#hrefIndexDefensoriaCoordinador").click(indexDefensoriaCoordinador);
		//$("#hrefIndexDefensoriaDefensor").click(indexDefensoriaDefensor);
		//$("#hrefIndexPoderJudicialAtencionAlPublico").click(indexPoderJudicialAtencionAlPublico);
		//$("#hrefIndexProcuraduriaAlmacenDeEvidencias").click(indexProcuraduriaAlmacenDeEvidencias);
		//$("#hrefIndexProcuraduriaEnviarNotificaciones").click(indexProcuraduriaEnviarNotificaciones);
		//$("#hrefIndexProcuraduriaView").click(indexProcuraduriaView);
		//$("#hrefJusticiaRestaurativa").click(JusticiaRestaurativa);
		//$("#hrefPerito").click(perito);
		//$("#hrefVisitaduria").click(visitaduria);

		$("#hrefEncargadoCausas").click(encargadoCausas);
		$("#hrefEncargadoSala").click(encargadoSala);
		$("#hrefEncargadoSegundaInstancia").click(encargadoSegundaInstancia);
		$("#hrefEncargadoInformatica").click(encargadoInformatica);
		$("#hrefNotificador").click(notificador);
		$("#hrefTranscriptor").click(transcriptor);
		
		});
	
		function creaAgenda() {
			$.newWindow({id:"iframewindowagenda", statusBar: true, posx:10,posy:10,width:1150,height:600,title:"Agenda", type:"iframe"});
		    $.updateWindowContent("iframewindowagenda",'<iframe src="<%= request.getContextPath() %>/InicioAgenda.do" width="1150" height="600" />');		
		}
		
	/*
	*#######################
	* INNER LAYOUT SETTINGS
	*#######################
	*
	* These settings are set in 'list format' - no nested data-structures
	* Default settings are specified with just their name, like: fxName:"slide"
	* Pane-specific settings are prefixed with the pane name + 2-underscores: north__fxName:"none"
	*/
	layoutSettings_Inner = {
		applyDefaultStyles:				false // basic styling for testing & demo purposes
	,	minSize:						50 // TESTING ONLY
	,	spacing_closed:					14
	,	north__spacing_closed:			8
	,	south__spacing_closed:			8
	,	north__togglerLength_closed:	-1 // = 100% - so cannot 'slide open'
	,	south__togglerLength_closed:	-1
	,	fxName:							"slide" // do not confuse with "slidable" option!
	,	fxSpeed_open:					1000
	,	fxSpeed_close:					2500
	,	fxSettings_open:				{ easing: "easeInQuint" }
	,	fxSettings_close:				{ easing: "easeOutQuint" }
	,	north__fxName:					"none"
	,	south__fxName:					"drop"
	,	south__fxSpeed_open:			500
	,	south__fxSpeed_close:			1000
	//,	initClosed:						true
	,	center__minWidth:				200
	,	center__minHeight:				200
	};
	/*
	*#######################
	* OUTER LAYOUT SETTINGS
	*#######################
	*
	* This configuration illustrates how extensively the layout can be customized
	* ALL SETTINGS ARE OPTIONAL - and there are more available than shown below
	*
	* These settings are set in 'sub-key format' - ALL data must be in a nested data-structures
	* All default settings (applied to all panes) go inside the defaults:{} key
	* Pane-specific settings go inside their keys: north:{}, south:{}, center:{}, etc
	*/
	var layoutSettings_Outer = {
		name: "outerLayout" // NO FUNCTIONAL USE, but could be used by custom code to 'identify' a layout
		// options.defaults apply to ALL PANES - but overridden by pane-specific settings
	,	defaults: {
			size:					"auto"
		,	minSize:				50
		,	paneClass:				"pane" 		// default = 'ui-layout-pane'
		,	resizerClass:			"resizer"	// default = 'ui-layout-resizer'
		,	togglerClass:			"toggler"	// default = 'ui-layout-toggler'
		,	buttonClass:			"button"	// default = 'ui-layout-button'
		,	contentSelector:		".content"	// inner div to auto-size so only it scrolls, not the entire pane!
		,	contentIgnoreSelector:	"span"		// 'paneSelector' for content to 'ignore' when measuring room for content
		,	togglerLength_open:		35			// WIDTH of toggler on north/south edges - HEIGHT on east/west edges
		,	togglerLength_closed:	35			// "100%" OR -1 = full height
		,	hideTogglerOnSlide:		true		// hide the toggler when pane is 'slid open'
		,	togglerTip_open:		"Close This Pane"
		,	togglerTip_closed:		"Open This Pane"
		,	resizerTip:				"Resize This Pane"
		//	effect defaults - overridden on some panes
		,	fxName:					"slide"		// none, slide, drop, scale
		,	fxSpeed_open:			750
		,	fxSpeed_close:			1500
		,	fxSettings_open:		{ easing: "easeInQuint" }
		,	fxSettings_close:		{ easing: "easeOutQuint" }
	}
	,	north: {
			spacing_open:			1			// cosmetic spacing
		,	togglerLength_open:		0			// HIDE the toggler button
		,	togglerLength_closed:	-1			// "100%" OR -1 = full width of pane
		,	resizable: 				false
		,	slidable:				false
		//	override default effect
		,	fxName:					"none"
		}
	,	south: {
			maxSize:				200
		,	togglerLength_closed:	-1			// "100%" OR -1 = full width of pane
		,	slidable:				false		// REFERENCE - cannot slide if spacing_closed = 0
		,	initClosed:				false
		}
	,	west: {
			size:					250
		,	spacing_closed:			21			// wider space when closed
		,	togglerLength_closed:	21			// make toggler 'square' - 21x21
		,	togglerAlign_closed:	"top"		// align to top of resizer
		,	togglerLength_open:		0			// NONE - using custom togglers INSIDE west-pane
		,	togglerTip_open:		"Close West Pane"
		,	togglerTip_closed:		"Open West Pane"
		,	resizerTip_open:		"Resize West Pane"
		,	slideTrigger_open:		"click" 	// default
		,	initClosed:				false
		//	add 'bounce' option to default 'slide' effect
		,	fxSettings_open:		{ easing: "" }
		,	west__onresize:		function () { $("#accordionmenuprincipal").accordion("resize"); }
		}
	,	east: {
			size:					250
		,	spacing_closed:			21			// wider space when closed
		,	togglerLength_closed:	21			// make toggler 'square' - 21x21
		,	togglerAlign_closed:	"top"		// align to top of resizer
		,	togglerLength_open:		0 			// NONE - using custom togglers INSIDE east-pane
		,	togglerTip_open:		"Close East Pane"
		,	togglerTip_closed:		"Open East Pane"
		,	resizerTip_open:		"Resize East Pane"
		,	slideTrigger_open:		"mouseover"
		,	initClosed:				false
		//	override default effect, speed, and settings
		,	fxName:					"drop"
		,	fxSpeed:				"normal"
		,	fxSettings:				{ easing: "" } // nullify default easing
		,	est__onresize:		function () { $("#accordionmenuderprincipal").accordion("resize"); }		
		}
	,	center: {
			paneSelector:			"#mainContent" 			// sample: use an ID to select pane instead of a class
		,	onresize:				"innerLayout.resizeAll"	// resize INNER LAYOUT when center pane resizes	
		,	minWidth:				200
		,	minHeight:				200
		}
	};
	
	/*
	*Listener del click para la redireccion a la valoracion de hechos
	*/
		
	function encargadoCausas()
	{
		location.href='<%= request.getContextPath()%>/EncargadoCausas.do';
	}
	
	function encargadoSala()
	{
		location.href='<%= request.getContextPath()%>/EncargadoSala.do';
	}
	
	function encargadoInformatica()
	{
		
		location.href='<%= request.getContextPath()%>/encargadoInformatica.do';
	}
	function encargadoSegundaInstancia()
	{
		
		location.href='<%= request.getContextPath()%>/encargadoSegundaInstancia.do';
	}
	function transcriptor()
	{
		
		location.href='<%= request.getContextPath()%>/transcriptor.do';
	}
	function notificador()
	{
		
		location.href='<%= request.getContextPath()%>/notificador.do';
	}
		
	</script>	
</head>

<body>
<div class="ui-layout-west">

	<div class="header">&nbsp;</div>

	<div class="content">
		<div id="accordionmenuprincipal">

			<h3><a href="#" id="hrefIndexPoderJudicialAtencionAlPublico">Atenci&oacute;n Al P&uacute;blico</a></h3>
			<div>
				&nbsp;
			</div>
			
			<h3><a href="#" id="hrefEncargadoCausas">Encargado de Causas</a></h3>
			<div>
				&nbsp;
			</div>
			
			
			<h3><a href="#" id="hrefEncargadoSala">Encargado de Sala</a></h3>
			<div>
				&nbsp;
			</div>
			<h3><a href="#" id="hrefEncargadoSegundaInstancia">Encargado de 2da Instancia</a></h3>
			<div>
				&nbsp;
			</div>
			
			<h3><a href="#" id="hrefEncargadoInformatica">Encargado de Inform&aacute;tica</a></h3>
			<div>
				&nbsp;
			</div>
			<h3><a href="#" id="hrefNotificador">Notificador</a></h3>
			<div>
				&nbsp;
			</div>			
			<h3><a href="#" id="hrefTranscriptor">Transcriptor</a></h3>
			<div>
				&nbsp;
			</div>
			
		</div>
	</div>
	
</div>

<div class="ui-layout-east">
	<div class="header">Bienvenido</div>
	<div class="content">
		<div id="accordionmenuderprincipal">
			<h4><a href="#">Datos Personales</a></h4>
			<div>			
				<center>
					<img src="<%= request.getContextPath()%>/resources/images/usuarioVertical.JPG" />
				</center>
			</div>
			<!-- <h4><a href="#">Calendario</a></h4>
			<div>
				<center>
					<a href="#"><img src="<%= request.getContextPath()%>/resources/images/calendario.JPG" width="130" height="104"></a>
				</center>
			</div>-->
			<h6><a href="#">Agenda</a></h6>
			<div>
				<center>
					<a href="#" id="controlAgenda"><img src="<%= request.getContextPath()%>/resources/images/agenda.jpg" width="130" height="104"></a>
				</center>
			</div>
			<h3><a href="#">Solicitudes</a></h3>
			<div></div>
			<h1><a href="#">Chat</a></h1>
			<div></div>
			<h1><a href="#">Clima</a></h1>
			<div></div>
		</div>
	</div>
	
</div>


<div class="ui-layout-north">
	<div class="content">
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0" background="<%=request.getContextPath()%>/resources/images/title/title13	.png">
			<tr>
            	<td width="250">
            		<img src="<%=request.getContextPath()%>/resources/images/title/poderJudicialYucatan.jpg" width="450" height="90" alt="Logo procuradur�a" />
            	</td>          

	            <td width="150" align="center"></td>
	            <td width="296" align="center"></td>
				<td width="150" align="center"><img src="<%=request.getContextPath()%>/resources/images/title/sistemaDeJusticiaPenal.png" width="100" height="100" alt="Logo sistema de justicia" /></td>
				<!--<td width="150" align="center"></td>-->
	            <td width="180" >
					<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	                	<tr>
	                 		<td width="168" height="40" colspan="2" align="center">
								<table align="center" cellpadding="2" cellspacing="2">
									<tr>
										<td><a href="#"><img src="<%=request.getContextPath()%>/resources/images/btn_head_buscar.png" width="35" height="35" alt="Bot�n Buscar General" title="Buscar" /></a></td>
										<td><a href="#"><img src="<%=request.getContextPath()%>/resources/images/btn_head_cerrarSesion.png" width="35" height="35" alt="Bot�n cerrar sesi�n" title="Cerrar Sesi�n"/></a></td>
										<td><a href="#"><img src="<%=request.getContextPath()%>/resources/images/btn_head_ayuda.png" width="35" height="35" alt="Bot�n ayuda" title="Ayuda"/></a></td>
									</tr>
								</table>
							</td>
	                  	</tr>
						<tr valign="top">
							<td  width="128" align="center">
								<div id="liveclock"></div>
							</td>
							<td width="40">
								<img src="<%=request.getContextPath()%>/resources/images/ico_reloj_grisOx.jpg" width="35" height="35" alt="Icono reloj" />
							</td>
						</tr>
					</table>            
				</td>
			</tr>
		</table>
	</div>
	<ul class="toolbar">
		<div id="menu_head" style="display: none;">
			<li id="tbarBtnHeaderZise" class="first"><span></span></li>
			<li id="tbarBtnNuevo" class="first"><span></span>Nuevo</li>
			<li id="tbarBtnLectura"><span></span>Lectura</li>
			<li id="tbarBtnImpresoras"><span></span>Impresoras</li>
			<li id="tbarBtnNuvaDenuncia"><span></span>Nueva Denuncia</li>
			<li id="buscarExpediente" ><span></span>Buscar Expediente</li>
			<li id="buscarCaso" ><span></span>Buscar Caso</li>
			<li id="generarDocumento">Generar Documento</li>
		</div>
		<div id="menu_config">
			<li><a href="#">config01</a></li>
			<li><a href="#">config02</a></li>
			<li><a href="#">config03</a></li>
			<li class="last"><a href="#">config04</a></li>
		</div>
	</ul>
</div>


<div class="ui-layout-south">
	<div id="pie" align="center" style="background-color ;background-position:center top; color: #FFFFFF; background-color: #4A5C68">
		<div id="footer" style="width: 720px;  padding: 5px;" >
			Direcci&oacute;n de la Instituci&oacute;n
		</div> 
	</div>
</div>


<div id="mainContent">
	<div class="ui-layout-center">
		<div class="ui-layout-content">
		<div id="divTurno">
			
			</div>
			<div id="divDatos">
				<div class="ui-layout-north">
					<table id="gridDetalleFrmPrincipal"></table>
					<div id="pager1"></div>
				</div>
				<div class="ui-layout-north">
					<table>
						<tr>
							
						</tr>
					</table>
					
				</div>
				
			</div>
		</div>
	</div>
</div>
</body>
</html>
