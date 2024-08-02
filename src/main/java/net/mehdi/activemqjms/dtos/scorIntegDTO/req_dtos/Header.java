
package net.mehdi.activemqjms.dtos.scorIntegDTO.req_dtos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}InquiryCode"/&gt;
 *         &lt;element ref="{}ProcessCode"/&gt;
 *         &lt;element ref="{}OrganizationCode"/&gt;
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
    "inquiryCode",
    "processCode",
    "organizationCode"
})
@XmlRootElement(name = "Header")
public class Header {

    @XmlElement(name = "InquiryCode")
    protected String inquiryCode;
    @XmlElement(name = "ProcessCode", required = true)
    protected String processCode;
    @XmlElement(name = "OrganizationCode")
    protected String organizationCode;

    /**
     * Obtient la valeur de la propriété inquiryCode.
     * 
     */
    public String getInquiryCode() {
        return inquiryCode;
    }

    /**
     * Définit la valeur de la propriété inquiryCode.
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
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * Définit la valeur de la propriété organizationCode.
     * 
     */
    public void setOrganizationCode(String value) {
        this.organizationCode = value;
    }

}
