
package net.mehdi.activemqjms.dtos.req_dtos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}VIN_Random_Number"/&gt;
 *         &lt;element ref="{}VIN_Societe_Gestion"/&gt;
 *         &lt;element ref="{}VIN_Date_Demande"/&gt;
 *         &lt;element ref="{}VIN_Numero_Demande"/&gt;
 *         &lt;element ref="{}VIN_Code_Agence"/&gt;
 *         &lt;element ref="{}VIN_Categorie_Affaire"/&gt;
 *         &lt;element ref="{}VIN_Type_Prelevement"/&gt;
 *         &lt;element ref="{}VIN_Montant_Demande"/&gt;
 *         &lt;element ref="{}VIN_Duree_Demande"/&gt;
 *         &lt;element ref="{}VIN_Mensualite_Demande"/&gt;
 *         &lt;element ref="{}VIN_Prem_Loyer"/&gt;
 *         &lt;element ref="{}VIN_Montant_Apport"/&gt;
 *         &lt;element ref="{}VIN_Prix_Vehicule"/&gt;
 *         &lt;element ref="{}VIN_Date_Mise_Circ"/&gt;
 *         &lt;element ref="{}VIN_Taux_Interet"/&gt;
 *         &lt;element ref="{}VIN_Depot_Garantie"/&gt;
 *         &lt;element ref="{}VIN_NUM_LANCEMENT"/&gt;
 *         &lt;element ref="{}VIN_Echeance_reservation"/&gt;
 *         &lt;element ref="{}VIN_Echeance_confirmation"/&gt;
 *         &lt;element ref="{}VIN_Date_reservation"/&gt;
 *         &lt;element ref="{}VIN_Date_confirmation"/&gt;
 *         &lt;element ref="{}VIN_Code_Fournisseur"/&gt;
 *         &lt;element ref="{}VIN_Code_Gestionnaire"/&gt;
 *         &lt;element ref="{}VIN_Flag_Flotte"/&gt;
 *         &lt;element ref="{}VIN_Prix_Vente_Catalogue"/&gt;
 *         &lt;element ref="{}VIN_Marque"/&gt;
 *         &lt;element ref="{}VIN_Genre"/&gt;
 *         &lt;element ref="{}VIN_Gamme"/&gt;
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
@XmlRootElement(name = "RecordNR")
public class RecordNRDTO {

