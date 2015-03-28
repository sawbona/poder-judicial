/**
* Nombre del Programa : ExpedienteTecnicoDAOImpl.java
* Autor                            : cesarAgustin
* Compania                    : Ultrasist
* Proyecto                      : NSJP                    Fecha: 13 May 2011
* Marca de cambio        : N/A
* Descripcion General    : Implementacion de metodos de acceso a datos de la entidad ExpedienteTecnico
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
package mx.gob.segob.nsjp.dao.expediente.impl;

import org.springframework.stereotype.Repository;

import mx.gob.segob.nsjp.dao.base.impl.GenericDaoHibernateImpl;
import mx.gob.segob.nsjp.dao.expediente.ExpedienteTecnicoDAO;
import mx.gob.segob.nsjp.model.ExpedienteTecnico;

/**
 * Implementacion de metodos de acceso a datos de la entidad ExpedienteTecnico.
 * @version 1.0
 * @author cesarAgustin
 *
 */
@Repository
public class ExpedienteTecnicoDAOImpl extends
		GenericDaoHibernateImpl<ExpedienteTecnico, Long> implements
		ExpedienteTecnicoDAO {

}
