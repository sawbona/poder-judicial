
package mx.gob.segob.nsjp.ws.cliente.consultaraudiencia;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for codigoError.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="codigoError">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FORMATO"/>
 *     &lt;enumeration value="PARAMETROS_INSUFICIENTES"/>
 *     &lt;enumeration value="EJCUCION_OPERACION_ESTADO_INCORRECTO"/>
 *     &lt;enumeration value="RANGO_FECHAS_CRUZADAS"/>
 *     &lt;enumeration value="ERROR_COMUNICACION"/>
 *     &lt;enumeration value="ERROR_TRANSORMACION_FECHAS"/>
 *     &lt;enumeration value="INFORMACION_PARAMETROS_ERRONEA"/>
 *     &lt;enumeration value="SALA_OCUPADA"/>
 *     &lt;enumeration value="DOCUMENTO_YA_ASOCIADO"/>
 *     &lt;enumeration value="AUDIENCIA_CANCELADA"/>
 *     &lt;enumeration value="FAIL_ESTATUS_AUDIENCIA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "codigoError")
@XmlEnum
public enum CodigoError {

    FORMATO,
    PARAMETROS_INSUFICIENTES,
    EJCUCION_OPERACION_ESTADO_INCORRECTO,
    RANGO_FECHAS_CRUZADAS,
    ERROR_COMUNICACION,
    ERROR_TRANSORMACION_FECHAS,
    INFORMACION_PARAMETROS_ERRONEA,
    SALA_OCUPADA,
    DOCUMENTO_YA_ASOCIADO,
    AUDIENCIA_CANCELADA,
    FAIL_ESTATUS_AUDIENCIA;

    public String value() {
        return name();
    }

    public static CodigoError fromValue(String v) {
        return valueOf(v);
    }

}
