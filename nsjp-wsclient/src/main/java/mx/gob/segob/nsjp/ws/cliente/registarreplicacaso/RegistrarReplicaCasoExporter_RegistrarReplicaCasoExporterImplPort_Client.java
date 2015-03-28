
package mx.gob.segob.nsjp.ws.cliente.registarreplicacaso;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
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
 * 2011-09-08T17:57:58.734-05:00
 * Generated source version: 2.4.1
 * 
 */
public final class RegistrarReplicaCasoExporter_RegistrarReplicaCasoExporterImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://impl.ws.service.nsjp.segob.gob.mx/", "RegistrarReplicaCasoExporterImplService");

    private RegistrarReplicaCasoExporter_RegistrarReplicaCasoExporterImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RegistrarReplicaCasoExporterImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        RegistrarReplicaCasoExporterImplService ss = new RegistrarReplicaCasoExporterImplService(wsdlURL, SERVICE_NAME);
        RegistrarReplicaCasoExporter port = ss.getRegistrarReplicaCasoExporterImplPort();  
        
        {
        System.out.println("Invoking registrarReplicaCaso...");
        mx.gob.segob.nsjp.ws.cliente.registarreplicacaso.CasoWSDTO _registrarReplicaCaso_arg0 = null;
        try {
            port.registrarReplicaCaso(_registrarReplicaCaso_arg0);

        } catch (NSJPNegocioException_Exception e) { 
            System.out.println("Expected exception: NSJPNegocioException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
