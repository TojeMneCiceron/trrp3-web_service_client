
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.lab3client;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-01-20T20:40:09.286+03:00
 * Generated source version: 3.5.0
 *
 */

@javax.jws.WebService(
                      serviceName = "Lab3Service",
                      portName = "BasicHttpBinding_ILab3Service",
                      targetNamespace = "http://tempuri.org/",
                      wsdlLocation = "http://25.46.195.40:8080/service?singleWsdl",
                      endpointInterface = "org.lab3client.ILab3Service")

public class BasicHttpBinding_ILab3ServiceImpl implements ILab3Service {

    private static final Logger LOG = Logger.getLogger(BasicHttpBinding_ILab3ServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see org.lab3client.ILab3Service#getRowsCount()*
     */
    public java.lang.Integer getRowsCount() {
        LOG.info("Executing operation getRowsCount");
        try {
            java.lang.Integer _return = Integer.valueOf(-1406903223);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.lab3client.ILab3Service#getRow(java.lang.Integer i)*
     */
    public org.datacontract.schemas._2004._07.wcfservicelibrary.Row getRow(java.lang.Integer i) {
        LOG.info("Executing operation getRow");
        System.out.println(i);
        try {
            org.datacontract.schemas._2004._07.wcfservicelibrary.Row _return = new org.datacontract.schemas._2004._07.wcfservicelibrary.Row();
            _return.setAge(Integer.valueOf(2062153411));
            javax.xml.bind.JAXBElement<java.lang.String> _returnDName = null;
            _return.setDName(_returnDName);
            javax.xml.bind.JAXBElement<java.lang.String> _returnDescription = null;
            _return.setDescription(_returnDescription);
            javax.xml.bind.JAXBElement<java.lang.String> _returnOName = null;
            _return.setOName(_returnOName);
            javax.xml.bind.JAXBElement<java.lang.String> _returnPName = null;
            _return.setPName(_returnPName);
            javax.xml.bind.JAXBElement<java.lang.String> _returnPhone = null;
            _return.setPhone(_returnPhone);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSName = null;
            _return.setSName(_returnSName);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
