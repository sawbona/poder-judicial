/**
* Nombre del Programa : ProgramaDAO.java
* Autor                            : AntonioBV
* Compania                    : Ultrasist
* Proyecto                      : NSJP                    Fecha: 26/01/2012
* Marca de cambio        : N/A
* Descripcion General    : Describir el objetivo de la clase de manera breve
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
package mx.gob.segob.nsjp.dao.programa;

import mx.gob.segob.nsjp.comun.excepcion.NSJPNegocioException;
import mx.gob.segob.nsjp.dao.base.GenericDao;
import mx.gob.segob.nsjp.model.Programa;

import org.springframework.stereotype.Repository;

/**
 * 
 * Acceso a la información de Programa
 * 
 * @version 1.0
 * @author AntonioBV
 *
 */
@Repository
public interface ProgramaDAO extends GenericDao<Programa, Long> {
		
	/**
	 * M&eacute;todo que consulta un Programa por id
	 * @return Programa
	 * @throws NSJPNegocioException
	 */
	public Programa consultarProgramaPorId(Programa programa)throws NSJPNegocioException;
		
}
