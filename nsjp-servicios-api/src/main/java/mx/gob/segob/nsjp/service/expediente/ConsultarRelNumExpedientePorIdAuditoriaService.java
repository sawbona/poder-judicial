/**
* Nombre del Programa : ConsultarRelNumExpedientePorIdAuditoriaService.java
* Autor                            : Hugo Serrano
* Compania                    : Ultrasist
* Proyecto                      : NSJP                    Fecha: 27 09 2011
* Marca de cambio        : N/A
* Descripcion General    : Contrato del servicio de Consultar Expedientes por etapa
* en base al area y al usuario logueado en el sistema
* Programa Dependiente  :N/A
* Programa Subsecuente :N/A
* Cond. de ejecucion        :N/A
* Dias de ejecucion          :N/A                             Horario: N/A
*                              MODIFICACIONES
*------------------------------------------------------------------------------
* Autor                       :N/A
* Compania               :N/A
* Proyecto                 :N/A                                 Fecha: N/A
* Modificacion           :N/A
*------------------------------------------------------------------------------
*/
package mx.gob.segob.nsjp.service.expediente;

import mx.gob.segob.nsjp.comun.excepcion.NSJPNegocioException;
import mx.gob.segob.nsjp.dto.expediente.RelNumExpedienteAuditoriaDTO;

public interface ConsultarRelNumExpedientePorIdAuditoriaService {

	/**
	 * Permite consultar RelNumExpedienteAuditoria en base a un numero de auditoria
	 * @param idAuditoria: Identificador del identificador del numero de auditoria (Numero de expediente)
	 * @return RelNumExpedienteAuditoria
	 * @throws NSJPNegocioException
	 */
    public RelNumExpedienteAuditoriaDTO consultarRelacionPorIdAuditoria(Long idAuditoria) throws NSJPNegocioException;
    
}

