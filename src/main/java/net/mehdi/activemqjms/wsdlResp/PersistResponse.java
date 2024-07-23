
package net.mehdi.activemqjms.wsdlResp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.io.Serializable;


/**
 * <p>Classe Java pour persistResponse complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="persistResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OutputData" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="codeRetour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="messageRetour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistResponse", propOrder = {
    "outputData"
})
public class PersistResponse {

    @XmlElement(name = "OutputData")
    protected OutputData outputData;

    /**
     * Obtient la valeur de la propriété outputData.
     * 
     * @return
     *     possible object is
     *     {@link OutputData }
     *     
     */
    public OutputData getOutputData() {
        return outputData;
    }

    /**
     * Définit la valeur de la propriété outputData.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputData }
     *     
     */
    public void setOutputData(OutputData value) {
        this.outputData = value;
    }


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
    public static class OutputData implements Serializable {

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

}
