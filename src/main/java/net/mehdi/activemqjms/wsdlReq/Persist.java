
package net.mehdi.activemqjms.wsdlReq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.io.Serializable;


/**
 * <p>Classe Java pour persist complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="persist">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Request" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="presCore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="scorInteg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "persist", propOrder = {
    "request"
})
public class Persist  {

    @XmlElement(name = "Request")
    protected Request request;

    /**
     * Obtient la valeur de la propriété request.
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Définit la valeur de la propriété request.
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
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
     *         <element name="presCore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="scorInteg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "presCore",
        "scorInteg"
    })
    public static class Request implements  Serializable {

        protected String presCore;
        protected String scorInteg;

        /**
         * Obtient la valeur de la propriété presCore.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPresCore() {
            return presCore;
        }

        /**
         * Définit la valeur de la propriété presCore.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPresCore(String value) {
            this.presCore = value;
        }

        /**
         * Obtient la valeur de la propriété scorInteg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScorInteg() {
            return scorInteg;
        }

        /**
         * Définit la valeur de la propriété scorInteg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScorInteg(String value) {
            this.scorInteg = value;
        }

    }

}
