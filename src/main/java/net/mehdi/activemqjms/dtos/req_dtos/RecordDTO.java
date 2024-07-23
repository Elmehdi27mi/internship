
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
 *         &lt;element ref="{}VIN_Role"/&gt;
 *         &lt;element ref="{}VIN_Progressif_Role"/&gt;
 *         &lt;element ref="{}VIN_Identifiant_Client"/&gt;
 *         &lt;element ref="{}VIN_Type_Client"/&gt;
 *         &lt;element ref="{}VIN_Forme_Juridique"/&gt;
 *         &lt;element ref="{}VIN_Part_PM"/&gt;
 *         &lt;element ref="{}VIN_Sexe"/&gt;
 *         &lt;element ref="{}VIN_Date_Naissance"/&gt;
 *         &lt;element ref="{}VIN_Date_Creat_Entr"/&gt;
 *         &lt;element ref="{}VIN_Nouveau_Client_ON"/&gt;
 *         &lt;element ref="{}VIN_Nationalite"/&gt;
 *         &lt;element ref="{}VIN_Date_Embauche"/&gt;
 *         &lt;element ref="{}VIN_Date_Creation_RC"/&gt;
 *         &lt;element ref="{}VIN_Situation_Logement"/&gt;
 *         &lt;element ref="{}VIN_Profession"/&gt;
 *         &lt;element ref="{}VIN_Code_Activite"/&gt;
 *         &lt;element ref="{}VIN_Date_Integration_Societe"/&gt;
 *         &lt;element ref="{}VIN_Code_Ville"/&gt;
 *         &lt;element ref="{}VIN_Code_Banque"/&gt;
 *         &lt;element ref="{}VIN_Date_Relation_Banque"/&gt;
 *         &lt;element ref="{}VIN_Nbr_Anciens_Dossiers"/&gt;
 *         &lt;element ref="{}VIN_Black_List"/&gt;
 *         &lt;element ref="{}VIN_Revenus_Mensuels"/&gt;
 *         &lt;element ref="{}VIN_Autre_Revenus"/&gt;
 *         &lt;element ref="{}VIN_Revenu_Conjoint"/&gt;
 *         &lt;element ref="{}VIN_Autre_Charges"/&gt;
 *         &lt;element ref="{}VIN_Charge_Imm"/&gt;
 *         &lt;element ref="{}VIN_Credit_Logement"/&gt;
 *         &lt;element ref="{}VIN_Max_Nbr_Impayes"/&gt;
 *         &lt;element ref="{}VIN_Mt_Impayes"/&gt;
 *         &lt;element ref="{}VIN_Max_Nbr_Mois_Retard"/&gt;
 *         &lt;element ref="{}VIN_Total_Mt_Negative"/&gt;
 *         &lt;element ref="{}VIN_Solde_Init"/&gt;
 *         &lt;element ref="{}VIN_Credit_M_1"/&gt;
 *         &lt;element ref="{}VIN_Credit_M_2"/&gt;
 *         &lt;element ref="{}VIN_Credit_M_3"/&gt;
 *         &lt;element ref="{}VIN_Debit_M_1"/&gt;
 *         &lt;element ref="{}VIN_Debit_M_2"/&gt;
 *         &lt;element ref="{}VIN_Debit_M_3"/&gt;
 *         &lt;element ref="{}VIN_Source"/&gt;
 *         &lt;element ref="{}VIN_Reference_Progressif_Role"/&gt;
 *         &lt;element ref="{}VIN_Numero_Chequiers"/&gt;
 *         &lt;element ref="{}VIN_Date_Effet"/&gt;
 *         &lt;element ref="{}VIN_Date_Sortie"/&gt;
 *         &lt;element ref="{}VIN_Statut_Chequiers"/&gt;
 *         &lt;element ref="{}VIN_Montant_Chequier"/&gt;
 *         &lt;element ref="{}VIN_Produit_Affaire"/&gt;
 *         &lt;element ref="{}VIN_Contentieux"/&gt;
 *         &lt;element ref="{}VIN_Nbr_Impayes"/&gt;
 *         &lt;element ref="{}VIN_Nbr_Impayes_12"/&gt;
 *         &lt;element ref="{}VIN_Date_Premiere_Echeance"/&gt;
 *         &lt;element ref="{}VIN_Date_Creation_Affaire"/&gt;
 *         &lt;element ref="{}VIN_Compensation"/&gt;
 *         &lt;element ref="{}VIN_CRD"/&gt;
 *         &lt;element ref="{}VIN_SOLDE"/&gt;
 *         &lt;element ref="{}VIN_Statut_Affaire"/&gt;
 *         &lt;element ref="{}VIN_Mt_Premiere_Echeanche_Ancienne_Affaire"/&gt;
 *         &lt;element ref="{}VIN_Nbr_Incidents"/&gt;
 *         &lt;element ref="{}VIN_Loyer_Ekip"/&gt;
 *         &lt;element ref="{}VIN_Loyer_Ekip_Comp"/&gt;
 *         &lt;element ref="{}VIN_Loyer_Front"/&gt;
 *         &lt;element ref="{}VIN_Role_Ancienne_Affaire"/&gt;
 *         &lt;element ref="{}VIN_Marche"/&gt;
 *         &lt;element ref="{}VIN_Segment"/&gt;
 *         &lt;element ref="{}VIN_Employeur"/&gt;
 *         &lt;element ref="{}VIN_Fonction"/&gt;
 *         &lt;element ref="{}VIN_DATE_FIN_CONTRAT"/&gt;
 *         &lt;element ref="{}VIN_FLAG_SINISTRE"/&gt;
 *         &lt;element ref="{}VIN_TYPE_GARANTIE"/&gt;
 *         &lt;element ref="{}VIN_MONTANT_EXPERTISE"/&gt;
 *         &lt;element ref="{}VIN_DATE_CERTIFICAT"/&gt;
 *         &lt;element ref="{}VIN_QUOTE_PART_GR"/&gt;
 *         &lt;element ref="{}VIN_VILLE_BIEN"/&gt;
 *         &lt;element ref="{}VIN_Rang_Garantie"/&gt;
 *         &lt;element ref="{}VIN_TYPE_CONTRAT"/&gt;
 *         &lt;element ref="{}VIN_ECHEANCE_RESTANTE"/&gt;
 *         &lt;element ref="{}VIN_ONU"/&gt;
 *         &lt;element ref="{}VIN_annee_bilan"/&gt;
 *         &lt;element ref="{}VIN_CTRL_INFORISK"/&gt;
 *         &lt;element ref="{}VIN_STOCKS"/&gt;
 *         &lt;element ref="{}VIN_CREANCE_ACTIF_CIRC"/&gt;
 *         &lt;element ref="{}VIN_TRESORERIE_ACTIF"/&gt;
 *         &lt;element ref="{}VIN_TOTAL_ACTIF"/&gt;
 *         &lt;element ref="{}VIN_CAPITAUX_PROPRES"/&gt;
 *         &lt;element ref="{}VIN_DETTES_FINANCEMENT"/&gt;
 *         &lt;element ref="{}VIN_PROVISION_RISQUE_CHARGE"/&gt;
 *         &lt;element ref="{}VIN_ECART_CONV_PASSIF_FIN_PERMANENT"/&gt;
 *         &lt;element ref="{}VIN_DETTES_PASSIF_CIRC"/&gt;
 *         &lt;element ref="{}VIN_AUTRES_PROVISION_RISQUE_CHARGE"/&gt;
 *         &lt;element ref="{}VIN_ECART_CONV_PASSIF_CIRC"/&gt;
 *         &lt;element ref="{}VIN_TOTAL_PASSIF_CIRC"/&gt;
 *         &lt;element ref="{}VIN_CHIFFRE_AFFAIRE_N1"/&gt;
 *         &lt;element ref="{}VIN_CHIFFRE_AFFAIRE_N0"/&gt;
 *         &lt;element ref="{}VIN_VARIATION_STOCK_PDT"/&gt;
 *         &lt;element ref="{}VIN_AUTRES_PDT_EXPL"/&gt;
 *         &lt;element ref="{}VIN_ACHAT_REVENDU_MARCHANDISE"/&gt;
 *         &lt;element ref="{}VIN_ACHAT_CONS_MATIERE_FOURNITURE"/&gt;
 *         &lt;element ref="{}VIN_DOTATION_EXPLOITATION_N1"/&gt;
 *         &lt;element ref="{}VIN_DOTATION_EXPLOITATION_N0"/&gt;
 *         &lt;element ref="{}VIN_CHARGE_FIN"/&gt;
 *         &lt;element ref="{}VIN_RESULTAT_FIN"/&gt;
 *         &lt;element ref="{}VIN_RESULTAT_NET_N1"/&gt;
 *         &lt;element ref="{}VIN_RESULTAT_NET_N0"/&gt;
 *         &lt;element ref="{}VIN_IE_AFFAIRE_OLD"/&gt;
 *         &lt;element ref="{}VIN_Flag_Report"/&gt;
 *         &lt;element ref="{}VIN_Date_Dernier_IMP"/&gt;
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
    "vinRole",
    "vinProgressifRole",
    "vinIdentifiantClient",
    "vinTypeClient",
    "vinFormeJuridique",
    "vinPartPM",
    "vinSexe",
    "vinDateNaissance",
    "vinDateCreatEntr",
    "vinNouveauClientON",
    "vinNationalite",
    "vinDateEmbauche",
    "vinDateCreationRC",
    "vinSituationLogement",
    "vinProfession",
    "vinCodeActivite",
    "vinDateIntegrationSociete",
    "vinCodeVille",
    "vinCodeBanque",
    "vinDateRelationBanque",
    "vinNbrAnciensDossiers",
    "vinBlackList",
    "vinRevenusMensuels",
    "vinAutreRevenus",
    "vinRevenuConjoint",
    "vinAutreCharges",
    "vinChargeImm",
    "vinCreditLogement",
    "vinMaxNbrImpayes",
    "vinMtImpayes",
    "vinMaxNbrMoisRetard",
    "vinTotalMtNegative",
    "vinSoldeInit",
    "vinCreditM1",
    "vinCreditM2",
    "vinCreditM3",
    "vinDebitM1",
    "vinDebitM2",
    "vinDebitM3",
    "vinSource",
    "vinReferenceProgressifRole",
    "vinNumeroChequiers",
    "vinDateEffet",
    "vinDateSortie",
    "vinStatutChequiers",
    "vinMontantChequier",
    "vinProduitAffaire",
    "vinContentieux",
    "vinNbrImpayes",
    "vinNbrImpayes12",
    "vinDatePremiereEcheance",
    "vinDateCreationAffaire",
    "vinCompensation",
    "vincrd",
    "vinsolde",
    "vinStatutAffaire",
    "vinMtPremiereEcheancheAncienneAffaire",
    "vinNbrIncidents",
    "vinLoyerEkip",
    "vinLoyerEkipComp",
    "vinLoyerFront",
    "vinRoleAncienneAffaire",
    "vinMarche",
    "vinSegment",
    "vinEmployeur",
    "vinFonction",
    "vindatefincontrat",
    "vinflagsinistre",
    "vintypegarantie",
    "vinmontantexpertise",
    "vindatecertificat",
    "vinquotepartgr",
    "vinvillebien",
    "vinRangGarantie",
    "vintypecontrat",
    "vinecheancerestante",
    "vinonu",
    "vinAnneeBilan",
    "vinctrlinforisk",
    "vinstocks",
    "vincreanceactifcirc",
    "vintresorerieactif",
    "vintotalactif",
    "vincapitauxpropres",
    "vindettesfinancement",
    "vinprovisionrisquecharge",
    "vinecartconvpassiffinpermanent",
    "vindettespassifcirc",
    "vinautresprovisionrisquecharge",
    "vinecartconvpassifcirc",
    "vintotalpassifcirc",
    "vinchiffreaffairen1",
    "vinchiffreaffairen0",
    "vinvariationstockpdt",
    "vinautrespdtexpl",
    "vinachatrevendumarchandise",
    "vinachatconsmatierefourniture",
    "vindotationexploitationn1",
    "vindotationexploitationn0",
    "vinchargefin",
    "vinresultatfin",
    "vinresultatnetn1",
    "vinresultatnetn0",
    "vinieaffaireold",
    "vinFlagReport",
    "vinDateDernierIMP"
})
@XmlRootElement(name = "Record")
public class RecordDTO {

