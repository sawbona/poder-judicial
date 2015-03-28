/**
* Nombre del Programa : EmbarcacionDAOImpl.java
* Autor                            : Tattva-IT
* Compania                    : Ultrasist
* Proyecto                      : NSJP                    Fecha: 10 May 2011
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
package mx.gob.segob.nsjp.dao.objeto.impl;


import org.springframework.stereotype.Repository;
import mx.gob.segob.nsjp.dao.base.impl.GenericDaoHibernateImpl;
import mx.gob.segob.nsjp.dao.objeto.EmbarcacionDAO;
import mx.gob.segob.nsjp.model.Embarcacion;

/**
 * Implementacion del contrato para los metodos de acceso a datos de la entidad embarcacion
 * @version 1.0
 * @author Tattva-IT
 *
 */

@Repository
public class EmbarcacionDAOImpl extends GenericDaoHibernateImpl<Embarcacion,Long>
		implements EmbarcacionDAO {

	
}