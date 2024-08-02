
package net.mehdi.activemqjms.dtos.scorIntegDTO.res_dtos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RecordType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VOUT_Role" type="{}VOUT_RoleType"/&gt;
 *         &lt;element name="VOUT_Type_Client" type="{}VOUT_Type_ClientType"/&gt;
 *         &lt;element name="VOUT_Identifiant_Client" type="{}VOUT_Identifiant_ClientType"/&gt;
 *         &lt;element name="RC_MO_010" type="{}RC_MO_010Type"/&gt;
 *         &lt;element name="RM_MO_010" type="{}RM_MO_010Type"/&gt;
 *         &lt;element name="RC_MO_011" type="{}RC_MO_011Type"/&gt;
 *         &lt;element name="RM_MO_011" type="{}RM_MO_011Type"/&gt;
 *         &lt;element name="RC_MO_012" type="{}RC_MO_012Type"/&gt;
 *         &lt;element name="RM_MO_012" type="{}RM_MO_012Type"/&gt;
 *         &lt;element name="RC_MO_013" type="{}RC_MO_013Type"/&gt;
 *         &lt;element name="RM_MO_013" type="{}RM_MO_013Type"/&gt;
 *         &lt;element name="RC_MO_014" type="{}RC_MO_014Type"/&gt;
 *         &lt;element name="RM_MO_014" type="{}RM_MO_014Type"/&gt;
 *         &lt;element name="RC_MO_015" type="{}RC_MO_015Type"/&gt;
 *         &lt;element name="RM_MO_015" type="{}RM_MO_015Type"/&gt;
 *         &lt;element name="RC_MO_016" type="{}RC_MO_016Type"/&gt;
 *         &lt;element name="RM_MO_016" type="{}RM_MO_016Type"/&gt;
 *         &lt;element name="RC_MO_017" type="{}RC_MO_017Type"/&gt;
 *         &lt;element name="RM_MO_017" type="{}RM_MO_017Type"/&gt;
 *         &lt;element name="RC_MO_018" type="{}RC_MO_018Type"/&gt;
 *         &lt;element name="RM_MO_018" type="{}RM_MO_018Type"/&gt;
 *         &lt;element name="RC_MO_019" type="{}RC_MO_019Type"/&gt;
 *         &lt;element name="RM_MO_019" type="{}RM_MO_019Type"/&gt;
 *         &lt;element name="RC_MO_020" type="{}RC_MO_020Type"/&gt;
 *         &lt;element name="RM_MO_020" type="{}RM_MO_020Type"/&gt;
 *         &lt;element name="RC_MO_021" type="{}RC_MO_021Type"/&gt;
 *         &lt;element name="RM_MO_021" type="{}RM_MO_021Type"/&gt;
 *         &lt;element name="RC_MO_021_ForcageABB" type="{}RC_MO_021_ForcageABBType"/&gt;
 *         &lt;element name="RM_MO_021_ForcageABB" type="{}RM_MO_021_ForcageABBType"/&gt;
 *         &lt;element name="RC_MO_022" type="{}RC_MO_022Type"/&gt;
 *         &lt;element name="RM_MO_022" type="{}RM_MO_022Type"/&gt;
 *         &lt;element name="RC_MO_023" type="{}RC_MO_023Type"/&gt;
 *         &lt;element name="RM_MO_023" type="{}RM_MO_023Type"/&gt;
 *         &lt;element name="RC_MO_024" type="{}RC_MO_024Type"/&gt;
 *         &lt;element name="RM_MO_024" type="{}RM_MO_024Type"/&gt;
 *         &lt;element name="RC_MO_025" type="{}RC_MO_025Type"/&gt;
 *         &lt;element name="RM_MO_025" type="{}RM_MO_025Type"/&gt;
 *         &lt;element name="RC_MO_026" type="{}RC_MO_026Type"/&gt;
 *         &lt;element name="RM_MO_026" type="{}RM_MO_026Type"/&gt;
 *         &lt;element name="RC_MO_027" type="{}RC_MO_027Type"/&gt;
 *         &lt;element name="RM_MO_027" type="{}RM_MO_027Type"/&gt;
 *         &lt;element name="RC_MO_028" type="{}RC_MO_028Type"/&gt;
 *         &lt;element name="RM_MO_028" type="{}RM_MO_028Type"/&gt;
 *         &lt;element name="RC_MO_029" type="{}RC_MO_029Type"/&gt;
 *         &lt;element name="RM_MO_029" type="{}RM_MO_029Type"/&gt;
 *         &lt;element name="RC_MO_030" type="{}RC_MO_030Type"/&gt;
 *         &lt;element name="RM_MO_030" type="{}RM_MO_030Type"/&gt;
 *         &lt;element name="RC_MO_031" type="{}RC_MO_031Type"/&gt;
 *         &lt;element name="RM_MO_031" type="{}RM_MO_031Type"/&gt;
 *         &lt;element name="RC_MO_032" type="{}RC_MO_032Type"/&gt;
 *         &lt;element name="RM_MO_032" type="{}RM_MO_032Type"/&gt;
 *         &lt;element name="RC_MO_033" type="{}RC_MO_033Type"/&gt;
 *         &lt;element name="RM_MO_033" type="{}RM_MO_033Type"/&gt;
 *         &lt;element name="RC_MO_034" type="{}RC_MO_034Type"/&gt;
 *         &lt;element name="RM_MO_034" type="{}RM_MO_034Type"/&gt;
 *         &lt;element name="RC_MO_035" type="{}RC_MO_035Type"/&gt;
 *         &lt;element name="RM_MO_035" type="{}RM_MO_035Type"/&gt;
 *         &lt;element name="RC_MO_036" type="{}RC_MO_036Type"/&gt;
 *         &lt;element name="RM_MO_036" type="{}RM_MO_036Type"/&gt;
 *         &lt;element name="RC_MO_037" type="{}RC_MO_037Type"/&gt;
 *         &lt;element name="RM_MO_037" type="{}RM_MO_037Type"/&gt;
 *         &lt;element name="RC_MO_038" type="{}RC_MO_038Type"/&gt;
 *         &lt;element name="RM_MO_038" type="{}RM_MO_038Type"/&gt;
 *         &lt;element name="RC_MO_039" type="{}RC_MO_039Type"/&gt;
 *         &lt;element name="RM_MO_039" type="{}RM_MO_039Type"/&gt;
 *         &lt;element name="RC_MO_040" type="{}RC_MO_040Type"/&gt;
 *         &lt;element name="RM_MO_040" type="{}RM_MO_040Type"/&gt;
 *         &lt;element name="RC_MO_041" type="{}RC_MO_041Type"/&gt;
 *         &lt;element name="RM_MO_041" type="{}RM_MO_041Type"/&gt;
 *         &lt;element name="RC_MO_042" type="{}RC_MO_042Type"/&gt;
 *         &lt;element name="RM_MO_042" type="{}RM_MO_042Type"/&gt;
 *         &lt;element name="RC_MO_043" type="{}RC_MO_043Type"/&gt;
 *         &lt;element name="RM_MO_043" type="{}RM_MO_043Type"/&gt;
 *         &lt;element name="RC_MO_044" type="{}RC_MO_044Type"/&gt;
 *         &lt;element name="RM_MO_044" type="{}RM_MO_044Type"/&gt;
 *         &lt;element name="RC_MO_045" type="{}RC_MO_045Type"/&gt;
 *         &lt;element name="RM_MO_045" type="{}RM_MO_045Type"/&gt;
 *         &lt;element name="RC_MO_046" type="{}RC_MO_046Type"/&gt;
 *         &lt;element name="RM_MO_046" type="{}RM_MO_046Type"/&gt;
 *         &lt;element name="RC_MO_047" type="{}RC_MO_047Type"/&gt;
 *         &lt;element name="RM_MO_047" type="{}RM_MO_047Type"/&gt;
 *         &lt;element name="RC_MO_048" type="{}RC_MO_048Type"/&gt;
 *         &lt;element name="RM_MO_048" type="{}RM_MO_048Type"/&gt;
 *         &lt;element name="RC_MO_049" type="{}RC_MO_049Type"/&gt;
 *         &lt;element name="RM_MO_049" type="{}RM_MO_049Type"/&gt;
 *         &lt;element name="RC_MO_050" type="{}RC_MO_050Type"/&gt;
 *         &lt;element name="RM_MO_050" type="{}RM_MO_050Type"/&gt;
 *         &lt;element name="VOUT_Age" type="{}VOUT_AgeType"/&gt;
 *         &lt;element name="VOUT_Age_Duree_Pret" type="{}VOUT_Age_Duree_PretType"/&gt;
 *         &lt;element name="VOUT_Anciennete_Activite_Part" type="{}VOUT_Anciennete_Activite_PartType"/&gt;
 *         &lt;element name="VOUT_Anciennete_Tete_Societe" type="{}VOUT_Anciennete_Tete_SocieteType"/&gt;
 *         &lt;element name="VOUT_Anciennete_Bancaire" type="{}VOUT_Anciennete_BancaireType"/&gt;
 *         &lt;element name="VOUT_Sexe" type="{}VOUT_SexeType"/&gt;
 *         &lt;element name="VOUT_Situation_Logement" type="{}VOUT_Situation_LogementType"/&gt;
 *         &lt;element name="VOUT_Nouveau_Client_ON" type="{}VOUT_Nouveau_Client_ONType"/&gt;
 *         &lt;element name="VOUT_Nbr_Impayes_12" type="{}VOUT_Nbr_Impayes_12Type"/&gt;
 *         &lt;element name="VOUT_Minimum_Vital" type="{}VOUT_Minimum_VitalType"/&gt;
 *         &lt;element name="VOUT_Profession" type="{}VOUT_ProfessionType"/&gt;
 *         &lt;element name="VOUT_CSP" type="{}VOUT_CSPType"/&gt;
 *         &lt;element name="VOUT_CSP_Code" type="{}VOUT_CSP_CodeType"/&gt;
 *         &lt;element name="VOUT_Solde_Moyen_3mois" type="{}VOUT_Solde_Moyen_3moisType"/&gt;
 *         &lt;element name="VOUT_Revenu_Total" type="{}VOUT_Revenu_TotalType"/&gt;
 *         &lt;element name="VOUT_Impaye_Flag" type="{}VOUT_Impaye_FlagType"/&gt;
 *         &lt;element name="VOUT_Code_Banque" type="{}VOUT_Code_BanqueType"/&gt;
 *         &lt;element name="VOUT_Encours_Compensees" type="{}VOUT_Encours_CompenseesType"/&gt;
 *         &lt;element name="VOUT_Encours_Ancienne_Affaire" type="{}VOUT_Encours_Ancienne_AffaireType"/&gt;
 *         &lt;element name="VOUT_Encours_Client_HISTO" type="{}VOUT_Encours_Client_HISTOType"/&gt;
 *         &lt;element name="VOUT_Encours_produit_PP" type="{}VOUT_Encours_produit_PPType"/&gt;
 *         &lt;element name="VOUT_Encours_produit_EDM" type="{}VOUT_Encours_produit_EDMType"/&gt;
 *         &lt;element name="VOUT_Encours_produit_AUTO" type="{}VOUT_Encours_produit_AUTOType"/&gt;
 *         &lt;element name="VOUT_Encours_produit_ASSU" type="{}VOUT_Encours_produit_ASSUType"/&gt;
 *         &lt;element name="VOUT_Encours_produit_MOU" type="{}VOUT_Encours_produit_MOUType"/&gt;
 *         &lt;element name="VOUT_Fichage_Chequiers_Encours" type="{}VOUT_Fichage_Chequiers_EncoursType"/&gt;
 *         &lt;element name="VOUT_Fichage_Chequiers_Echu" type="{}VOUT_Fichage_Chequiers_EchuType"/&gt;
 *         &lt;element name="VOUT_Fichage_Chequiers_Regularise" type="{}VOUT_Fichage_Chequiers_RegulariseType"/&gt;
 *         &lt;element name="VOUT_Fichage_Chequiers_Annule" type="{}VOUT_Fichage_Chequiers_AnnuleType"/&gt;
 *         &lt;element name="VOUT_Nbr_Incidents" type="{}VOUT_Nbr_IncidentsType"/&gt;
 *         &lt;element name="VOUT_Mouvements_Crediteurs" type="{}VOUT_Mouvements_CrediteursType"/&gt;
 *         &lt;element name="VOUT_Nbr_Impayes" type="{}VOUT_Nbr_ImpayesType"/&gt;
 *         &lt;element name="VOUT_Solde_Impayes" type="{}VOUT_Solde_ImpayesType"/&gt;
 *         &lt;element name="VOUT_Taux_Endettement" type="{}VOUT_Taux_EndettementType"/&gt;
 *         &lt;element name="VOUT_Temporisation" type="{}VOUT_TemporisationType"/&gt;
 *         &lt;element name="VOUT_Montant_Revenu" type="{}VOUT_Montant_RevenuType"/&gt;
 *         &lt;element name="VOUT_Marche" type="{}VOUT_MarcheType"/&gt;
 *         &lt;element name="VOUT_Segment" type="{}VOUT_SegmentType"/&gt;
 *         &lt;element name="VOUT_Employeur" type="{}VOUT_EmployeurType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordType", propOrder = {
    "voutRole",
    "voutTypeClient",
    "voutIdentifiantClient",
    "rcmo010",
    "rmmo010",
    "rcmo011",
    "rmmo011",
    "rcmo012",
    "rmmo012",
    "rcmo013",
    "rmmo013",
    "rcmo014",
    "rmmo014",
    "rcmo015",
    "rmmo015",
    "rcmo016",
    "rmmo016",
    "rcmo017",
    "rmmo017",
    "rcmo018",
    "rmmo018",
    "rcmo019",
    "rmmo019",
    "rcmo020",
    "rmmo020",
    "rcmo021",
    "rmmo021",
    "rcmo021ForcageABB",
    "rmmo021ForcageABB",
    "rcmo022",
    "rmmo022",
    "rcmo023",
    "rmmo023",
    "rcmo024",
    "rmmo024",
    "rcmo025",
    "rmmo025",
    "rcmo026",
    "rmmo026",
    "rcmo027",
    "rmmo027",
    "rcmo028",
    "rmmo028",
    "rcmo029",
    "rmmo029",
    "rcmo030",
    "rmmo030",
    "rcmo031",
    "rmmo031",
    "rcmo032",
    "rmmo032",
    "rcmo033",
    "rmmo033",
    "rcmo034",
    "rmmo034",
    "rcmo035",
    "rmmo035",
    "rcmo036",
    "rmmo036",
    "rcmo037",
    "rmmo037",
    "rcmo038",
    "rmmo038",
    "rcmo039",
    "rmmo039",
    "rcmo040",
    "rmmo040",
    "rcmo041",
    "rmmo041",
    "rcmo042",
    "rmmo042",
    "rcmo043",
    "rmmo043",
    "rcmo044",
    "rmmo044",
    "rcmo045",
    "rmmo045",
    "rcmo046",
    "rmmo046",
    "rcmo047",
    "rmmo047",
    "rcmo048",
    "rmmo048",
    "rcmo049",
    "rmmo049",
    "rcmo050",
    "rmmo050",
    "voutAge",
    "voutAgeDureePret",
    "voutAncienneteActivitePart",
    "voutAncienneteTeteSociete",
    "voutAncienneteBancaire",
    "voutSexe",
    "voutSituationLogement",
    "voutNouveauClientON",
    "voutNbrImpayes12",
    "voutMinimumVital",
    "voutProfession",
    "voutcsp",
    "voutcspCode",
    "voutSoldeMoyen3Mois",
    "voutRevenuTotal",
    "voutImpayeFlag",
    "voutCodeBanque",
    "voutEncoursCompensees",
    "voutEncoursAncienneAffaire",
    "voutEncoursClientHISTO",
    "voutEncoursProduitPP",
    "voutEncoursProduitEDM",
    "voutEncoursProduitAUTO",
    "voutEncoursProduitASSU",
    "voutEncoursProduitMOU",
    "voutFichageChequiersEncours",
    "voutFichageChequiersEchu",
    "voutFichageChequiersRegularise",
    "voutFichageChequiersAnnule",
    "voutNbrIncidents",
    "voutMouvementsCrediteurs",
    "voutNbrImpayes",
    "voutSoldeImpayes",
    "voutTauxEndettement",
    "voutTemporisation",
    "voutMontantRevenu",
    "voutMarche",
    "voutSegment",
    "voutEmployeur"
})
public class RecordRespDTO {

