
package net.mehdi.activemqjms.dtos.presCoreDTO.res_dtos;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.mehdi.activemqjms.dtos.presCoreDTO.res_dtos package. 
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

    private final static QName _StrategyOneResponse_QNAME = new QName("", "StrategyOneResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.mehdi.activemqjms.dtos.presCoreDTO.res_dtos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StrategyOneResponsePresResDTO }
     * 
     */
    public StrategyOneResponsePresResDTO createStrategyOneResponseType() {
        return new StrategyOneResponsePresResDTO();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link VOUTSocieteGestionType }
     * 
     */
    public VOUTSocieteGestionType createVOUTSocieteGestionType() {
        return new VOUTSocieteGestionType();
    }

    /**
     * Create an instance of {@link CodeIdentifiantType }
     * 
     */
    public CodeIdentifiantType createCodeIdentifiantType() {
        return new CodeIdentifiantType();
    }

    /**
     * Create an instance of {@link FLAGCoheranceMarcheType }
     * 
     */
    public FLAGCoheranceMarcheType createFLAGCoheranceMarcheType() {
        return new FLAGCoheranceMarcheType();
    }

    /**
     * Create an instance of {@link VOUTMarcheType }
     * 
     */
    public VOUTMarcheType createVOUTMarcheType() {
        return new VOUTMarcheType();
    }

    /**
     * Create an instance of {@link VOUTSegmentType }
     * 
     */
    public VOUTSegmentType createVOUTSegmentType() {
        return new VOUTSegmentType();
    }

    /**
     * Create an instance of {@link VOUTProfessionType }
     * 
     */
    public VOUTProfessionType createVOUTProfessionType() {
        return new VOUTProfessionType();
    }

    /**
     * Create an instance of {@link VOUTFonctionType }
     * 
     */
    public VOUTFonctionType createVOUTFonctionType() {
        return new VOUTFonctionType();
    }

    /**
     * Create an instance of {@link VOUTRevenuType }
     * 
     */
    public VOUTRevenuType createVOUTRevenuType() {
        return new VOUTRevenuType();
    }

    /**
     * Create an instance of {@link VOUTChargeType }
     * 
     */
    public VOUTChargeType createVOUTChargeType() {
        return new VOUTChargeType();
    }

    /**
     * Create an instance of {@link DecisionOffreMaxType }
     * 
     */
    public DecisionOffreMaxType createDecisionOffreMaxType() {
        return new DecisionOffreMaxType();
    }

    /**
     * Create an instance of {@link CapaciteENDType }
     * 
     */
    public CapaciteENDType createCapaciteENDType() {
        return new CapaciteENDType();
    }

    /**
     * Create an instance of {@link OffreMaxType }
     * 
     */
    public OffreMaxType createOffreMaxType() {
        return new OffreMaxType();
    }

    /**
     * Create an instance of {@link DureeMaxType }
     * 
     */
    public DureeMaxType createDureeMaxType() {
        return new DureeMaxType();
    }

    /**
     * Create an instance of {@link MensualiteOffreMaxType }
     * 
     */
    public MensualiteOffreMaxType createMensualiteOffreMaxType() {
        return new MensualiteOffreMaxType();
    }

    /**
     * Create an instance of {@link RecordNRPresResDTO }
     * 
     */
    public RecordNRPresResDTO createRecordNRType() {
        return new RecordNRPresResDTO();
    }

    /**
     * Create an instance of {@link BodyType }
     * 
     */
    public BodyType createBodyType() {
        return new BodyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategyOneResponsePresResDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StrategyOneResponsePresResDTO }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "StrategyOneResponse")
    public JAXBElement<StrategyOneResponsePresResDTO> createStrategyOneResponse(StrategyOneResponsePresResDTO value) {
        return new JAXBElement<StrategyOneResponsePresResDTO>(_StrategyOneResponse_QNAME, StrategyOneResponsePresResDTO.class, null, value);
    }

}
