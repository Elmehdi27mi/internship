
package net.mehdi.activemqjms.dtos.presCoreDTO.res_dtos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RecordNRType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RecordNRType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VOUT_Societe_Gestion" type="{}VOUT_Societe_GestionType"/&gt;
 *         &lt;element name="Code_Identifiant" type="{}Code_IdentifiantType"/&gt;
 *         &lt;element name="FLAG_Coherance_Marche" type="{}FLAG_Coherance_MarcheType"/&gt;
 *         &lt;element name="VOUT_Marche" type="{}VOUT_MarcheType"/&gt;
 *         &lt;element name="VOUT_Segment" type="{}VOUT_SegmentType"/&gt;
 *         &lt;element name="VOUT_Profession" type="{}VOUT_ProfessionType"/&gt;
 *         &lt;element name="VOUT_Fonction" type="{}VOUT_FonctionType"/&gt;
 *         &lt;element name="VOUT_Revenu" type="{}VOUT_RevenuType"/&gt;
 *         &lt;element name="VOUT_Charge" type="{}VOUT_ChargeType"/&gt;
 *         &lt;element name="Decision_Offre_Max" type="{}Decision_Offre_MaxType"/&gt;
 *         &lt;element name="Capacite_END" type="{}Capacite_ENDType"/&gt;
 *         &lt;element name="Offre_Max" type="{}Offre_MaxType"/&gt;
 *         &lt;element name="Duree_Max" type="{}Duree_MaxType"/&gt;
 *         &lt;element name="Mensualite_Offre_Max" type="{}Mensualite_Offre_MaxType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordNRType", propOrder = {
    "voutSocieteGestion",
    "codeIdentifiant",
    "flagCoheranceMarche",
    "voutMarche",
    "voutSegment",
    "voutProfession",
    "voutFonction",
    "voutRevenu",
    "voutCharge",
    "decisionOffreMax",
    "capaciteEND",
    "offreMax",
    "dureeMax",
    "mensualiteOffreMax"
})
public class RecordNRPresResDTO {

    @XmlElement(name = "VOUT_Societe_Gestion", required = true)
    protected VOUTSocieteGestionType voutSocieteGestion;
    @XmlElement(name = "Code_Identifiant", required = true)
    protected CodeIdentifiantType codeIdentifiant;
    @XmlElement(name = "FLAG_Coherance_Marche", required = true)
    protected FLAGCoheranceMarcheType flagCoheranceMarche;
    @XmlElement(name = "VOUT_Marche", required = true)
    protected VOUTMarcheType voutMarche;
    @XmlElement(name = "VOUT_Segment", required = true)
    protected VOUTSegmentType voutSegment;
    @XmlElement(name = "VOUT_Profession", required = true)
    protected VOUTProfessionType voutProfession;
    @XmlElement(name = "VOUT_Fonction", required = true)
    protected VOUTFonctionType voutFonction;
    @XmlElement(name = "VOUT_Revenu", required = true)
    protected VOUTRevenuType voutRevenu;
    @XmlElement(name = "VOUT_Charge", required = true)
    protected VOUTChargeType voutCharge;
    @XmlElement(name = "Decision_Offre_Max", required = true)
    protected DecisionOffreMaxType decisionOffreMax;
    @XmlElement(name = "Capacite_END", required = true)
    protected CapaciteENDType capaciteEND;
    @XmlElement(name = "Offre_Max", required = true)
    protected OffreMaxType offreMax;
    @XmlElement(name = "Duree_Max", required = true)
    protected DureeMaxType dureeMax;
    @XmlElement(name = "Mensualite_Offre_Max", required = true)
    protected MensualiteOffreMaxType mensualiteOffreMax;

    /**
     * Obtient la valeur de la propriété voutSocieteGestion.
     * 
     * @return
     *     possible object is
     *     {@link VOUTSocieteGestionType }
     *     
     */
    public VOUTSocieteGestionType getVOUTSocieteGestion() {
        return voutSocieteGestion;
    }

    /**
     * Définit la valeur de la propriété voutSocieteGestion.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTSocieteGestionType }
     *     
     */
    public void setVOUTSocieteGestion(VOUTSocieteGestionType value) {
        this.voutSocieteGestion = value;
    }

    /**
     * Obtient la valeur de la propriété codeIdentifiant.
     * 
     * @return
     *     possible object is
     *     {@link CodeIdentifiantType }
     *     
     */
    public CodeIdentifiantType getCodeIdentifiant() {
        return codeIdentifiant;
    }

    /**
     * Définit la valeur de la propriété codeIdentifiant.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeIdentifiantType }
     *     
     */
    public void setCodeIdentifiant(CodeIdentifiantType value) {
        this.codeIdentifiant = value;
    }

    /**
     * Obtient la valeur de la propriété flagCoheranceMarche.
     * 
     * @return
     *     possible object is
     *     {@link FLAGCoheranceMarcheType }
     *     
     */
    public FLAGCoheranceMarcheType getFLAGCoheranceMarche() {
        return flagCoheranceMarche;
    }

    /**
     * Définit la valeur de la propriété flagCoheranceMarche.
     * 
     * @param value
     *     allowed object is
     *     {@link FLAGCoheranceMarcheType }
     *     
     */
    public void setFLAGCoheranceMarche(FLAGCoheranceMarcheType value) {
        this.flagCoheranceMarche = value;
    }