    @XmlElement(name = "VIN_Role", required = true)
    protected VINRole vinRole;
    @XmlElement(name = "VIN_Progressif_Role", required = true)
    protected VINProgressifRole vinProgressifRole;
    @XmlElement(name = "VIN_Identifiant_Client", required = true)
    protected VINIdentifiantClient vinIdentifiantClient;
    @XmlElement(name = "VIN_Type_Client", required = true)
    protected VINTypeClient vinTypeClient;
    @XmlElement(name = "VIN_Forme_Juridique", required = true)
    protected VINFormeJuridique vinFormeJuridique;
    @XmlElement(name = "VIN_Part_PM", required = true)
    protected VINPartPM vinPartPM;
    @XmlElement(name = "VIN_Sexe", required = true)
    protected VINSexe vinSexe;
    @XmlElement(name = "VIN_Date_Naissance", required = true)
    protected VINDateNaissance vinDateNaissance;
    @XmlElement(name = "VIN_Date_Creat_Entr", required = true)
    protected VINDateCreatEntr vinDateCreatEntr;
    @XmlElement(name = "VIN_Nouveau_Client_ON", required = true)
    protected VINNouveauClientON vinNouveauClientON;
    @XmlElement(name = "VIN_Nationalite", required = true)
    protected VINNationalite vinNationalite;
    @XmlElement(name = "VIN_Date_Embauche", required = true)
    protected VINDateEmbauche vinDateEmbauche;
    @XmlElement(name = "VIN_Date_Creation_RC", required = true)
    protected VINDateCreationRC vinDateCreationRC;
    @XmlElement(name = "VIN_Situation_Logement", required = true)
    protected VINSituationLogement vinSituationLogement;
    @XmlElement(name = "VIN_Profession", required = true)
    protected VINProfession vinProfession;
    @XmlElement(name = "VIN_Code_Activite", required = true)
    protected VINCodeActivite vinCodeActivite;
    @XmlElement(name = "VIN_Date_Integration_Societe", required = true)
    protected VINDateIntegrationSociete vinDateIntegrationSociete;
    @XmlElement(name = "VIN_Code_Ville", required = true)
    protected VINCodeVille vinCodeVille;
    @XmlElement(name = "VIN_Code_Banque", required = true)
    protected VINCodeBanque vinCodeBanque;
    @XmlElement(name = "VIN_Date_Relation_Banque", required = true)
    protected VINDateRelationBanque vinDateRelationBanque;
    @XmlElement(name = "VIN_Nbr_Anciens_Dossiers", required = true)
    protected VINNbrAnciensDossiers vinNbrAnciensDossiers;
    @XmlElement(name = "VIN_Black_List", required = true)
    protected VINBlackList vinBlackList;
    @XmlElement(name = "VIN_Revenus_Mensuels", required = true)
    protected VINRevenusMensuels vinRevenusMensuels;
    @XmlElement(name = "VIN_Autre_Revenus", required = true)
    protected VINAutreRevenus vinAutreRevenus;
    @XmlElement(name = "VIN_Revenu_Conjoint", required = true)
    protected VINRevenuConjoint vinRevenuConjoint;
    @XmlElement(name = "VIN_Autre_Charges", required = true)
    protected VINAutreCharges vinAutreCharges;
    @XmlElement(name = "VIN_Charge_Imm", required = true)
    protected VINChargeImm vinChargeImm;
    @XmlElement(name = "VIN_Credit_Logement", required = true)
    protected VINCreditLogement vinCreditLogement;
    @XmlElement(name = "VIN_Max_Nbr_Impayes", required = true)
    protected VINMaxNbrImpayes vinMaxNbrImpayes;
    @XmlElement(name = "VIN_Mt_Impayes", required = true)
    protected VINMtImpayes vinMtImpayes;
    @XmlElement(name = "VIN_Max_Nbr_Mois_Retard", required = true)
    protected VINMaxNbrMoisRetard vinMaxNbrMoisRetard;
    @XmlElement(name = "VIN_Total_Mt_Negative", required = true)
    protected VINTotalMtNegative vinTotalMtNegative;
    @XmlElement(name = "VIN_Solde_Init", required = true)
    protected VINSoldeInit vinSoldeInit;
    @XmlElement(name = "VIN_Credit_M_1", required = true)
    protected VINCreditM1 vinCreditM1;
    @XmlElement(name = "VIN_Credit_M_2", required = true)
    protected VINCreditM2 vinCreditM2;
    @XmlElement(name = "VIN_Credit_M_3", required = true)
    protected VINCreditM3 vinCreditM3;
    @XmlElement(name = "VIN_Debit_M_1", required = true)
    protected VINDebitM1 vinDebitM1;
    @XmlElement(name = "VIN_Debit_M_2", required = true)
    protected VINDebitM2 vinDebitM2;
    @XmlElement(name = "VIN_Debit_M_3", required = true)
    protected VINDebitM3 vinDebitM3;
    @XmlElement(name = "VIN_Source", required = true)
    protected VINSource vinSource;
    @XmlElement(name = "VIN_Reference_Progressif_Role", required = true)
    protected VINReferenceProgressifRole vinReferenceProgressifRole;
    @XmlElement(name = "VIN_Numero_Chequiers", required = true)
    protected VINNumeroChequiers vinNumeroChequiers;
    @XmlElement(name = "VIN_Date_Effet", required = true)
    protected VINDateEffet vinDateEffet;
    @XmlElement(name = "VIN_Date_Sortie", required = true)
    protected VINDateSortie vinDateSortie;
    @XmlElement(name = "VIN_Statut_Chequiers", required = true)
    protected VINStatutChequiers vinStatutChequiers;
    @XmlElement(name = "VIN_Montant_Chequier", required = true)
    protected VINMontantChequier vinMontantChequier;
    @XmlElement(name = "VIN_Produit_Affaire", required = true)
    protected VINProduitAffaire vinProduitAffaire;
    @XmlElement(name = "VIN_Contentieux", required = true)
    protected VINContentieux vinContentieux;
    @XmlElement(name = "VIN_Nbr_Impayes", required = true)
    protected VINNbrImpayes vinNbrImpayes;
    @XmlElement(name = "VIN_Nbr_Impayes_12", required = true)
    protected VINNbrImpayes12 vinNbrImpayes12;
    @XmlElement(name = "VIN_Date_Premiere_Echeance", required = true)
    protected VINDatePremiereEcheance vinDatePremiereEcheance;
    @XmlElement(name = "VIN_Date_Creation_Affaire", required = true)
    protected VINDateCreationAffaire vinDateCreationAffaire;
    @XmlElement(name = "VIN_Compensation", required = true)
    protected VINCompensation vinCompensation;
    @XmlElement(name = "VIN_CRD", required = true)
    protected VINCRD vincrd;
    @XmlElement(name = "VIN_SOLDE", required = true)
    protected VINSOLDE vinsolde;
    @XmlElement(name = "VIN_Statut_Affaire", required = true)
    protected VINStatutAffaire vinStatutAffaire;
    @XmlElement(name = "VIN_Mt_Premiere_Echeanche_Ancienne_Affaire", required = true)
    protected VINMtPremiereEcheancheAncienneAffaire vinMtPremiereEcheancheAncienneAffaire;
    @XmlElement(name = "VIN_Nbr_Incidents", required = true)
    protected VINNbrIncidents vinNbrIncidents;
    @XmlElement(name = "VIN_Loyer_Ekip", required = true)
    protected VINLoyerEkip vinLoyerEkip;
    @XmlElement(name = "VIN_Loyer_Ekip_Comp", required = true)
    protected VINLoyerEkipComp vinLoyerEkipComp;
    @XmlElement(name = "VIN_Loyer_Front", required = true)
    protected VINLoyerFront vinLoyerFront;
    @XmlElement(name = "VIN_Role_Ancienne_Affaire", required = true)
    protected VINRoleAncienneAffaire vinRoleAncienneAffaire;
    @XmlElement(name = "VIN_Marche", required = true)
    protected VINMarche vinMarche;
    @XmlElement(name = "VIN_Segment", required = true)
    protected VINSegment vinSegment;
    @XmlElement(name = "VIN_Employeur", required = true)
    protected VINEmployeur vinEmployeur;
    @XmlElement(name = "VIN_Fonction", required = true)
    protected VINFonction vinFonction;
    @XmlElement(name = "VIN_DATE_FIN_CONTRAT", required = true)
    protected VINDATEFINCONTRAT vindatefincontrat;
    @XmlElement(name = "VIN_FLAG_SINISTRE", required = true)
    protected VINFLAGSINISTRE vinflagsinistre;
    @XmlElement(name = "VIN_TYPE_GARANTIE", required = true)
    protected VINTYPEGARANTIE vintypegarantie;
    @XmlElement(name = "VIN_MONTANT_EXPERTISE", required = true)
    protected VINMONTANTEXPERTISE vinmontantexpertise;
    @XmlElement(name = "VIN_DATE_CERTIFICAT", required = true)
    protected VINDATECERTIFICAT vindatecertificat;
    @XmlElement(name = "VIN_QUOTE_PART_GR", required = true)
    protected VINQUOTEPARTGR vinquotepartgr;
    @XmlElement(name = "VIN_VILLE_BIEN", required = true)
    protected VINVILLEBIEN vinvillebien;
    @XmlElement(name = "VIN_Rang_Garantie", required = true)
    protected VINRangGarantie vinRangGarantie;
    @XmlElement(name = "VIN_TYPE_CONTRAT", required = true)
    protected VINTYPECONTRAT vintypecontrat;
    @XmlElement(name = "VIN_ECHEANCE_RESTANTE", required = true)
    protected VINECHEANCERESTANTE vinecheancerestante;
    @XmlElement(name = "VIN_ONU", required = true)
    protected VINONU vinonu;
    @XmlElement(name = "VIN_annee_bilan", required = true)
    protected VINAnneeBilan vinAnneeBilan;
    @XmlElement(name = "VIN_CTRL_INFORISK", required = true)
    protected VINCTRLINFORISK vinctrlinforisk;
    @XmlElement(name = "VIN_STOCKS", required = true)
    protected VINSTOCKS vinstocks;
    @XmlElement(name = "VIN_CREANCE_ACTIF_CIRC", required = true)
    protected VINCREANCEACTIFCIRC vincreanceactifcirc;
    @XmlElement(name = "VIN_TRESORERIE_ACTIF", required = true)
    protected VINTRESORERIEACTIF vintresorerieactif;
    @XmlElement(name = "VIN_TOTAL_ACTIF", required = true)
    protected VINTOTALACTIF vintotalactif;
    @XmlElement(name = "VIN_CAPITAUX_PROPRES", required = true)
    protected VINCAPITAUXPROPRES vincapitauxpropres;
    @XmlElement(name = "VIN_DETTES_FINANCEMENT", required = true)
    protected VINDETTESFINANCEMENT vindettesfinancement;
    @XmlElement(name = "VIN_PROVISION_RISQUE_CHARGE", required = true)
    protected VINPROVISIONRISQUECHARGE vinprovisionrisquecharge;
    @XmlElement(name = "VIN_ECART_CONV_PASSIF_FIN_PERMANENT", required = true)
    protected VINECARTCONVPASSIFFINPERMANENT vinecartconvpassiffinpermanent;
    @XmlElement(name = "VIN_DETTES_PASSIF_CIRC", required = true)
    protected VINDETTESPASSIFCIRC vindettespassifcirc;
    @XmlElement(name = "VIN_AUTRES_PROVISION_RISQUE_CHARGE", required = true)
    protected VINAUTRESPROVISIONRISQUECHARGE vinautresprovisionrisquecharge;
    @XmlElement(name = "VIN_ECART_CONV_PASSIF_CIRC", required = true)
    protected VINECARTCONVPASSIFCIRC vinecartconvpassifcirc;
    @XmlElement(name = "VIN_TOTAL_PASSIF_CIRC", required = true)
    protected VINTOTALPASSIFCIRC vintotalpassifcirc;
    @XmlElement(name = "VIN_CHIFFRE_AFFAIRE_N1", required = true)
    protected VINCHIFFREAFFAIREN1 vinchiffreaffairen1;
    @XmlElement(name = "VIN_CHIFFRE_AFFAIRE_N0", required = true)
    protected VINCHIFFREAFFAIREN0 vinchiffreaffairen0;
    @XmlElement(name = "VIN_VARIATION_STOCK_PDT", required = true)
    protected VINVARIATIONSTOCKPDT vinvariationstockpdt;
    @XmlElement(name = "VIN_AUTRES_PDT_EXPL", required = true)
    protected VINAUTRESPDTEXPL vinautrespdtexpl;
    @XmlElement(name = "VIN_ACHAT_REVENDU_MARCHANDISE", required = true)
    protected VINACHATREVENDUMARCHANDISE vinachatrevendumarchandise;
    @XmlElement(name = "VIN_ACHAT_CONS_MATIERE_FOURNITURE", required = true)
    protected VINACHATCONSMATIEREFOURNITURE vinachatconsmatierefourniture;
    @XmlElement(name = "VIN_DOTATION_EXPLOITATION_N1", required = true)
    protected VINDOTATIONEXPLOITATIONN1 vindotationexploitationn1;
    @XmlElement(name = "VIN_DOTATION_EXPLOITATION_N0", required = true)
    protected VINDOTATIONEXPLOITATIONN0 vindotationexploitationn0;
    @XmlElement(name = "VIN_CHARGE_FIN", required = true)
    protected VINCHARGEFIN vinchargefin;
    @XmlElement(name = "VIN_RESULTAT_FIN", required = true)
    protected VINRESULTATFIN vinresultatfin;
    @XmlElement(name = "VIN_RESULTAT_NET_N1", required = true)
    protected VINRESULTATNETN1 vinresultatnetn1;
    @XmlElement(name = "VIN_RESULTAT_NET_N0", required = true)
    protected VINRESULTATNETN0 vinresultatnetn0;
    @XmlElement(name = "VIN_IE_AFFAIRE_OLD", required = true)
    protected VINIEAFFAIREOLD vinieaffaireold;
    @XmlElement(name = "VIN_Flag_Report", required = true)
    protected VINFlagReport vinFlagReport;
    @XmlElement(name = "VIN_Date_Dernier_IMP", required = true)
    protected VINDateDernierIMP vinDateDernierIMP;

