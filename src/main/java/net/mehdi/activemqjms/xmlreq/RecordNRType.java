
package net.mehdi.activemqjms.xmlreq;

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
 *         &lt;element name="VIN_Random_Number" type="{}VIN_Random_NumberType"/&gt;
 *         &lt;element name="VIN_Societe_Gestion" type="{}VIN_Societe_GestionType"/&gt;
 *         &lt;element name="VIN_Date_Demande" type="{}VIN_Date_DemandeType"/&gt;
 *         &lt;element name="VIN_Numero_Demande" type="{}VIN_Numero_DemandeType"/&gt;
 *         &lt;element name="VIN_Code_Agence" type="{}VIN_Code_AgenceType"/&gt;
 *         &lt;element name="VIN_Categorie_Affaire" type="{}VIN_Categorie_AffaireType"/&gt;
 *         &lt;element name="VIN_Type_Prelevement" type="{}VIN_Type_PrelevementType"/&gt;
 *         &lt;element name="VIN_Montant_Demande" type="{}VIN_Montant_DemandeType"/&gt;
 *         &lt;element name="VIN_Duree_Demande" type="{}VIN_Duree_DemandeType"/&gt;
 *         &lt;element name="VIN_Mensualite_Demande" type="{}VIN_Mensualite_DemandeType"/&gt;
 *         &lt;element name="VIN_Prem_Loyer" type="{}VIN_Prem_LoyerType"/&gt;
 *         &lt;element name="VIN_Montant_Apport" type="{}VIN_Montant_ApportType"/&gt;
 *         &lt;element name="VIN_Prix_Vehicule" type="{}VIN_Prix_VehiculeType"/&gt;
 *         &lt;element name="VIN_Date_Mise_Circ" type="{}VIN_Date_Mise_CircType"/&gt;
 *         &lt;element name="VIN_Taux_Interet" type="{}VIN_Taux_InteretType"/&gt;
 *         &lt;element name="VIN_Depot_Garantie" type="{}VIN_Depot_GarantieType"/&gt;
 *         &lt;element name="VIN_NUM_LANCEMENT" type="{}VIN_NUM_LANCEMENTType"/&gt;
 *         &lt;element name="VIN_Echeance_reservation" type="{}VIN_Echeance_reservationType"/&gt;
 *         &lt;element name="VIN_Echeance_confirmation" type="{}VIN_Echeance_confirmationType"/&gt;
 *         &lt;element name="VIN_Date_reservation" type="{}VIN_Date_reservationType"/&gt;
 *         &lt;element name="VIN_Date_confirmation" type="{}VIN_Date_confirmationType"/&gt;
 *         &lt;element name="VIN_Code_Fournisseur" type="{}VIN_Code_FournisseurType"/&gt;
 *         &lt;element name="VIN_Code_Gestionnaire" type="{}VIN_Code_GestionnaireType"/&gt;
 *         &lt;element name="VIN_Flag_Flotte" type="{}VIN_Flag_FlotteType"/&gt;
 *         &lt;element name="VIN_Prix_Vente_Catalogue" type="{}VIN_Prix_Vente_CatalogueType"/&gt;
 *         &lt;element name="VIN_Marque" type="{}VIN_MarqueType"/&gt;
 *         &lt;element name="VIN_Genre" type="{}VIN_GenreType"/&gt;
 *         &lt;element name="VIN_Gamme" type="{}VIN_GammeType"/&gt;
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
    "vinRandomNumber",
    "vinSocieteGestion",
    "vinDateDemande",
    "vinNumeroDemande",
    "vinCodeAgence",
    "vinCategorieAffaire",
    "vinTypePrelevement",
    "vinMontantDemande",
    "vinDureeDemande",
    "vinMensualiteDemande",
    "vinPremLoyer",
    "vinMontantApport",
    "vinPrixVehicule",
    "vinDateMiseCirc",
    "vinTauxInteret",
    "vinDepotGarantie",
    "vinnumlancement",
    "vinEcheanceReservation",
    "vinEcheanceConfirmation",
    "vinDateReservation",
    "vinDateConfirmation",
    "vinCodeFournisseur",
    "vinCodeGestionnaire",
    "vinFlagFlotte",
    "vinPrixVenteCatalogue",
    "vinMarque",
    "vinGenre",
    "vinGamme"
})
public class RecordNRType {

