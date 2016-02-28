//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 06:25:15 PM CET 
//


package org.openhab.ui.cometvisu.internal.config.beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for navbar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="navbar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="page" type="{}page"/&gt;
 *         &lt;element name="group" type="{}group"/&gt;
 *         &lt;group ref="{}Widgets"/&gt;
 *         &lt;group ref="{}AvailablePlugins"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="position" use="required" type="{}navbarPositionType" /&gt;
 *       &lt;attribute name="dynamic" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="scope" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "navbar", propOrder = {
    "pageOrGroupOrLine"
})
public class Navbar {

    @XmlElementRefs({
        @XmlElementRef(name = "refresh", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "shade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gauge", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "designtoggle", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "diagram_info", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reload", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "svg", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "colorchooser", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "break", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rsslog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "infoaction", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "infotrigger", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "image", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "group", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "video", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "imagetrigger", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "multitrigger", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "include", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "strftime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pushbutton", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rss", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "page", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "web", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "diagram", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "toggle", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "audio", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "line", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clock", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "slide", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "calendarlist", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rgb", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "info", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "timeout", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "urltrigger", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "wgplugin_info", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "trigger", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pagejump", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "switch", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "text", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "upnpcontroller", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> pageOrGroupOrLine;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "position", required = true)
    protected NavbarPositionType position;
    @XmlAttribute(name = "dynamic")
    protected Boolean dynamic;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "scope")
    protected BigDecimal scope;

    /**
     * Gets the value of the pageOrGroupOrLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageOrGroupOrLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageOrGroupOrLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Refresh }{@code >}
     * {@link JAXBElement }{@code <}{@link Info }{@code >}
     * {@link JAXBElement }{@code <}{@link Gauge }{@code >}
     * {@link JAXBElement }{@code <}{@link Designtoggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DiagramInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link Reload }{@code >}
     * {@link JAXBElement }{@code <}{@link Svg }{@code >}
     * {@link JAXBElement }{@code <}{@link Colorchooser }{@code >}
     * {@link JAXBElement }{@code <}{@link Break }{@code >}
     * {@link JAXBElement }{@code <}{@link Rsslog }{@code >}
     * {@link JAXBElement }{@code <}{@link Infoaction }{@code >}
     * {@link JAXBElement }{@code <}{@link Infotrigger }{@code >}
     * {@link JAXBElement }{@code <}{@link Image }{@code >}
     * {@link JAXBElement }{@code <}{@link Group }{@code >}
     * {@link JAXBElement }{@code <}{@link Video }{@code >}
     * {@link JAXBElement }{@code <}{@link Imagetrigger }{@code >}
     * {@link JAXBElement }{@code <}{@link Multitrigger }{@code >}
     * {@link JAXBElement }{@code <}{@link Include }{@code >}
     * {@link JAXBElement }{@code <}{@link Strftime }{@code >}
     * {@link JAXBElement }{@code <}{@link Pushbutton }{@code >}
     * {@link JAXBElement }{@code <}{@link Rss }{@code >}
     * {@link JAXBElement }{@code <}{@link Page }{@code >}
     * {@link JAXBElement }{@code <}{@link Web }{@code >}
     * {@link JAXBElement }{@code <}{@link Diagram }{@code >}
     * {@link JAXBElement }{@code <}{@link Toggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Audio }{@code >}
     * {@link JAXBElement }{@code <}{@link Line }{@code >}
     * {@link JAXBElement }{@code <}{@link Clock }{@code >}
     * {@link JAXBElement }{@code <}{@link Slide }{@code >}
     * {@link JAXBElement }{@code <}{@link Calendarlist }{@code >}
     * {@link JAXBElement }{@code <}{@link Rgb }{@code >}
     * {@link JAXBElement }{@code <}{@link Info }{@code >}
     * {@link JAXBElement }{@code <}{@link Timeout }{@code >}
     * {@link JAXBElement }{@code <}{@link Urltrigger }{@code >}
     * {@link JAXBElement }{@code <}{@link WgpluginInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link Trigger }{@code >}
     * {@link JAXBElement }{@code <}{@link Pagejump }{@code >}
     * {@link JAXBElement }{@code <}{@link Switch }{@code >}
     * {@link JAXBElement }{@code <}{@link Text }{@code >}
     * {@link JAXBElement }{@code <}{@link Upnpcontroller }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPageOrGroupOrLine() {
        if (pageOrGroupOrLine == null) {
            pageOrGroupOrLine = new ArrayList<JAXBElement<?>>();
        }
        return this.pageOrGroupOrLine;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link NavbarPositionType }
     *     
     */
    public NavbarPositionType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavbarPositionType }
     *     
     */
    public void setPosition(NavbarPositionType value) {
        this.position = value;
    }

    /**
     * Gets the value of the dynamic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynamic() {
        return dynamic;
    }

    /**
     * Sets the value of the dynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamic(Boolean value) {
        this.dynamic = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScope(BigDecimal value) {
        this.scope = value;
    }

}