    @XmlElement(name = "VOUT_Role", required = true)
    protected VOUTRoleType voutRole;
    @XmlElement(name = "VOUT_Type_Client", required = true)
    protected VOUTTypeClientType voutTypeClient;
    @XmlElement(name = "VOUT_Identifiant_Client", required = true)
    protected VOUTIdentifiantClientType voutIdentifiantClient;
    @XmlElement(name = "RC_MO_010", required = true)
    protected RCMO010Type rcmo010;
    @XmlElement(name = "RM_MO_010", required = true)
    protected RMMO010Type rmmo010;
    @XmlElement(name = "RC_MO_011", required = true)
    protected RCMO011Type rcmo011;
    @XmlElement(name = "RM_MO_011", required = true)
    protected RMMO011Type rmmo011;
    @XmlElement(name = "RC_MO_012", required = true)
    protected RCMO012Type rcmo012;
    @XmlElement(name = "RM_MO_012", required = true)
    protected RMMO012Type rmmo012;
    @XmlElement(name = "RC_MO_013", required = true)
    protected RCMO013Type rcmo013;
    @XmlElement(name = "RM_MO_013", required = true)
    protected RMMO013Type rmmo013;
    @XmlElement(name = "RC_MO_014", required = true)
    protected RCMO014Type rcmo014;
    @XmlElement(name = "RM_MO_014", required = true)
    protected RMMO014Type rmmo014;
    @XmlElement(name = "RC_MO_015", required = true)
    protected RCMO015Type rcmo015;
    @XmlElement(name = "RM_MO_015", required = true)
    protected RMMO015Type rmmo015;
    @XmlElement(name = "RC_MO_016", required = true)
    protected RCMO016Type rcmo016;
    @XmlElement(name = "RM_MO_016", required = true)
    protected RMMO016Type rmmo016;
    @XmlElement(name = "RC_MO_017", required = true)
    protected RCMO017Type rcmo017;
    @XmlElement(name = "RM_MO_017", required = true)
    protected RMMO017Type rmmo017;
    @XmlElement(name = "RC_MO_018", required = true)
    protected RCMO018Type rcmo018;
    @XmlElement(name = "RM_MO_018", required = true)
    protected RMMO018Type rmmo018;
    @XmlElement(name = "RC_MO_019", required = true)
    protected RCMO019Type rcmo019;
    @XmlElement(name = "RM_MO_019", required = true)
    protected RMMO019Type rmmo019;
    @XmlElement(name = "RC_MO_020", required = true)
    protected RCMO020Type rcmo020;
    @XmlElement(name = "RM_MO_020", required = true)
    protected RMMO020Type rmmo020;
    @XmlElement(name = "RC_MO_021", required = true)
    protected RCMO021Type rcmo021;
    @XmlElement(name = "RM_MO_021", required = true)
    protected RMMO021Type rmmo021;
    @XmlElement(name = "RC_MO_021_ForcageABB", required = true)
    protected RCMO021ForcageABBType rcmo021ForcageABB;
    @XmlElement(name = "RM_MO_021_ForcageABB", required = true)
    protected RMMO021ForcageABBType rmmo021ForcageABB;
    @XmlElement(name = "RC_MO_022", required = true)
    protected RCMO022Type rcmo022;
    @XmlElement(name = "RM_MO_022", required = true)
    protected RMMO022Type rmmo022;
    @XmlElement(name = "RC_MO_023", required = true)
    protected RCMO023Type rcmo023;
    @XmlElement(name = "RM_MO_023", required = true)
    protected RMMO023Type rmmo023;
    @XmlElement(name = "RC_MO_024", required = true)
    protected RCMO024Type rcmo024;
    @XmlElement(name = "RM_MO_024", required = true)
    protected RMMO024Type rmmo024;
    @XmlElement(name = "RC_MO_025", required = true)
    protected RCMO025Type rcmo025;
    @XmlElement(name = "RM_MO_025", required = true)
    protected RMMO025Type rmmo025;
    @XmlElement(name = "RC_MO_026", required = true)
    protected RCMO026Type rcmo026;
    @XmlElement(name = "RM_MO_026", required = true)
    protected RMMO026Type rmmo026;
    @XmlElement(name = "RC_MO_027", required = true)
    protected RCMO027Type rcmo027;
    @XmlElement(name = "RM_MO_027", required = true)
    protected RMMO027Type rmmo027;
    @XmlElement(name = "RC_MO_028", required = true)
    protected RCMO028Type rcmo028;
    @XmlElement(name = "RM_MO_028", required = true)
    protected RMMO028Type rmmo028;
    @XmlElement(name = "RC_MO_029", required = true)
    protected RCMO029Type rcmo029;
    @XmlElement(name = "RM_MO_029", required = true)
    protected RMMO029Type rmmo029;
    @XmlElement(name = "RC_MO_030", required = true)
    protected RCMO030Type rcmo030;
    @XmlElement(name = "RM_MO_030", required = true)
    protected RMMO030Type rmmo030;
    @XmlElement(name = "RC_MO_031", required = true)
    protected RCMO031Type rcmo031;
    @XmlElement(name = "RM_MO_031", required = true)
    protected RMMO031Type rmmo031;
    @XmlElement(name = "RC_MO_032", required = true)
    protected RCMO032Type rcmo032;
    @XmlElement(name = "RM_MO_032", required = true)
    protected RMMO032Type rmmo032;
    @XmlElement(name = "RC_MO_033", required = true)
    protected RCMO033Type rcmo033;
    @XmlElement(name = "RM_MO_033", required = true)
    protected RMMO033Type rmmo033;
    @XmlElement(name = "RC_MO_034", required = true)
    protected RCMO034Type rcmo034;
    @XmlElement(name = "RM_MO_034", required = true)
    protected RMMO034Type rmmo034;
    @XmlElement(name = "RC_MO_035", required = true)
    protected RCMO035Type rcmo035;
    @XmlElement(name = "RM_MO_035", required = true)
    protected RMMO035Type rmmo035;
    @XmlElement(name = "RC_MO_036", required = true)
    protected RCMO036Type rcmo036;
    @XmlElement(name = "RM_MO_036", required = true)
    protected RMMO036Type rmmo036;
    @XmlElement(name = "RC_MO_037", required = true)
    protected RCMO037Type rcmo037;
    @XmlElement(name = "RM_MO_037", required = true)
    protected RMMO037Type rmmo037;
    @XmlElement(name = "RC_MO_038", required = true)
    protected RCMO038Type rcmo038;
    @XmlElement(name = "RM_MO_038", required = true)
    protected RMMO038Type rmmo038;
    @XmlElement(name = "RC_MO_039", required = true)
    protected RCMO039Type rcmo039;
    @XmlElement(name = "RM_MO_039", required = true)
    protected RMMO039Type rmmo039;
    @XmlElement(name = "RC_MO_040", required = true)
    protected RCMO040Type rcmo040;
    @XmlElement(name = "RM_MO_040", required = true)
    protected RMMO040Type rmmo040;
    @XmlElement(name = "RC_MO_041", required = true)
    protected RCMO041Type rcmo041;
    @XmlElement(name = "RM_MO_041", required = true)
    protected RMMO041Type rmmo041;
    @XmlElement(name = "RC_MO_042", required = true)
    protected RCMO042Type rcmo042;
    @XmlElement(name = "RM_MO_042", required = true)
    protected RMMO042Type rmmo042;
    @XmlElement(name = "RC_MO_043", required = true)
    protected RCMO043Type rcmo043;
    @XmlElement(name = "RM_MO_043", required = true)
    protected RMMO043Type rmmo043;
    @XmlElement(name = "RC_MO_044", required = true)
    protected RCMO044Type rcmo044;
    @XmlElement(name = "RM_MO_044", required = true)
    protected RMMO044Type rmmo044;
    @XmlElement(name = "RC_MO_045", required = true)
    protected RCMO045Type rcmo045;
    @XmlElement(name = "RM_MO_045", required = true)
    protected RMMO045Type rmmo045;
    @XmlElement(name = "RC_MO_046", required = true)
    protected RCMO046Type rcmo046;
    @XmlElement(name = "RM_MO_046", required = true)
    protected RMMO046Type rmmo046;
    @XmlElement(name = "RC_MO_047", required = true)
    protected RCMO047Type rcmo047;
    @XmlElement(name = "RM_MO_047", required = true)
    protected RMMO047Type rmmo047;
    @XmlElement(name = "RC_MO_048", required = true)
    protected RCMO048Type rcmo048;
    @XmlElement(name = "RM_MO_048", required = true)
    protected RMMO048Type rmmo048;
    @XmlElement(name = "RC_MO_049", required = true)
    protected RCMO049Type rcmo049;
    @XmlElement(name = "RM_MO_049", required = true)
    protected RMMO049Type rmmo049;
    @XmlElement(name = "RC_MO_050", required = true)
    protected RCMO050Type rcmo050;
    @XmlElement(name = "RM_MO_050", required = true)
    protected RMMO050Type rmmo050;
    @XmlElement(name = "VOUT_Age", required = true)
    protected VOUTAgeType voutAge;
    @XmlElement(name = "VOUT_Age_Duree_Pret", required = true)
    protected VOUTAgeDureePretType voutAgeDureePret;
    @XmlElement(name = "VOUT_Anciennete_Activite_Part", required = true)
    protected VOUTAncienneteActivitePartType voutAncienneteActivitePart;
    @XmlElement(name = "VOUT_Anciennete_Tete_Societe", required = true)
    protected VOUTAncienneteTeteSocieteType voutAncienneteTeteSociete;
    @XmlElement(name = "VOUT_Anciennete_Bancaire", required = true)
    protected VOUTAncienneteBancaireType voutAncienneteBancaire;
    @XmlElement(name = "VOUT_Sexe", required = true)
    protected VOUTSexeType voutSexe;
    @XmlElement(name = "VOUT_Situation_Logement", required = true)
    protected VOUTSituationLogementType voutSituationLogement;
    @XmlElement(name = "VOUT_Nouveau_Client_ON", required = true)
    protected VOUTNouveauClientONType voutNouveauClientON;
    @XmlElement(name = "VOUT_Nbr_Impayes_12", required = true)
    protected VOUTNbrImpayes12Type voutNbrImpayes12;
    @XmlElement(name = "VOUT_Minimum_Vital", required = true)
    protected VOUTMinimumVitalType voutMinimumVital;
    @XmlElement(name = "VOUT_Profession", required = true)
    protected VOUTProfessionType voutProfession;
    @XmlElement(name = "VOUT_CSP", required = true)
    protected VOUTCSPType voutcsp;
    @XmlElement(name = "VOUT_CSP_Code", required = true)
    protected VOUTCSPCodeType voutcspCode;
    @XmlElement(name = "VOUT_Solde_Moyen_3mois", required = true)
    protected VOUTSoldeMoyen3MoisType voutSoldeMoyen3Mois;
    @XmlElement(name = "VOUT_Revenu_Total", required = true)
    protected VOUTRevenuTotalType voutRevenuTotal;
    @XmlElement(name = "VOUT_Impaye_Flag", required = true)
    protected VOUTImpayeFlagType voutImpayeFlag;
    @XmlElement(name = "VOUT_Code_Banque", required = true)
    protected VOUTCodeBanqueType voutCodeBanque;
    @XmlElement(name = "VOUT_Encours_Compensees", required = true)
    protected VOUTEncoursCompenseesType voutEncoursCompensees;
    @XmlElement(name = "VOUT_Encours_Ancienne_Affaire", required = true)
    protected VOUTEncoursAncienneAffaireType voutEncoursAncienneAffaire;
    @XmlElement(name = "VOUT_Encours_Client_HISTO", required = true)
    protected VOUTEncoursClientHISTOType voutEncoursClientHISTO;
    @XmlElement(name = "VOUT_Encours_produit_PP", required = true)
    protected VOUTEncoursProduitPPType voutEncoursProduitPP;
    @XmlElement(name = "VOUT_Encours_produit_EDM", required = true)
    protected VOUTEncoursProduitEDMType voutEncoursProduitEDM;
    @XmlElement(name = "VOUT_Encours_produit_AUTO", required = true)
    protected VOUTEncoursProduitAUTOType voutEncoursProduitAUTO;
    @XmlElement(name = "VOUT_Encours_produit_ASSU", required = true)
    protected VOUTEncoursProduitASSUType voutEncoursProduitASSU;
    @XmlElement(name = "VOUT_Encours_produit_MOU", required = true)
    protected VOUTEncoursProduitMOUType voutEncoursProduitMOU;
    @XmlElement(name = "VOUT_Fichage_Chequiers_Encours", required = true)
    protected VOUTFichageChequiersEncoursType voutFichageChequiersEncours;
    @XmlElement(name = "VOUT_Fichage_Chequiers_Echu", required = true)
    protected VOUTFichageChequiersEchuType voutFichageChequiersEchu;
    @XmlElement(name = "VOUT_Fichage_Chequiers_Regularise", required = true)
    protected VOUTFichageChequiersRegulariseType voutFichageChequiersRegularise;
    @XmlElement(name = "VOUT_Fichage_Chequiers_Annule", required = true)
    protected VOUTFichageChequiersAnnuleType voutFichageChequiersAnnule;
    @XmlElement(name = "VOUT_Nbr_Incidents", required = true)
    protected VOUTNbrIncidentsType voutNbrIncidents;
    @XmlElement(name = "VOUT_Mouvements_Crediteurs", required = true)
    protected VOUTMouvementsCrediteursType voutMouvementsCrediteurs;
    @XmlElement(name = "VOUT_Nbr_Impayes", required = true)
    protected VOUTNbrImpayesType voutNbrImpayes;
    @XmlElement(name = "VOUT_Solde_Impayes", required = true)
    protected VOUTSoldeImpayesType voutSoldeImpayes;
    @XmlElement(name = "VOUT_Taux_Endettement", required = true)
    protected VOUTTauxEndettementType voutTauxEndettement;
    @XmlElement(name = "VOUT_Temporisation", required = true)
    protected VOUTTemporisationType voutTemporisation;
    @XmlElement(name = "VOUT_Montant_Revenu", required = true)
    protected VOUTMontantRevenuType voutMontantRevenu;
    @XmlElement(name = "VOUT_Marche", required = true)
    protected VOUTMarcheType voutMarche;
    @XmlElement(name = "VOUT_Segment", required = true)
    protected VOUTSegmentType voutSegment;
    @XmlElement(name = "VOUT_Employeur", required = true)
    protected VOUTEmployeurType voutEmployeur;

