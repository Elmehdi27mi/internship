
package net.mehdi.activemqjms.dtos.res_dtos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour BodyType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordNR" type="{}RecordNRType"/&gt;
 *         &lt;element name="RecordRR" type="{}RecordRRType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyType", propOrder = {
    "recordNR",
    "recordRR"
})
public class BodyType {

    @XmlElement(name = "RecordNR", required = true)
    protected RecordNRRespDTO recordNR;
    @XmlElement(name = "RecordRR", required = true)
    protected RecordRRRespDTO recordRR;

    /**
     * Obtient la valeur de la propriété recordNR.
     * 
     * @return
     *     possible object is
     *     {@link RecordNRRespDTO }
     *     
     */
    public RecordNRRespDTO getRecordNR() {
        return recordNR;
    }

    /**
     * Définit la valeur de la propriété recordNR.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordNRRespDTO }
     *     
     */
    public void setRecordNR(RecordNRRespDTO value) {
        this.recordNR = value;
    }

    /**
     * Obtient la valeur de la propriété recordRR.
     * 
     * @return
     *     possible object is
     *     {@link RecordRRRespDTO }
     *     
     */
    public RecordRRRespDTO getRecordRR() {
        return recordRR;
    }

    /**
     * Définit la valeur de la propriété recordRR.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRRRespDTO }
     *     
     */
    public void setRecordRR(RecordRRRespDTO value) {
        this.recordRR = value;
    }

}
