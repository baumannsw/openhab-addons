//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 06:25:15 PM CET 
//


package org.openhab.ui.cometvisu.internal.config.beans;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rsslog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rsslog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="layout" type="{}layout" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{}label" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{}address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="src" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="refresh" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="limit" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="mode" type="{}rss_mode" /&gt;
 *       &lt;attribute name="datetime" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="timeformat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="itemack" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rsslog", propOrder = {
    "layout",
    "label",
    "address"
})
public class Rsslog {

    protected Layout layout;
    protected Label label;
    protected List<Address> address;
    @XmlAttribute(name = "src", required = true)
    protected String src;
    @XmlAttribute(name = "refresh")
    protected BigInteger refresh;
    @XmlAttribute(name = "limit")
    protected BigInteger limit;
    @XmlAttribute(name = "mode")
    protected RssMode mode;
    @XmlAttribute(name = "datetime")
    protected Boolean datetime;
    @XmlAttribute(name = "timeformat")
    protected String timeformat;
    @XmlAttribute(name = "filter")
    protected String filter;
    @XmlAttribute(name = "itemack")
    protected String itemack;

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link Layout }
     *     
     */
    public Layout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layout }
     *     
     */
    public void setLayout(Layout value) {
        this.layout = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrc(String value) {
        this.src = value;
    }

    /**
     * Gets the value of the refresh property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefresh() {
        return refresh;
    }

    /**
     * Sets the value of the refresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefresh(BigInteger value) {
        this.refresh = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimit(BigInteger value) {
        this.limit = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link RssMode }
     *     
     */
    public RssMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RssMode }
     *     
     */
    public void setMode(RssMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDatetime() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDatetime(Boolean value) {
        this.datetime = value;
    }

    /**
     * Gets the value of the timeformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeformat() {
        return timeformat;
    }

    /**
     * Sets the value of the timeformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeformat(String value) {
        this.timeformat = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    /**
     * Gets the value of the itemack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemack() {
        return itemack;
    }

    /**
     * Sets the value of the itemack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemack(String value) {
        this.itemack = value;
    }

}