    /**
     * Obtient la valeur de la propriété voutRole.
     * 
     * @return
     *     possible object is
     *     {@link VOUTRoleType }
     *     
     */
    public VOUTRoleType getVOUTRole() {
        return voutRole;
    }

    /**
     * Définit la valeur de la propriété voutRole.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTRoleType }
     *     
     */
    public void setVOUTRole(VOUTRoleType value) {
        this.voutRole = value;
    }

    /**
     * Obtient la valeur de la propriété voutTypeClient.
     * 
     * @return
     *     possible object is
     *     {@link VOUTTypeClientType }
     *     
     */
    public VOUTTypeClientType getVOUTTypeClient() {
        return voutTypeClient;
    }

    /**
     * Définit la valeur de la propriété voutTypeClient.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTTypeClientType }
     *     
     */
    public void setVOUTTypeClient(VOUTTypeClientType value) {
        this.voutTypeClient = value;
    }

    /**
     * Obtient la valeur de la propriété voutIdentifiantClient.
     * 
     * @return
     *     possible object is
     *     {@link VOUTIdentifiantClientType }
     *     
     */
    public VOUTIdentifiantClientType getVOUTIdentifiantClient() {
        return voutIdentifiantClient;
    }

    /**
     * Définit la valeur de la propriété voutIdentifiantClient.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTIdentifiantClientType }
     *     
     */
    public void setVOUTIdentifiantClient(VOUTIdentifiantClientType value) {
        this.voutIdentifiantClient = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo010.
     * 
     * @return
     *     possible object is
     *     {@link RCMO010Type }
     *     
     */
    public RCMO010Type getRCMO010() {
        return rcmo010;
    }

    /**
     * Définit la valeur de la propriété rcmo010.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO010Type }
     *     
     */
    public void setRCMO010(RCMO010Type value) {
        this.rcmo010 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo010.
     * 
     * @return
     *     possible object is
     *     {@link RMMO010Type }
     *     
     */
    public RMMO010Type getRMMO010() {
        return rmmo010;
    }

    /**
     * Définit la valeur de la propriété rmmo010.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO010Type }
     *     
     */
    public void setRMMO010(RMMO010Type value) {
        this.rmmo010 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo011.
     * 
     * @return
     *     possible object is
     *     {@link RCMO011Type }
     *     
     */
    public RCMO011Type getRCMO011() {
        return rcmo011;
    }

    /**
     * Définit la valeur de la propriété rcmo011.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO011Type }
     *     
     */
    public void setRCMO011(RCMO011Type value) {
        this.rcmo011 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo011.
     * 
     * @return
     *     possible object is
     *     {@link RMMO011Type }
     *     
     */
    public RMMO011Type getRMMO011() {
        return rmmo011;
    }

    /**
     * Définit la valeur de la propriété rmmo011.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO011Type }
     *     
     */
    public void setRMMO011(RMMO011Type value) {
        this.rmmo011 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo012.
     * 
     * @return
     *     possible object is
     *     {@link RCMO012Type }
     *     
     */
    public RCMO012Type getRCMO012() {
        return rcmo012;
    }

    /**
     * Définit la valeur de la propriété rcmo012.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO012Type }
     *     
     */
    public void setRCMO012(RCMO012Type value) {
        this.rcmo012 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo012.
     * 
     * @return
     *     possible object is
     *     {@link RMMO012Type }
     *     
     */
    public RMMO012Type getRMMO012() {
        return rmmo012;
    }

    /**
     * Définit la valeur de la propriété rmmo012.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO012Type }
     *     
     */
    public void setRMMO012(RMMO012Type value) {
        this.rmmo012 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo013.
     * 
     * @return
     *     possible object is
     *     {@link RCMO013Type }
     *     
     */
    public RCMO013Type getRCMO013() {
        return rcmo013;
    }

    /**
     * Définit la valeur de la propriété rcmo013.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO013Type }
     *     
     */
    public void setRCMO013(RCMO013Type value) {
        this.rcmo013 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo013.
     * 
     * @return
     *     possible object is
     *     {@link RMMO013Type }
     *     
     */
    public RMMO013Type getRMMO013() {
        return rmmo013;
    }

    /**
     * Définit la valeur de la propriété rmmo013.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO013Type }
     *     
     */
    public void setRMMO013(RMMO013Type value) {
        this.rmmo013 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo014.
     * 
     * @return
     *     possible object is
     *     {@link RCMO014Type }
     *     
     */
    public RCMO014Type getRCMO014() {
        return rcmo014;
    }

    /**
     * Définit la valeur de la propriété rcmo014.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO014Type }
     *     
     */
    public void setRCMO014(RCMO014Type value) {
        this.rcmo014 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo014.
     * 
     * @return
     *     possible object is
     *     {@link RMMO014Type }
     *     
     */
    public RMMO014Type getRMMO014() {
        return rmmo014;
    }

    /**
     * Définit la valeur de la propriété rmmo014.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO014Type }
     *     
     */
    public void setRMMO014(RMMO014Type value) {
        this.rmmo014 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo015.
     * 
     * @return
     *     possible object is
     *     {@link RCMO015Type }
     *     
     */
    public RCMO015Type getRCMO015() {
        return rcmo015;
    }

    /**
     * Définit la valeur de la propriété rcmo015.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO015Type }
     *     
     */
    public void setRCMO015(RCMO015Type value) {
        this.rcmo015 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo015.
     * 
     * @return
     *     possible object is
     *     {@link RMMO015Type }
     *     
     */
    public RMMO015Type getRMMO015() {
        return rmmo015;
    }

    /**
     * Définit la valeur de la propriété rmmo015.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO015Type }
     *     
     */
    public void setRMMO015(RMMO015Type value) {
        this.rmmo015 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo016.
     * 
     * @return
     *     possible object is
     *     {@link RCMO016Type }
     *     
     */
    public RCMO016Type getRCMO016() {
        return rcmo016;
    }

    /**
     * Définit la valeur de la propriété rcmo016.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO016Type }
     *     
     */
    public void setRCMO016(RCMO016Type value) {
        this.rcmo016 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo016.
     * 
     * @return
     *     possible object is
     *     {@link RMMO016Type }
     *     
     */
    public RMMO016Type getRMMO016() {
        return rmmo016;
    }

    /**
     * Définit la valeur de la propriété rmmo016.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO016Type }
     *     
     */
    public void setRMMO016(RMMO016Type value) {
        this.rmmo016 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo017.
     * 
     * @return
     *     possible object is
     *     {@link RCMO017Type }
     *     
     */
    public RCMO017Type getRCMO017() {
        return rcmo017;
    }

    /**
     * Définit la valeur de la propriété rcmo017.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO017Type }
     *     
     */
    public void setRCMO017(RCMO017Type value) {
        this.rcmo017 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo017.
     * 
     * @return
     *     possible object is
     *     {@link RMMO017Type }
     *     
     */
    public RMMO017Type getRMMO017() {
        return rmmo017;
    }

    /**
     * Définit la valeur de la propriété rmmo017.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO017Type }
     *     
     */
    public void setRMMO017(RMMO017Type value) {
        this.rmmo017 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo018.
     * 
     * @return
     *     possible object is
     *     {@link RCMO018Type }
     *     
     */
    public RCMO018Type getRCMO018() {
        return rcmo018;
    }

    /**
     * Définit la valeur de la propriété rcmo018.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO018Type }
     *     
     */
    public void setRCMO018(RCMO018Type value) {
        this.rcmo018 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo018.
     * 
     * @return
     *     possible object is
     *     {@link RMMO018Type }
     *     
     */
    public RMMO018Type getRMMO018() {
        return rmmo018;
    }

    /**
     * Définit la valeur de la propriété rmmo018.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO018Type }
     *     
     */
    public void setRMMO018(RMMO018Type value) {
        this.rmmo018 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo019.
     * 
     * @return
     *     possible object is
     *     {@link RCMO019Type }
     *     
     */
    public RCMO019Type getRCMO019() {
        return rcmo019;
    }

    /**
     * Définit la valeur de la propriété rcmo019.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO019Type }
     *     
     */
    public void setRCMO019(RCMO019Type value) {
        this.rcmo019 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo019.
     * 
     * @return
     *     possible object is
     *     {@link RMMO019Type }
     *     
     */
    public RMMO019Type getRMMO019() {
        return rmmo019;
    }

    /**
     * Définit la valeur de la propriété rmmo019.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO019Type }
     *     
     */
    public void setRMMO019(RMMO019Type value) {
        this.rmmo019 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo020.
     * 
     * @return
     *     possible object is
     *     {@link RCMO020Type }
     *     
     */
    public RCMO020Type getRCMO020() {
        return rcmo020;
    }

    /**
     * Définit la valeur de la propriété rcmo020.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO020Type }
     *     
     */
    public void setRCMO020(RCMO020Type value) {
        this.rcmo020 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo020.
     * 
     * @return
     *     possible object is
     *     {@link RMMO020Type }
     *     
     */
    public RMMO020Type getRMMO020() {
        return rmmo020;
    }

    /**
     * Définit la valeur de la propriété rmmo020.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO020Type }
     *     
     */
    public void setRMMO020(RMMO020Type value) {
        this.rmmo020 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo021.
     * 
     * @return
     *     possible object is
     *     {@link RCMO021Type }
     *     
     */
    public RCMO021Type getRCMO021() {
        return rcmo021;
    }

    /**
     * Définit la valeur de la propriété rcmo021.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO021Type }
     *     
     */
    public void setRCMO021(RCMO021Type value) {
        this.rcmo021 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo021.
     * 
     * @return
     *     possible object is
     *     {@link RMMO021Type }
     *     
     */
    public RMMO021Type getRMMO021() {
        return rmmo021;
    }

    /**
     * Définit la valeur de la propriété rmmo021.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO021Type }
     *     
     */
    public void setRMMO021(RMMO021Type value) {
        this.rmmo021 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo021ForcageABB.
     * 
     * @return
     *     possible object is
     *     {@link RCMO021ForcageABBType }
     *     
     */
    public RCMO021ForcageABBType getRCMO021ForcageABB() {
        return rcmo021ForcageABB;
    }

    /**
     * Définit la valeur de la propriété rcmo021ForcageABB.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO021ForcageABBType }
     *     
     */
    public void setRCMO021ForcageABB(RCMO021ForcageABBType value) {
        this.rcmo021ForcageABB = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo021ForcageABB.
     * 
     * @return
     *     possible object is
     *     {@link RMMO021ForcageABBType }
     *     
     */
    public RMMO021ForcageABBType getRMMO021ForcageABB() {
        return rmmo021ForcageABB;
    }

    /**
     * Définit la valeur de la propriété rmmo021ForcageABB.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO021ForcageABBType }
     *     
     */
    public void setRMMO021ForcageABB(RMMO021ForcageABBType value) {
        this.rmmo021ForcageABB = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo022.
     * 
     * @return
     *     possible object is
     *     {@link RCMO022Type }
     *     
     */
    public RCMO022Type getRCMO022() {
        return rcmo022;
    }

    /**
     * Définit la valeur de la propriété rcmo022.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO022Type }
     *     
     */
    public void setRCMO022(RCMO022Type value) {
        this.rcmo022 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo022.
     * 
     * @return
     *     possible object is
     *     {@link RMMO022Type }
     *     
     */
    public RMMO022Type getRMMO022() {
        return rmmo022;
    }

    /**
     * Définit la valeur de la propriété rmmo022.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO022Type }
     *     
     */
    public void setRMMO022(RMMO022Type value) {
        this.rmmo022 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo023.
     * 
     * @return
     *     possible object is
     *     {@link RCMO023Type }
     *     
     */
    public RCMO023Type getRCMO023() {
        return rcmo023;
    }

    /**
     * Définit la valeur de la propriété rcmo023.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO023Type }
     *     
     */
    public void setRCMO023(RCMO023Type value) {
        this.rcmo023 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo023.
     * 
     * @return
     *     possible object is
     *     {@link RMMO023Type }
     *     
     */
    public RMMO023Type getRMMO023() {
        return rmmo023;
    }

    /**
     * Définit la valeur de la propriété rmmo023.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO023Type }
     *     
     */
    public void setRMMO023(RMMO023Type value) {
        this.rmmo023 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo024.
     * 
     * @return
     *     possible object is
     *     {@link RCMO024Type }
     *     
     */
    public RCMO024Type getRCMO024() {
        return rcmo024;
    }

    /**
     * Définit la valeur de la propriété rcmo024.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO024Type }
     *     
     */
    public void setRCMO024(RCMO024Type value) {
        this.rcmo024 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo024.
     * 
     * @return
     *     possible object is
     *     {@link RMMO024Type }
     *     
     */
    public RMMO024Type getRMMO024() {
        return rmmo024;
    }

    /**
     * Définit la valeur de la propriété rmmo024.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO024Type }
     *     
     */
    public void setRMMO024(RMMO024Type value) {
        this.rmmo024 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo025.
     * 
     * @return
     *     possible object is
     *     {@link RCMO025Type }
     *     
     */
    public RCMO025Type getRCMO025() {
        return rcmo025;
    }

    /**
     * Définit la valeur de la propriété rcmo025.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO025Type }
     *     
     */
    public void setRCMO025(RCMO025Type value) {
        this.rcmo025 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo025.
     * 
     * @return
     *     possible object is
     *     {@link RMMO025Type }
     *     
     */
    public RMMO025Type getRMMO025() {
        return rmmo025;
    }

    /**
     * Définit la valeur de la propriété rmmo025.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO025Type }
     *     
     */
    public void setRMMO025(RMMO025Type value) {
        this.rmmo025 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo026.
     * 
     * @return
     *     possible object is
     *     {@link RCMO026Type }
     *     
     */
    public RCMO026Type getRCMO026() {
        return rcmo026;
    }

    /**
     * Définit la valeur de la propriété rcmo026.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO026Type }
     *     
     */
    public void setRCMO026(RCMO026Type value) {
        this.rcmo026 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo026.
     * 
     * @return
     *     possible object is
     *     {@link RMMO026Type }
     *     
     */
    public RMMO026Type getRMMO026() {
        return rmmo026;
    }

    /**
     * Définit la valeur de la propriété rmmo026.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO026Type }
     *     
     */
    public void setRMMO026(RMMO026Type value) {
        this.rmmo026 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo027.
     * 
     * @return
     *     possible object is
     *     {@link RCMO027Type }
     *     
     */
    public RCMO027Type getRCMO027() {
        return rcmo027;
    }

    /**
     * Définit la valeur de la propriété rcmo027.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO027Type }
     *     
     */
    public void setRCMO027(RCMO027Type value) {
        this.rcmo027 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo027.
     * 
     * @return
     *     possible object is
     *     {@link RMMO027Type }
     *     
     */
    public RMMO027Type getRMMO027() {
        return rmmo027;
    }

    /**
     * Définit la valeur de la propriété rmmo027.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO027Type }
     *     
     */
    public void setRMMO027(RMMO027Type value) {
        this.rmmo027 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo028.
     * 
     * @return
     *     possible object is
     *     {@link RCMO028Type }
     *     
     */
    public RCMO028Type getRCMO028() {
        return rcmo028;
    }

    /**
     * Définit la valeur de la propriété rcmo028.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO028Type }
     *     
     */
    public void setRCMO028(RCMO028Type value) {
        this.rcmo028 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo028.
     * 
     * @return
     *     possible object is
     *     {@link RMMO028Type }
     *     
     */
    public RMMO028Type getRMMO028() {
        return rmmo028;
    }

    /**
     * Définit la valeur de la propriété rmmo028.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO028Type }
     *     
     */
    public void setRMMO028(RMMO028Type value) {
        this.rmmo028 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo029.
     * 
     * @return
     *     possible object is
     *     {@link RCMO029Type }
     *     
     */
    public RCMO029Type getRCMO029() {
        return rcmo029;
    }

    /**
     * Définit la valeur de la propriété rcmo029.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO029Type }
     *     
     */
    public void setRCMO029(RCMO029Type value) {
        this.rcmo029 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo029.
     * 
     * @return
     *     possible object is
     *     {@link RMMO029Type }
     *     
     */
    public RMMO029Type getRMMO029() {
        return rmmo029;
    }

    /**
     * Définit la valeur de la propriété rmmo029.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO029Type }
     *     
     */
    public void setRMMO029(RMMO029Type value) {
        this.rmmo029 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo030.
     * 
     * @return
     *     possible object is
     *     {@link RCMO030Type }
     *     
     */
    public RCMO030Type getRCMO030() {
        return rcmo030;
    }

    /**
     * Définit la valeur de la propriété rcmo030.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO030Type }
     *     
     */
    public void setRCMO030(RCMO030Type value) {
        this.rcmo030 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo030.
     * 
     * @return
     *     possible object is
     *     {@link RMMO030Type }
     *     
     */
    public RMMO030Type getRMMO030() {
        return rmmo030;
    }

    /**
     * Définit la valeur de la propriété rmmo030.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO030Type }
     *     
     */
    public void setRMMO030(RMMO030Type value) {
        this.rmmo030 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo031.
     * 
     * @return
     *     possible object is
     *     {@link RCMO031Type }
     *     
     */
    public RCMO031Type getRCMO031() {
        return rcmo031;
    }

    /**
     * Définit la valeur de la propriété rcmo031.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO031Type }
     *     
     */
    public void setRCMO031(RCMO031Type value) {
        this.rcmo031 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo031.
     * 
     * @return
     *     possible object is
     *     {@link RMMO031Type }
     *     
     */
    public RMMO031Type getRMMO031() {
        return rmmo031;
    }

    /**
     * Définit la valeur de la propriété rmmo031.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO031Type }
     *     
     */
    public void setRMMO031(RMMO031Type value) {
        this.rmmo031 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo032.
     * 
     * @return
     *     possible object is
     *     {@link RCMO032Type }
     *     
     */
    public RCMO032Type getRCMO032() {
        return rcmo032;
    }

    /**
     * Définit la valeur de la propriété rcmo032.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO032Type }
     *     
     */
    public void setRCMO032(RCMO032Type value) {
        this.rcmo032 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo032.
     * 
     * @return
     *     possible object is
     *     {@link RMMO032Type }
     *     
     */
    public RMMO032Type getRMMO032() {
        return rmmo032;
    }

    /**
     * Définit la valeur de la propriété rmmo032.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO032Type }
     *     
     */
    public void setRMMO032(RMMO032Type value) {
        this.rmmo032 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo033.
     * 
     * @return
     *     possible object is
     *     {@link RCMO033Type }
     *     
     */
    public RCMO033Type getRCMO033() {
        return rcmo033;
    }

    /**
     * Définit la valeur de la propriété rcmo033.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO033Type }
     *     
     */
    public void setRCMO033(RCMO033Type value) {
        this.rcmo033 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo033.
     * 
     * @return
     *     possible object is
     *     {@link RMMO033Type }
     *     
     */
    public RMMO033Type getRMMO033() {
        return rmmo033;
    }

    /**
     * Définit la valeur de la propriété rmmo033.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO033Type }
     *     
     */
    public void setRMMO033(RMMO033Type value) {
        this.rmmo033 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo034.
     * 
     * @return
     *     possible object is
     *     {@link RCMO034Type }
     *     
     */
    public RCMO034Type getRCMO034() {
        return rcmo034;
    }

    /**
     * Définit la valeur de la propriété rcmo034.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO034Type }
     *     
     */
    public void setRCMO034(RCMO034Type value) {
        this.rcmo034 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo034.
     * 
     * @return
     *     possible object is
     *     {@link RMMO034Type }
     *     
     */
    public RMMO034Type getRMMO034() {
        return rmmo034;
    }

    /**
     * Définit la valeur de la propriété rmmo034.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO034Type }
     *     
     */
    public void setRMMO034(RMMO034Type value) {
        this.rmmo034 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo035.
     * 
     * @return
     *     possible object is
     *     {@link RCMO035Type }
     *     
     */
    public RCMO035Type getRCMO035() {
        return rcmo035;
    }

    /**
     * Définit la valeur de la propriété rcmo035.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO035Type }
     *     
     */
    public void setRCMO035(RCMO035Type value) {
        this.rcmo035 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo035.
     * 
     * @return
     *     possible object is
     *     {@link RMMO035Type }
     *     
     */
    public RMMO035Type getRMMO035() {
        return rmmo035;
    }

    /**
     * Définit la valeur de la propriété rmmo035.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO035Type }
     *     
     */
    public void setRMMO035(RMMO035Type value) {
        this.rmmo035 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo036.
     * 
     * @return
     *     possible object is
     *     {@link RCMO036Type }
     *     
     */
    public RCMO036Type getRCMO036() {
        return rcmo036;
    }

    /**
     * Définit la valeur de la propriété rcmo036.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO036Type }
     *     
     */
    public void setRCMO036(RCMO036Type value) {
        this.rcmo036 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo036.
     * 
     * @return
     *     possible object is
     *     {@link RMMO036Type }
     *     
     */
    public RMMO036Type getRMMO036() {
        return rmmo036;
    }

    /**
     * Définit la valeur de la propriété rmmo036.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO036Type }
     *     
     */
    public void setRMMO036(RMMO036Type value) {
        this.rmmo036 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo037.
     * 
     * @return
     *     possible object is
     *     {@link RCMO037Type }
     *     
     */
    public RCMO037Type getRCMO037() {
        return rcmo037;
    }

    /**
     * Définit la valeur de la propriété rcmo037.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO037Type }
     *     
     */
    public void setRCMO037(RCMO037Type value) {
        this.rcmo037 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo037.
     * 
     * @return
     *     possible object is
     *     {@link RMMO037Type }
     *     
     */
    public RMMO037Type getRMMO037() {
        return rmmo037;
    }

    /**
     * Définit la valeur de la propriété rmmo037.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO037Type }
     *     
     */
    public void setRMMO037(RMMO037Type value) {
        this.rmmo037 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo038.
     * 
     * @return
     *     possible object is
     *     {@link RCMO038Type }
     *     
     */
    public RCMO038Type getRCMO038() {
        return rcmo038;
    }

    /**
     * Définit la valeur de la propriété rcmo038.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO038Type }
     *     
     */
    public void setRCMO038(RCMO038Type value) {
        this.rcmo038 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo038.
     * 
     * @return
     *     possible object is
     *     {@link RMMO038Type }
     *     
     */
    public RMMO038Type getRMMO038() {
        return rmmo038;
    }

    /**
     * Définit la valeur de la propriété rmmo038.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO038Type }
     *     
     */
    public void setRMMO038(RMMO038Type value) {
        this.rmmo038 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo039.
     * 
     * @return
     *     possible object is
     *     {@link RCMO039Type }
     *     
     */
    public RCMO039Type getRCMO039() {
        return rcmo039;
    }

    /**
     * Définit la valeur de la propriété rcmo039.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO039Type }
     *     
     */
    public void setRCMO039(RCMO039Type value) {
        this.rcmo039 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo039.
     * 
     * @return
     *     possible object is
     *     {@link RMMO039Type }
     *     
     */
    public RMMO039Type getRMMO039() {
        return rmmo039;
    }

    /**
     * Définit la valeur de la propriété rmmo039.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO039Type }
     *     
     */
    public void setRMMO039(RMMO039Type value) {
        this.rmmo039 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo040.
     * 
     * @return
     *     possible object is
     *     {@link RCMO040Type }
     *     
     */
    public RCMO040Type getRCMO040() {
        return rcmo040;
    }

    /**
     * Définit la valeur de la propriété rcmo040.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO040Type }
     *     
     */
    public void setRCMO040(RCMO040Type value) {
        this.rcmo040 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo040.
     * 
     * @return
     *     possible object is
     *     {@link RMMO040Type }
     *     
     */
    public RMMO040Type getRMMO040() {
        return rmmo040;
    }

    /**
     * Définit la valeur de la propriété rmmo040.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO040Type }
     *     
     */
    public void setRMMO040(RMMO040Type value) {
        this.rmmo040 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo041.
     * 
     * @return
     *     possible object is
     *     {@link RCMO041Type }
     *     
     */
    public RCMO041Type getRCMO041() {
        return rcmo041;
    }

    /**
     * Définit la valeur de la propriété rcmo041.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO041Type }
     *     
     */
    public void setRCMO041(RCMO041Type value) {
        this.rcmo041 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo041.
     * 
     * @return
     *     possible object is
     *     {@link RMMO041Type }
     *     
     */
    public RMMO041Type getRMMO041() {
        return rmmo041;
    }

    /**
     * Définit la valeur de la propriété rmmo041.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO041Type }
     *     
     */
    public void setRMMO041(RMMO041Type value) {
        this.rmmo041 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo042.
     * 
     * @return
     *     possible object is
     *     {@link RCMO042Type }
     *     
     */
    public RCMO042Type getRCMO042() {
        return rcmo042;
    }

    /**
     * Définit la valeur de la propriété rcmo042.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO042Type }
     *     
     */
    public void setRCMO042(RCMO042Type value) {
        this.rcmo042 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo042.
     * 
     * @return
     *     possible object is
     *     {@link RMMO042Type }
     *     
     */
    public RMMO042Type getRMMO042() {
        return rmmo042;
    }

    /**
     * Définit la valeur de la propriété rmmo042.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO042Type }
     *     
     */
    public void setRMMO042(RMMO042Type value) {
        this.rmmo042 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo043.
     * 
     * @return
     *     possible object is
     *     {@link RCMO043Type }
     *     
     */
    public RCMO043Type getRCMO043() {
        return rcmo043;
    }

    /**
     * Définit la valeur de la propriété rcmo043.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO043Type }
     *     
     */
    public void setRCMO043(RCMO043Type value) {
        this.rcmo043 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo043.
     * 
     * @return
     *     possible object is
     *     {@link RMMO043Type }
     *     
     */
    public RMMO043Type getRMMO043() {
        return rmmo043;
    }

    /**
     * Définit la valeur de la propriété rmmo043.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO043Type }
     *     
     */
    public void setRMMO043(RMMO043Type value) {
        this.rmmo043 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo044.
     * 
     * @return
     *     possible object is
     *     {@link RCMO044Type }
     *     
     */
    public RCMO044Type getRCMO044() {
        return rcmo044;
    }

    /**
     * Définit la valeur de la propriété rcmo044.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO044Type }
     *     
     */
    public void setRCMO044(RCMO044Type value) {
        this.rcmo044 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo044.
     * 
     * @return
     *     possible object is
     *     {@link RMMO044Type }
     *     
     */
    public RMMO044Type getRMMO044() {
        return rmmo044;
    }

    /**
     * Définit la valeur de la propriété rmmo044.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO044Type }
     *     
     */
    public void setRMMO044(RMMO044Type value) {
        this.rmmo044 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo045.
     * 
     * @return
     *     possible object is
     *     {@link RCMO045Type }
     *     
     */
    public RCMO045Type getRCMO045() {
        return rcmo045;
    }

    /**
     * Définit la valeur de la propriété rcmo045.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO045Type }
     *     
     */
    public void setRCMO045(RCMO045Type value) {
        this.rcmo045 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo045.
     * 
     * @return
     *     possible object is
     *     {@link RMMO045Type }
     *     
     */
    public RMMO045Type getRMMO045() {
        return rmmo045;
    }

    /**
     * Définit la valeur de la propriété rmmo045.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO045Type }
     *     
     */
    public void setRMMO045(RMMO045Type value) {
        this.rmmo045 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo046.
     * 
     * @return
     *     possible object is
     *     {@link RCMO046Type }
     *     
     */
    public RCMO046Type getRCMO046() {
        return rcmo046;
    }

    /**
     * Définit la valeur de la propriété rcmo046.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO046Type }
     *     
     */
    public void setRCMO046(RCMO046Type value) {
        this.rcmo046 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo046.
     * 
     * @return
     *     possible object is
     *     {@link RMMO046Type }
     *     
     */
    public RMMO046Type getRMMO046() {
        return rmmo046;
    }

    /**
     * Définit la valeur de la propriété rmmo046.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO046Type }
     *     
     */
    public void setRMMO046(RMMO046Type value) {
        this.rmmo046 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo047.
     * 
     * @return
     *     possible object is
     *     {@link RCMO047Type }
     *     
     */
    public RCMO047Type getRCMO047() {
        return rcmo047;
    }

    /**
     * Définit la valeur de la propriété rcmo047.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO047Type }
     *     
     */
    public void setRCMO047(RCMO047Type value) {
        this.rcmo047 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo047.
     * 
     * @return
     *     possible object is
     *     {@link RMMO047Type }
     *     
     */
    public RMMO047Type getRMMO047() {
        return rmmo047;
    }

    /**
     * Définit la valeur de la propriété rmmo047.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO047Type }
     *     
     */
    public void setRMMO047(RMMO047Type value) {
        this.rmmo047 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo048.
     * 
     * @return
     *     possible object is
     *     {@link RCMO048Type }
     *     
     */
    public RCMO048Type getRCMO048() {
        return rcmo048;
    }

    /**
     * Définit la valeur de la propriété rcmo048.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO048Type }
     *     
     */
    public void setRCMO048(RCMO048Type value) {
        this.rcmo048 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo048.
     * 
     * @return
     *     possible object is
     *     {@link RMMO048Type }
     *     
     */
    public RMMO048Type getRMMO048() {
        return rmmo048;
    }

    /**
     * Définit la valeur de la propriété rmmo048.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO048Type }
     *     
     */
    public void setRMMO048(RMMO048Type value) {
        this.rmmo048 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo049.
     * 
     * @return
     *     possible object is
     *     {@link RCMO049Type }
     *     
     */
    public RCMO049Type getRCMO049() {
        return rcmo049;
    }

    /**
     * Définit la valeur de la propriété rcmo049.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO049Type }
     *     
     */
    public void setRCMO049(RCMO049Type value) {
        this.rcmo049 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo049.
     * 
     * @return
     *     possible object is
     *     {@link RMMO049Type }
     *     
     */
    public RMMO049Type getRMMO049() {
        return rmmo049;
    }

    /**
     * Définit la valeur de la propriété rmmo049.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO049Type }
     *     
     */
    public void setRMMO049(RMMO049Type value) {
        this.rmmo049 = value;
    }

    /**
     * Obtient la valeur de la propriété rcmo050.
     * 
     * @return
     *     possible object is
     *     {@link RCMO050Type }
     *     
     */
    public RCMO050Type getRCMO050() {
        return rcmo050;
    }

    /**
     * Définit la valeur de la propriété rcmo050.
     * 
     * @param value
     *     allowed object is
     *     {@link RCMO050Type }
     *     
     */
    public void setRCMO050(RCMO050Type value) {
        this.rcmo050 = value;
    }

    /**
     * Obtient la valeur de la propriété rmmo050.
     * 
     * @return
     *     possible object is
     *     {@link RMMO050Type }
     *     
     */
    public RMMO050Type getRMMO050() {
        return rmmo050;
    }

    /**
     * Définit la valeur de la propriété rmmo050.
     * 
     * @param value
     *     allowed object is
     *     {@link RMMO050Type }
     *     
     */
    public void setRMMO050(RMMO050Type value) {
        this.rmmo050 = value;
    }

    /**
     * Obtient la valeur de la propriété voutAge.
     * 
     * @return
     *     possible object is
     *     {@link VOUTAgeType }
     *     
     */
    public VOUTAgeType getVOUTAge() {
        return voutAge;
    }

    /**
     * Définit la valeur de la propriété voutAge.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTAgeType }
     *     
     */
    public void setVOUTAge(VOUTAgeType value) {
        this.voutAge = value;
    }

    /**
     * Obtient la valeur de la propriété voutAgeDureePret.
     * 
     * @return
     *     possible object is
     *     {@link VOUTAgeDureePretType }
     *     
     */
    public VOUTAgeDureePretType getVOUTAgeDureePret() {
        return voutAgeDureePret;
    }

    /**
     * Définit la valeur de la propriété voutAgeDureePret.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTAgeDureePretType }
     *     
     */
    public void setVOUTAgeDureePret(VOUTAgeDureePretType value) {
        this.voutAgeDureePret = value;
    }

    /**
     * Obtient la valeur de la propriété voutAncienneteActivitePart.
     * 
     * @return
     *     possible object is
     *     {@link VOUTAncienneteActivitePartType }
     *     
     */
    public VOUTAncienneteActivitePartType getVOUTAncienneteActivitePart() {
        return voutAncienneteActivitePart;
    }

    /**
     * Définit la valeur de la propriété voutAncienneteActivitePart.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTAncienneteActivitePartType }
     *     
     */
    public void setVOUTAncienneteActivitePart(VOUTAncienneteActivitePartType value) {
        this.voutAncienneteActivitePart = value;
    }

    /**
     * Obtient la valeur de la propriété voutAncienneteTeteSociete.
     * 
     * @return
     *     possible object is
     *     {@link VOUTAncienneteTeteSocieteType }
     *     
     */
    public VOUTAncienneteTeteSocieteType getVOUTAncienneteTeteSociete() {
        return voutAncienneteTeteSociete;
    }

    /**
     * Définit la valeur de la propriété voutAncienneteTeteSociete.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTAncienneteTeteSocieteType }
     *     
     */
    public void setVOUTAncienneteTeteSociete(VOUTAncienneteTeteSocieteType value) {
        this.voutAncienneteTeteSociete = value;
    }

    /**
     * Obtient la valeur de la propriété voutAncienneteBancaire.
     * 
     * @return
     *     possible object is
     *     {@link VOUTAncienneteBancaireType }
     *     
     */
    public VOUTAncienneteBancaireType getVOUTAncienneteBancaire() {
        return voutAncienneteBancaire;
    }

    /**
     * Définit la valeur de la propriété voutAncienneteBancaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTAncienneteBancaireType }
     *     
     */
    public void setVOUTAncienneteBancaire(VOUTAncienneteBancaireType value) {
        this.voutAncienneteBancaire = value;
    }

    /**
     * Obtient la valeur de la propriété voutSexe.
     * 
     * @return
     *     possible object is
     *     {@link VOUTSexeType }
     *     
     */
    public VOUTSexeType getVOUTSexe() {
        return voutSexe;
    }

    /**
     * Définit la valeur de la propriété voutSexe.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTSexeType }
     *     
     */
    public void setVOUTSexe(VOUTSexeType value) {
        this.voutSexe = value;
    }

    /**
     * Obtient la valeur de la propriété voutSituationLogement.
     * 
     * @return
     *     possible object is
     *     {@link VOUTSituationLogementType }
     *     
     */
    public VOUTSituationLogementType getVOUTSituationLogement() {
        return voutSituationLogement;
    }

    /**
     * Définit la valeur de la propriété voutSituationLogement.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTSituationLogementType }
     *     
     */
    public void setVOUTSituationLogement(VOUTSituationLogementType value) {
        this.voutSituationLogement = value;
    }

    /**
     * Obtient la valeur de la propriété voutNouveauClientON.
     * 
     * @return
     *     possible object is
     *     {@link VOUTNouveauClientONType }
     *     
     */
    public VOUTNouveauClientONType getVOUTNouveauClientON() {
        return voutNouveauClientON;
    }

    /**
     * Définit la valeur de la propriété voutNouveauClientON.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTNouveauClientONType }
     *     
     */
    public void setVOUTNouveauClientON(VOUTNouveauClientONType value) {
        this.voutNouveauClientON = value;
    }

    /**
     * Obtient la valeur de la propriété voutNbrImpayes12.
     * 
     * @return
     *     possible object is
     *     {@link VOUTNbrImpayes12Type }
     *     
     */
    public VOUTNbrImpayes12Type getVOUTNbrImpayes12() {
        return voutNbrImpayes12;
    }

    /**
     * Définit la valeur de la propriété voutNbrImpayes12.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTNbrImpayes12Type }
     *     
     */
    public void setVOUTNbrImpayes12(VOUTNbrImpayes12Type value) {
        this.voutNbrImpayes12 = value;
    }

    /**
     * Obtient la valeur de la propriété voutMinimumVital.
     * 
     * @return
     *     possible object is
     *     {@link VOUTMinimumVitalType }
     *     
     */
    public VOUTMinimumVitalType getVOUTMinimumVital() {
        return voutMinimumVital;
    }

    /**
     * Définit la valeur de la propriété voutMinimumVital.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTMinimumVitalType }
     *     
     */
    public void setVOUTMinimumVital(VOUTMinimumVitalType value) {
        this.voutMinimumVital = value;
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
     * Obtient la valeur de la propriété voutcsp.
     * 
     * @return
     *     possible object is
     *     {@link VOUTCSPType }
     *     
     */
    public VOUTCSPType getVOUTCSP() {
        return voutcsp;
    }

    /**
     * Définit la valeur de la propriété voutcsp.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTCSPType }
     *     
     */
    public void setVOUTCSP(VOUTCSPType value) {
        this.voutcsp = value;
    }

    /**
     * Obtient la valeur de la propriété voutcspCode.
     * 
     * @return
     *     possible object is
     *     {@link VOUTCSPCodeType }
     *     
     */
    public VOUTCSPCodeType getVOUTCSPCode() {
        return voutcspCode;
    }

    /**
     * Définit la valeur de la propriété voutcspCode.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTCSPCodeType }
     *     
     */
    public void setVOUTCSPCode(VOUTCSPCodeType value) {
        this.voutcspCode = value;
    }

    /**
     * Obtient la valeur de la propriété voutSoldeMoyen3Mois.
     * 
     * @return
     *     possible object is
     *     {@link VOUTSoldeMoyen3MoisType }
     *     
     */
    public VOUTSoldeMoyen3MoisType getVOUTSoldeMoyen3Mois() {
        return voutSoldeMoyen3Mois;
    }

    /**
     * Définit la valeur de la propriété voutSoldeMoyen3Mois.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTSoldeMoyen3MoisType }
     *     
     */
    public void setVOUTSoldeMoyen3Mois(VOUTSoldeMoyen3MoisType value) {
        this.voutSoldeMoyen3Mois = value;
    }

    /**
     * Obtient la valeur de la propriété voutRevenuTotal.
     * 
     * @return
     *     possible object is
     *     {@link VOUTRevenuTotalType }
     *     
     */
    public VOUTRevenuTotalType getVOUTRevenuTotal() {
        return voutRevenuTotal;
    }

    /**
     * Définit la valeur de la propriété voutRevenuTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTRevenuTotalType }
     *     
     */
    public void setVOUTRevenuTotal(VOUTRevenuTotalType value) {
        this.voutRevenuTotal = value;
    }

    /**
     * Obtient la valeur de la propriété voutImpayeFlag.
     * 
     * @return
     *     possible object is
     *     {@link VOUTImpayeFlagType }
     *     
     */
    public VOUTImpayeFlagType getVOUTImpayeFlag() {
        return voutImpayeFlag;
    }

    /**
     * Définit la valeur de la propriété voutImpayeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTImpayeFlagType }
     *     
     */
    public void setVOUTImpayeFlag(VOUTImpayeFlagType value) {
        this.voutImpayeFlag = value;
    }

    /**
     * Obtient la valeur de la propriété voutCodeBanque.
     * 
     * @return
     *     possible object is
     *     {@link VOUTCodeBanqueType }
     *     
     */
    public VOUTCodeBanqueType getVOUTCodeBanque() {
        return voutCodeBanque;
    }

    /**
     * Définit la valeur de la propriété voutCodeBanque.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTCodeBanqueType }
     *     
     */
    public void setVOUTCodeBanque(VOUTCodeBanqueType value) {
        this.voutCodeBanque = value;
    }

    /**
     * Obtient la valeur de la propriété voutEncoursCompensees.
     * 
     * @return
     *     possible object is
     *     {@link VOUTEncoursCompenseesType }
     *     
     */
    public VOUTEncoursCompenseesType getVOUTEncoursCompensees() {
        return voutEncoursCompensees;
    }

    /**
     * Définit la valeur de la propriété voutEncoursCompensees.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTEncoursCompenseesType }
     *     
     */
    public void setVOUTEncoursCompensees(VOUTEncoursCompenseesType value) {
        this.voutEncoursCompensees = value;
    }

    /**
     * Obtient la valeur de la propriété voutEncoursAncienneAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VOUTEncoursAncienneAffaireType }
     *     
     */
    public VOUTEncoursAncienneAffaireType getVOUTEncoursAncienneAffaire() {
        return voutEncoursAncienneAffaire;
    }

    /**
     * Définit la valeur de la propriété voutEncoursAncienneAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTEncoursAncienneAffaireType }
     *     
     */
    public void setVOUTEncoursAncienneAffaire(VOUTEncoursAncienneAffaireType value) {
        this.voutEncoursAncienneAffaire = value;
    }

    /**
     * Obtient la valeur de la propriété voutEncoursClientHISTO.
     * 
     * @return
     *     possible object is
     *     {@link VOUTEncoursClientHISTOType }
     *     
     */
    public VOUTEncoursClientHISTOType getVOUTEncoursClientHISTO() {
        return voutEncoursClientHISTO;
    }

    /**
     * Définit la valeur de la propriété voutEncoursClientHISTO.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTEncoursClientHISTOType }
     *     
     */
    public void setVOUTEncoursClientHISTO(VOUTEncoursClientHISTOType value) {
        this.voutEncoursClientHISTO = value;
    }

    /**
     * Obtient la valeur de la propriété voutEncoursProduitPP.
     * 
     * @return
     *     possible object is
     *     {@link VOUTEncoursProduitPPType }
     *     
     */
    public VOUTEncoursProduitPPType getVOUTEncoursProduitPP() {
        return voutEncoursProduitPP;
    }

    /**
     * Définit la valeur de la propriété voutEncoursProduitPP.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTEncoursProduitPPType }
     *     
     */
    public void setVOUTEncoursProduitPP(VOUTEncoursProduitPPType value) {
        this.voutEncoursProduitPP = value;
    }

    /**
     * Obtient la valeur de la propriété voutEncoursProduitEDM.
     * 
     * @return
     *     possible object is
     *     {@link VOUTEncoursProduitEDMType }
     *     
     */
    public VOUTEncoursProduitEDMType getVOUTEncoursProduitEDM() {
        return voutEncoursProduitEDM;
    }

    /**
     * Définit la valeur de la propriété voutEncoursProduitEDM.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTEncoursProduitEDMType }
     *     
     */
    public void setVOUTEncoursProduitEDM(VOUTEncoursProduitEDMType value) {
        this.voutEncoursProduitEDM = value;
    }

    /**
     * Obtient la valeur de la propriété voutEncoursProduitAUTO.
     * 
     * @return
     *     possible object is
     *     {@link VOUTEncoursProduitAUTOType }
     *     
     */
    public VOUTEncoursProduitAUTOType getVOUTEncoursProduitAUTO() {
        return voutEncoursProduitAUTO;
    }

    /**
     * Définit la valeur de la propriété voutEncoursProduitAUTO.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTEncoursProduitAUTOType }
     *     
     */
    public void setVOUTEncoursProduitAUTO(VOUTEncoursProduitAUTOType value) {
        this.voutEncoursProduitAUTO = value;
    }

    /**
     * Obtient la valeur de la propriété voutEncoursProduitASSU.
     * 
     * @return
     *     possible object is
     *     {@link VOUTEncoursProduitASSUType }
     *     
     */
    public VOUTEncoursProduitASSUType getVOUTEncoursProduitASSU() {
        return voutEncoursProduitASSU;
    }

    /**
     * Définit la valeur de la propriété voutEncoursProduitASSU.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTEncoursProduitASSUType }
     *     
     */
    public void setVOUTEncoursProduitASSU(VOUTEncoursProduitASSUType value) {
        this.voutEncoursProduitASSU = value;
    }

    /**
     * Obtient la valeur de la propriété voutEncoursProduitMOU.
     * 
     * @return
     *     possible object is
     *     {@link VOUTEncoursProduitMOUType }
     *     
     */
    public VOUTEncoursProduitMOUType getVOUTEncoursProduitMOU() {
        return voutEncoursProduitMOU;
    }

    /**
     * Définit la valeur de la propriété voutEncoursProduitMOU.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTEncoursProduitMOUType }
     *     
     */
    public void setVOUTEncoursProduitMOU(VOUTEncoursProduitMOUType value) {
        this.voutEncoursProduitMOU = value;
    }

    /**
     * Obtient la valeur de la propriété voutFichageChequiersEncours.
     * 
     * @return
     *     possible object is
     *     {@link VOUTFichageChequiersEncoursType }
     *     
     */
    public VOUTFichageChequiersEncoursType getVOUTFichageChequiersEncours() {
        return voutFichageChequiersEncours;
    }

    /**
     * Définit la valeur de la propriété voutFichageChequiersEncours.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTFichageChequiersEncoursType }
     *     
     */
    public void setVOUTFichageChequiersEncours(VOUTFichageChequiersEncoursType value) {
        this.voutFichageChequiersEncours = value;
    }

    /**
     * Obtient la valeur de la propriété voutFichageChequiersEchu.
     * 
     * @return
     *     possible object is
     *     {@link VOUTFichageChequiersEchuType }
     *     
     */
    public VOUTFichageChequiersEchuType getVOUTFichageChequiersEchu() {
        return voutFichageChequiersEchu;
    }

    /**
     * Définit la valeur de la propriété voutFichageChequiersEchu.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTFichageChequiersEchuType }
     *     
     */
    public void setVOUTFichageChequiersEchu(VOUTFichageChequiersEchuType value) {
        this.voutFichageChequiersEchu = value;
    }

    /**
     * Obtient la valeur de la propriété voutFichageChequiersRegularise.
     * 
     * @return
     *     possible object is
     *     {@link VOUTFichageChequiersRegulariseType }
     *     
     */
    public VOUTFichageChequiersRegulariseType getVOUTFichageChequiersRegularise() {
        return voutFichageChequiersRegularise;
    }

    /**
     * Définit la valeur de la propriété voutFichageChequiersRegularise.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTFichageChequiersRegulariseType }
     *     
     */
    public void setVOUTFichageChequiersRegularise(VOUTFichageChequiersRegulariseType value) {
        this.voutFichageChequiersRegularise = value;
    }

    /**
     * Obtient la valeur de la propriété voutFichageChequiersAnnule.
     * 
     * @return
     *     possible object is
     *     {@link VOUTFichageChequiersAnnuleType }
     *     
     */
    public VOUTFichageChequiersAnnuleType getVOUTFichageChequiersAnnule() {
        return voutFichageChequiersAnnule;
    }

    /**
     * Définit la valeur de la propriété voutFichageChequiersAnnule.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTFichageChequiersAnnuleType }
     *     
     */
    public void setVOUTFichageChequiersAnnule(VOUTFichageChequiersAnnuleType value) {
        this.voutFichageChequiersAnnule = value;
    }

    /**
     * Obtient la valeur de la propriété voutNbrIncidents.
     * 
     * @return
     *     possible object is
     *     {@link VOUTNbrIncidentsType }
     *     
     */
    public VOUTNbrIncidentsType getVOUTNbrIncidents() {
        return voutNbrIncidents;
    }

    /**
     * Définit la valeur de la propriété voutNbrIncidents.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTNbrIncidentsType }
     *     
     */
    public void setVOUTNbrIncidents(VOUTNbrIncidentsType value) {
        this.voutNbrIncidents = value;
    }

    /**
     * Obtient la valeur de la propriété voutMouvementsCrediteurs.
     * 
     * @return
     *     possible object is
     *     {@link VOUTMouvementsCrediteursType }
     *     
     */
    public VOUTMouvementsCrediteursType getVOUTMouvementsCrediteurs() {
        return voutMouvementsCrediteurs;
    }

    /**
     * Définit la valeur de la propriété voutMouvementsCrediteurs.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTMouvementsCrediteursType }
     *     
     */
    public void setVOUTMouvementsCrediteurs(VOUTMouvementsCrediteursType value) {
        this.voutMouvementsCrediteurs = value;
    }

    /**
     * Obtient la valeur de la propriété voutNbrImpayes.
     * 
     * @return
     *     possible object is
     *     {@link VOUTNbrImpayesType }
     *     
     */
    public VOUTNbrImpayesType getVOUTNbrImpayes() {
        return voutNbrImpayes;
    }

    /**
     * Définit la valeur de la propriété voutNbrImpayes.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTNbrImpayesType }
     *     
     */
    public void setVOUTNbrImpayes(VOUTNbrImpayesType value) {
        this.voutNbrImpayes = value;
    }

    /**
     * Obtient la valeur de la propriété voutSoldeImpayes.
     * 
     * @return
     *     possible object is
     *     {@link VOUTSoldeImpayesType }
     *     
     */
    public VOUTSoldeImpayesType getVOUTSoldeImpayes() {
        return voutSoldeImpayes;
    }

    /**
     * Définit la valeur de la propriété voutSoldeImpayes.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTSoldeImpayesType }
     *     
     */
    public void setVOUTSoldeImpayes(VOUTSoldeImpayesType value) {
        this.voutSoldeImpayes = value;
    }

    /**
     * Obtient la valeur de la propriété voutTauxEndettement.
     * 
     * @return
     *     possible object is
     *     {@link VOUTTauxEndettementType }
     *     
     */
    public VOUTTauxEndettementType getVOUTTauxEndettement() {
        return voutTauxEndettement;
    }

    /**
     * Définit la valeur de la propriété voutTauxEndettement.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTTauxEndettementType }
     *     
     */
    public void setVOUTTauxEndettement(VOUTTauxEndettementType value) {
        this.voutTauxEndettement = value;
    }

    /**
     * Obtient la valeur de la propriété voutTemporisation.
     * 
     * @return
     *     possible object is
     *     {@link VOUTTemporisationType }
     *     
     */
    public VOUTTemporisationType getVOUTTemporisation() {
        return voutTemporisation;
    }

    /**
     * Définit la valeur de la propriété voutTemporisation.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTTemporisationType }
     *     
     */
    public void setVOUTTemporisation(VOUTTemporisationType value) {
        this.voutTemporisation = value;
    }

    /**
     * Obtient la valeur de la propriété voutMontantRevenu.
     * 
     * @return
     *     possible object is
     *     {@link VOUTMontantRevenuType }
     *     
     */
    public VOUTMontantRevenuType getVOUTMontantRevenu() {
        return voutMontantRevenu;
    }

    /**
     * Définit la valeur de la propriété voutMontantRevenu.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTMontantRevenuType }
     *     
     */
    public void setVOUTMontantRevenu(VOUTMontantRevenuType value) {
        this.voutMontantRevenu = value;
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
     * Obtient la valeur de la propriété voutEmployeur.
     * 
     * @return
     *     possible object is
     *     {@link VOUTEmployeurType }
     *     
     */
    public VOUTEmployeurType getVOUTEmployeur() {
        return voutEmployeur;
    }

    /**
     * Définit la valeur de la propriété voutEmployeur.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTEmployeurType }
     *     
     */
    public void setVOUTEmployeur(VOUTEmployeurType value) {
        this.voutEmployeur = value;
    }

}