    @XmlElement(name = "VIN_Random_Number", required = true)
    protected VINRandomNumber vinRandomNumber;
    @XmlElement(name = "VIN_Societe_Gestion", required = true)
    protected VINSocieteGestion vinSocieteGestion;
    @XmlElement(name = "VIN_Date_Demande", required = true)
    protected VINDateDemande vinDateDemande;
    @XmlElement(name = "VIN_Numero_Demande", required = true)
    protected VINNumeroDemande vinNumeroDemande;
    @XmlElement(name = "VIN_Code_Agence", required = true)
    protected VINCodeAgence vinCodeAgence;
    @XmlElement(name = "VIN_Categorie_Affaire", required = true)
    protected VINCategorieAffaire vinCategorieAffaire;
    @XmlElement(name = "VIN_Type_Prelevement", required = true)
    protected VINTypePrelevement vinTypePrelevement;
    @XmlElement(name = "VIN_Montant_Demande", required = true)
    protected VINMontantDemande vinMontantDemande;
    @XmlElement(name = "VIN_Duree_Demande", required = true)
    protected VINDureeDemande vinDureeDemande;
    @XmlElement(name = "VIN_Mensualite_Demande", required = true)
    protected VINMensualiteDemande vinMensualiteDemande;
    @XmlElement(name = "VIN_Prem_Loyer", required = true)
    protected VINPremLoyer vinPremLoyer;
    @XmlElement(name = "VIN_Montant_Apport", required = true)
    protected VINMontantApport vinMontantApport;
    @XmlElement(name = "VIN_Prix_Vehicule", required = true)
    protected VINPrixVehicule vinPrixVehicule;
    @XmlElement(name = "VIN_Date_Mise_Circ", required = true)
    protected VINDateMiseCirc vinDateMiseCirc;
    @XmlElement(name = "VIN_Taux_Interet", required = true)
    protected VINTauxInteret vinTauxInteret;
    @XmlElement(name = "VIN_Depot_Garantie", required = true)
    protected VINDepotGarantie vinDepotGarantie;
    @XmlElement(name = "VIN_NUM_LANCEMENT", required = true)
    protected VINNUMLANCEMENT vinnumlancement;
    @XmlElement(name = "VIN_Echeance_reservation", required = true)
    protected VINEcheanceReservation vinEcheanceReservation;
    @XmlElement(name = "VIN_Echeance_confirmation", required = true)
    protected VINEcheanceConfirmation vinEcheanceConfirmation;
    @XmlElement(name = "VIN_Date_reservation", required = true)
    protected VINDateReservation vinDateReservation;
    @XmlElement(name = "VIN_Date_confirmation", required = true)
    protected VINDateConfirmation vinDateConfirmation;
    @XmlElement(name = "VIN_Code_Fournisseur", required = true)
    protected VINCodeFournisseur vinCodeFournisseur;
    @XmlElement(name = "VIN_Code_Gestionnaire", required = true)
    protected VINCodeGestionnaire vinCodeGestionnaire;
    @XmlElement(name = "VIN_Flag_Flotte", required = true)
    protected VINFlagFlotte vinFlagFlotte;
    @XmlElement(name = "VIN_Prix_Vente_Catalogue", required = true)
    protected VINPrixVenteCatalogue vinPrixVenteCatalogue;
    @XmlElement(name = "VIN_Marque", required = true)
    protected VINMarque vinMarque;
    @XmlElement(name = "VIN_Genre", required = true)
    protected VINGenre vinGenre;
    @XmlElement(name = "VIN_Gamme", required = true)
    protected VINGamme vinGamme;

    /**
     * Obtient la valeur de la propriété vinRandomNumber.
     * 
     * @return
     *     possible object is
     *     {@link VINRandomNumber }
     *     
     */
    public VINRandomNumber getVINRandomNumber() {
        return vinRandomNumber;
    }

    /**
     * Définit la valeur de la propriété vinRandomNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRandomNumber }
     *     
     */
    public void setVINRandomNumber(VINRandomNumber value) {
        this.vinRandomNumber = value;
    }

    /**
     * Obtient la valeur de la propriété vinSocieteGestion.
     * 
     * @return
     *     possible object is
     *     {@link VINSocieteGestion }
     *     
     */
    public VINSocieteGestion getVINSocieteGestion() {
        return vinSocieteGestion;
    }