    @XmlElement(name = "VIN_Random_Number", required = true)
    protected VINRandomNumberType vinRandomNumber;
    @XmlElement(name = "VIN_Societe_Gestion", required = true)
    protected VINSocieteGestionType vinSocieteGestion;
    @XmlElement(name = "VIN_Date_Demande", required = true)
    protected VINDateDemandeType vinDateDemande;
    @XmlElement(name = "VIN_Numero_Demande", required = true)
    protected VINNumeroDemandeType vinNumeroDemande;
    @XmlElement(name = "VIN_Code_Agence", required = true)
    protected VINCodeAgenceType vinCodeAgence;
    @XmlElement(name = "VIN_Categorie_Affaire", required = true)
    protected VINCategorieAffaireType vinCategorieAffaire;
    @XmlElement(name = "VIN_Type_Prelevement", required = true)
    protected VINTypePrelevementType vinTypePrelevement;
    @XmlElement(name = "VIN_Montant_Demande", required = true)
    protected VINMontantDemandeType vinMontantDemande;
    @XmlElement(name = "VIN_Duree_Demande", required = true)
    protected VINDureeDemandeType vinDureeDemande;
    @XmlElement(name = "VIN_Mensualite_Demande", required = true)
    protected VINMensualiteDemandeType vinMensualiteDemande;
    @XmlElement(name = "VIN_Prem_Loyer", required = true)
    protected VINPremLoyerType vinPremLoyer;
    @XmlElement(name = "VIN_Montant_Apport", required = true)
    protected VINMontantApportType vinMontantApport;
    @XmlElement(name = "VIN_Prix_Vehicule", required = true)
    protected VINPrixVehiculeType vinPrixVehicule;
    @XmlElement(name = "VIN_Date_Mise_Circ", required = true)
    protected VINDateMiseCircType vinDateMiseCirc;
    @XmlElement(name = "VIN_Taux_Interet", required = true)
    protected VINTauxInteretType vinTauxInteret;
    @XmlElement(name = "VIN_Depot_Garantie", required = true)
    protected VINDepotGarantieType vinDepotGarantie;
    @XmlElement(name = "VIN_NUM_LANCEMENT", required = true)
    protected VINNUMLANCEMENTType vinnumlancement;
    @XmlElement(name = "VIN_Echeance_reservation", required = true)
    protected VINEcheanceReservationType vinEcheanceReservation;
    @XmlElement(name = "VIN_Echeance_confirmation", required = true)
    protected VINEcheanceConfirmationType vinEcheanceConfirmation;
    @XmlElement(name = "VIN_Date_reservation", required = true)
    protected VINDateReservationType vinDateReservation;
    @XmlElement(name = "VIN_Date_confirmation", required = true)
    protected VINDateConfirmationType vinDateConfirmation;
    @XmlElement(name = "VIN_Code_Fournisseur", required = true)
    protected VINCodeFournisseurType vinCodeFournisseur;
    @XmlElement(name = "VIN_Code_Gestionnaire", required = true)
    protected VINCodeGestionnaireType vinCodeGestionnaire;
    @XmlElement(name = "VIN_Flag_Flotte", required = true)
    protected VINFlagFlotteType vinFlagFlotte;
    @XmlElement(name = "VIN_Prix_Vente_Catalogue", required = true)
    protected VINPrixVenteCatalogueType vinPrixVenteCatalogue;
    @XmlElement(name = "VIN_Marque", required = true)
    protected VINMarqueType vinMarque;
    @XmlElement(name = "VIN_Genre", required = true)
    protected VINGenreType vinGenre;
    @XmlElement(name = "VIN_Gamme", required = true)
    protected VINGammeType vinGamme;