    /**
     * Obtient la valeur de la propriété vinRole.
     * 
     * @return
     *     possible object is
     *     {@link VINRole }
     *     
     */
    public VINRole getVINRole() {
        return vinRole;
    }

    /**
     * Définit la valeur de la propriété vinRole.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRole }
     *     
     */
    public void setVINRole(VINRole value) {
        this.vinRole = value;
    }

    /**
     * Obtient la valeur de la propriété vinProgressifRole.
     * 
     * @return
     *     possible object is
     *     {@link VINProgressifRole }
     *     
     */
    public VINProgressifRole getVINProgressifRole() {
        return vinProgressifRole;
    }

    /**
     * Définit la valeur de la propriété vinProgressifRole.
     * 
     * @param value
     *     allowed object is
     *     {@link VINProgressifRole }
     *     
     */
    public void setVINProgressifRole(VINProgressifRole value) {
        this.vinProgressifRole = value;
    }

    /**
     * Obtient la valeur de la propriété vinIdentifiantClient.
     * 
     * @return
     *     possible object is
     *     {@link VINIdentifiantClient }
     *     
     */
    public VINIdentifiantClient getVINIdentifiantClient() {
        return vinIdentifiantClient;
    }

    /**
     * Définit la valeur de la propriété vinIdentifiantClient.
     * 
     * @param value
     *     allowed object is
     *     {@link VINIdentifiantClient }
     *     
     */
    public void setVINIdentifiantClient(VINIdentifiantClient value) {
        this.vinIdentifiantClient = value;
    }

    /**
     * Obtient la valeur de la propriété vinTypeClient.
     * 
     * @return
     *     possible object is
     *     {@link VINTypeClient }
     *     
     */
    public VINTypeClient getVINTypeClient() {
        return vinTypeClient;
    }

    /**
     * Définit la valeur de la propriété vinTypeClient.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTypeClient }
     *     
     */
    public void setVINTypeClient(VINTypeClient value) {
        this.vinTypeClient = value;
    }

    /**
     * Obtient la valeur de la propriété vinFormeJuridique.
     * 
     * @return
     *     possible object is
     *     {@link VINFormeJuridique }
     *     
     */
    public VINFormeJuridique getVINFormeJuridique() {
        return vinFormeJuridique;
    }

    /**
     * Définit la valeur de la propriété vinFormeJuridique.
     * 
     * @param value
     *     allowed object is
     *     {@link VINFormeJuridique }
     *     
     */
    public void setVINFormeJuridique(VINFormeJuridique value) {
        this.vinFormeJuridique = value;
    }

    /**
     * Obtient la valeur de la propriété vinPartPM.
     * 
     * @return
     *     possible object is
     *     {@link VINPartPM }
     *     
     */
    public VINPartPM getVINPartPM() {
        return vinPartPM;
    }

    /**
     * Définit la valeur de la propriété vinPartPM.
     * 
     * @param value
     *     allowed object is
     *     {@link VINPartPM }
     *     
     */
    public void setVINPartPM(VINPartPM value) {
        this.vinPartPM = value;
    }

    /**
     * Obtient la valeur de la propriété vinSexe.
     * 
     * @return
     *     possible object is
     *     {@link VINSexe }
     *     
     */
    public VINSexe getVINSexe() {
        return vinSexe;
    }

