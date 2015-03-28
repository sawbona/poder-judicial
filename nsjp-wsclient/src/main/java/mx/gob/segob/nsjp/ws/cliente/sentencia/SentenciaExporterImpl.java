package mx.gob.segob.nsjp.ws.cliente.sentencia;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2012-04-12T11:42:17.781-05:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://impl.ws.service.nsjp.segob.gob.mx/", name = "SentenciaExporterImpl")
@XmlSeeAlso({ObjectFactory.class})
public interface SentenciaExporterImpl {

    @Action(input = "http://impl.ws.service.nsjp.segob.gob.mx/SentenciaExporterImpl/crearSentenciaRequest", output = "http://impl.ws.service.nsjp.segob.gob.mx/SentenciaExporterImpl/crearSentenciaResponse", fault = {@FaultAction(className = NSJPNegocioException_Exception.class, value = "http://impl.ws.service.nsjp.segob.gob.mx/SentenciaExporterImpl/crearSentencia/Fault/NSJPNegocioException")})
    @RequestWrapper(localName = "crearSentencia", targetNamespace = "http://impl.ws.service.nsjp.segob.gob.mx/", className = "mx.gob.segob.nsjp.ws.cliente.sentencia.CrearSentencia")
    @WebMethod
    @ResponseWrapper(localName = "crearSentenciaResponse", targetNamespace = "http://impl.ws.service.nsjp.segob.gob.mx/", className = "mx.gob.segob.nsjp.ws.cliente.sentencia.CrearSentenciaResponse")
    public void crearSentencia(
        @WebParam(name = "arg0", targetNamespace = "")
        mx.gob.segob.nsjp.ws.cliente.sentencia.SentenciaWSDTO arg0
    ) throws NSJPNegocioException_Exception;
}
