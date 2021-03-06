package mx.gob.segob.nsjp.delegate.agenda;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import mx.gob.segob.nsjp.comun.enums.documento.Periodicidad;
import mx.gob.segob.nsjp.comun.excepcion.NSJPNegocioException;
import mx.gob.segob.nsjp.dto.medida.FechaCompromisoDTO;

/**
 * Contrato de Delegate para la Agenda
 * @version 1.0
 * @author Marco Gallardo
 *
 */

public interface AgendaDelegate {
	
	/**
	 * Operación que permite generar la calendarización de acuerdo a un rango de fechas, un periodo y opcionalmente los dias de un periodo
	 * @param fechaInicio : Fecha de inicio de la calendarización
	 * @param fechaFin : Fecha fin de la calendarización
	 * @param periodo : Enum de Periodicidad para especificar la periodicidad que se generara en la calendarización
	 * @param idMedida : El id de la medida a la cual se generará la calendarización
	 * @param idUsuarioLoggeado :El id del usuario actual del sistema 
	 * @return List<Date> : Lista de periodos en fechas.
	 * @throws NSJPNegocioException
	 */
	
	public List<FechaCompromisoDTO> generarCalendarizacion(Calendar fechaInicio, Calendar fechaFin,
			Periodicidad periodo, Long idMedida, Long idUsuarioLoggeado) throws NSJPNegocioException;
	
	/**
	 * Operación que Consulta la calendarización de una medida especifica
	 * @param idMedida : El id de la medida a consultar 
	 * @return FechaCompromisoDTO : Calendarizacion de Fechas de la medida
	 * @throws NSJPNegocioException
	 */
	public List<FechaCompromisoDTO> consultarCalendarizacionPorMedidaId(Long idMedida) throws NSJPNegocioException;
	
	/**
	 * Operación que Consulta la Calendarización con la fecha reciente, la anterior y la siguiente, solo regresa 3 registros de calendarizacion
	 * @param idMedida : El id de la medida a consultar 
	 * @return List<FechaCompromisoDTO> : 3 Registros de calendarizacion
	 * @throws NSJPNegocioException
	 */
	List<FechaCompromisoDTO> consultarCalendarizacionPorMedidaIdReducido(Long idMedida) throws NSJPNegocioException;
	
	/**
	 * Operación que actualiza el campo de fecha cumplimiento para notificar que se cumplio la asistencia en una Medida cautelar o alternativa
	 * @param fechaCompromiso : FechaCompromisoDTO se deben setear los campos fechaCompromisoId y fechaCumplimiento  
	 * @throws NSJPNegocioException
	 */
	void actualizarFechaCumplimiento(FechaCompromisoDTO fechaCompromiso) throws NSJPNegocioException;
		
}