    /**
     * Définit la valeur de la propriété vinSexe.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSexe }
     *     
     */
    public void setVINSexe(VINSexe value) {
        this.vinSexe = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateNaissance.
     * 
     * @return
     *     possible object is
     *     {@link VINDateNaissance }
     *     
     */
    public VINDateNaissance getVINDateNaissance() {
        return vinDateNaissance;
    }

    /**
     * Définit la valeur de la propriété vinDateNaissance.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateNaissance }
     *     
     */
    public void setVINDateNaissance(VINDateNaissance value) {
        this.vinDateNaissance = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateCreatEntr.
     * 
     * @return
     *     possible object is
     *     {@link VINDateCreatEntr }
     *     
     */
    public VINDateCreatEntr getVINDateCreatEntr() {
        return vinDateCreatEntr;
    }

    /**
     * Définit la valeur de la propriété vinDateCreatEntr.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateCreatEntr }
     *     
     */
    public void setVINDateCreatEntr(VINDateCreatEntr value) {
        this.vinDateCreatEntr = value;
    }

    /**
     * Obtient la valeur de la propriété vinNouveauClientON.
     * 
     * @return
     *     possible object is
     *     {@link VINNouveauClientON }
     *     
     */
    public VINNouveauClientON getVINNouveauClientON() {
        return vinNouveauClientON;
    }

    /**
     * Définit la valeur de la propriété vinNouveauClientON.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNouveauClientON }
     *     
     */
    public void setVINNouveauClientON(VINNouveauClientON value) {
        this.vinNouveauClientON = value;
    }

    /**
     * Obtient la valeur de la propriété vinNationalite.
     * 
     * @return
     *     possible object is
     *     {@link VINNationalite }
     *     
     */
    public VINNationalite getVINNationalite() {
        return vinNationalite;
    }

    /**
     * Définit la valeur de la propriété vinNationalite.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNationalite }
     *     
     */
    public void setVINNationalite(VINNationalite value) {
        this.vinNationalite = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateEmbauche.
     * 
     * @return
     *     possible object is
     *     {@link VINDateEmbauche }
     *     
     */
    public VINDateEmbauche getVINDateEmbauche() {
        return vinDateEmbauche;
    }

    /**
     * Définit la valeur de la propriété vinDateEmbauche.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateEmbauche }
     *     
     */
    public void setVINDateEmbauche(VINDateEmbauche value) {
        this.vinDateEmbauche = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateCreationRC.
     * 
     * @return
     *     possible object is
     *     {@link VINDateCreationRC }
     *     
     */
    public VINDateCreationRC getVINDateCreationRC() {
        return vinDateCreationRC;
    }

    /**
     * Définit la valeur de la propriété vinDateCreationRC.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateCreationRC }
     *     
     */
    public void setVINDateCreationRC(VINDateCreationRC value) {
        this.vinDateCreationRC = value;
    }

    /**
     * Obtient la valeur de la propriété vinSituationLogement.
     * 
     * @return
     *     possible object is
     *     {@link VINSituationLogement }
     *     
     */
    public VINSituationLogement getVINSituationLogement() {
        return vinSituationLogement;
    }

    /**
     * Définit la valeur de la propriété vinSituationLogement.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSituationLogement }
     *     
     */
    public void setVINSituationLogement(VINSituationLogement value) {
        this.vinSituationLogement = value;
    }

    /**
     * Obtient la valeur de la propriété vinProfession.
     * 
     * @return
     *     possible object is
     *     {@link VINProfession }
     *     
     */
    public VINProfession getVINProfession() {
        return vinProfession;
    }

    /**
     * Définit la valeur de la propriété vinProfession.
     * 
     * @param value
     *     allowed object is
     *     {@link VINProfession }
     *     
     */
    public void setVINProfession(VINProfession value) {
        this.vinProfession = value;
    }

    /**
     * Obtient la valeur de la propriété vinCodeActivite.
     * 
     * @return
     *     possible object is
     *     {@link VINCodeActivite }
     *     
     */
    public VINCodeActivite getVINCodeActivite() {
        return vinCodeActivite;
    }

    /**
     * Définit la valeur de la propriété vinCodeActivite.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCodeActivite }
     *     
     */
    public void setVINCodeActivite(VINCodeActivite value) {
        this.vinCodeActivite = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateIntegrationSociete.
     * 
     * @return
     *     possible object is
     *     {@link VINDateIntegrationSociete }
     *     
     */
    public VINDateIntegrationSociete getVINDateIntegrationSociete() {
        return vinDateIntegrationSociete;
    }

    /**
     * Définit la valeur de la propriété vinDateIntegrationSociete.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateIntegrationSociete }
     *     
     */
    public void setVINDateIntegrationSociete(VINDateIntegrationSociete value) {
        this.vinDateIntegrationSociete = value;
    }

    /**
     * Obtient la valeur de la propriété vinCodeVille.
     * 
     * @return
     *     possible object is
     *     {@link VINCodeVille }
     *     
     */
    public VINCodeVille getVINCodeVille() {
        return vinCodeVille;
    }

    /**
     * Définit la valeur de la propriété vinCodeVille.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCodeVille }
     *     
     */
    public void setVINCodeVille(VINCodeVille value) {
        this.vinCodeVille = value;
    }

    /**
     * Obtient la valeur de la propriété vinCodeBanque.
     * 
     * @return
     *     possible object is
     *     {@link VINCodeBanque }
     *     
     */
    public VINCodeBanque getVINCodeBanque() {
        return vinCodeBanque;
    }

    /**
     * Définit la valeur de la propriété vinCodeBanque.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCodeBanque }
     *     
     */
    public void setVINCodeBanque(VINCodeBanque value) {
        this.vinCodeBanque = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateRelationBanque.
     * 
     * @return
     *     possible object is
     *     {@link VINDateRelationBanque }
     *     
     */
    public VINDateRelationBanque getVINDateRelationBanque() {
        return vinDateRelationBanque;
    }

    /**
     * Définit la valeur de la propriété vinDateRelationBanque.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateRelationBanque }
     *     
     */
    public void setVINDateRelationBanque(VINDateRelationBanque value) {
        this.vinDateRelationBanque = value;
    }

    /**
     * Obtient la valeur de la propriété vinNbrAnciensDossiers.
     * 
     * @return
     *     possible object is
     *     {@link VINNbrAnciensDossiers }
     *     
     */
    public VINNbrAnciensDossiers getVINNbrAnciensDossiers() {
        return vinNbrAnciensDossiers;
    }

    /**
     * Définit la valeur de la propriété vinNbrAnciensDossiers.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNbrAnciensDossiers }
     *     
     */
    public void setVINNbrAnciensDossiers(VINNbrAnciensDossiers value) {
        this.vinNbrAnciensDossiers = value;
    }

    /**
     * Obtient la valeur de la propriété vinBlackList.
     * 
     * @return
     *     possible object is
     *     {@link VINBlackList }
     *     
     */
    public VINBlackList getVINBlackList() {
        return vinBlackList;
    }

    /**
     * Définit la valeur de la propriété vinBlackList.
     * 
     * @param value
     *     allowed object is
     *     {@link VINBlackList }
     *     
     */
    public void setVINBlackList(VINBlackList value) {
        this.vinBlackList = value;
    }

    /**
     * Obtient la valeur de la propriété vinRevenusMensuels.
     * 
     * @return
     *     possible object is
     *     {@link VINRevenusMensuels }
     *     
     */
    public VINRevenusMensuels getVINRevenusMensuels() {
        return vinRevenusMensuels;
    }

    /**
     * Définit la valeur de la propriété vinRevenusMensuels.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRevenusMensuels }
     *     
     */
    public void setVINRevenusMensuels(VINRevenusMensuels value) {
        this.vinRevenusMensuels = value;
    }

    /**
     * Obtient la valeur de la propriété vinAutreRevenus.
     * 
     * @return
     *     possible object is
     *     {@link VINAutreRevenus }
     *     
     */
    public VINAutreRevenus getVINAutreRevenus() {
        return vinAutreRevenus;
    }

    /**
     * Définit la valeur de la propriété vinAutreRevenus.
     * 
     * @param value
     *     allowed object is
     *     {@link VINAutreRevenus }
     *     
     */
    public void setVINAutreRevenus(VINAutreRevenus value) {
        this.vinAutreRevenus = value;
    }

    /**
     * Obtient la valeur de la propriété vinRevenuConjoint.
     * 
     * @return
     *     possible object is
     *     {@link VINRevenuConjoint }
     *     
     */
    public VINRevenuConjoint getVINRevenuConjoint() {
        return vinRevenuConjoint;
    }

    /**
     * Définit la valeur de la propriété vinRevenuConjoint.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRevenuConjoint }
     *     
     */
    public void setVINRevenuConjoint(VINRevenuConjoint value) {
        this.vinRevenuConjoint = value;
    }

    /**
     * Obtient la valeur de la propriété vinAutreCharges.
     * 
     * @return
     *     possible object is
     *     {@link VINAutreCharges }
     *     
     */
    public VINAutreCharges getVINAutreCharges() {
        return vinAutreCharges;
    }

    /**
     * Définit la valeur de la propriété vinAutreCharges.
     * 
     * @param value
     *     allowed object is
     *     {@link VINAutreCharges }
     *     
     */
    public void setVINAutreCharges(VINAutreCharges value) {
        this.vinAutreCharges = value;
    }

    /**
     * Obtient la valeur de la propriété vinChargeImm.
     * 
     * @return
     *     possible object is
     *     {@link VINChargeImm }
     *     
     */
    public VINChargeImm getVINChargeImm() {
        return vinChargeImm;
    }

    /**
     * Définit la valeur de la propriété vinChargeImm.
     * 
     * @param value
     *     allowed object is
     *     {@link VINChargeImm }
     *     
     */
    public void setVINChargeImm(VINChargeImm value) {
        this.vinChargeImm = value;
    }

    /**
     * Obtient la valeur de la propriété vinCreditLogement.
     * 
     * @return
     *     possible object is
     *     {@link VINCreditLogement }
     *     
     */
    public VINCreditLogement getVINCreditLogement() {
        return vinCreditLogement;
    }

    /**
     * Définit la valeur de la propriété vinCreditLogement.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCreditLogement }
     *     
     */
    public void setVINCreditLogement(VINCreditLogement value) {
        this.vinCreditLogement = value;
    }

    /**
     * Obtient la valeur de la propriété vinMaxNbrImpayes.
     * 
     * @return
     *     possible object is
     *     {@link VINMaxNbrImpayes }
     *     
     */
    public VINMaxNbrImpayes getVINMaxNbrImpayes() {
        return vinMaxNbrImpayes;
    }

    /**
     * Définit la valeur de la propriété vinMaxNbrImpayes.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMaxNbrImpayes }
     *     
     */
    public void setVINMaxNbrImpayes(VINMaxNbrImpayes value) {
        this.vinMaxNbrImpayes = value;
    }

    /**
     * Obtient la valeur de la propriété vinMtImpayes.
     * 
     * @return
     *     possible object is
     *     {@link VINMtImpayes }
     *     
     */
    public VINMtImpayes getVINMtImpayes() {
        return vinMtImpayes;
    }

    /**
     * Définit la valeur de la propriété vinMtImpayes.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMtImpayes }
     *     
     */
    public void setVINMtImpayes(VINMtImpayes value) {
        this.vinMtImpayes = value;
    }

    /**
     * Obtient la valeur de la propriété vinMaxNbrMoisRetard.
     * 
     * @return
     *     possible object is
     *     {@link VINMaxNbrMoisRetard }
     *     
     */
    public VINMaxNbrMoisRetard getVINMaxNbrMoisRetard() {
        return vinMaxNbrMoisRetard;
    }

    /**
     * Définit la valeur de la propriété vinMaxNbrMoisRetard.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMaxNbrMoisRetard }
     *     
     */
    public void setVINMaxNbrMoisRetard(VINMaxNbrMoisRetard value) {
        this.vinMaxNbrMoisRetard = value;
    }

    /**
     * Obtient la valeur de la propriété vinTotalMtNegative.
     * 
     * @return
     *     possible object is
     *     {@link VINTotalMtNegative }
     *     
     */
    public VINTotalMtNegative getVINTotalMtNegative() {
        return vinTotalMtNegative;
    }

    /**
     * Définit la valeur de la propriété vinTotalMtNegative.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTotalMtNegative }
     *     
     */
    public void setVINTotalMtNegative(VINTotalMtNegative value) {
        this.vinTotalMtNegative = value;
    }

    /**
     * Obtient la valeur de la propriété vinSoldeInit.
     * 
     * @return
     *     possible object is
     *     {@link VINSoldeInit }
     *     
     */
    public VINSoldeInit getVINSoldeInit() {
        return vinSoldeInit;
    }

    /**
     * Définit la valeur de la propriété vinSoldeInit.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSoldeInit }
     *     
     */
    public void setVINSoldeInit(VINSoldeInit value) {
        this.vinSoldeInit = value;
    }

    /**
     * Obtient la valeur de la propriété vinCreditM1.
     * 
     * @return
     *     possible object is
     *     {@link VINCreditM1 }
     *     
     */
    public VINCreditM1 getVINCreditM1() {
        return vinCreditM1;
    }

    /**
     * Définit la valeur de la propriété vinCreditM1.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCreditM1 }
     *     
     */
    public void setVINCreditM1(VINCreditM1 value) {
        this.vinCreditM1 = value;
    }

    /**
     * Obtient la valeur de la propriété vinCreditM2.
     * 
     * @return
     *     possible object is
     *     {@link VINCreditM2 }
     *     
     */
    public VINCreditM2 getVINCreditM2() {
        return vinCreditM2;
    }

    /**
     * Définit la valeur de la propriété vinCreditM2.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCreditM2 }
     *     
     */
    public void setVINCreditM2(VINCreditM2 value) {
        this.vinCreditM2 = value;
    }

    /**
     * Obtient la valeur de la propriété vinCreditM3.
     * 
     * @return
     *     possible object is
     *     {@link VINCreditM3 }
     *     
     */
    public VINCreditM3 getVINCreditM3() {
        return vinCreditM3;
    }

    /**
     * Définit la valeur de la propriété vinCreditM3.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCreditM3 }
     *     
     */
    public void setVINCreditM3(VINCreditM3 value) {
        this.vinCreditM3 = value;
    }

    /**
     * Obtient la valeur de la propriété vinDebitM1.
     * 
     * @return
     *     possible object is
     *     {@link VINDebitM1 }
     *     
     */
    public VINDebitM1 getVINDebitM1() {
        return vinDebitM1;
    }

    /**
     * Définit la valeur de la propriété vinDebitM1.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDebitM1 }
     *     
     */
    public void setVINDebitM1(VINDebitM1 value) {
        this.vinDebitM1 = value;
    }

    /**
     * Obtient la valeur de la propriété vinDebitM2.
     * 
     * @return
     *     possible object is
     *     {@link VINDebitM2 }
     *     
     */
    public VINDebitM2 getVINDebitM2() {
        return vinDebitM2;
    }

    /**
     * Définit la valeur de la propriété vinDebitM2.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDebitM2 }
     *     
     */
    public void setVINDebitM2(VINDebitM2 value) {
        this.vinDebitM2 = value;
    }

    /**
     * Obtient la valeur de la propriété vinDebitM3.
     * 
     * @return
     *     possible object is
     *     {@link VINDebitM3 }
     *     
     */
    public VINDebitM3 getVINDebitM3() {
        return vinDebitM3;
    }

    /**
     * Définit la valeur de la propriété vinDebitM3.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDebitM3 }
     *     
     */
    public void setVINDebitM3(VINDebitM3 value) {
        this.vinDebitM3 = value;
    }

    /**
     * Obtient la valeur de la propriété vinSource.
     * 
     * @return
     *     possible object is
     *     {@link VINSource }
     *     
     */
    public VINSource getVINSource() {
        return vinSource;
    }

    /**
     * Définit la valeur de la propriété vinSource.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSource }
     *     
     */
    public void setVINSource(VINSource value) {
        this.vinSource = value;
    }

    /**
     * Obtient la valeur de la propriété vinReferenceProgressifRole.
     * 
     * @return
     *     possible object is
     *     {@link VINReferenceProgressifRole }
     *     
     */
    public VINReferenceProgressifRole getVINReferenceProgressifRole() {
        return vinReferenceProgressifRole;
    }

    /**
     * Définit la valeur de la propriété vinReferenceProgressifRole.
     * 
     * @param value
     *     allowed object is
     *     {@link VINReferenceProgressifRole }
     *     
     */
    public void setVINReferenceProgressifRole(VINReferenceProgressifRole value) {
        this.vinReferenceProgressifRole = value;
    }

    /**
     * Obtient la valeur de la propriété vinNumeroChequiers.
     * 
     * @return
     *     possible object is
     *     {@link VINNumeroChequiers }
     *     
     */
    public VINNumeroChequiers getVINNumeroChequiers() {
        return vinNumeroChequiers;
    }

    /**
     * Définit la valeur de la propriété vinNumeroChequiers.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNumeroChequiers }
     *     
     */
    public void setVINNumeroChequiers(VINNumeroChequiers value) {
        this.vinNumeroChequiers = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateEffet.
     * 
     * @return
     *     possible object is
     *     {@link VINDateEffet }
     *     
     */
    public VINDateEffet getVINDateEffet() {
        return vinDateEffet;
    }

    /**
     * Définit la valeur de la propriété vinDateEffet.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateEffet }
     *     
     */
    public void setVINDateEffet(VINDateEffet value) {
        this.vinDateEffet = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateSortie.
     *
     * @return possible object is
     * {@link VINDateSortie }
     */
    public VINDateSortie getVINDateSortie() {
        return vinDateSortie;
    }

    /**
     * Définit la valeur de la propriété vinDateSortie.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateSortie }
     *     
     */
    public void setVINDateSortie(VINDateSortie value) {
        this.vinDateSortie = value;
    }

    /**
     * Obtient la valeur de la propriété vinStatutChequiers.
     *
     * @return possible object is
     * {@link VINStatutChequiers }
     */
    public VINStatutChequiers getVINStatutChequiers() {
        return vinStatutChequiers;
    }

    /**
     * Définit la valeur de la propriété vinStatutChequiers.
     * 
     * @param value
     *     allowed object is
     *     {@link VINStatutChequiers }
     *     
     */
    public void setVINStatutChequiers(VINStatutChequiers value) {
        this.vinStatutChequiers = value;
    }

    /**
     * Obtient la valeur de la propriété vinMontantChequier.
     * 
     * @return
     *     possible object is
     *     {@link VINMontantChequier }
     *     
     */
    public VINMontantChequier getVINMontantChequier() {
        return vinMontantChequier;
    }

    /**
     * Définit la valeur de la propriété vinMontantChequier.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMontantChequier }
     *     
     */
    public void setVINMontantChequier(VINMontantChequier value) {
        this.vinMontantChequier = value;
    }

    /**
     * Obtient la valeur de la propriété vinProduitAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VINProduitAffaire }
     *     
     */
    public VINProduitAffaire getVINProduitAffaire() {
        return vinProduitAffaire;
    }

    /**
     * Définit la valeur de la propriété vinProduitAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINProduitAffaire }
     *     
     */
    public void setVINProduitAffaire(VINProduitAffaire value) {
        this.vinProduitAffaire = value;
    }

    /**
     * Obtient la valeur de la propriété vinContentieux.
     * 
     * @return
     *     possible object is
     *     {@link VINContentieux }
     *     
     */
    public VINContentieux getVINContentieux() {
        return vinContentieux;
    }

    /**
     * Définit la valeur de la propriété vinContentieux.
     * 
     * @param value
     *     allowed object is
     *     {@link VINContentieux }
     *     
     */
    public void setVINContentieux(VINContentieux value) {
        this.vinContentieux = value;
    }

    /**
     * Obtient la valeur de la propriété vinNbrImpayes.
     * 
     * @return
     *     possible object is
     *     {@link VINNbrImpayes }
     *     
     */
    public VINNbrImpayes getVINNbrImpayes() {
        return vinNbrImpayes;
    }

    /**
     * Définit la valeur de la propriété vinNbrImpayes.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNbrImpayes }
     *     
     */
    public void setVINNbrImpayes(VINNbrImpayes value) {
        this.vinNbrImpayes = value;
    }

    /**
     * Obtient la valeur de la propriété vinNbrImpayes12.
     * 
     * @return
     *     possible object is
     *     {@link VINNbrImpayes12 }
     *     
     */
    public VINNbrImpayes12 getVINNbrImpayes12() {
        return vinNbrImpayes12;
    }

    /**
     * Définit la valeur de la propriété vinNbrImpayes12.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNbrImpayes12 }
     *     
     */
    public void setVINNbrImpayes12(VINNbrImpayes12 value) {
        this.vinNbrImpayes12 = value;
    }

    /**
     * Obtient la valeur de la propriété vinDatePremiereEcheance.
     * 
     * @return
     *     possible object is
     *     {@link VINDatePremiereEcheance }
     *     
     */
    public VINDatePremiereEcheance getVINDatePremiereEcheance() {
        return vinDatePremiereEcheance;
    }

    /**
     * Définit la valeur de la propriété vinDatePremiereEcheance.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDatePremiereEcheance }
     *     
     */
    public void setVINDatePremiereEcheance(VINDatePremiereEcheance value) {
        this.vinDatePremiereEcheance = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateCreationAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VINDateCreationAffaire }
     *     
     */
    public VINDateCreationAffaire getVINDateCreationAffaire() {
        return vinDateCreationAffaire;
    }

    /**
     * Définit la valeur de la propriété vinDateCreationAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateCreationAffaire }
     *     
     */
    public void setVINDateCreationAffaire(VINDateCreationAffaire value) {
        this.vinDateCreationAffaire = value;
    }

    /**
     * Obtient la valeur de la propriété vinCompensation.
     * 
     * @return
     *     possible object is
     *     {@link VINCompensation }
     *     
     */
    public VINCompensation getVINCompensation() {
        return vinCompensation;
    }

    /**
     * Définit la valeur de la propriété vinCompensation.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCompensation }
     *     
     */
    public void setVINCompensation(VINCompensation value) {
        this.vinCompensation = value;
    }

    /**
     * Obtient la valeur de la propriété vincrd.
     * 
     * @return
     *     possible object is
     *     {@link VINCRD }
     *     
     */
    public VINCRD getVINCRD() {
        return vincrd;
    }

    /**
     * Définit la valeur de la propriété vincrd.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCRD }
     *     
     */
    public void setVINCRD(VINCRD value) {
        this.vincrd = value;
    }

    /**
     * Obtient la valeur de la propriété vinsolde.
     * 
     * @return
     *     possible object is
     *     {@link VINSOLDE }
     *     
     */
    public VINSOLDE getVINSOLDE() {
        return vinsolde;
    }

    /**
     * Définit la valeur de la propriété vinsolde.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSOLDE }
     *     
     */
    public void setVINSOLDE(VINSOLDE value) {
        this.vinsolde = value;
    }

    /**
     * Obtient la valeur de la propriété vinStatutAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VINStatutAffaire }
     *     
     */
    public VINStatutAffaire getVINStatutAffaire() {
        return vinStatutAffaire;
    }

    /**
     * Définit la valeur de la propriété vinStatutAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINStatutAffaire }
     *     
     */
    public void setVINStatutAffaire(VINStatutAffaire value) {
        this.vinStatutAffaire = value;
    }

    /**
     * Obtient la valeur de la propriété vinMtPremiereEcheancheAncienneAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VINMtPremiereEcheancheAncienneAffaire }
     *     
     */
    public VINMtPremiereEcheancheAncienneAffaire getVINMtPremiereEcheancheAncienneAffaire() {
        return vinMtPremiereEcheancheAncienneAffaire;
    }

    /**
     * Définit la valeur de la propriété vinMtPremiereEcheancheAncienneAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMtPremiereEcheancheAncienneAffaire }
     *     
     */
    public void setVINMtPremiereEcheancheAncienneAffaire(VINMtPremiereEcheancheAncienneAffaire value) {
        this.vinMtPremiereEcheancheAncienneAffaire = value;
    }

    /**
     * Obtient la valeur de la propriété vinNbrIncidents.
     * 
     * @return
     *     possible object is
     *     {@link VINNbrIncidents }
     *     
     */
    public VINNbrIncidents getVINNbrIncidents() {
        return vinNbrIncidents;
    }

    /**
     * Définit la valeur de la propriété vinNbrIncidents.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNbrIncidents }
     *     
     */
    public void setVINNbrIncidents(VINNbrIncidents value) {
        this.vinNbrIncidents = value;
    }

    /**
     * Obtient la valeur de la propriété vinLoyerEkip.
     * 
     * @return
     *     possible object is
     *     {@link VINLoyerEkip }
     *     
     */
    public VINLoyerEkip getVINLoyerEkip() {
        return vinLoyerEkip;
    }

    /**
     * Définit la valeur de la propriété vinLoyerEkip.
     * 
     * @param value
     *     allowed object is
     *     {@link VINLoyerEkip }
     *     
     */
    public void setVINLoyerEkip(VINLoyerEkip value) {
        this.vinLoyerEkip = value;
    }

    /**
     * Obtient la valeur de la propriété vinLoyerEkipComp.
     * 
     * @return
     *     possible object is
     *     {@link VINLoyerEkipComp }
     *     
     */
    public VINLoyerEkipComp getVINLoyerEkipComp() {
        return vinLoyerEkipComp;
    }

    /**
     * Définit la valeur de la propriété vinLoyerEkipComp.
     * 
     * @param value
     *     allowed object is
     *     {@link VINLoyerEkipComp }
     *     
     */
    public void setVINLoyerEkipComp(VINLoyerEkipComp value) {
        this.vinLoyerEkipComp = value;
    }

    /**
     * Obtient la valeur de la propriété vinLoyerFront.
     * 
     * @return
     *     possible object is
     *     {@link VINLoyerFront }
     *     
     */
    public VINLoyerFront getVINLoyerFront() {
        return vinLoyerFront;
    }

    /**
     * Définit la valeur de la propriété vinLoyerFront.
     * 
     * @param value
     *     allowed object is
     *     {@link VINLoyerFront }
     *     
     */
    public void setVINLoyerFront(VINLoyerFront value) {
        this.vinLoyerFront = value;
    }

    /**
     * Obtient la valeur de la propriété vinRoleAncienneAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VINRoleAncienneAffaire }
     *     
     */
    public VINRoleAncienneAffaire getVINRoleAncienneAffaire() {
        return vinRoleAncienneAffaire;
    }

    /**
     * Définit la valeur de la propriété vinRoleAncienneAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRoleAncienneAffaire }
     *     
     */
    public void setVINRoleAncienneAffaire(VINRoleAncienneAffaire value) {
        this.vinRoleAncienneAffaire = value;
    }

    /**
     * Obtient la valeur de la propriété vinMarche.
     * 
     * @return
     *     possible object is
     *     {@link VINMarche }
     *     
     */
    public VINMarche getVINMarche() {
        return vinMarche;
    }

    /**
     * Définit la valeur de la propriété vinMarche.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMarche }
     *     
     */
    public void setVINMarche(VINMarche value) {
        this.vinMarche = value;
    }

    /**
     * Obtient la valeur de la propriété vinSegment.
     * 
     * @return
     *     possible object is
     *     {@link VINSegment }
     *     
     */
    public VINSegment getVINSegment() {
        return vinSegment;
    }

    /**
     * Définit la valeur de la propriété vinSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSegment }
     *     
     */
    public void setVINSegment(VINSegment value) {
        this.vinSegment = value;
    }

    /**
     * Obtient la valeur de la propriété vinEmployeur.
     * 
     * @return
     *     possible object is
     *     {@link VINEmployeur }
     *     
     */
    public VINEmployeur getVINEmployeur() {
        return vinEmployeur;
    }

    /**
     * Définit la valeur de la propriété vinEmployeur.
     * 
     * @param value
     *     allowed object is
     *     {@link VINEmployeur }
     *     
     */
    public void setVINEmployeur(VINEmployeur value) {
        this.vinEmployeur = value;
    }

    /**
     * Obtient la valeur de la propriété vinFonction.
     * 
     * @return
     *     possible object is
     *     {@link VINFonction }
     *     
     */
    public VINFonction getVINFonction() {
        return vinFonction;
    }

    /**
     * Définit la valeur de la propriété vinFonction.
     * 
     * @param value
     *     allowed object is
     *     {@link VINFonction }
     *     
     */
    public void setVINFonction(VINFonction value) {
        this.vinFonction = value;
    }

    /**
     * Obtient la valeur de la propriété vindatefincontrat.
     * 
     * @return
     *     possible object is
     *     {@link VINDATEFINCONTRAT }
     *     
     */
    public VINDATEFINCONTRAT getVINDATEFINCONTRAT() {
        return vindatefincontrat;
    }

    /**
     * Définit la valeur de la propriété vindatefincontrat.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDATEFINCONTRAT }
     *     
     */
    public void setVINDATEFINCONTRAT(VINDATEFINCONTRAT value) {
        this.vindatefincontrat = value;
    }

    /**
     * Obtient la valeur de la propriété vinflagsinistre.
     * 
     * @return
     *     possible object is
     *     {@link VINFLAGSINISTRE }
     *     
     */
    public VINFLAGSINISTRE getVINFLAGSINISTRE() {
        return vinflagsinistre;
    }

    /**
     * Définit la valeur de la propriété vinflagsinistre.
     * 
     * @param value
     *     allowed object is
     *     {@link VINFLAGSINISTRE }
     *     
     */
    public void setVINFLAGSINISTRE(VINFLAGSINISTRE value) {
        this.vinflagsinistre = value;
    }

    /**
     * Obtient la valeur de la propriété vintypegarantie.
     * 
     * @return
     *     possible object is
     *     {@link VINTYPEGARANTIE }
     *     
     */
    public VINTYPEGARANTIE getVINTYPEGARANTIE() {
        return vintypegarantie;
    }

    /**
     * Définit la valeur de la propriété vintypegarantie.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTYPEGARANTIE }
     *     
     */
    public void setVINTYPEGARANTIE(VINTYPEGARANTIE value) {
        this.vintypegarantie = value;
    }

    /**
     * Obtient la valeur de la propriété vinmontantexpertise.
     * 
     * @return
     *     possible object is
     *     {@link VINMONTANTEXPERTISE }
     *     
     */
    public VINMONTANTEXPERTISE getVINMONTANTEXPERTISE() {
        return vinmontantexpertise;
    }

    /**
     * Définit la valeur de la propriété vinmontantexpertise.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMONTANTEXPERTISE }
     *     
     */
    public void setVINMONTANTEXPERTISE(VINMONTANTEXPERTISE value) {
        this.vinmontantexpertise = value;
    }

    /**
     * Obtient la valeur de la propriété vindatecertificat.
     * 
     * @return
     *     possible object is
     *     {@link VINDATECERTIFICAT }
     *     
     */
    public VINDATECERTIFICAT getVINDATECERTIFICAT() {
        return vindatecertificat;
    }

    /**
     * Définit la valeur de la propriété vindatecertificat.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDATECERTIFICAT }
     *     
     */
    public void setVINDATECERTIFICAT(VINDATECERTIFICAT value) {
        this.vindatecertificat = value;
    }

    /**
     * Obtient la valeur de la propriété vinquotepartgr.
     * 
     * @return
     *     possible object is
     *     {@link VINQUOTEPARTGR }
     *     
     */
    public VINQUOTEPARTGR getVINQUOTEPARTGR() {
        return vinquotepartgr;
    }

    /**
     * Définit la valeur de la propriété vinquotepartgr.
     * 
     * @param value
     *     allowed object is
     *     {@link VINQUOTEPARTGR }
     *     
     */
    public void setVINQUOTEPARTGR(VINQUOTEPARTGR value) {
        this.vinquotepartgr = value;
    }

    /**
     * Obtient la valeur de la propriété vinvillebien.
     * 
     * @return
     *     possible object is
     *     {@link VINVILLEBIEN }
     *     
     */
    public VINVILLEBIEN getVINVILLEBIEN() {
        return vinvillebien;
    }

    /**
     * Définit la valeur de la propriété vinvillebien.
     * 
     * @param value
     *     allowed object is
     *     {@link VINVILLEBIEN }
     *     
     */
    public void setVINVILLEBIEN(VINVILLEBIEN value) {
        this.vinvillebien = value;
    }

    /**
     * Obtient la valeur de la propriété vinRangGarantie.
     * 
     * @return
     *     possible object is
     *     {@link VINRangGarantie }
     *     
     */
    public VINRangGarantie getVINRangGarantie() {
        return vinRangGarantie;
    }

    /**
     * Définit la valeur de la propriété vinRangGarantie.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRangGarantie }
     *     
     */
    public void setVINRangGarantie(VINRangGarantie value) {
        this.vinRangGarantie = value;
    }

    /**
     * Obtient la valeur de la propriété vintypecontrat.
     * 
     * @return
     *     possible object is
     *     {@link VINTYPECONTRAT }
     *     
     */
    public VINTYPECONTRAT getVINTYPECONTRAT() {
        return vintypecontrat;
    }

    /**
     * Définit la valeur de la propriété vintypecontrat.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTYPECONTRAT }
     *     
     */
    public void setVINTYPECONTRAT(VINTYPECONTRAT value) {
        this.vintypecontrat = value;
    }

    /**
     * Obtient la valeur de la propriété vinecheancerestante.
     * 
     * @return
     *     possible object is
     *     {@link VINECHEANCERESTANTE }
     *     
     */
    public VINECHEANCERESTANTE getVINECHEANCERESTANTE() {
        return vinecheancerestante;
    }

    /**
     * Définit la valeur de la propriété vinecheancerestante.
     * 
     * @param value
     *     allowed object is
     *     {@link VINECHEANCERESTANTE }
     *     
     */
    public void setVINECHEANCERESTANTE(VINECHEANCERESTANTE value) {
        this.vinecheancerestante = value;
    }

    /**
     * Obtient la valeur de la propriété vinonu.
     * 
     * @return
     *     possible object is
     *     {@link VINONU }
     *     
     */
    public VINONU getVINONU() {
        return vinonu;
    }

    /**
     * Définit la valeur de la propriété vinonu.
     * 
     * @param value
     *     allowed object is
     *     {@link VINONU }
     *     
     */
    public void setVINONU(VINONU value) {
        this.vinonu = value;
    }

    /**
     * Obtient la valeur de la propriété vinAnneeBilan.
     * 
     * @return
     *     possible object is
     *     {@link VINAnneeBilan }
     *     
     */
    public VINAnneeBilan getVINAnneeBilan() {
        return vinAnneeBilan;
    }

    /**
     * Définit la valeur de la propriété vinAnneeBilan.
     * 
     * @param value
     *     allowed object is
     *     {@link VINAnneeBilan }
     *     
     */
    public void setVINAnneeBilan(VINAnneeBilan value) {
        this.vinAnneeBilan = value;
    }

    /**
     * Obtient la valeur de la propriété vinctrlinforisk.
     * 
     * @return
     *     possible object is
     *     {@link VINCTRLINFORISK }
     *     
     */
    public VINCTRLINFORISK getVINCTRLINFORISK() {
        return vinctrlinforisk;
    }

    /**
     * Définit la valeur de la propriété vinctrlinforisk.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCTRLINFORISK }
     *     
     */
    public void setVINCTRLINFORISK(VINCTRLINFORISK value) {
        this.vinctrlinforisk = value;
    }

    /**
     * Obtient la valeur de la propriété vinstocks.
     * 
     * @return
     *     possible object is
     *     {@link VINSTOCKS }
     *     
     */
    public VINSTOCKS getVINSTOCKS() {
        return vinstocks;
    }

    /**
     * Définit la valeur de la propriété vinstocks.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSTOCKS }
     *     
     */
    public void setVINSTOCKS(VINSTOCKS value) {
        this.vinstocks = value;
    }

    /**
     * Obtient la valeur de la propriété vincreanceactifcirc.
     * 
     * @return
     *     possible object is
     *     {@link VINCREANCEACTIFCIRC }
     *     
     */
    public VINCREANCEACTIFCIRC getVINCREANCEACTIFCIRC() {
        return vincreanceactifcirc;
    }

    /**
     * Définit la valeur de la propriété vincreanceactifcirc.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCREANCEACTIFCIRC }
     *     
     */
    public void setVINCREANCEACTIFCIRC(VINCREANCEACTIFCIRC value) {
        this.vincreanceactifcirc = value;
    }

    /**
     * Obtient la valeur de la propriété vintresorerieactif.
     * 
     * @return
     *     possible object is
     *     {@link VINTRESORERIEACTIF }
     *     
     */
    public VINTRESORERIEACTIF getVINTRESORERIEACTIF() {
        return vintresorerieactif;
    }

    /**
     * Définit la valeur de la propriété vintresorerieactif.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTRESORERIEACTIF }
     *     
     */
    public void setVINTRESORERIEACTIF(VINTRESORERIEACTIF value) {
        this.vintresorerieactif = value;
    }

    /**
     * Obtient la valeur de la propriété vintotalactif.
     * 
     * @return
     *     possible object is
     *     {@link VINTOTALACTIF }
     *     
     */
    public VINTOTALACTIF getVINTOTALACTIF() {
        return vintotalactif;
    }

    /**
     * Définit la valeur de la propriété vintotalactif.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTOTALACTIF }
     *     
     */
    public void setVINTOTALACTIF(VINTOTALACTIF value) {
        this.vintotalactif = value;
    }

    /**
     * Obtient la valeur de la propriété vincapitauxpropres.
     * 
     * @return
     *     possible object is
     *     {@link VINCAPITAUXPROPRES }
     *     
     */
    public VINCAPITAUXPROPRES getVINCAPITAUXPROPRES() {
        return vincapitauxpropres;
    }

    /**
     * Définit la valeur de la propriété vincapitauxpropres.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCAPITAUXPROPRES }
     *     
     */
    public void setVINCAPITAUXPROPRES(VINCAPITAUXPROPRES value) {
        this.vincapitauxpropres = value;
    }

    /**
     * Obtient la valeur de la propriété vindettesfinancement.
     * 
     * @return
     *     possible object is
     *     {@link VINDETTESFINANCEMENT }
     *     
     */
    public VINDETTESFINANCEMENT getVINDETTESFINANCEMENT() {
        return vindettesfinancement;
    }

    /**
     * Définit la valeur de la propriété vindettesfinancement.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDETTESFINANCEMENT }
     *     
     */
    public void setVINDETTESFINANCEMENT(VINDETTESFINANCEMENT value) {
        this.vindettesfinancement = value;
    }

    /**
     * Obtient la valeur de la propriété vinprovisionrisquecharge.
     * 
     * @return
     *     possible object is
     *     {@link VINPROVISIONRISQUECHARGE }
     *     
     */
    public VINPROVISIONRISQUECHARGE getVINPROVISIONRISQUECHARGE() {
        return vinprovisionrisquecharge;
    }

    /**
     * Définit la valeur de la propriété vinprovisionrisquecharge.
     * 
     * @param value
     *     allowed object is
     *     {@link VINPROVISIONRISQUECHARGE }
     *     
     */
    public void setVINPROVISIONRISQUECHARGE(VINPROVISIONRISQUECHARGE value) {
        this.vinprovisionrisquecharge = value;
    }

    /**
     * Obtient la valeur de la propriété vinecartconvpassiffinpermanent.
     * 
     * @return
     *     possible object is
     *     {@link VINECARTCONVPASSIFFINPERMANENT }
     *     
     */
    public VINECARTCONVPASSIFFINPERMANENT getVINECARTCONVPASSIFFINPERMANENT() {
        return vinecartconvpassiffinpermanent;
    }

    /**
     * Définit la valeur de la propriété vinecartconvpassiffinpermanent.
     * 
     * @param value
     *     allowed object is
     *     {@link VINECARTCONVPASSIFFINPERMANENT }
     *     
     */
    public void setVINECARTCONVPASSIFFINPERMANENT(VINECARTCONVPASSIFFINPERMANENT value) {
        this.vinecartconvpassiffinpermanent = value;
    }

    /**
     * Obtient la valeur de la propriété vindettespassifcirc.
     * 
     * @return
     *     possible object is
     *     {@link VINDETTESPASSIFCIRC }
     *     
     */
    public VINDETTESPASSIFCIRC getVINDETTESPASSIFCIRC() {
        return vindettespassifcirc;
    }

    /**
     * Définit la valeur de la propriété vindettespassifcirc.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDETTESPASSIFCIRC }
     *     
     */
    public void setVINDETTESPASSIFCIRC(VINDETTESPASSIFCIRC value) {
        this.vindettespassifcirc = value;
    }

    /**
     * Obtient la valeur de la propriété vinautresprovisionrisquecharge.
     * 
     * @return
     *     possible object is
     *     {@link VINAUTRESPROVISIONRISQUECHARGE }
     *     
     */
    public VINAUTRESPROVISIONRISQUECHARGE getVINAUTRESPROVISIONRISQUECHARGE() {
        return vinautresprovisionrisquecharge;
    }

    /**
     * Définit la valeur de la propriété vinautresprovisionrisquecharge.
     * 
     * @param value
     *     allowed object is
     *     {@link VINAUTRESPROVISIONRISQUECHARGE }
     *     
     */
    public void setVINAUTRESPROVISIONRISQUECHARGE(VINAUTRESPROVISIONRISQUECHARGE value) {
        this.vinautresprovisionrisquecharge = value;
    }

    /**
     * Obtient la valeur de la propriété vinecartconvpassifcirc.
     * 
     * @return
     *     possible object is
     *     {@link VINECARTCONVPASSIFCIRC }
     *     
     */
    public VINECARTCONVPASSIFCIRC getVINECARTCONVPASSIFCIRC() {
        return vinecartconvpassifcirc;
    }

    /**
     * Définit la valeur de la propriété vinecartconvpassifcirc.
     * 
     * @param value
     *     allowed object is
     *     {@link VINECARTCONVPASSIFCIRC }
     *     
     */
    public void setVINECARTCONVPASSIFCIRC(VINECARTCONVPASSIFCIRC value) {
        this.vinecartconvpassifcirc = value;
    }

    /**
     * Obtient la valeur de la propriété vintotalpassifcirc.
     * 
     * @return
     *     possible object is
     *     {@link VINTOTALPASSIFCIRC }
     *     
     */
    public VINTOTALPASSIFCIRC getVINTOTALPASSIFCIRC() {
        return vintotalpassifcirc;
    }

    /**
     * Définit la valeur de la propriété vintotalpassifcirc.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTOTALPASSIFCIRC }
     *     
     */
    public void setVINTOTALPASSIFCIRC(VINTOTALPASSIFCIRC value) {
        this.vintotalpassifcirc = value;
    }

    /**
     * Obtient la valeur de la propriété vinchiffreaffairen1.
     * 
     * @return
     *     possible object is
     *     {@link VINCHIFFREAFFAIREN1 }
     *     
     */
    public VINCHIFFREAFFAIREN1 getVINCHIFFREAFFAIREN1() {
        return vinchiffreaffairen1;
    }

    /**
     * Définit la valeur de la propriété vinchiffreaffairen1.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCHIFFREAFFAIREN1 }
     *     
     */
    public void setVINCHIFFREAFFAIREN1(VINCHIFFREAFFAIREN1 value) {
        this.vinchiffreaffairen1 = value;
    }

    /**
     * Obtient la valeur de la propriété vinchiffreaffairen0.
     * 
     * @return
     *     possible object is
     *     {@link VINCHIFFREAFFAIREN0 }
     *     
     */
    public VINCHIFFREAFFAIREN0 getVINCHIFFREAFFAIREN0() {
        return vinchiffreaffairen0;
    }

    /**
     * Définit la valeur de la propriété vinchiffreaffairen0.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCHIFFREAFFAIREN0 }
     *     
     */
    public void setVINCHIFFREAFFAIREN0(VINCHIFFREAFFAIREN0 value) {
        this.vinchiffreaffairen0 = value;
    }

    /**
     * Obtient la valeur de la propriété vinvariationstockpdt.
     * 
     * @return
     *     possible object is
     *     {@link VINVARIATIONSTOCKPDT }
     *     
     */
    public VINVARIATIONSTOCKPDT getVINVARIATIONSTOCKPDT() {
        return vinvariationstockpdt;
    }

    /**
     * Définit la valeur de la propriété vinvariationstockpdt.
     * 
     * @param value
     *     allowed object is
     *     {@link VINVARIATIONSTOCKPDT }
     *     
     */
    public void setVINVARIATIONSTOCKPDT(VINVARIATIONSTOCKPDT value) {
        this.vinvariationstockpdt = value;
    }

    /**
     * Obtient la valeur de la propriété vinautrespdtexpl.
     * 
     * @return
     *     possible object is
     *     {@link VINAUTRESPDTEXPL }
     *     
     */
    public VINAUTRESPDTEXPL getVINAUTRESPDTEXPL() {
        return vinautrespdtexpl;
    }

    /**
     * Définit la valeur de la propriété vinautrespdtexpl.
     * 
     * @param value
     *     allowed object is
     *     {@link VINAUTRESPDTEXPL }
     *     
     */
    public void setVINAUTRESPDTEXPL(VINAUTRESPDTEXPL value) {
        this.vinautrespdtexpl = value;
    }

    /**
     * Obtient la valeur de la propriété vinachatrevendumarchandise.
     * 
     * @return
     *     possible object is
     *     {@link VINACHATREVENDUMARCHANDISE }
     *     
     */
    public VINACHATREVENDUMARCHANDISE getVINACHATREVENDUMARCHANDISE() {
        return vinachatrevendumarchandise;
    }

    /**
     * Définit la valeur de la propriété vinachatrevendumarchandise.
     * 
     * @param value
     *     allowed object is
     *     {@link VINACHATREVENDUMARCHANDISE }
     *     
     */
    public void setVINACHATREVENDUMARCHANDISE(VINACHATREVENDUMARCHANDISE value) {
        this.vinachatrevendumarchandise = value;
    }

    /**
     * Obtient la valeur de la propriété vinachatconsmatierefourniture.
     * 
     * @return
     *     possible object is
     *     {@link VINACHATCONSMATIEREFOURNITURE }
     *     
     */
    public VINACHATCONSMATIEREFOURNITURE getVINACHATCONSMATIEREFOURNITURE() {
        return vinachatconsmatierefourniture;
    }

    /**
     * Définit la valeur de la propriété vinachatconsmatierefourniture.
     * 
     * @param value
     *     allowed object is
     *     {@link VINACHATCONSMATIEREFOURNITURE }
     *     
     */
    public void setVINACHATCONSMATIEREFOURNITURE(VINACHATCONSMATIEREFOURNITURE value) {
        this.vinachatconsmatierefourniture = value;
    }

    /**
     * Obtient la valeur de la propriété vindotationexploitationn1.
     * 
     * @return
     *     possible object is
     *     {@link VINDOTATIONEXPLOITATIONN1 }
     *     
     */
    public VINDOTATIONEXPLOITATIONN1 getVINDOTATIONEXPLOITATIONN1() {
        return vindotationexploitationn1;
    }

    /**
     * Définit la valeur de la propriété vindotationexploitationn1.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDOTATIONEXPLOITATIONN1 }
     *     
     */
    public void setVINDOTATIONEXPLOITATIONN1(VINDOTATIONEXPLOITATIONN1 value) {
        this.vindotationexploitationn1 = value;
    }

    /**
     * Obtient la valeur de la propriété vindotationexploitationn0.
     * 
     * @return
     *     possible object is
     *     {@link VINDOTATIONEXPLOITATIONN0 }
     *     
     */
    public VINDOTATIONEXPLOITATIONN0 getVINDOTATIONEXPLOITATIONN0() {
        return vindotationexploitationn0;
    }

    /**
     * Définit la valeur de la propriété vindotationexploitationn0.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDOTATIONEXPLOITATIONN0 }
     *     
     */
    public void setVINDOTATIONEXPLOITATIONN0(VINDOTATIONEXPLOITATIONN0 value) {
        this.vindotationexploitationn0 = value;
    }

    /**
     * Obtient la valeur de la propriété vinchargefin.
     * 
     * @return
     *     possible object is
     *     {@link VINCHARGEFIN }
     *     
     */
    public VINCHARGEFIN getVINCHARGEFIN() {
        return vinchargefin;
    }

    /**
     * Définit la valeur de la propriété vinchargefin.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCHARGEFIN }
     *     
     */
    public void setVINCHARGEFIN(VINCHARGEFIN value) {
        this.vinchargefin = value;
    }

    /**
     * Obtient la valeur de la propriété vinresultatfin.
     * 
     * @return
     *     possible object is
     *     {@link VINRESULTATFIN }
     *     
     */
    public VINRESULTATFIN getVINRESULTATFIN() {
        return vinresultatfin;
    }

    /**
     * Définit la valeur de la propriété vinresultatfin.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRESULTATFIN }
     *     
     */
    public void setVINRESULTATFIN(VINRESULTATFIN value) {
        this.vinresultatfin = value;
    }

    /**
     * Obtient la valeur de la propriété vinresultatnetn1.
     * 
     * @return
     *     possible object is
     *     {@link VINRESULTATNETN1 }
     *     
     */
    public VINRESULTATNETN1 getVINRESULTATNETN1() {
        return vinresultatnetn1;
    }

    /**
     * Définit la valeur de la propriété vinresultatnetn1.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRESULTATNETN1 }
     *     
     */
    public void setVINRESULTATNETN1(VINRESULTATNETN1 value) {
        this.vinresultatnetn1 = value;
    }

    /**
     * Obtient la valeur de la propriété vinresultatnetn0.
     * 
     * @return
     *     possible object is
     *     {@link VINRESULTATNETN0 }
     *     
     */
    public VINRESULTATNETN0 getVINRESULTATNETN0() {
        return vinresultatnetn0;
    }

    /**
     * Définit la valeur de la propriété vinresultatnetn0.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRESULTATNETN0 }
     *     
     */
    public void setVINRESULTATNETN0(VINRESULTATNETN0 value) {
        this.vinresultatnetn0 = value;
    }

    /**
     * Obtient la valeur de la propriété vinieaffaireold.
     * 
     * @return
     *     possible object is
     *     {@link VINIEAFFAIREOLD }
     *     
     */
    public VINIEAFFAIREOLD getVINIEAFFAIREOLD() {
        return vinieaffaireold;
    }

    /**
     * Définit la valeur de la propriété vinieaffaireold.
     * 
     * @param value
     *     allowed object is
     *     {@link VINIEAFFAIREOLD }
     *     
     */
    public void setVINIEAFFAIREOLD(VINIEAFFAIREOLD value) {
        this.vinieaffaireold = value;
    }

    /**
     * Obtient la valeur de la propriété vinFlagReport.
     * 
     * @return
     *     possible object is
     *     {@link VINFlagReport }
     *     
     */
    public VINFlagReport getVINFlagReport() {
        return vinFlagReport;
    }

    /**
     * Définit la valeur de la propriété vinFlagReport.
     * 
     * @param value
     *     allowed object is
     *     {@link VINFlagReport }
     *     
     */
    public void setVINFlagReport(VINFlagReport value) {
        this.vinFlagReport = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateDernierIMP.
     * 
     * @return
     *     possible object is
     *     {@link VINDateDernierIMP }
     *     
     */
    public VINDateDernierIMP getVINDateDernierIMP() {
        return vinDateDernierIMP;
    }

    /**
     * Définit la valeur de la propriété vinDateDernierIMP.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateDernierIMP }
     *     
     */
    public void setVINDateDernierIMP(VINDateDernierIMP value) {
        this.vinDateDernierIMP = value;
    }

}
