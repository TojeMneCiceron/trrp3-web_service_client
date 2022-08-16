
package org.datacontract.schemas._2004._07.wcfservicelibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.wcfservicelibrary package. 
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

    private final static QName _Row_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "Row");
    private final static QName _RowDName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "D_name");
    private final static QName _RowDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "Description");
    private final static QName _RowOName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "O_name");
    private final static QName _RowPName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "P_name");
    private final static QName _RowPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "Phone");
    private final static QName _RowSName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "S_name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.wcfservicelibrary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Row }
     * 
     */
    public Row createRow() {
        return new Row();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Row }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Row }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "Row")
    public JAXBElement<Row> createRow(Row value) {
        return new JAXBElement<Row>(_Row_QNAME, Row.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "D_name", scope = Row.class)
    public JAXBElement<String> createRowDName(String value) {
        return new JAXBElement<String>(_RowDName_QNAME, String.class, Row.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "Description", scope = Row.class)
    public JAXBElement<String> createRowDescription(String value) {
        return new JAXBElement<String>(_RowDescription_QNAME, String.class, Row.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "O_name", scope = Row.class)
    public JAXBElement<String> createRowOName(String value) {
        return new JAXBElement<String>(_RowOName_QNAME, String.class, Row.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "P_name", scope = Row.class)
    public JAXBElement<String> createRowPName(String value) {
        return new JAXBElement<String>(_RowPName_QNAME, String.class, Row.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "Phone", scope = Row.class)
    public JAXBElement<String> createRowPhone(String value) {
        return new JAXBElement<String>(_RowPhone_QNAME, String.class, Row.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "S_name", scope = Row.class)
    public JAXBElement<String> createRowSName(String value) {
        return new JAXBElement<String>(_RowSName_QNAME, String.class, Row.class, value);
    }

}