    /**
     * Obtient la valeur de la propriété vinRandomNumber.
     * 
     * @return
     *     possible object is
     *     {@link VINRandomNumberType }
     *     
     */
    public VINRandomNumberType getVINRandomNumber() {
        return vinRandomNumber;
    }

    /**
     * Définit la valeur de la propriété vinRandomNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRandomNumberType }
     *     
     */
    public void setVINRandomNumber(VINRandomNumberType value) {
        this.vinRandomNumber = value;
    }

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
     * Obtient la valeur de la propriété vinNumeroDemande.
     * 
     * @return
     *     possible object is
     *     {@link VINNumeroDemandeType }
     *     
     */
    public VINNumeroDemandeType getVINNumeroDemande() {
        return vinNumeroDemande;
    }

    /**
     * Définit la valeur de la propriété vinNumeroDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNumeroDemandeType }
     *     
     */
    public void setVINNumeroDemande(VINNumeroDemandeType value) {
        this.vinNumeroDemande = value;
    }

    /**
     * Obtient la valeur de la propriété vinCodeAgence.
     * 
     * @return
     *     possible object is
     *     {@link VINCodeAgenceType }
     *     
     */
    public VINCodeAgenceType getVINCodeAgence() {
        return vinCodeAgence;
    }

    /**
     * Définit la valeur de la propriété vinCodeAgence.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCodeAgenceType }
     *     
     */
    public void setVINCodeAgence(VINCodeAgenceType value) {
        this.vinCodeAgence = value;
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
     * Obtient la valeur de la propriété vinTypePrelevement.
     * 
     * @return
     *     possible object is
     *     {@link VINTypePrelevementType }
     *     
     */
    public VINTypePrelevementType getVINTypePrelevement() {
        return vinTypePrelevement;
    }

    /**
     * Définit la valeur de la propriété vinTypePrelevement.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTypePrelevementType }
     *     
     */
    public void setVINTypePrelevement(VINTypePrelevementType value) {
        this.vinTypePrelevement = value;
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
     * Obtient la valeur de la propriété vinDureeDemande.
     * 
     * @return
     *     possible object is
     *     {@link VINDureeDemandeType }
     *     
     */
    public VINDureeDemandeType getVINDureeDemande() {
        return vinDureeDemande;
    }

    /**
     * Définit la valeur de la propriété vinDureeDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDureeDemandeType }
     *     
     */
    public void setVINDureeDemande(VINDureeDemandeType value) {
        this.vinDureeDemande = value;
    }

    /**
     * Obtient la valeur de la propriété vinMensualiteDemande.
     * 
     * @return
     *     possible object is
     *     {@link VINMensualiteDemandeType }
     *     
     */
    public VINMensualiteDemandeType getVINMensualiteDemande() {
        return vinMensualiteDemande;
    }

    /**
     * Définit la valeur de la propriété vinMensualiteDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMensualiteDemandeType }
     *     
     */
    public void setVINMensualiteDemande(VINMensualiteDemandeType value) {
        this.vinMensualiteDemande = value;
    }

    /**
     * Obtient la valeur de la propriété vinPremLoyer.
     * 
     * @return
     *     possible object is
     *     {@link VINPremLoyerType }
     *     
     */
    public VINPremLoyerType getVINPremLoyer() {
        return vinPremLoyer;
    }

    /**
     * Définit la valeur de la propriété vinPremLoyer.
     * 
     * @param value
     *     allowed object is
     *     {@link VINPremLoyerType }
     *     
     */
    public void setVINPremLoyer(VINPremLoyerType value) {
        this.vinPremLoyer = value;
    }

    /**
     * Obtient la valeur de la propriété vinMontantApport.
     * 
     * @return
     *     possible object is
     *     {@link VINMontantApportType }
     *     
     */
    public VINMontantApportType getVINMontantApport() {
        return vinMontantApport;
    }

    /**
     * Définit la valeur de la propriété vinMontantApport.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMontantApportType }
     *     
     */
    public void setVINMontantApport(VINMontantApportType value) {
        this.vinMontantApport = value;
    }

    /**
     * Obtient la valeur de la propriété vinPrixVehicule.
     * 
     * @return
     *     possible object is
     *     {@link VINPrixVehiculeType }
     *     
     */
    public VINPrixVehiculeType getVINPrixVehicule() {
        return vinPrixVehicule;
    }

    /**
     * Définit la valeur de la propriété vinPrixVehicule.
     * 
     * @param value
     *     allowed object is
     *     {@link VINPrixVehiculeType }
     *     
     */
    public void setVINPrixVehicule(VINPrixVehiculeType value) {
        this.vinPrixVehicule = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateMiseCirc.
     * 
     * @return
     *     possible object is
     *     {@link VINDateMiseCircType }
     *     
     */
    public VINDateMiseCircType getVINDateMiseCirc() {
        return vinDateMiseCirc;
    }

    /**
     * Définit la valeur de la propriété vinDateMiseCirc.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateMiseCircType }
     *     
     */
    public void setVINDateMiseCirc(VINDateMiseCircType value) {
        this.vinDateMiseCirc = value;
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
     * Obtient la valeur de la propriété vinDepotGarantie.
     * 
     * @return
     *     possible object is
     *     {@link VINDepotGarantieType }
     *     
     */
    public VINDepotGarantieType getVINDepotGarantie() {
        return vinDepotGarantie;
    }

    /**
     * Définit la valeur de la propriété vinDepotGarantie.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDepotGarantieType }
     *     
     */
    public void setVINDepotGarantie(VINDepotGarantieType value) {
        this.vinDepotGarantie = value;
    }

    /**
     * Obtient la valeur de la propriété vinnumlancement.
     * 
     * @return
     *     possible object is
     *     {@link VINNUMLANCEMENTType }
     *     
     */
    public VINNUMLANCEMENTType getVINNUMLANCEMENT() {
        return vinnumlancement;
    }

    /**
     * Définit la valeur de la propriété vinnumlancement.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNUMLANCEMENTType }
     *     
     */
    public void setVINNUMLANCEMENT(VINNUMLANCEMENTType value) {
        this.vinnumlancement = value;
    }

    /**
     * Obtient la valeur de la propriété vinEcheanceReservation.
     * 
     * @return
     *     possible object is
     *     {@link VINEcheanceReservationType }
     *     
     */
    public VINEcheanceReservationType getVINEcheanceReservation() {
        return vinEcheanceReservation;
    }

    /**
     * Définit la valeur de la propriété vinEcheanceReservation.
     * 
     * @param value
     *     allowed object is
     *     {@link VINEcheanceReservationType }
     *     
     */
    public void setVINEcheanceReservation(VINEcheanceReservationType value) {
        this.vinEcheanceReservation = value;
    }

    /**
     * Obtient la valeur de la propriété vinEcheanceConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link VINEcheanceConfirmationType }
     *     
     */
    public VINEcheanceConfirmationType getVINEcheanceConfirmation() {
        return vinEcheanceConfirmation;
    }

    /**
     * Définit la valeur de la propriété vinEcheanceConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link VINEcheanceConfirmationType }
     *     
     */
    public void setVINEcheanceConfirmation(VINEcheanceConfirmationType value) {
        this.vinEcheanceConfirmation = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateReservation.
     * 
     * @return
     *     possible object is
     *     {@link VINDateReservationType }
     *     
     */
    public VINDateReservationType getVINDateReservation() {
        return vinDateReservation;
    }

    /**
     * Définit la valeur de la propriété vinDateReservation.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateReservationType }
     *     
     */
    public void setVINDateReservation(VINDateReservationType value) {
        this.vinDateReservation = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link VINDateConfirmationType }
     *     
     */
    public VINDateConfirmationType getVINDateConfirmation() {
        return vinDateConfirmation;
    }

    /**
     * Définit la valeur de la propriété vinDateConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateConfirmationType }
     *     
     */
    public void setVINDateConfirmation(VINDateConfirmationType value) {
        this.vinDateConfirmation = value;
    }

    /**
     * Obtient la valeur de la propriété vinCodeFournisseur.
     * 
     * @return
     *     possible object is
     *     {@link VINCodeFournisseurType }
     *     
     */
    public VINCodeFournisseurType getVINCodeFournisseur() {
        return vinCodeFournisseur;
    }

    /**
     * Définit la valeur de la propriété vinCodeFournisseur.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCodeFournisseurType }
     *     
     */
    public void setVINCodeFournisseur(VINCodeFournisseurType value) {
        this.vinCodeFournisseur = value;
    }

    /**
     * Obtient la valeur de la propriété vinCodeGestionnaire.
     * 
     * @return
     *     possible object is
     *     {@link VINCodeGestionnaireType }
     *     
     */
    public VINCodeGestionnaireType getVINCodeGestionnaire() {
        return vinCodeGestionnaire;
    }

    /**
     * Définit la valeur de la propriété vinCodeGestionnaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCodeGestionnaireType }
     *     
     */
    public void setVINCodeGestionnaire(VINCodeGestionnaireType value) {
        this.vinCodeGestionnaire = value;
    }

    /**
     * Obtient la valeur de la propriété vinFlagFlotte.
     * 
     * @return
     *     possible object is
     *     {@link VINFlagFlotteType }
     *     
     */
    public VINFlagFlotteType getVINFlagFlotte() {
        return vinFlagFlotte;
    }

    /**
     * Définit la valeur de la propriété vinFlagFlotte.
     * 
     * @param value
     *     allowed object is
     *     {@link VINFlagFlotteType }
     *     
     */
    public void setVINFlagFlotte(VINFlagFlotteType value) {
        this.vinFlagFlotte = value;
    }

    /**
     * Obtient la valeur de la propriété vinPrixVenteCatalogue.
     * 
     * @return
     *     possible object is
     *     {@link VINPrixVenteCatalogueType }
     *     
     */
    public VINPrixVenteCatalogueType getVINPrixVenteCatalogue() {
        return vinPrixVenteCatalogue;
    }

    /**
     * Définit la valeur de la propriété vinPrixVenteCatalogue.
     * 
     * @param value
     *     allowed object is
     *     {@link VINPrixVenteCatalogueType }
     *     
     */
    public void setVINPrixVenteCatalogue(VINPrixVenteCatalogueType value) {
        this.vinPrixVenteCatalogue = value;
    }

    /**
     * Obtient la valeur de la propriété vinMarque.
     * 
     * @return
     *     possible object is
     *     {@link VINMarqueType }
     *     
     */
    public VINMarqueType getVINMarque() {
        return vinMarque;
    }

    /**
     * Définit la valeur de la propriété vinMarque.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMarqueType }
     *     
     */
    public void setVINMarque(VINMarqueType value) {
        this.vinMarque = value;
    }

    /**
     * Obtient la valeur de la propriété vinGenre.
     * 
     * @return
     *     possible object is
     *     {@link VINGenreType }
     *     
     */
    public VINGenreType getVINGenre() {
        return vinGenre;
    }

    /**
     * Définit la valeur de la propriété vinGenre.
     * 
     * @param value
     *     allowed object is
     *     {@link VINGenreType }
     *     
     */
    public void setVINGenre(VINGenreType value) {
        this.vinGenre = value;
    }

    /**
     * Obtient la valeur de la propriété vinGamme.
     * 
     * @return
     *     possible object is
     *     {@link VINGammeType }
     *     
     */
    public VINGammeType getVINGamme() {
        return vinGamme;
    }

    /**
     * Définit la valeur de la propriété vinGamme.
     * 
     * @param value
     *     allowed object is
     *     {@link VINGammeType }
     *     
     */
    public void setVINGamme(VINGammeType value) {
        this.vinGamme = value;
    }

}
