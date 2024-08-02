
package net.mehdi.activemqjms.dtos.scorIntegDTO.req_dtos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.ToString;


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
 *         &lt;element ref="{}RecordNR"/&gt;
 *         &lt;element ref="{}RecordRR"/&gt;
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
    "recordNR",
    "recordRR"
})
@XmlRootElement(name = "Body")
@ToString
public class Body {

    @XmlElement(name = "RecordNR", required = true)
    protected RecordNRDTO recordNR;
    @XmlElement(name = "RecordRR", required = true)
    protected RecordRRDTO recordRR;

    /**
     * Obtient la valeur de la propriété recordNR.
     * 
     * @return
     *     possible object is
     *     {@link RecordNRDTO }
     *     
     */
    public RecordNRDTO getRecordNR() {
        return recordNR;
    }

    /**
     * Définit la valeur de la propriété recordNR.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordNRDTO }
     *     
     */
    public void setRecordNR(RecordNRDTO value) {
        this.recordNR = value;
    }

    /**
     * Obtient la valeur de la propriété recordRR.
     *
     * @return possible object is
     * {@link RecordRRDTO }
     */
    public RecordRRDTO getRecordRR() {
        return recordRR;
    }

    /**
     * Définit la valeur de la propriété recordRR.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRRDTO }
     *     
     */
    public void setRecordRR(RecordRRDTO value) {
        this.recordRR = value;
    }

}
