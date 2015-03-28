/**
 * Nombre del Programa : MandamientoAdjuntosDAOImpl.java
 * Autor                            : vaguirre
 * Compania                    : Ultrasist
 * Proyecto                      : NSJP                    Fecha: 1 Sep 2011
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
package mx.gob.segob.nsjp.dao.documento.impl;

import org.springframework.stereotype.Repository;

import mx.gob.segob.nsjp.dao.base.impl.GenericDaoHibernateImpl;
import mx.gob.segob.nsjp.dao.documento.MandamientoAdjuntosDAO;
import mx.gob.segob.nsjp.model.MandamientoAdjuntos;
import mx.gob.segob.nsjp.model.MandamientoAdjuntosId;

/**
 * Describir el objetivo de la clase con punto al final.
 * 
 * @version 1.0
 * @author vaguirre
 * 
 */
@Repository
public class MandamientoAdjuntosDAOImpl
        extends
            GenericDaoHibernateImpl<MandamientoAdjuntos, MandamientoAdjuntosId> implements MandamientoAdjuntosDAO {

}
