
package net.mehdi.activemqjms.dtos.presCoreDTO.req_dtos;

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
 *         &lt;element name="VIN_Societe_Gestion" type="{}VIN_Societe_GestionType"/&gt;
 *         &lt;element name="Code_Identifiant" type="{}Code_IdentifiantType"/&gt;
 *         &lt;element name="VIN_Date_Demande" type="{}VIN_Date_DemandeType"/&gt;
 *         &lt;element name="VIN_Categorie_Affaire" type="{}VIN_Categorie_AffaireType"/&gt;
 *         &lt;element name="VIN_Marche" type="{}VIN_MarcheType"/&gt;
 *         &lt;element name="VIN_Segment" type="{}VIN_SegmentType"/&gt;
 *         &lt;element name="VIN_Profession" type="{}VIN_ProfessionType"/&gt;
 *         &lt;element name="VIN_Employeur" type="{}VIN_EmployeurType"/&gt;
 *         &lt;element name="VIN_Fonction" type="{}VIN_FonctionType"/&gt;
 *         &lt;element name="VIN_Date_Naissance" type="{}VIN_Date_NaissanceType"/&gt;
 *         &lt;element name="VIN_Montant_Demande" type="{}VIN_Montant_DemandeType"/&gt;
 *         &lt;element name="VIN_Duree" type="{}VIN_DureeType"/&gt;
 *         &lt;element name="VIN_Mensualite" type="{}VIN_MensualiteType"/&gt;
 *         &lt;element name="VIN_Taux_Interet" type="{}VIN_Taux_InteretType"/&gt;
 *         &lt;element name="VIN_Revenu" type="{}VIN_RevenuType"/&gt;
 *         &lt;element name="VIN_Charge" type="{}VIN_ChargeType"/&gt;
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
    "vinSocieteGestion",
    "codeIdentifiant",
    "vinDateDemande",
    "vinCategorieAffaire",
    "vinMarche",
    "vinSegment",
    "vinProfession",
    "vinEmployeur",
    "vinFonction",
    "vinDateNaissance",
    "vinMontantDemande",
    "vinDuree",
    "vinMensualite",
    "vinTauxInteret",
    "vinRevenu",
    "vinCharge"
})
public class RecordNRPresDTO {

    @XmlElement(name = "VIN_Societe_Gestion", required = true)
    protected VINSocieteGestionType vinSocieteGestion;
    @XmlElement(name = "Code_Identifiant", required = true)
    protected CodeIdentifiantType codeIdentifiant;
    @XmlElement(name = "VIN_Date_Demande", required = true)
    protected VINDateDemandeType vinDateDemande;
    @XmlElement(name = "VIN_Categorie_Affaire", required = true)
    protected VINCategorieAffaireType vinCategorieAffaire;
    @XmlElement(name = "VIN_Marche", required = true)
    protected VINMarcheType vinMarche;
    @XmlElement(name = "VIN_Segment", required = true)
    protected VINSegmentType vinSegment;
    @XmlElement(name = "VIN_Profession", required = true)
    protected VINProfessionType vinProfession;
    @XmlElement(name = "VIN_Employeur", required = true)
    protected VINEmployeurType vinEmployeur;
    @XmlElement(name = "VIN_Fonction", required = true)
    protected VINFonctionType vinFonction;
    @XmlElement(name = "VIN_Date_Naissance", required = true)
    protected VINDateNaissanceType vinDateNaissance;
    @XmlElement(name = "VIN_Montant_Demande", required = true)
    protected VINMontantDemandeType vinMontantDemande;
    @XmlElement(name = "VIN_Duree", required = true)
    protected VINDureeType vinDuree;
    @XmlElement(name = "VIN_Mensualite", required = true)
    protected VINMensualiteType vinMensualite;
    @XmlElement(name = "VIN_Taux_Interet", required = true)
    protected VINTauxInteretType vinTauxInteret;
    @XmlElement(name = "VIN_Revenu", required = true)
    protected VINRevenuType vinRevenu;
    @XmlElement(name = "VIN_Charge", required = true)
    protected VINChargeType vinCharge;

    /**
     * Obtient la valeur de la propriété vinSocieteGestion.
     * 
     * @return
     *     possible object is
     *     {@link VINSocieteGestionType }
     *     
     */
    public VINSocieteGestionType getVINSocieteGestion() {
        return vinSocieteGestion;
    }

