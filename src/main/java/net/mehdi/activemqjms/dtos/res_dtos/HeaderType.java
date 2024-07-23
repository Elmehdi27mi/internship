
package net.mehdi.activemqjms.dtos.res_dtos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour HeaderType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InquiryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProcessCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrganizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProcessVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LayoutVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", propOrder = {
    "inquiryCode",
    "processCode",
    "organizationCode",
    "processVersion",
    "layoutVersion"
})
public class HeaderType {

    @XmlElement(name = "InquiryCode", required = true)
    protected String inquiryCode;
    @XmlElement(name = "ProcessCode", required = true)
    protected String processCode;
    @XmlElement(name = "OrganizationCode", required = true)
    protected String organizationCode;
    @XmlElement(name = "ProcessVersion", required = true)
    protected String processVersion;
    @XmlElement(name = "LayoutVersion", required = true)
    protected String layoutVersion;

    /**
     * Obtient la valeur de la propriété inquiryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryCode() {
        return inquiryCode;
    }

    /**
     * Définit la valeur de la propriété inquiryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryCode(String value) {
        this.inquiryCode = value;
    }

    /**
     * Obtient la valeur de la propriété processCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessCode() {
        return processCode;
    }

    /**
     * Définit la valeur de la propriété processCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessCode(String value) {
        this.processCode = value;
    }

    /**
     * Obtient la valeur de la propriété organizationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * Définit la valeur de la propriété organizationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationCode(String value) {
        this.organizationCode = value;
    }

    /**
     * Obtient la valeur de la propriété processVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessVersion() {
        return processVersion;
    }

    /**
     * Définit la valeur de la propriété processVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessVersion(String value) {
        this.processVersion = value;
    }

    /**
     * Obtient la valeur de la propriété layoutVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutVersion() {
        return layoutVersion;
    }

    /**
     * Définit la valeur de la propriété layoutVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutVersion(String value) {
        this.layoutVersion = value;
    }

}
