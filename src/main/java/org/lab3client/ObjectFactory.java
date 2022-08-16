
package org.lab3client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelibrary.Row;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.lab3client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetRowResponseGetRowResult_QNAME = new QName("http://tempuri.org/", "GetRowResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.lab3client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRowsCount }
     * 
     */
    public GetRowsCount createGetRowsCount() {
        return new GetRowsCount();
    }

    /**
     * Create an instance of {@link GetRowsCountResponse }
     * 
     */
    public GetRowsCountResponse createGetRowsCountResponse() {
        return new GetRowsCountResponse();
    }

    /**
     * Create an instance of {@link GetRow }
     * 
     */
    public GetRow createGetRow() {
        return new GetRow();
    }

    /**
     * Create an instance of {@link GetRowResponse }
     * 
     */
    public GetRowResponse createGetRowResponse() {
        return new GetRowResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Row }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Row }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRowResult", scope = GetRowResponse.class)
    public JAXBElement<Row> createGetRowResponseGetRowResult(Row value) {
        return new JAXBElement<Row>(_GetRowResponseGetRowResult_QNAME, Row.class, GetRowResponse.class, value);
    }

}