    /**
     * Obtient la valeur de la propriété voutMarche.
     * 
     * @return
     *     possible object is
     *     {@link VOUTMarcheType }
     *     
     */
    public VOUTMarcheType getVOUTMarche() {
        return voutMarche;
    }

    /**
     * Définit la valeur de la propriété voutMarche.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTMarcheType }
     *     
     */
    public void setVOUTMarche(VOUTMarcheType value) {
        this.voutMarche = value;
    }

    /**
     * Obtient la valeur de la propriété voutSegment.
     * 
     * @return
     *     possible object is
     *     {@link VOUTSegmentType }
     *     
     */
    public VOUTSegmentType getVOUTSegment() {
        return voutSegment;
    }

    /**
     * Définit la valeur de la propriété voutSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTSegmentType }
     *     
     */
    public void setVOUTSegment(VOUTSegmentType value) {
        this.voutSegment = value;
    }

    /**
     * Obtient la valeur de la propriété voutProfession.
     * 
     * @return
     *     possible object is
     *     {@link VOUTProfessionType }
     *     
     */
    public VOUTProfessionType getVOUTProfession() {
        return voutProfession;
    }

    /**
     * Définit la valeur de la propriété voutProfession.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTProfessionType }
     *     
     */
    public void setVOUTProfession(VOUTProfessionType value) {
        this.voutProfession = value;
    }

    /**
     * Obtient la valeur de la propriété voutFonction.
     * 
     * @return
     *     possible object is
     *     {@link VOUTFonctionType }
     *     
     */
    public VOUTFonctionType getVOUTFonction() {
        return voutFonction;
    }

    /**
     * Définit la valeur de la propriété voutFonction.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTFonctionType }
     *     
     */
    public void setVOUTFonction(VOUTFonctionType value) {
        this.voutFonction = value;
    }

    /**
     * Obtient la valeur de la propriété voutRevenu.
     * 
     * @return
     *     possible object is
     *     {@link VOUTRevenuType }
     *     
     */
    public VOUTRevenuType getVOUTRevenu() {
        return voutRevenu;
    }

    /**
     * Définit la valeur de la propriété voutRevenu.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTRevenuType }
     *     
     */
    public void setVOUTRevenu(VOUTRevenuType value) {
        this.voutRevenu = value;
    }

    /**
     * Obtient la valeur de la propriété voutCharge.
     * 
     * @return
     *     possible object is
     *     {@link VOUTChargeType }
     *     
     */
    public VOUTChargeType getVOUTCharge() {
        return voutCharge;
    }

    /**
     * Définit la valeur de la propriété voutCharge.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTChargeType }
     *     
     */
    public void setVOUTCharge(VOUTChargeType value) {
        this.voutCharge = value;
    }

    /**
     * Obtient la valeur de la propriété decisionOffreMax.
     * 
     * @return
     *     possible object is
     *     {@link DecisionOffreMaxType }
     *     
     */
    public DecisionOffreMaxType getDecisionOffreMax() {
        return decisionOffreMax;
    }

    /**
     * Définit la valeur de la propriété decisionOffreMax.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionOffreMaxType }
     *     
     */
    public void setDecisionOffreMax(DecisionOffreMaxType value) {
        this.decisionOffreMax = value;
    }

    /**
     * Obtient la valeur de la propriété capaciteEND.
     * 
     * @return
     *     possible object is
     *     {@link CapaciteENDType }
     *     
     */
    public CapaciteENDType getCapaciteEND() {
        return capaciteEND;
    }

    /**
     * Définit la valeur de la propriété capaciteEND.
     * 
     * @param value
     *     allowed object is
     *     {@link CapaciteENDType }
     *     
     */
    public void setCapaciteEND(CapaciteENDType value) {
        this.capaciteEND = value;
    }

    /**
     * Obtient la valeur de la propriété offreMax.
     * 
     * @return
     *     possible object is
     *     {@link OffreMaxType }
     *     
     */
    public OffreMaxType getOffreMax() {
        return offreMax;
    }

    /**
     * Définit la valeur de la propriété offreMax.
     * 
     * @param value
     *     allowed object is
     *     {@link OffreMaxType }
     *     
     */
    public void setOffreMax(OffreMaxType value) {
        this.offreMax = value;
    }

    /**
     * Obtient la valeur de la propriété dureeMax.
     * 
     * @return
     *     possible object is
     *     {@link DureeMaxType }
     *     
     */
    public DureeMaxType getDureeMax() {
        return dureeMax;
    }

    /**
     * Définit la valeur de la propriété dureeMax.
     * 
     * @param value
     *     allowed object is
     *     {@link DureeMaxType }
     *     
     */
    public void setDureeMax(DureeMaxType value) {
        this.dureeMax = value;
    }

    /**
     * Obtient la valeur de la propriété mensualiteOffreMax.
     * 
     * @return
     *     possible object is
     *     {@link MensualiteOffreMaxType }
     *     
     */
    public MensualiteOffreMaxType getMensualiteOffreMax() {
        return mensualiteOffreMax;
    }

    /**
     * Définit la valeur de la propriété mensualiteOffreMax.
     * 
     * @param value
     *     allowed object is
     *     {@link MensualiteOffreMaxType }
     *     
     */
    public void setMensualiteOffreMax(MensualiteOffreMaxType value) {
        this.mensualiteOffreMax = value;
    }

}
