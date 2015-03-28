package mx.gob.segob.nsjp.ws.cliente.registarreplicacaso;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2011-09-08T17:57:58.875-05:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "RegistrarReplicaCasoExporterImplService", 
                  wsdlLocation = "http://localhost:8080/nsjp-web/RegistrarReplicaCasoExporterImplService?wsdl",
                  targetNamespace = "http://impl.ws.service.nsjp.segob.gob.mx/") 
public class RegistrarReplicaCasoExporterImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.ws.service.nsjp.segob.gob.mx/", "RegistrarReplicaCasoExporterImplService");
    public final static QName RegistrarReplicaCasoExporterImplPort = new QName("http://impl.ws.service.nsjp.segob.gob.mx/", "RegistrarReplicaCasoExporterImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/nsjp-web/RegistrarReplicaCasoExporterImplService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RegistrarReplicaCasoExporterImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/nsjp-web/RegistrarReplicaCasoExporterImplService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RegistrarReplicaCasoExporterImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RegistrarReplicaCasoExporterImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegistrarReplicaCasoExporterImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    /**
     *
     * @return
     *     returns RegistrarReplicaCasoExporter
     */
    @WebEndpoint(name = "RegistrarReplicaCasoExporterImplPort")
    public RegistrarReplicaCasoExporter getRegistrarReplicaCasoExporterImplPort() {
        return super.getPort(RegistrarReplicaCasoExporterImplPort, RegistrarReplicaCasoExporter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RegistrarReplicaCasoExporter
     */
    @WebEndpoint(name = "RegistrarReplicaCasoExporterImplPort")
    public RegistrarReplicaCasoExporter getRegistrarReplicaCasoExporterImplPort(WebServiceFeature... features) {
        return super.getPort(RegistrarReplicaCasoExporterImplPort, RegistrarReplicaCasoExporter.class, features);
    }

}