    /**
     * Définit la valeur de la propriété vinSocieteGestion.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSocieteGestionType }
     *     
     */
    public void setVINSocieteGestion(VINSocieteGestionType value) {
        this.vinSocieteGestion = value;
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
     * Obtient la valeur de la propriété vinDateDemande.
     * 
     * @return
     *     possible object is
     *     {@link VINDateDemandeType }
     *     
     */
    public VINDateDemandeType getVINDateDemande() {
        return vinDateDemande;
    }

    /**
     * Définit la valeur de la propriété vinDateDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateDemandeType }
     *     
     */
    public void setVINDateDemande(VINDateDemandeType value) {
        this.vinDateDemande = value;
    }

    /**
     * Obtient la valeur de la propriété vinCategorieAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VINCategorieAffaireType }
     *     
     */
    public VINCategorieAffaireType getVINCategorieAffaire() {
        return vinCategorieAffaire;
    }

    /**
     * Définit la valeur de la propriété vinCategorieAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCategorieAffaireType }
     *     
     */
    public void setVINCategorieAffaire(VINCategorieAffaireType value) {
        this.vinCategorieAffaire = value;
    }

    /**
     * Obtient la valeur de la propriété vinMarche.
     * 
     * @return
     *     possible object is
     *     {@link VINMarcheType }
     *     
     */
    public VINMarcheType getVINMarche() {
        return vinMarche;
    }

    /**
     * Définit la valeur de la propriété vinMarche.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMarcheType }
     *     
     */
    public void setVINMarche(VINMarcheType value) {
        this.vinMarche = value;
    }

    /**
     * Obtient la valeur de la propriété vinSegment.
     * 
     * @return
     *     possible object is
     *     {@link VINSegmentType }
     *     
     */
    public VINSegmentType getVINSegment() {
        return vinSegment;
    }

    /**
     * Définit la valeur de la propriété vinSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSegmentType }
     *     
     */
    public void setVINSegment(VINSegmentType value) {
        this.vinSegment = value;
    }

    /**
     * Obtient la valeur de la propriété vinProfession.
     * 
     * @return
     *     possible object is
     *     {@link VINProfessionType }
     *     
     */
    public VINProfessionType getVINProfession() {
        return vinProfession;
    }

    /**
     * Définit la valeur de la propriété vinProfession.
     * 
     * @param value
     *     allowed object is
     *     {@link VINProfessionType }
     *     
     */
    public void setVINProfession(VINProfessionType value) {
        this.vinProfession = value;
    }

    /**
     * Obtient la valeur de la propriété vinEmployeur.
     * 
     * @return
     *     possible object is
     *     {@link VINEmployeurType }
     *     
     */
    public VINEmployeurType getVINEmployeur() {
        return vinEmployeur;
    }

    /**
     * Définit la valeur de la propriété vinEmployeur.
     * 
     * @param value
     *     allowed object is
     *     {@link VINEmployeurType }
     *     
     */
    public void setVINEmployeur(VINEmployeurType value) {
        this.vinEmployeur = value;
    }

    /**
     * Obtient la valeur de la propriété vinFonction.
     * 
     * @return
     *     possible object is
     *     {@link VINFonctionType }
     *     
     */
    public VINFonctionType getVINFonction() {
        return vinFonction;
    }

    /**
     * Définit la valeur de la propriété vinFonction.
     * 
     * @param value
     *     allowed object is
     *     {@link VINFonctionType }
     *     
     */
    public void setVINFonction(VINFonctionType value) {
        this.vinFonction = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateNaissance.
     * 
     * @return
     *     possible object is
     *     {@link VINDateNaissanceType }
     *     
     */
    public VINDateNaissanceType getVINDateNaissance() {
        return vinDateNaissance;
    }

    /**
     * Définit la valeur de la propriété vinDateNaissance.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateNaissanceType }
     *     
     */
    public void setVINDateNaissance(VINDateNaissanceType value) {
        this.vinDateNaissance = value;
    }

    /**
     * Obtient la valeur de la propriété vinMontantDemande.
     * 
     * @return
     *     possible object is
     *     {@link VINMontantDemandeType }
     *     
     */
    public VINMontantDemandeType getVINMontantDemande() {
        return vinMontantDemande;
    }

    /**
     * Définit la valeur de la propriété vinMontantDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMontantDemandeType }
     *     
     */
    public void setVINMontantDemande(VINMontantDemandeType value) {
        this.vinMontantDemande = value;
    }

    /**
     * Obtient la valeur de la propriété vinDuree.
     * 
     * @return
     *     possible object is
     *     {@link VINDureeType }
     *     
     */
    public VINDureeType getVINDuree() {
        return vinDuree;
    }

    /**
     * Définit la valeur de la propriété vinDuree.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDureeType }
     *     
     */
    public void setVINDuree(VINDureeType value) {
        this.vinDuree = value;
    }

    /**
     * Obtient la valeur de la propriété vinMensualite.
     * 
     * @return
     *     possible object is
     *     {@link VINMensualiteType }
     *     
     */
    public VINMensualiteType getVINMensualite() {
        return vinMensualite;
    }

    /**
     * Définit la valeur de la propriété vinMensualite.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMensualiteType }
     *     
     */
    public void setVINMensualite(VINMensualiteType value) {
        this.vinMensualite = value;
    }

    /**
     * Obtient la valeur de la propriété vinTauxInteret.
     * 
     * @return
     *     possible object is
     *     {@link VINTauxInteretType }
     *     
     */
    public VINTauxInteretType getVINTauxInteret() {
        return vinTauxInteret;
    }

    /**
     * Définit la valeur de la propriété vinTauxInteret.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTauxInteretType }
     *     
     */
    public void setVINTauxInteret(VINTauxInteretType value) {
        this.vinTauxInteret = value;
    }

    /**
     * Obtient la valeur de la propriété vinRevenu.
     * 
     * @return
     *     possible object is
     *     {@link VINRevenuType }
     *     
     */
    public VINRevenuType getVINRevenu() {
        return vinRevenu;
    }

    /**
     * Définit la valeur de la propriété vinRevenu.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRevenuType }
     *     
     */
    public void setVINRevenu(VINRevenuType value) {
        this.vinRevenu = value;
    }

    /**
     * Obtient la valeur de la propriété vinCharge.
     * 
     * @return
     *     possible object is
     *     {@link VINChargeType }
     *     
     */
    public VINChargeType getVINCharge() {
        return vinCharge;
    }

    /**
     * Définit la valeur de la propriété vinCharge.
     * 
     * @param value
     *     allowed object is
     *     {@link VINChargeType }
     *     
     */
    public void setVINCharge(VINChargeType value) {
        this.vinCharge = value;
    }

}
