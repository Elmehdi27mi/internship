
package net.mehdi.activemqjms.dtos.presCoreDTO.req_dtos;

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
    "recordNR"
})
public class BodyType {

    @XmlElement(name = "RecordNR", required = true)
    protected RecordNRPresDTO recordNR;

    /**
     * Obtient la valeur de la propriété recordNR.
     * 
     * @return
     *     possible object is
     *     {@link RecordNRPresDTO }
     *     
     */
    public RecordNRPresDTO getRecordNR() {
        return recordNR;
    }

    /**
     * Définit la valeur de la propriété recordNR.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordNRPresDTO }
     *     
     */
    public void setRecordNR(RecordNRPresDTO value) {
        this.recordNR = value;
    }

}
