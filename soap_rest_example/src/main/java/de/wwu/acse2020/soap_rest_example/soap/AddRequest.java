//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.14 at 04:56:05 PM CEST 
//


package de.wwu.acse2020.soap_rest_example.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="n1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="n2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "n1",
    "n2"
})
@XmlRootElement(name = "addRequest")
public class AddRequest {

    protected int n1;
    protected int n2;

    /**
     * Gets the value of the n1 property.
     * 
     */
    public int getN1() {
        return n1;
    }

    /**
     * Sets the value of the n1 property.
     * 
     */
    public void setN1(int value) {
        this.n1 = value;
    }

    /**
     * Gets the value of the n2 property.
     * 
     */
    public int getN2() {
        return n2;
    }

    /**
     * Sets the value of the n2 property.
     * 
     */
    public void setN2(int value) {
        this.n2 = value;
    }

}