    /**
     * Définit la valeur de la propriété vinSocieteGestion.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSocieteGestion }
     *     
     */
    public void setVINSocieteGestion(VINSocieteGestion value) {
        this.vinSocieteGestion = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateDemande.
     * 
     * @return
     *     possible object is
     *     {@link VINDateDemande }
     *     
     */
    public VINDateDemande getVINDateDemande() {
        return vinDateDemande;
    }

    /**
     * Définit la valeur de la propriété vinDateDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateDemande }
     *     
     */
    public void setVINDateDemande(VINDateDemande value) {
        this.vinDateDemande = value;
    }

    /**
     * Obtient la valeur de la propriété vinNumeroDemande.
     * 
     * @return
     *     possible object is
     *     {@link VINNumeroDemande }
     *     
     */
    public VINNumeroDemande getVINNumeroDemande() {
        return vinNumeroDemande;
    }

    /**
     * Définit la valeur de la propriété vinNumeroDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNumeroDemande }
     *     
     */
    public void setVINNumeroDemande(VINNumeroDemande value) {
        this.vinNumeroDemande = value;
    }

    /**
     * Obtient la valeur de la propriété vinCodeAgence.
     * 
     * @return
     *     possible object is
     *     {@link VINCodeAgence }
     *     
     */
    public VINCodeAgence getVINCodeAgence() {
        return vinCodeAgence;
    }

    /**
     * Définit la valeur de la propriété vinCodeAgence.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCodeAgence }
     *     
     */
    public void setVINCodeAgence(VINCodeAgence value) {
        this.vinCodeAgence = value;
    }

    /**
     * Obtient la valeur de la propriété vinCategorieAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VINCategorieAffaire }
     *     
     */
    public VINCategorieAffaire getVINCategorieAffaire() {
        return vinCategorieAffaire;
    }

    /**
     * Définit la valeur de la propriété vinCategorieAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCategorieAffaire }
     *     
     */
    public void setVINCategorieAffaire(VINCategorieAffaire value) {
        this.vinCategorieAffaire = value;
    }

    /**
     * Obtient la valeur de la propriété vinTypePrelevement.
     * 
     * @return
     *     possible object is
     *     {@link VINTypePrelevement }
     *     
     */
    public VINTypePrelevement getVINTypePrelevement() {
        return vinTypePrelevement;
    }

    /**
     * Définit la valeur de la propriété vinTypePrelevement.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTypePrelevement }
     *     
     */
    public void setVINTypePrelevement(VINTypePrelevement value) {
        this.vinTypePrelevement = value;
    }

    /**
     * Obtient la valeur de la propriété vinMontantDemande.
     * 
     * @return
     *     possible object is
     *     {@link VINMontantDemande }
     *     
     */
    public VINMontantDemande getVINMontantDemande() {
        return vinMontantDemande;
    }

    /**
     * Définit la valeur de la propriété vinMontantDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMontantDemande }
     *     
     */
    public void setVINMontantDemande(VINMontantDemande value) {
        this.vinMontantDemande = value;
    }

    /**
     * Obtient la valeur de la propriété vinDureeDemande.
     * 
     * @return
     *     possible object is
     *     {@link VINDureeDemande }
     *     
     */
    public VINDureeDemande getVINDureeDemande() {
        return vinDureeDemande;
    }

    /**
     * Définit la valeur de la propriété vinDureeDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDureeDemande }
     *     
     */
    public void setVINDureeDemande(VINDureeDemande value) {
        this.vinDureeDemande = value;
    }

    /**
     * Obtient la valeur de la propriété vinMensualiteDemande.
     * 
     * @return
     *     possible object is
     *     {@link VINMensualiteDemande }
     *     
     */
    public VINMensualiteDemande getVINMensualiteDemande() {
        return vinMensualiteDemande;
    }

    /**
     * Définit la valeur de la propriété vinMensualiteDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMensualiteDemande }
     *     
     */
    public void setVINMensualiteDemande(VINMensualiteDemande value) {
        this.vinMensualiteDemande = value;
    }

    /**
     * Obtient la valeur de la propriété vinPremLoyer.
     * 
     * @return
     *     possible object is
     *     {@link VINPremLoyer }
     *     
     */
    public VINPremLoyer getVINPremLoyer() {
        return vinPremLoyer;
    }

    /**
     * Définit la valeur de la propriété vinPremLoyer.
     * 
     * @param value
     *     allowed object is
     *     {@link VINPremLoyer }
     *     
     */
    public void setVINPremLoyer(VINPremLoyer value) {
        this.vinPremLoyer = value;
    }

    /**
     * Obtient la valeur de la propriété vinMontantApport.
     * 
     * @return
     *     possible object is
     *     {@link VINMontantApport }
     *     
     */
    public VINMontantApport getVINMontantApport() {
        return vinMontantApport;
    }

    /**
     * Définit la valeur de la propriété vinMontantApport.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMontantApport }
     *     
     */
    public void setVINMontantApport(VINMontantApport value) {
        this.vinMontantApport = value;
    }

    /**
     * Obtient la valeur de la propriété vinPrixVehicule.
     * 
     * @return
     *     possible object is
     *     {@link VINPrixVehicule }
     *     
     */
    public VINPrixVehicule getVINPrixVehicule() {
        return vinPrixVehicule;
    }

    /**
     * Définit la valeur de la propriété vinPrixVehicule.
     * 
     * @param value
     *     allowed object is
     *     {@link VINPrixVehicule }
     *     
     */
    public void setVINPrixVehicule(VINPrixVehicule value) {
        this.vinPrixVehicule = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateMiseCirc.
     * 
     * @return
     *     possible object is
     *     {@link VINDateMiseCirc }
     *     
     */
    public VINDateMiseCirc getVINDateMiseCirc() {
        return vinDateMiseCirc;
    }

    /**
     * Définit la valeur de la propriété vinDateMiseCirc.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateMiseCirc }
     *     
     */
    public void setVINDateMiseCirc(VINDateMiseCirc value) {
        this.vinDateMiseCirc = value;
    }

    /**
     * Obtient la valeur de la propriété vinTauxInteret.
     * 
     * @return
     *     possible object is
     *     {@link VINTauxInteret }
     *     
     */
    public VINTauxInteret getVINTauxInteret() {
        return vinTauxInteret;
    }

    /**
     * Définit la valeur de la propriété vinTauxInteret.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTauxInteret }
     *     
     */
    public void setVINTauxInteret(VINTauxInteret value) {
        this.vinTauxInteret = value;
    }

    /**
     * Obtient la valeur de la propriété vinDepotGarantie.
     * 
     * @return
     *     possible object is
     *     {@link VINDepotGarantie }
     *     
     */
    public VINDepotGarantie getVINDepotGarantie() {
        return vinDepotGarantie;
    }

    /**
     * Définit la valeur de la propriété vinDepotGarantie.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDepotGarantie }
     *     
     */
    public void setVINDepotGarantie(VINDepotGarantie value) {
        this.vinDepotGarantie = value;
    }

    /**
     * Obtient la valeur de la propriété vinnumlancement.
     * 
     * @return
     *     possible object is
     *     {@link VINNUMLANCEMENT }
     *     
     */
    public VINNUMLANCEMENT getVINNUMLANCEMENT() {
        return vinnumlancement;
    }

    /**
     * Définit la valeur de la propriété vinnumlancement.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNUMLANCEMENT }
     *     
     */
    public void setVINNUMLANCEMENT(VINNUMLANCEMENT value) {
        this.vinnumlancement = value;
    }

    /**
     * Obtient la valeur de la propriété vinEcheanceReservation.
     * 
     * @return
     *     possible object is
     *     {@link VINEcheanceReservation }
     *     
     */
    public VINEcheanceReservation getVINEcheanceReservation() {
        return vinEcheanceReservation;
    }

    /**
     * Définit la valeur de la propriété vinEcheanceReservation.
     * 
     * @param value
     *     allowed object is
     *     {@link VINEcheanceReservation }
     *     
     */
    public void setVINEcheanceReservation(VINEcheanceReservation value) {
        this.vinEcheanceReservation = value;
    }

    /**
     * Obtient la valeur de la propriété vinEcheanceConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link VINEcheanceConfirmation }
     *     
     */
    public VINEcheanceConfirmation getVINEcheanceConfirmation() {
        return vinEcheanceConfirmation;
    }

    /**
     * Définit la valeur de la propriété vinEcheanceConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link VINEcheanceConfirmation }
     *     
     */
    public void setVINEcheanceConfirmation(VINEcheanceConfirmation value) {
        this.vinEcheanceConfirmation = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateReservation.
     * 
     * @return
     *     possible object is
     *     {@link VINDateReservation }
     *     
     */
    public VINDateReservation getVINDateReservation() {
        return vinDateReservation;
    }

    /**
     * Définit la valeur de la propriété vinDateReservation.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateReservation }
     *     
     */
    public void setVINDateReservation(VINDateReservation value) {
        this.vinDateReservation = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link VINDateConfirmation }
     *     
     */
    public VINDateConfirmation getVINDateConfirmation() {
        return vinDateConfirmation;
    }

    /**
     * Définit la valeur de la propriété vinDateConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateConfirmation }
     *     
     */
    public void setVINDateConfirmation(VINDateConfirmation value) {
        this.vinDateConfirmation = value;
    }

    /**
     * Obtient la valeur de la propriété vinCodeFournisseur.
     * 
     * @return
     *     possible object is
     *     {@link VINCodeFournisseur }
     *     
     */
    public VINCodeFournisseur getVINCodeFournisseur() {
        return vinCodeFournisseur;
    }

    /**
     * Définit la valeur de la propriété vinCodeFournisseur.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCodeFournisseur }
     *     
     */
    public void setVINCodeFournisseur(VINCodeFournisseur value) {
        this.vinCodeFournisseur = value;
    }

    /**
     * Obtient la valeur de la propriété vinCodeGestionnaire.
     * 
     * @return
     *     possible object is
     *     {@link VINCodeGestionnaire }
     *     
     */
    public VINCodeGestionnaire getVINCodeGestionnaire() {
        return vinCodeGestionnaire;
    }

    /**
     * Définit la valeur de la propriété vinCodeGestionnaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCodeGestionnaire }
     *     
     */
    public void setVINCodeGestionnaire(VINCodeGestionnaire value) {
        this.vinCodeGestionnaire = value;
    }

    /**
     * Obtient la valeur de la propriété vinFlagFlotte.
     * 
     * @return
     *     possible object is
     *     {@link VINFlagFlotte }
     *     
     */
    public VINFlagFlotte getVINFlagFlotte() {
        return vinFlagFlotte;
    }

    /**
     * Définit la valeur de la propriété vinFlagFlotte.
     * 
     * @param value
     *     allowed object is
     *     {@link VINFlagFlotte }
     *     
     */
    public void setVINFlagFlotte(VINFlagFlotte value) {
        this.vinFlagFlotte = value;
    }

    /**
     * Obtient la valeur de la propriété vinPrixVenteCatalogue.
     * 
     * @return
     *     possible object is
     *     {@link VINPrixVenteCatalogue }
     *     
     */
    public VINPrixVenteCatalogue getVINPrixVenteCatalogue() {
        return vinPrixVenteCatalogue;
    }

    /**
     * Définit la valeur de la propriété vinPrixVenteCatalogue.
     * 
     * @param value
     *     allowed object is
     *     {@link VINPrixVenteCatalogue }
     *     
     */
    public void setVINPrixVenteCatalogue(VINPrixVenteCatalogue value) {
        this.vinPrixVenteCatalogue = value;
    }

    /**
     * Obtient la valeur de la propriété vinMarque.
     * 
     * @return
     *     possible object is
     *     {@link VINMarque }
     *     
     */
    public VINMarque getVINMarque() {
        return vinMarque;
    }

    /**
     * Définit la valeur de la propriété vinMarque.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMarque }
     *     
     */
    public void setVINMarque(VINMarque value) {
        this.vinMarque = value;
    }

    /**
     * Obtient la valeur de la propriété vinGenre.
     * 
     * @return
     *     possible object is
     *     {@link VINGenre }
     *     
     */
    public VINGenre getVINGenre() {
        return vinGenre;
    }

    /**
     * Définit la valeur de la propriété vinGenre.
     * 
     * @param value
     *     allowed object is
     *     {@link VINGenre }
     *     
     */
    public void setVINGenre(VINGenre value) {
        this.vinGenre = value;
    }

    /**
     * Obtient la valeur de la propriété vinGamme.
     * 
     * @return
     *     possible object is
     *     {@link VINGamme }
     *     
     */
    public VINGamme getVINGamme() {
        return vinGamme;
    }

    /**
     * Définit la valeur de la propriété vinGamme.
     * 
     * @param value
     *     allowed object is
     *     {@link VINGamme }
     *     
     */
    public void setVINGamme(VINGamme value) {
        this.vinGamme = value;
    }

}
