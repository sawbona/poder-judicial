package mx.gob.segob.nsjp.ws.cliente.solicitudtranscripcion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2011-09-05T14:57:38.678-05:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://ws.service.nsjp.segob.gob.mx/", name = "RegistrarSolicitudTranscripcionAreaExternaExporter")
@XmlSeeAlso({ObjectFactory.class})
public interface RegistrarSolicitudTranscripcionAreaExternaExporter {

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.service.nsjp.segob.gob.mx/RegistrarSolicitudTranscripcionAreaExternaExporter/registrarSolicitudTranscripcionRequest", output = "http://ws.service.nsjp.segob.gob.mx/RegistrarSolicitudTranscripcionAreaExternaExporter/registrarSolicitudTranscripcionResponse", fault = {@FaultAction(className = NSJPNegocioException_Exception.class, value = "http://ws.service.nsjp.segob.gob.mx/RegistrarSolicitudTranscripcionAreaExternaExporter/registrarSolicitudTranscripcion/Fault/NSJPNegocioException")})
    @RequestWrapper(localName = "registrarSolicitudTranscripcion", targetNamespace = "http://ws.service.nsjp.segob.gob.mx/", className = "mx.gob.segob.nsjp.ws.cliente.solicitudtranscripcion.RegistrarSolicitudTranscripcion")
    @WebMethod
    @ResponseWrapper(localName = "registrarSolicitudTranscripcionResponse", targetNamespace = "http://ws.service.nsjp.segob.gob.mx/", className = "mx.gob.segob.nsjp.ws.cliente.solicitudtranscripcion.RegistrarSolicitudTranscripcionResponse")
    public mx.gob.segob.nsjp.ws.cliente.solicitudtranscripcion.SolicitudTranscripcionWSDTO registrarSolicitudTranscripcion(
        @WebParam(name = "arg0", targetNamespace = "")
        mx.gob.segob.nsjp.ws.cliente.solicitudtranscripcion.SolicitudTranscripcionWSDTO arg0
    ) throws NSJPNegocioException_Exception;
}