//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.14 at 04:56:05 PM CEST 
//


package de.wwu.acse2020.soap_rest_example.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MySum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MySum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="n1" type="{soap.soap_rest_example.acse2020.wwu.de}MyNumber"/>
 *         &lt;element name="n2" type="{soap.soap_rest_example.acse2020.wwu.de}MyNumber"/>
 *         &lt;element name="sum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MySum", propOrder = {
    "n1",
    "n2",
    "sum"
})
public class MySum {

    @XmlElement(required = true)
    protected MyNumber n1;
    @XmlElement(required = true)
    protected MyNumber n2;
    protected int sum;

    /**
     * Gets the value of the n1 property.
     * 
     * @return
     *     possible object is
     *     {@link MyNumber }
     *     
     */
    public MyNumber getN1() {
        return n1;
    }

    /**
     * Sets the value of the n1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyNumber }
     *     
     */
    public void setN1(MyNumber value) {
        this.n1 = value;
    }

    /**
     * Gets the value of the n2 property.
     * 
     * @return
     *     possible object is
     *     {@link MyNumber }
     *     
     */
    public MyNumber getN2() {
        return n2;
    }

    /**
     * Sets the value of the n2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyNumber }
     *     
     */
    public void setN2(MyNumber value) {
        this.n2 = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     */
    public int getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     */
    public void setSum(int value) {
        this.sum = value;
    }

}
