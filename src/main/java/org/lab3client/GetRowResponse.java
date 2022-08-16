
package org.lab3client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelibrary.Row;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetRowResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLibrary}Row" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getRowResult"
})
@XmlRootElement(name = "GetRowResponse")
public class GetRowResponse {

    @XmlElementRef(name = "GetRowResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Row> getRowResult;

    /**
     * Gets the value of the getRowResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Row }{@code >}
     *     
     */
    public JAXBElement<Row> getGetRowResult() {
        return getRowResult;
    }

    /**
     * Sets the value of the getRowResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Row }{@code >}
     *     
     */
    public void setGetRowResult(JAXBElement<Row> value) {
        this.getRowResult = value;
    }

}
