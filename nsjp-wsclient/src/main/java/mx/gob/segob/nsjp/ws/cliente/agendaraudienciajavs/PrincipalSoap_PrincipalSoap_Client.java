
package mx.gob.segob.nsjp.ws.cliente.agendaraudienciajavs;

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
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2012-05-07T19:17:49.815-05:00
 * Generated source version: 2.4.1
 * 
 */
public final class PrincipalSoap_PrincipalSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "Principal");

    private PrincipalSoap_PrincipalSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Principal.WSDL_LOCATION;
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
      
        Principal ss = new Principal(wsdlURL, SERVICE_NAME);
        PrincipalSoap port = ss.getPrincipalSoap();  
        
        {
        System.out.println("Invoking consultarResolutivos...");
        java.lang.String _consultarResolutivos_sAudiencia = "";
        java.lang.String _consultarResolutivos_sUsuario = "";
        int _consultarResolutivos__return = port.consultarResolutivos(_consultarResolutivos_sAudiencia, _consultarResolutivos_sUsuario);
        System.out.println("consultarResolutivos.result=" + _consultarResolutivos__return);


        }
        {
        System.out.println("Invoking agendarAudiencia...");
        java.lang.String _agendarAudiencia_sAudiencia = "";
        java.lang.String _agendarAudiencia_sUsuario = "";
        int _agendarAudiencia__return = port.agendarAudiencia(_agendarAudiencia_sAudiencia, _agendarAudiencia_sUsuario);
        System.out.println("agendarAudiencia.result=" + _agendarAudiencia__return);


        }
        {
        System.out.println("Invoking estadoAudiencia...");
        java.lang.String _estadoAudiencia_sAudiencia = "";
        java.lang.String _estadoAudiencia_sUsuario = "";
        int _estadoAudiencia__return = port.estadoAudiencia(_estadoAudiencia_sAudiencia, _estadoAudiencia_sUsuario);
        System.out.println("estadoAudiencia.result=" + _estadoAudiencia__return);


        }
        {
        System.out.println("Invoking ligasSFTP...");
        java.lang.String _ligasSFTP_sAudiencia = "";
        java.lang.String _ligasSFTP_sUsuario = "";
        long _ligasSFTP_lUsuario = 0;
        int _ligasSFTP__return = port.ligasSFTP(_ligasSFTP_sAudiencia, _ligasSFTP_sUsuario, _ligasSFTP_lUsuario);
        System.out.println("ligasSFTP.result=" + _ligasSFTP__return);


        }
        {
        System.out.println("Invoking consultarAudiencia...");
        java.lang.String _consultarAudiencia_sAudiencia = "";
        java.lang.String _consultarAudiencia_sUsuario = "";
        int _consultarAudiencia__return = port.consultarAudiencia(_consultarAudiencia_sAudiencia, _consultarAudiencia_sUsuario);
        System.out.println("consultarAudiencia.result=" + _consultarAudiencia__return);


        }
        {
        System.out.println("Invoking eliminarAudiencia...");
        java.lang.String _eliminarAudiencia_sAudiencia = "";
        java.lang.String _eliminarAudiencia_sUsuario = "";
        int _eliminarAudiencia__return = port.eliminarAudiencia(_eliminarAudiencia_sAudiencia, _eliminarAudiencia_sUsuario);
        System.out.println("eliminarAudiencia.result=" + _eliminarAudiencia__return);


        }

        System.exit(0);
    }

}