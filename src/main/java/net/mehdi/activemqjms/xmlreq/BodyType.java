
package net.mehdi.activemqjms.xmlreq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;


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
@Data
public class BodyType {

    @XmlElement(name = "RecordNR", required = true)
    protected RecordNRType recordNR;
    @XmlElement(name = "RecordRR", required = true)
    protected RecordRRType recordRR;

}
