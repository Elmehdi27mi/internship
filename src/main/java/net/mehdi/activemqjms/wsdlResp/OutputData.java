
package net.mehdi.activemqjms.wsdlResp;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Classe Java pour anonymous complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="codeRetour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="messageRetour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codeRetour",
    "messageRetour"
})
@XmlRootElement(name = "OutputData")
public class OutputData {

    @XmlElement(required = true)
    protected String codeRetour;
    @XmlElement(required = true)
    protected String messageRetour;

    /**
     * Obtient la valeur de la propriété codeRetour.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeRetour() {
        return codeRetour;
    }

    /**
     * Définit la valeur de la propriété codeRetour.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeRetour(String value) {
        this.codeRetour = value;
    }

    /**
     * Obtient la valeur de la propriété messageRetour.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageRetour() {
        return messageRetour;
    }

    /**
     * Définit la valeur de la propriété messageRetour.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageRetour(String value) {
        this.messageRetour = value;
    }

}
