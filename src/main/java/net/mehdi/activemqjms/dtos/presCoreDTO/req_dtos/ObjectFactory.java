
package net.mehdi.activemqjms.dtos.presCoreDTO.req_dtos;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.mehdi.activemqjms.dtos.presCoreDTO.req_dtos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StrategyOneRequest_QNAME = new QName("", "StrategyOneRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.mehdi.activemqjms.dtos.presCoreDTO.req_dtos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StrategyOneRequestPresDTO }
     * 
     */
    public StrategyOneRequestPresDTO createStrategyOneRequestType() {
        return new StrategyOneRequestPresDTO();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link VINSocieteGestionType }
     * 
     */
    public VINSocieteGestionType createVINSocieteGestionType() {
        return new VINSocieteGestionType();
    }

    /**
     * Create an instance of {@link CodeIdentifiantType }
     * 
     */
    public CodeIdentifiantType createCodeIdentifiantType() {
        return new CodeIdentifiantType();
    }

    /**
     * Create an instance of {@link VINDateDemandeType }
     * 
     */
    public VINDateDemandeType createVINDateDemandeType() {
        return new VINDateDemandeType();
    }

    /**
     * Create an instance of {@link VINCategorieAffaireType }
     * 
     */
    public VINCategorieAffaireType createVINCategorieAffaireType() {
        return new VINCategorieAffaireType();
    }

    /**
     * Create an instance of {@link VINMarcheType }
     * 
     */
    public VINMarcheType createVINMarcheType() {
        return new VINMarcheType();
    }

    /**
     * Create an instance of {@link VINSegmentType }
     * 
     */
    public VINSegmentType createVINSegmentType() {
        return new VINSegmentType();
    }

    /**
     * Create an instance of {@link VINProfessionType }
     * 
     */
    public VINProfessionType createVINProfessionType() {
        return new VINProfessionType();
    }

    /**
     * Create an instance of {@link VINEmployeurType }
     * 
     */
    public VINEmployeurType createVINEmployeurType() {
        return new VINEmployeurType();
    }

    /**
     * Create an instance of {@link VINFonctionType }
     * 
     */
    public VINFonctionType createVINFonctionType() {
        return new VINFonctionType();
    }

    /**
     * Create an instance of {@link VINDateNaissanceType }
     * 
     */
    public VINDateNaissanceType createVINDateNaissanceType() {
        return new VINDateNaissanceType();
    }

    /**
     * Create an instance of {@link VINMontantDemandeType }
     * 
     */
    public VINMontantDemandeType createVINMontantDemandeType() {
        return new VINMontantDemandeType();
    }

    /**
     * Create an instance of {@link VINDureeType }
     * 
     */
    public VINDureeType createVINDureeType() {
        return new VINDureeType();
    }

    /**
     * Create an instance of {@link VINMensualiteType }
     * 
     */
    public VINMensualiteType createVINMensualiteType() {
        return new VINMensualiteType();
    }

    /**
     * Create an instance of {@link VINTauxInteretType }
     * 
     */
    public VINTauxInteretType createVINTauxInteretType() {
        return new VINTauxInteretType();
    }

    /**
     * Create an instance of {@link VINRevenuType }
     * 
     */
    public VINRevenuType createVINRevenuType() {
        return new VINRevenuType();
    }

    /**
     * Create an instance of {@link VINChargeType }
     * 
     */
    public VINChargeType createVINChargeType() {
        return new VINChargeType();
    }

    /**
     * Create an instance of {@link RecordNRPresDTO }
     * 
     */
    public RecordNRPresDTO createRecordNRType() {
        return new RecordNRPresDTO();
    }

    /**
     * Create an instance of {@link BodyType }
     * 
     */
    public BodyType createBodyType() {
        return new BodyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategyOneRequestPresDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StrategyOneRequestPresDTO }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "StrategyOneRequest")
    public JAXBElement<StrategyOneRequestPresDTO> createStrategyOneRequest(StrategyOneRequestPresDTO value) {
        return new JAXBElement<StrategyOneRequestPresDTO>(_StrategyOneRequest_QNAME, StrategyOneRequestPresDTO.class, null, value);
    }

}
