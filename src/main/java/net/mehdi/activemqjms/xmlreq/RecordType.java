
package net.mehdi.activemqjms.xmlreq;

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
 *         &lt;element name="VIN_Role" type="{}VIN_RoleType"/&gt;
 *         &lt;element name="VIN_Progressif_Role" type="{}VIN_Progressif_RoleType"/&gt;
 *         &lt;element name="VIN_Identifiant_Client" type="{}VIN_Identifiant_ClientType"/&gt;
 *         &lt;element name="VIN_Type_Client" type="{}VIN_Type_ClientType"/&gt;
 *         &lt;element name="VIN_Forme_Juridique" type="{}VIN_Forme_JuridiqueType"/&gt;
 *         &lt;element name="VIN_Part_PM" type="{}VIN_Part_PMType"/&gt;
 *         &lt;element name="VIN_Sexe" type="{}VIN_SexeType"/&gt;
 *         &lt;element name="VIN_Date_Naissance" type="{}VIN_Date_NaissanceType"/&gt;
 *         &lt;element name="VIN_Date_Creat_Entr" type="{}VIN_Date_Creat_EntrType"/&gt;
 *         &lt;element name="VIN_Nouveau_Client_ON" type="{}VIN_Nouveau_Client_ONType"/&gt;
 *         &lt;element name="VIN_Nationalite" type="{}VIN_NationaliteType"/&gt;
 *         &lt;element name="VIN_Date_Embauche" type="{}VIN_Date_EmbaucheType"/&gt;
 *         &lt;element name="VIN_Date_Creation_RC" type="{}VIN_Date_Creation_RCType"/&gt;
 *         &lt;element name="VIN_Situation_Logement" type="{}VIN_Situation_LogementType"/&gt;
 *         &lt;element name="VIN_Profession" type="{}VIN_ProfessionType"/&gt;
 *         &lt;element name="VIN_Code_Activite" type="{}VIN_Code_ActiviteType"/&gt;
 *         &lt;element name="VIN_Date_Integration_Societe" type="{}VIN_Date_Integration_SocieteType"/&gt;
 *         &lt;element name="VIN_Code_Ville" type="{}VIN_Code_VilleType"/&gt;
 *         &lt;element name="VIN_Code_Banque" type="{}VIN_Code_BanqueType"/&gt;
 *         &lt;element name="VIN_Date_Relation_Banque" type="{}VIN_Date_Relation_BanqueType"/&gt;
 *         &lt;element name="VIN_Nbr_Anciens_Dossiers" type="{}VIN_Nbr_Anciens_DossiersType"/&gt;
 *         &lt;element name="VIN_Black_List" type="{}VIN_Black_ListType"/&gt;
 *         &lt;element name="VIN_Revenus_Mensuels" type="{}VIN_Revenus_MensuelsType"/&gt;
 *         &lt;element name="VIN_Autre_Revenus" type="{}VIN_Autre_RevenusType"/&gt;
 *         &lt;element name="VIN_Revenu_Conjoint" type="{}VIN_Revenu_ConjointType"/&gt;
 *         &lt;element name="VIN_Autre_Charges" type="{}VIN_Autre_ChargesType"/&gt;
 *         &lt;element name="VIN_Charge_Imm" type="{}VIN_Charge_ImmType"/&gt;
 *         &lt;element name="VIN_Credit_Logement" type="{}VIN_Credit_LogementType"/&gt;
 *         &lt;element name="VIN_Max_Nbr_Impayes" type="{}VIN_Max_Nbr_ImpayesType"/&gt;
 *         &lt;element name="VIN_Mt_Impayes" type="{}VIN_Mt_ImpayesType"/&gt;
 *         &lt;element name="VIN_Max_Nbr_Mois_Retard" type="{}VIN_Max_Nbr_Mois_RetardType"/&gt;
 *         &lt;element name="VIN_Total_Mt_Negative" type="{}VIN_Total_Mt_NegativeType"/&gt;
 *         &lt;element name="VIN_Solde_Init" type="{}VIN_Solde_InitType"/&gt;
 *         &lt;element name="VIN_Credit_M_1" type="{}VIN_Credit_M_1Type"/&gt;
 *         &lt;element name="VIN_Credit_M_2" type="{}VIN_Credit_M_2Type"/&gt;
 *         &lt;element name="VIN_Credit_M_3" type="{}VIN_Credit_M_3Type"/&gt;
 *         &lt;element name="VIN_Debit_M_1" type="{}VIN_Debit_M_1Type"/&gt;
 *         &lt;element name="VIN_Debit_M_2" type="{}VIN_Debit_M_2Type"/&gt;
 *         &lt;element name="VIN_Debit_M_3" type="{}VIN_Debit_M_3Type"/&gt;
 *         &lt;element name="VIN_Source" type="{}VIN_SourceType"/&gt;
 *         &lt;element name="VIN_Reference_Progressif_Role" type="{}VIN_Reference_Progressif_RoleType"/&gt;
 *         &lt;element name="VIN_Numero_Chequiers" type="{}VIN_Numero_ChequiersType"/&gt;
 *         &lt;element name="VIN_Date_Effet" type="{}VIN_Date_EffetType"/&gt;
 *         &lt;element name="VIN_Date_Sortie" type="{}VIN_Date_SortieType"/&gt;
 *         &lt;element name="VIN_Statut_Chequiers" type="{}VIN_Statut_ChequiersType"/&gt;
 *         &lt;element name="VIN_Montant_Chequier" type="{}VIN_Montant_ChequierType"/&gt;
 *         &lt;element name="VIN_Produit_Affaire" type="{}VIN_Produit_AffaireType"/&gt;
 *         &lt;element name="VIN_Contentieux" type="{}VIN_ContentieuxType"/&gt;
 *         &lt;element name="VIN_Nbr_Impayes" type="{}VIN_Nbr_ImpayesType"/&gt;
 *         &lt;element name="VIN_Nbr_Impayes_12" type="{}VIN_Nbr_Impayes_12Type"/&gt;
 *         &lt;element name="VIN_Date_Premiere_Echeance" type="{}VIN_Date_Premiere_EcheanceType"/&gt;
 *         &lt;element name="VIN_Date_Creation_Affaire" type="{}VIN_Date_Creation_AffaireType"/&gt;
 *         &lt;element name="VIN_Compensation" type="{}VIN_CompensationType"/&gt;
 *         &lt;element name="VIN_CRD" type="{}VIN_CRDType"/&gt;
 *         &lt;element name="VIN_SOLDE" type="{}VIN_SOLDEType"/&gt;
 *         &lt;element name="VIN_Statut_Affaire" type="{}VIN_Statut_AffaireType"/&gt;
 *         &lt;element name="VIN_Mt_Premiere_Echeanche_Ancienne_Affaire" type="{}VIN_Mt_Premiere_Echeanche_Ancienne_AffaireType"/&gt;
 *         &lt;element name="VIN_Nbr_Incidents" type="{}VIN_Nbr_IncidentsType"/&gt;
 *         &lt;element name="VIN_Loyer_Ekip" type="{}VIN_Loyer_EkipType"/&gt;
 *         &lt;element name="VIN_Loyer_Ekip_Comp" type="{}VIN_Loyer_Ekip_CompType"/&gt;
 *         &lt;element name="VIN_Loyer_Front" type="{}VIN_Loyer_FrontType"/&gt;
 *         &lt;element name="VIN_Role_Ancienne_Affaire" type="{}VIN_Role_Ancienne_AffaireType"/&gt;
 *         &lt;element name="VIN_Marche" type="{}VIN_MarcheType"/&gt;
 *         &lt;element name="VIN_Segment" type="{}VIN_SegmentType"/&gt;
 *         &lt;element name="VIN_Employeur" type="{}VIN_EmployeurType"/&gt;
 *         &lt;element name="VIN_Fonction" type="{}VIN_FonctionType"/&gt;
 *         &lt;element name="VIN_DATE_FIN_CONTRAT" type="{}VIN_DATE_FIN_CONTRATType"/&gt;
 *         &lt;element name="VIN_FLAG_SINISTRE" type="{}VIN_FLAG_SINISTREType"/&gt;
 *         &lt;element name="VIN_TYPE_GARANTIE" type="{}VIN_TYPE_GARANTIEType"/&gt;
 *         &lt;element name="VIN_MONTANT_EXPERTISE" type="{}VIN_MONTANT_EXPERTISEType"/&gt;
 *         &lt;element name="VIN_DATE_CERTIFICAT" type="{}VIN_DATE_CERTIFICATType"/&gt;
 *         &lt;element name="VIN_QUOTE_PART_GR" type="{}VIN_QUOTE_PART_GRType"/&gt;
 *         &lt;element name="VIN_VILLE_BIEN" type="{}VIN_VILLE_BIENType"/&gt;
 *         &lt;element name="VIN_Rang_Garantie" type="{}VIN_Rang_GarantieType"/&gt;
 *         &lt;element name="VIN_TYPE_CONTRAT" type="{}VIN_TYPE_CONTRATType"/&gt;
 *         &lt;element name="VIN_ECHEANCE_RESTANTE" type="{}VIN_ECHEANCE_RESTANTEType"/&gt;
 *         &lt;element name="VIN_ONU" type="{}VIN_ONUType"/&gt;
 *         &lt;element name="VIN_annee_bilan" type="{}VIN_annee_bilanType"/&gt;
 *         &lt;element name="VIN_CTRL_INFORISK" type="{}VIN_CTRL_INFORISKType"/&gt;
 *         &lt;element name="VIN_STOCKS" type="{}VIN_STOCKSType"/&gt;
 *         &lt;element name="VIN_CREANCE_ACTIF_CIRC" type="{}VIN_CREANCE_ACTIF_CIRCType"/&gt;
 *         &lt;element name="VIN_TRESORERIE_ACTIF" type="{}VIN_TRESORERIE_ACTIFType"/&gt;
 *         &lt;element name="VIN_TOTAL_ACTIF" type="{}VIN_TOTAL_ACTIFType"/&gt;
 *         &lt;element name="VIN_CAPITAUX_PROPRES" type="{}VIN_CAPITAUX_PROPRESType"/&gt;
 *         &lt;element name="VIN_DETTES_FINANCEMENT" type="{}VIN_DETTES_FINANCEMENTType"/&gt;
 *         &lt;element name="VIN_PROVISION_RISQUE_CHARGE" type="{}VIN_PROVISION_RISQUE_CHARGEType"/&gt;
 *         &lt;element name="VIN_ECART_CONV_PASSIF_FIN_PERMANENT" type="{}VIN_ECART_CONV_PASSIF_FIN_PERMANENTType"/&gt;
 *         &lt;element name="VIN_DETTES_PASSIF_CIRC" type="{}VIN_DETTES_PASSIF_CIRCType"/&gt;
 *         &lt;element name="VIN_AUTRES_PROVISION_RISQUE_CHARGE" type="{}VIN_AUTRES_PROVISION_RISQUE_CHARGEType"/&gt;
 *         &lt;element name="VIN_ECART_CONV_PASSIF_CIRC" type="{}VIN_ECART_CONV_PASSIF_CIRCType"/&gt;
 *         &lt;element name="VIN_TOTAL_PASSIF_CIRC" type="{}VIN_TOTAL_PASSIF_CIRCType"/&gt;
 *         &lt;element name="VIN_CHIFFRE_AFFAIRE_N1" type="{}VIN_CHIFFRE_AFFAIRE_N1Type"/&gt;
 *         &lt;element name="VIN_CHIFFRE_AFFAIRE_N0" type="{}VIN_CHIFFRE_AFFAIRE_N0Type"/&gt;
 *         &lt;element name="VIN_VARIATION_STOCK_PDT" type="{}VIN_VARIATION_STOCK_PDTType"/&gt;
 *         &lt;element name="VIN_AUTRES_PDT_EXPL" type="{}VIN_AUTRES_PDT_EXPLType"/&gt;
 *         &lt;element name="VIN_ACHAT_REVENDU_MARCHANDISE" type="{}VIN_ACHAT_REVENDU_MARCHANDISEType"/&gt;
 *         &lt;element name="VIN_ACHAT_CONS_MATIERE_FOURNITURE" type="{}VIN_ACHAT_CONS_MATIERE_FOURNITUREType"/&gt;
 *         &lt;element name="VIN_DOTATION_EXPLOITATION_N1" type="{}VIN_DOTATION_EXPLOITATION_N1Type"/&gt;
 *         &lt;element name="VIN_DOTATION_EXPLOITATION_N0" type="{}VIN_DOTATION_EXPLOITATION_N0Type"/&gt;
 *         &lt;element name="VIN_CHARGE_FIN" type="{}VIN_CHARGE_FINType"/&gt;
 *         &lt;element name="VIN_RESULTAT_FIN" type="{}VIN_RESULTAT_FINType"/&gt;
 *         &lt;element name="VIN_RESULTAT_NET_N1" type="{}VIN_RESULTAT_NET_N1Type"/&gt;
 *         &lt;element name="VIN_RESULTAT_NET_N0" type="{}VIN_RESULTAT_NET_N0Type"/&gt;
 *         &lt;element name="VIN_IE_AFFAIRE_OLD" type="{}VIN_IE_AFFAIRE_OLDType"/&gt;
 *         &lt;element name="VIN_Flag_Report" type="{}VIN_Flag_ReportType"/&gt;
 *         &lt;element name="VIN_Date_Dernier_IMP" type="{}VIN_Date_Dernier_IMPType"/&gt;
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
public class RecordType {

    @XmlElement(name = "VIN_Role", required = true)
    protected VINRoleType vinRole;
    @XmlElement(name = "VIN_Progressif_Role", required = true)
    protected VINProgressifRoleType vinProgressifRole;
    @XmlElement(name = "VIN_Identifiant_Client", required = true)
    protected VINIdentifiantClientType vinIdentifiantClient;
    @XmlElement(name = "VIN_Type_Client", required = true)
    protected VINTypeClientType vinTypeClient;
    @XmlElement(name = "VIN_Forme_Juridique", required = true)
    protected VINFormeJuridiqueType vinFormeJuridique;
    @XmlElement(name = "VIN_Part_PM", required = true)
    protected VINPartPMType vinPartPM;
    @XmlElement(name = "VIN_Sexe", required = true)
    protected VINSexeType vinSexe;
    @XmlElement(name = "VIN_Date_Naissance", required = true)
    protected VINDateNaissanceType vinDateNaissance;
    @XmlElement(name = "VIN_Date_Creat_Entr", required = true)
    protected VINDateCreatEntrType vinDateCreatEntr;
    @XmlElement(name = "VIN_Nouveau_Client_ON", required = true)
    protected VINNouveauClientONType vinNouveauClientON;
    @XmlElement(name = "VIN_Nationalite", required = true)
    protected VINNationaliteType vinNationalite;
    @XmlElement(name = "VIN_Date_Embauche", required = true)
    protected VINDateEmbaucheType vinDateEmbauche;
    @XmlElement(name = "VIN_Date_Creation_RC", required = true)
    protected VINDateCreationRCType vinDateCreationRC;
    @XmlElement(name = "VIN_Situation_Logement", required = true)
    protected VINSituationLogementType vinSituationLogement;
    @XmlElement(name = "VIN_Profession", required = true)
    protected VINProfessionType vinProfession;
    @XmlElement(name = "VIN_Code_Activite", required = true)
    protected VINCodeActiviteType vinCodeActivite;
    @XmlElement(name = "VIN_Date_Integration_Societe", required = true)
    protected VINDateIntegrationSocieteType vinDateIntegrationSociete;
    @XmlElement(name = "VIN_Code_Ville", required = true)
    protected VINCodeVilleType vinCodeVille;
    @XmlElement(name = "VIN_Code_Banque", required = true)
    protected VINCodeBanqueType vinCodeBanque;
    @XmlElement(name = "VIN_Date_Relation_Banque", required = true)
    protected VINDateRelationBanqueType vinDateRelationBanque;
    @XmlElement(name = "VIN_Nbr_Anciens_Dossiers", required = true)
    protected VINNbrAnciensDossiersType vinNbrAnciensDossiers;
    @XmlElement(name = "VIN_Black_List", required = true)
    protected VINBlackListType vinBlackList;
    @XmlElement(name = "VIN_Revenus_Mensuels", required = true)
    protected VINRevenusMensuelsType vinRevenusMensuels;
    @XmlElement(name = "VIN_Autre_Revenus", required = true)
    protected VINAutreRevenusType vinAutreRevenus;
    @XmlElement(name = "VIN_Revenu_Conjoint", required = true)
    protected VINRevenuConjointType vinRevenuConjoint;
    @XmlElement(name = "VIN_Autre_Charges", required = true)
    protected VINAutreChargesType vinAutreCharges;
    @XmlElement(name = "VIN_Charge_Imm", required = true)
    protected VINChargeImmType vinChargeImm;
    @XmlElement(name = "VIN_Credit_Logement", required = true)
    protected VINCreditLogementType vinCreditLogement;
    @XmlElement(name = "VIN_Max_Nbr_Impayes", required = true)
    protected VINMaxNbrImpayesType vinMaxNbrImpayes;
    @XmlElement(name = "VIN_Mt_Impayes", required = true)
    protected VINMtImpayesType vinMtImpayes;
    @XmlElement(name = "VIN_Max_Nbr_Mois_Retard", required = true)
    protected VINMaxNbrMoisRetardType vinMaxNbrMoisRetard;
    @XmlElement(name = "VIN_Total_Mt_Negative", required = true)
    protected VINTotalMtNegativeType vinTotalMtNegative;
    @XmlElement(name = "VIN_Solde_Init", required = true)
    protected VINSoldeInitType vinSoldeInit;
    @XmlElement(name = "VIN_Credit_M_1", required = true)
    protected VINCreditM1Type vinCreditM1;
    @XmlElement(name = "VIN_Credit_M_2", required = true)
    protected VINCreditM2Type vinCreditM2;
    @XmlElement(name = "VIN_Credit_M_3", required = true)
    protected VINCreditM3Type vinCreditM3;
    @XmlElement(name = "VIN_Debit_M_1", required = true)
    protected VINDebitM1Type vinDebitM1;
    @XmlElement(name = "VIN_Debit_M_2", required = true)
    protected VINDebitM2Type vinDebitM2;
    @XmlElement(name = "VIN_Debit_M_3", required = true)
    protected VINDebitM3Type vinDebitM3;
    @XmlElement(name = "VIN_Source", required = true)
    protected VINSourceType vinSource;
    @XmlElement(name = "VIN_Reference_Progressif_Role", required = true)
    protected VINReferenceProgressifRoleType vinReferenceProgressifRole;
    @XmlElement(name = "VIN_Numero_Chequiers", required = true)
    protected VINNumeroChequiersType vinNumeroChequiers;
    @XmlElement(name = "VIN_Date_Effet", required = true)
    protected VINDateEffetType vinDateEffet;
    @XmlElement(name = "VIN_Date_Sortie", required = true)
    protected VINDateSortieType vinDateSortie;
    @XmlElement(name = "VIN_Statut_Chequiers", required = true)
    protected VINStatutChequiersType vinStatutChequiers;
    @XmlElement(name = "VIN_Montant_Chequier", required = true)
    protected VINMontantChequierType vinMontantChequier;
    @XmlElement(name = "VIN_Produit_Affaire", required = true)
    protected VINProduitAffaireType vinProduitAffaire;
    @XmlElement(name = "VIN_Contentieux", required = true)
    protected VINContentieuxType vinContentieux;
    @XmlElement(name = "VIN_Nbr_Impayes", required = true)
    protected VINNbrImpayesType vinNbrImpayes;
    @XmlElement(name = "VIN_Nbr_Impayes_12", required = true)
    protected VINNbrImpayes12Type vinNbrImpayes12;
    @XmlElement(name = "VIN_Date_Premiere_Echeance", required = true)
    protected VINDatePremiereEcheanceType vinDatePremiereEcheance;
    @XmlElement(name = "VIN_Date_Creation_Affaire", required = true)
    protected VINDateCreationAffaireType vinDateCreationAffaire;
    @XmlElement(name = "VIN_Compensation", required = true)
    protected VINCompensationType vinCompensation;
    @XmlElement(name = "VIN_CRD", required = true)
    protected VINCRDType vincrd;
    @XmlElement(name = "VIN_SOLDE", required = true)
    protected VINSOLDEType vinsolde;
    @XmlElement(name = "VIN_Statut_Affaire", required = true)
    protected VINStatutAffaireType vinStatutAffaire;
    @XmlElement(name = "VIN_Mt_Premiere_Echeanche_Ancienne_Affaire", required = true)
    protected VINMtPremiereEcheancheAncienneAffaireType vinMtPremiereEcheancheAncienneAffaire;
    @XmlElement(name = "VIN_Nbr_Incidents", required = true)
    protected VINNbrIncidentsType vinNbrIncidents;
    @XmlElement(name = "VIN_Loyer_Ekip", required = true)
    protected VINLoyerEkipType vinLoyerEkip;
    @XmlElement(name = "VIN_Loyer_Ekip_Comp", required = true)
    protected VINLoyerEkipCompType vinLoyerEkipComp;
    @XmlElement(name = "VIN_Loyer_Front", required = true)
    protected VINLoyerFrontType vinLoyerFront;
    @XmlElement(name = "VIN_Role_Ancienne_Affaire", required = true)
    protected VINRoleAncienneAffaireType vinRoleAncienneAffaire;
    @XmlElement(name = "VIN_Marche", required = true)
    protected VINMarcheType vinMarche;
    @XmlElement(name = "VIN_Segment", required = true)
    protected VINSegmentType vinSegment;
    @XmlElement(name = "VIN_Employeur", required = true)
    protected VINEmployeurType vinEmployeur;
    @XmlElement(name = "VIN_Fonction", required = true)
    protected VINFonctionType vinFonction;
    @XmlElement(name = "VIN_DATE_FIN_CONTRAT", required = true)
    protected VINDATEFINCONTRATType vindatefincontrat;
    @XmlElement(name = "VIN_FLAG_SINISTRE", required = true)
    protected VINFLAGSINISTREType vinflagsinistre;
    @XmlElement(name = "VIN_TYPE_GARANTIE", required = true)
    protected VINTYPEGARANTIEType vintypegarantie;
    @XmlElement(name = "VIN_MONTANT_EXPERTISE", required = true)
    protected VINMONTANTEXPERTISEType vinmontantexpertise;
    @XmlElement(name = "VIN_DATE_CERTIFICAT", required = true)
    protected VINDATECERTIFICATType vindatecertificat;
    @XmlElement(name = "VIN_QUOTE_PART_GR", required = true)
    protected VINQUOTEPARTGRType vinquotepartgr;
    @XmlElement(name = "VIN_VILLE_BIEN", required = true)
    protected VINVILLEBIENType vinvillebien;
    @XmlElement(name = "VIN_Rang_Garantie", required = true)
    protected VINRangGarantieType vinRangGarantie;
    @XmlElement(name = "VIN_TYPE_CONTRAT", required = true)
    protected VINTYPECONTRATType vintypecontrat;
    @XmlElement(name = "VIN_ECHEANCE_RESTANTE", required = true)
    protected VINECHEANCERESTANTEType vinecheancerestante;
    @XmlElement(name = "VIN_ONU", required = true)
    protected VINONUType vinonu;
    @XmlElement(name = "VIN_annee_bilan", required = true)
    protected VINAnneeBilanType vinAnneeBilan;
    @XmlElement(name = "VIN_CTRL_INFORISK", required = true)
    protected VINCTRLINFORISKType vinctrlinforisk;
    @XmlElement(name = "VIN_STOCKS", required = true)
    protected VINSTOCKSType vinstocks;
    @XmlElement(name = "VIN_CREANCE_ACTIF_CIRC", required = true)
    protected VINCREANCEACTIFCIRCType vincreanceactifcirc;
    @XmlElement(name = "VIN_TRESORERIE_ACTIF", required = true)
    protected VINTRESORERIEACTIFType vintresorerieactif;
    @XmlElement(name = "VIN_TOTAL_ACTIF", required = true)
    protected VINTOTALACTIFType vintotalactif;
    @XmlElement(name = "VIN_CAPITAUX_PROPRES", required = true)
    protected VINCAPITAUXPROPRESType vincapitauxpropres;
    @XmlElement(name = "VIN_DETTES_FINANCEMENT", required = true)
    protected VINDETTESFINANCEMENTType vindettesfinancement;
    @XmlElement(name = "VIN_PROVISION_RISQUE_CHARGE", required = true)
    protected VINPROVISIONRISQUECHARGEType vinprovisionrisquecharge;
    @XmlElement(name = "VIN_ECART_CONV_PASSIF_FIN_PERMANENT", required = true)
    protected VINECARTCONVPASSIFFINPERMANENTType vinecartconvpassiffinpermanent;
    @XmlElement(name = "VIN_DETTES_PASSIF_CIRC", required = true)
    protected VINDETTESPASSIFCIRCType vindettespassifcirc;
    @XmlElement(name = "VIN_AUTRES_PROVISION_RISQUE_CHARGE", required = true)
    protected VINAUTRESPROVISIONRISQUECHARGEType vinautresprovisionrisquecharge;
    @XmlElement(name = "VIN_ECART_CONV_PASSIF_CIRC", required = true)
    protected VINECARTCONVPASSIFCIRCType vinecartconvpassifcirc;
    @XmlElement(name = "VIN_TOTAL_PASSIF_CIRC", required = true)
    protected VINTOTALPASSIFCIRCType vintotalpassifcirc;
    @XmlElement(name = "VIN_CHIFFRE_AFFAIRE_N1", required = true)
    protected VINCHIFFREAFFAIREN1Type vinchiffreaffairen1;
    @XmlElement(name = "VIN_CHIFFRE_AFFAIRE_N0", required = true)
    protected VINCHIFFREAFFAIREN0Type vinchiffreaffairen0;
    @XmlElement(name = "VIN_VARIATION_STOCK_PDT", required = true)
    protected VINVARIATIONSTOCKPDTType vinvariationstockpdt;
    @XmlElement(name = "VIN_AUTRES_PDT_EXPL", required = true)
    protected VINAUTRESPDTEXPLType vinautrespdtexpl;
    @XmlElement(name = "VIN_ACHAT_REVENDU_MARCHANDISE", required = true)
    protected VINACHATREVENDUMARCHANDISEType vinachatrevendumarchandise;
    @XmlElement(name = "VIN_ACHAT_CONS_MATIERE_FOURNITURE", required = true)
    protected VINACHATCONSMATIEREFOURNITUREType vinachatconsmatierefourniture;
    @XmlElement(name = "VIN_DOTATION_EXPLOITATION_N1", required = true)
    protected VINDOTATIONEXPLOITATIONN1Type vindotationexploitationn1;
    @XmlElement(name = "VIN_DOTATION_EXPLOITATION_N0", required = true)
    protected VINDOTATIONEXPLOITATIONN0Type vindotationexploitationn0;
    @XmlElement(name = "VIN_CHARGE_FIN", required = true)
    protected VINCHARGEFINType vinchargefin;
    @XmlElement(name = "VIN_RESULTAT_FIN", required = true)
    protected VINRESULTATFINType vinresultatfin;
    @XmlElement(name = "VIN_RESULTAT_NET_N1", required = true)
    protected VINRESULTATNETN1Type vinresultatnetn1;
    @XmlElement(name = "VIN_RESULTAT_NET_N0", required = true)
    protected VINRESULTATNETN0Type vinresultatnetn0;
    @XmlElement(name = "VIN_IE_AFFAIRE_OLD", required = true)
    protected VINIEAFFAIREOLDType vinieaffaireold;
    @XmlElement(name = "VIN_Flag_Report", required = true)
    protected VINFlagReportType vinFlagReport;
    @XmlElement(name = "VIN_Date_Dernier_IMP", required = true)
    protected VINDateDernierIMPType vinDateDernierIMP;

    /**
     * Obtient la valeur de la propriété vinRole.
     * 
     * @return
     *     possible object is
     *     {@link VINRoleType }
     *     
     */
    public VINRoleType getVINRole() {
        return vinRole;
    }

    /**
     * Définit la valeur de la propriété vinRole.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRoleType }
     *     
     */
    public void setVINRole(VINRoleType value) {
        this.vinRole = value;
    }

    /**
     * Obtient la valeur de la propriété vinProgressifRole.
     * 
     * @return
     *     possible object is
     *     {@link VINProgressifRoleType }
     *     
     */
    public VINProgressifRoleType getVINProgressifRole() {
        return vinProgressifRole;
    }

    /**
     * Définit la valeur de la propriété vinProgressifRole.
     * 
     * @param value
     *     allowed object is
     *     {@link VINProgressifRoleType }
     *     
     */
    public void setVINProgressifRole(VINProgressifRoleType value) {
        this.vinProgressifRole = value;
    }

    /**
     * Obtient la valeur de la propriété vinIdentifiantClient.
     * 
     * @return
     *     possible object is
     *     {@link VINIdentifiantClientType }
     *     
     */
    public VINIdentifiantClientType getVINIdentifiantClient() {
        return vinIdentifiantClient;
    }

    /**
     * Définit la valeur de la propriété vinIdentifiantClient.
     * 
     * @param value
     *     allowed object is
     *     {@link VINIdentifiantClientType }
     *     
     */
    public void setVINIdentifiantClient(VINIdentifiantClientType value) {
        this.vinIdentifiantClient = value;
    }

    /**
     * Obtient la valeur de la propriété vinTypeClient.
     * 
     * @return
     *     possible object is
     *     {@link VINTypeClientType }
     *     
     */
    public VINTypeClientType getVINTypeClient() {
        return vinTypeClient;
    }

    /**
     * Définit la valeur de la propriété vinTypeClient.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTypeClientType }
     *     
     */
    public void setVINTypeClient(VINTypeClientType value) {
        this.vinTypeClient = value;
    }

    /**
     * Obtient la valeur de la propriété vinFormeJuridique.
     * 
     * @return
     *     possible object is
     *     {@link VINFormeJuridiqueType }
     *     
     */
    public VINFormeJuridiqueType getVINFormeJuridique() {
        return vinFormeJuridique;
    }

    /**
     * Définit la valeur de la propriété vinFormeJuridique.
     * 
     * @param value
     *     allowed object is
     *     {@link VINFormeJuridiqueType }
     *     
     */
    public void setVINFormeJuridique(VINFormeJuridiqueType value) {
        this.vinFormeJuridique = value;
    }

    /**
     * Obtient la valeur de la propriété vinPartPM.
     * 
     * @return
     *     possible object is
     *     {@link VINPartPMType }
     *     
     */
    public VINPartPMType getVINPartPM() {
        return vinPartPM;
    }

    /**
     * Définit la valeur de la propriété vinPartPM.
     * 
     * @param value
     *     allowed object is
     *     {@link VINPartPMType }
     *     
     */
    public void setVINPartPM(VINPartPMType value) {
        this.vinPartPM = value;
    }

    /**
     * Obtient la valeur de la propriété vinSexe.
     * 
     * @return
     *     possible object is
     *     {@link VINSexeType }
     *     
     */
    public VINSexeType getVINSexe() {
        return vinSexe;
    }

    /**
     * Définit la valeur de la propriété vinSexe.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSexeType }
     *     
     */
    public void setVINSexe(VINSexeType value) {
        this.vinSexe = value;
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
     * Obtient la valeur de la propriété vinDateCreatEntr.
     * 
     * @return
     *     possible object is
     *     {@link VINDateCreatEntrType }
     *     
     */
    public VINDateCreatEntrType getVINDateCreatEntr() {
        return vinDateCreatEntr;
    }

    /**
     * Définit la valeur de la propriété vinDateCreatEntr.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateCreatEntrType }
     *     
     */
    public void setVINDateCreatEntr(VINDateCreatEntrType value) {
        this.vinDateCreatEntr = value;
    }

    /**
     * Obtient la valeur de la propriété vinNouveauClientON.
     * 
     * @return
     *     possible object is
     *     {@link VINNouveauClientONType }
     *     
     */
    public VINNouveauClientONType getVINNouveauClientON() {
        return vinNouveauClientON;
    }

    /**
     * Définit la valeur de la propriété vinNouveauClientON.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNouveauClientONType }
     *     
     */
    public void setVINNouveauClientON(VINNouveauClientONType value) {
        this.vinNouveauClientON = value;
    }

    /**
     * Obtient la valeur de la propriété vinNationalite.
     * 
     * @return
     *     possible object is
     *     {@link VINNationaliteType }
     *     
     */
    public VINNationaliteType getVINNationalite() {
        return vinNationalite;
    }

    /**
     * Définit la valeur de la propriété vinNationalite.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNationaliteType }
     *     
     */
    public void setVINNationalite(VINNationaliteType value) {
        this.vinNationalite = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateEmbauche.
     * 
     * @return
     *     possible object is
     *     {@link VINDateEmbaucheType }
     *     
     */
    public VINDateEmbaucheType getVINDateEmbauche() {
        return vinDateEmbauche;
    }

    /**
     * Définit la valeur de la propriété vinDateEmbauche.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateEmbaucheType }
     *     
     */
    public void setVINDateEmbauche(VINDateEmbaucheType value) {
        this.vinDateEmbauche = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateCreationRC.
     * 
     * @return
     *     possible object is
     *     {@link VINDateCreationRCType }
     *     
     */
    public VINDateCreationRCType getVINDateCreationRC() {
        return vinDateCreationRC;
    }

    /**
     * Définit la valeur de la propriété vinDateCreationRC.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateCreationRCType }
     *     
     */
    public void setVINDateCreationRC(VINDateCreationRCType value) {
        this.vinDateCreationRC = value;
    }

    /**
     * Obtient la valeur de la propriété vinSituationLogement.
     * 
     * @return
     *     possible object is
     *     {@link VINSituationLogementType }
     *     
     */
    public VINSituationLogementType getVINSituationLogement() {
        return vinSituationLogement;
    }

    /**
     * Définit la valeur de la propriété vinSituationLogement.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSituationLogementType }
     *     
     */
    public void setVINSituationLogement(VINSituationLogementType value) {
        this.vinSituationLogement = value;
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
     * Obtient la valeur de la propriété vinCodeActivite.
     * 
     * @return
     *     possible object is
     *     {@link VINCodeActiviteType }
     *     
     */
    public VINCodeActiviteType getVINCodeActivite() {
        return vinCodeActivite;
    }

    /**
     * Définit la valeur de la propriété vinCodeActivite.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCodeActiviteType }
     *     
     */
    public void setVINCodeActivite(VINCodeActiviteType value) {
        this.vinCodeActivite = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateIntegrationSociete.
     * 
     * @return
     *     possible object is
     *     {@link VINDateIntegrationSocieteType }
     *     
     */
    public VINDateIntegrationSocieteType getVINDateIntegrationSociete() {
        return vinDateIntegrationSociete;
    }

    /**
     * Définit la valeur de la propriété vinDateIntegrationSociete.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateIntegrationSocieteType }
     *     
     */
    public void setVINDateIntegrationSociete(VINDateIntegrationSocieteType value) {
        this.vinDateIntegrationSociete = value;
    }

    /**
     * Obtient la valeur de la propriété vinCodeVille.
     * 
     * @return
     *     possible object is
     *     {@link VINCodeVilleType }
     *     
     */
    public VINCodeVilleType getVINCodeVille() {
        return vinCodeVille;
    }

    /**
     * Définit la valeur de la propriété vinCodeVille.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCodeVilleType }
     *     
     */
    public void setVINCodeVille(VINCodeVilleType value) {
        this.vinCodeVille = value;
    }

    /**
     * Obtient la valeur de la propriété vinCodeBanque.
     * 
     * @return
     *     possible object is
     *     {@link VINCodeBanqueType }
     *     
     */
    public VINCodeBanqueType getVINCodeBanque() {
        return vinCodeBanque;
    }

    /**
     * Définit la valeur de la propriété vinCodeBanque.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCodeBanqueType }
     *     
     */
    public void setVINCodeBanque(VINCodeBanqueType value) {
        this.vinCodeBanque = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateRelationBanque.
     * 
     * @return
     *     possible object is
     *     {@link VINDateRelationBanqueType }
     *     
     */
    public VINDateRelationBanqueType getVINDateRelationBanque() {
        return vinDateRelationBanque;
    }

    /**
     * Définit la valeur de la propriété vinDateRelationBanque.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateRelationBanqueType }
     *     
     */
    public void setVINDateRelationBanque(VINDateRelationBanqueType value) {
        this.vinDateRelationBanque = value;
    }

    /**
     * Obtient la valeur de la propriété vinNbrAnciensDossiers.
     * 
     * @return
     *     possible object is
     *     {@link VINNbrAnciensDossiersType }
     *     
     */
    public VINNbrAnciensDossiersType getVINNbrAnciensDossiers() {
        return vinNbrAnciensDossiers;
    }

    /**
     * Définit la valeur de la propriété vinNbrAnciensDossiers.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNbrAnciensDossiersType }
     *     
     */
    public void setVINNbrAnciensDossiers(VINNbrAnciensDossiersType value) {
        this.vinNbrAnciensDossiers = value;
    }

    /**
     * Obtient la valeur de la propriété vinBlackList.
     * 
     * @return
     *     possible object is
     *     {@link VINBlackListType }
     *     
     */
    public VINBlackListType getVINBlackList() {
        return vinBlackList;
    }

    /**
     * Définit la valeur de la propriété vinBlackList.
     * 
     * @param value
     *     allowed object is
     *     {@link VINBlackListType }
     *     
     */
    public void setVINBlackList(VINBlackListType value) {
        this.vinBlackList = value;
    }

    /**
     * Obtient la valeur de la propriété vinRevenusMensuels.
     * 
     * @return
     *     possible object is
     *     {@link VINRevenusMensuelsType }
     *     
     */
    public VINRevenusMensuelsType getVINRevenusMensuels() {
        return vinRevenusMensuels;
    }

    /**
     * Définit la valeur de la propriété vinRevenusMensuels.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRevenusMensuelsType }
     *     
     */
    public void setVINRevenusMensuels(VINRevenusMensuelsType value) {
        this.vinRevenusMensuels = value;
    }

    /**
     * Obtient la valeur de la propriété vinAutreRevenus.
     * 
     * @return
     *     possible object is
     *     {@link VINAutreRevenusType }
     *     
     */
    public VINAutreRevenusType getVINAutreRevenus() {
        return vinAutreRevenus;
    }

    /**
     * Définit la valeur de la propriété vinAutreRevenus.
     * 
     * @param value
     *     allowed object is
     *     {@link VINAutreRevenusType }
     *     
     */
    public void setVINAutreRevenus(VINAutreRevenusType value) {
        this.vinAutreRevenus = value;
    }

    /**
     * Obtient la valeur de la propriété vinRevenuConjoint.
     * 
     * @return
     *     possible object is
     *     {@link VINRevenuConjointType }
     *     
     */
    public VINRevenuConjointType getVINRevenuConjoint() {
        return vinRevenuConjoint;
    }

    /**
     * Définit la valeur de la propriété vinRevenuConjoint.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRevenuConjointType }
     *     
     */
    public void setVINRevenuConjoint(VINRevenuConjointType value) {
        this.vinRevenuConjoint = value;
    }

    /**
     * Obtient la valeur de la propriété vinAutreCharges.
     * 
     * @return
     *     possible object is
     *     {@link VINAutreChargesType }
     *     
     */
    public VINAutreChargesType getVINAutreCharges() {
        return vinAutreCharges;
    }

    /**
     * Définit la valeur de la propriété vinAutreCharges.
     * 
     * @param value
     *     allowed object is
     *     {@link VINAutreChargesType }
     *     
     */
    public void setVINAutreCharges(VINAutreChargesType value) {
        this.vinAutreCharges = value;
    }

    /**
     * Obtient la valeur de la propriété vinChargeImm.
     * 
     * @return
     *     possible object is
     *     {@link VINChargeImmType }
     *     
     */
    public VINChargeImmType getVINChargeImm() {
        return vinChargeImm;
    }

    /**
     * Définit la valeur de la propriété vinChargeImm.
     * 
     * @param value
     *     allowed object is
     *     {@link VINChargeImmType }
     *     
     */
    public void setVINChargeImm(VINChargeImmType value) {
        this.vinChargeImm = value;
    }

    /**
     * Obtient la valeur de la propriété vinCreditLogement.
     * 
     * @return
     *     possible object is
     *     {@link VINCreditLogementType }
     *     
     */
    public VINCreditLogementType getVINCreditLogement() {
        return vinCreditLogement;
    }

    /**
     * Définit la valeur de la propriété vinCreditLogement.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCreditLogementType }
     *     
     */
    public void setVINCreditLogement(VINCreditLogementType value) {
        this.vinCreditLogement = value;
    }

    /**
     * Obtient la valeur de la propriété vinMaxNbrImpayes.
     * 
     * @return
     *     possible object is
     *     {@link VINMaxNbrImpayesType }
     *     
     */
    public VINMaxNbrImpayesType getVINMaxNbrImpayes() {
        return vinMaxNbrImpayes;
    }

    /**
     * Définit la valeur de la propriété vinMaxNbrImpayes.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMaxNbrImpayesType }
     *     
     */
    public void setVINMaxNbrImpayes(VINMaxNbrImpayesType value) {
        this.vinMaxNbrImpayes = value;
    }

    /**
     * Obtient la valeur de la propriété vinMtImpayes.
     * 
     * @return
     *     possible object is
     *     {@link VINMtImpayesType }
     *     
     */
    public VINMtImpayesType getVINMtImpayes() {
        return vinMtImpayes;
    }

    /**
     * Définit la valeur de la propriété vinMtImpayes.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMtImpayesType }
     *     
     */
    public void setVINMtImpayes(VINMtImpayesType value) {
        this.vinMtImpayes = value;
    }

    /**
     * Obtient la valeur de la propriété vinMaxNbrMoisRetard.
     * 
     * @return
     *     possible object is
     *     {@link VINMaxNbrMoisRetardType }
     *     
     */
    public VINMaxNbrMoisRetardType getVINMaxNbrMoisRetard() {
        return vinMaxNbrMoisRetard;
    }

    /**
     * Définit la valeur de la propriété vinMaxNbrMoisRetard.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMaxNbrMoisRetardType }
     *     
     */
    public void setVINMaxNbrMoisRetard(VINMaxNbrMoisRetardType value) {
        this.vinMaxNbrMoisRetard = value;
    }

    /**
     * Obtient la valeur de la propriété vinTotalMtNegative.
     * 
     * @return
     *     possible object is
     *     {@link VINTotalMtNegativeType }
     *     
     */
    public VINTotalMtNegativeType getVINTotalMtNegative() {
        return vinTotalMtNegative;
    }

    /**
     * Définit la valeur de la propriété vinTotalMtNegative.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTotalMtNegativeType }
     *     
     */
    public void setVINTotalMtNegative(VINTotalMtNegativeType value) {
        this.vinTotalMtNegative = value;
    }

    /**
     * Obtient la valeur de la propriété vinSoldeInit.
     * 
     * @return
     *     possible object is
     *     {@link VINSoldeInitType }
     *     
     */
    public VINSoldeInitType getVINSoldeInit() {
        return vinSoldeInit;
    }

    /**
     * Définit la valeur de la propriété vinSoldeInit.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSoldeInitType }
     *     
     */
    public void setVINSoldeInit(VINSoldeInitType value) {
        this.vinSoldeInit = value;
    }

    /**
     * Obtient la valeur de la propriété vinCreditM1.
     * 
     * @return
     *     possible object is
     *     {@link VINCreditM1Type }
     *     
     */
    public VINCreditM1Type getVINCreditM1() {
        return vinCreditM1;
    }

    /**
     * Définit la valeur de la propriété vinCreditM1.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCreditM1Type }
     *     
     */
    public void setVINCreditM1(VINCreditM1Type value) {
        this.vinCreditM1 = value;
    }

    /**
     * Obtient la valeur de la propriété vinCreditM2.
     * 
     * @return
     *     possible object is
     *     {@link VINCreditM2Type }
     *     
     */
    public VINCreditM2Type getVINCreditM2() {
        return vinCreditM2;
    }

    /**
     * Définit la valeur de la propriété vinCreditM2.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCreditM2Type }
     *     
     */
    public void setVINCreditM2(VINCreditM2Type value) {
        this.vinCreditM2 = value;
    }

    /**
     * Obtient la valeur de la propriété vinCreditM3.
     * 
     * @return
     *     possible object is
     *     {@link VINCreditM3Type }
     *     
     */
    public VINCreditM3Type getVINCreditM3() {
        return vinCreditM3;
    }

    /**
     * Définit la valeur de la propriété vinCreditM3.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCreditM3Type }
     *     
     */
    public void setVINCreditM3(VINCreditM3Type value) {
        this.vinCreditM3 = value;
    }

    /**
     * Obtient la valeur de la propriété vinDebitM1.
     * 
     * @return
     *     possible object is
     *     {@link VINDebitM1Type }
     *     
     */
    public VINDebitM1Type getVINDebitM1() {
        return vinDebitM1;
    }

    /**
     * Définit la valeur de la propriété vinDebitM1.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDebitM1Type }
     *     
     */
    public void setVINDebitM1(VINDebitM1Type value) {
        this.vinDebitM1 = value;
    }

    /**
     * Obtient la valeur de la propriété vinDebitM2.
     * 
     * @return
     *     possible object is
     *     {@link VINDebitM2Type }
     *     
     */
    public VINDebitM2Type getVINDebitM2() {
        return vinDebitM2;
    }

    /**
     * Définit la valeur de la propriété vinDebitM2.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDebitM2Type }
     *     
     */
    public void setVINDebitM2(VINDebitM2Type value) {
        this.vinDebitM2 = value;
    }

    /**
     * Obtient la valeur de la propriété vinDebitM3.
     * 
     * @return
     *     possible object is
     *     {@link VINDebitM3Type }
     *     
     */
    public VINDebitM3Type getVINDebitM3() {
        return vinDebitM3;
    }

    /**
     * Définit la valeur de la propriété vinDebitM3.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDebitM3Type }
     *     
     */
    public void setVINDebitM3(VINDebitM3Type value) {
        this.vinDebitM3 = value;
    }

    /**
     * Obtient la valeur de la propriété vinSource.
     * 
     * @return
     *     possible object is
     *     {@link VINSourceType }
     *     
     */
    public VINSourceType getVINSource() {
        return vinSource;
    }

    /**
     * Définit la valeur de la propriété vinSource.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSourceType }
     *     
     */
    public void setVINSource(VINSourceType value) {
        this.vinSource = value;
    }

    /**
     * Obtient la valeur de la propriété vinReferenceProgressifRole.
     * 
     * @return
     *     possible object is
     *     {@link VINReferenceProgressifRoleType }
     *     
     */
    public VINReferenceProgressifRoleType getVINReferenceProgressifRole() {
        return vinReferenceProgressifRole;
    }

    /**
     * Définit la valeur de la propriété vinReferenceProgressifRole.
     * 
     * @param value
     *     allowed object is
     *     {@link VINReferenceProgressifRoleType }
     *     
     */
    public void setVINReferenceProgressifRole(VINReferenceProgressifRoleType value) {
        this.vinReferenceProgressifRole = value;
    }

    /**
     * Obtient la valeur de la propriété vinNumeroChequiers.
     * 
     * @return
     *     possible object is
     *     {@link VINNumeroChequiersType }
     *     
     */
    public VINNumeroChequiersType getVINNumeroChequiers() {
        return vinNumeroChequiers;
    }

    /**
     * Définit la valeur de la propriété vinNumeroChequiers.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNumeroChequiersType }
     *     
     */
    public void setVINNumeroChequiers(VINNumeroChequiersType value) {
        this.vinNumeroChequiers = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateEffet.
     * 
     * @return
     *     possible object is
     *     {@link VINDateEffetType }
     *     
     */
    public VINDateEffetType getVINDateEffet() {
        return vinDateEffet;
    }

    /**
     * Définit la valeur de la propriété vinDateEffet.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateEffetType }
     *     
     */
    public void setVINDateEffet(VINDateEffetType value) {
        this.vinDateEffet = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateSortie.
     * 
     * @return
     *     possible object is
     *     {@link VINDateSortieType }
     *     
     */
    public VINDateSortieType getVINDateSortie() {
        return vinDateSortie;
    }

    /**
     * Définit la valeur de la propriété vinDateSortie.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateSortieType }
     *     
     */
    public void setVINDateSortie(VINDateSortieType value) {
        this.vinDateSortie = value;
    }

    /**
     * Obtient la valeur de la propriété vinStatutChequiers.
     * 
     * @return
     *     possible object is
     *     {@link VINStatutChequiersType }
     *     
     */
    public VINStatutChequiersType getVINStatutChequiers() {
        return vinStatutChequiers;
    }

    /**
     * Définit la valeur de la propriété vinStatutChequiers.
     * 
     * @param value
     *     allowed object is
     *     {@link VINStatutChequiersType }
     *     
     */
    public void setVINStatutChequiers(VINStatutChequiersType value) {
        this.vinStatutChequiers = value;
    }

    /**
     * Obtient la valeur de la propriété vinMontantChequier.
     * 
     * @return
     *     possible object is
     *     {@link VINMontantChequierType }
     *     
     */
    public VINMontantChequierType getVINMontantChequier() {
        return vinMontantChequier;
    }

    /**
     * Définit la valeur de la propriété vinMontantChequier.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMontantChequierType }
     *     
     */
    public void setVINMontantChequier(VINMontantChequierType value) {
        this.vinMontantChequier = value;
    }

    /**
     * Obtient la valeur de la propriété vinProduitAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VINProduitAffaireType }
     *     
     */
    public VINProduitAffaireType getVINProduitAffaire() {
        return vinProduitAffaire;
    }

    /**
     * Définit la valeur de la propriété vinProduitAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINProduitAffaireType }
     *     
     */
    public void setVINProduitAffaire(VINProduitAffaireType value) {
        this.vinProduitAffaire = value;
    }

    /**
     * Obtient la valeur de la propriété vinContentieux.
     * 
     * @return
     *     possible object is
     *     {@link VINContentieuxType }
     *     
     */
    public VINContentieuxType getVINContentieux() {
        return vinContentieux;
    }

    /**
     * Définit la valeur de la propriété vinContentieux.
     * 
     * @param value
     *     allowed object is
     *     {@link VINContentieuxType }
     *     
     */
    public void setVINContentieux(VINContentieuxType value) {
        this.vinContentieux = value;
    }

    /**
     * Obtient la valeur de la propriété vinNbrImpayes.
     * 
     * @return
     *     possible object is
     *     {@link VINNbrImpayesType }
     *     
     */
    public VINNbrImpayesType getVINNbrImpayes() {
        return vinNbrImpayes;
    }

    /**
     * Définit la valeur de la propriété vinNbrImpayes.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNbrImpayesType }
     *     
     */
    public void setVINNbrImpayes(VINNbrImpayesType value) {
        this.vinNbrImpayes = value;
    }

    /**
     * Obtient la valeur de la propriété vinNbrImpayes12.
     * 
     * @return
     *     possible object is
     *     {@link VINNbrImpayes12Type }
     *     
     */
    public VINNbrImpayes12Type getVINNbrImpayes12() {
        return vinNbrImpayes12;
    }

    /**
     * Définit la valeur de la propriété vinNbrImpayes12.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNbrImpayes12Type }
     *     
     */
    public void setVINNbrImpayes12(VINNbrImpayes12Type value) {
        this.vinNbrImpayes12 = value;
    }

    /**
     * Obtient la valeur de la propriété vinDatePremiereEcheance.
     * 
     * @return
     *     possible object is
     *     {@link VINDatePremiereEcheanceType }
     *     
     */
    public VINDatePremiereEcheanceType getVINDatePremiereEcheance() {
        return vinDatePremiereEcheance;
    }

    /**
     * Définit la valeur de la propriété vinDatePremiereEcheance.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDatePremiereEcheanceType }
     *     
     */
    public void setVINDatePremiereEcheance(VINDatePremiereEcheanceType value) {
        this.vinDatePremiereEcheance = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateCreationAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VINDateCreationAffaireType }
     *     
     */
    public VINDateCreationAffaireType getVINDateCreationAffaire() {
        return vinDateCreationAffaire;
    }

    /**
     * Définit la valeur de la propriété vinDateCreationAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateCreationAffaireType }
     *     
     */
    public void setVINDateCreationAffaire(VINDateCreationAffaireType value) {
        this.vinDateCreationAffaire = value;
    }

    /**
     * Obtient la valeur de la propriété vinCompensation.
     * 
     * @return
     *     possible object is
     *     {@link VINCompensationType }
     *     
     */
    public VINCompensationType getVINCompensation() {
        return vinCompensation;
    }

    /**
     * Définit la valeur de la propriété vinCompensation.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCompensationType }
     *     
     */
    public void setVINCompensation(VINCompensationType value) {
        this.vinCompensation = value;
    }

    /**
     * Obtient la valeur de la propriété vincrd.
     * 
     * @return
     *     possible object is
     *     {@link VINCRDType }
     *     
     */
    public VINCRDType getVINCRD() {
        return vincrd;
    }

    /**
     * Définit la valeur de la propriété vincrd.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCRDType }
     *     
     */
    public void setVINCRD(VINCRDType value) {
        this.vincrd = value;
    }

    /**
     * Obtient la valeur de la propriété vinsolde.
     * 
     * @return
     *     possible object is
     *     {@link VINSOLDEType }
     *     
     */
    public VINSOLDEType getVINSOLDE() {
        return vinsolde;
    }

    /**
     * Définit la valeur de la propriété vinsolde.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSOLDEType }
     *     
     */
    public void setVINSOLDE(VINSOLDEType value) {
        this.vinsolde = value;
    }

    /**
     * Obtient la valeur de la propriété vinStatutAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VINStatutAffaireType }
     *     
     */
    public VINStatutAffaireType getVINStatutAffaire() {
        return vinStatutAffaire;
    }

    /**
     * Définit la valeur de la propriété vinStatutAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINStatutAffaireType }
     *     
     */
    public void setVINStatutAffaire(VINStatutAffaireType value) {
        this.vinStatutAffaire = value;
    }

    /**
     * Obtient la valeur de la propriété vinMtPremiereEcheancheAncienneAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VINMtPremiereEcheancheAncienneAffaireType }
     *     
     */
    public VINMtPremiereEcheancheAncienneAffaireType getVINMtPremiereEcheancheAncienneAffaire() {
        return vinMtPremiereEcheancheAncienneAffaire;
    }

    /**
     * Définit la valeur de la propriété vinMtPremiereEcheancheAncienneAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMtPremiereEcheancheAncienneAffaireType }
     *     
     */
    public void setVINMtPremiereEcheancheAncienneAffaire(VINMtPremiereEcheancheAncienneAffaireType value) {
        this.vinMtPremiereEcheancheAncienneAffaire = value;
    }

    /**
     * Obtient la valeur de la propriété vinNbrIncidents.
     * 
     * @return
     *     possible object is
     *     {@link VINNbrIncidentsType }
     *     
     */
    public VINNbrIncidentsType getVINNbrIncidents() {
        return vinNbrIncidents;
    }

    /**
     * Définit la valeur de la propriété vinNbrIncidents.
     * 
     * @param value
     *     allowed object is
     *     {@link VINNbrIncidentsType }
     *     
     */
    public void setVINNbrIncidents(VINNbrIncidentsType value) {
        this.vinNbrIncidents = value;
    }

    /**
     * Obtient la valeur de la propriété vinLoyerEkip.
     * 
     * @return
     *     possible object is
     *     {@link VINLoyerEkipType }
     *     
     */
    public VINLoyerEkipType getVINLoyerEkip() {
        return vinLoyerEkip;
    }

    /**
     * Définit la valeur de la propriété vinLoyerEkip.
     * 
     * @param value
     *     allowed object is
     *     {@link VINLoyerEkipType }
     *     
     */
    public void setVINLoyerEkip(VINLoyerEkipType value) {
        this.vinLoyerEkip = value;
    }

    /**
     * Obtient la valeur de la propriété vinLoyerEkipComp.
     * 
     * @return
     *     possible object is
     *     {@link VINLoyerEkipCompType }
     *     
     */
    public VINLoyerEkipCompType getVINLoyerEkipComp() {
        return vinLoyerEkipComp;
    }

    /**
     * Définit la valeur de la propriété vinLoyerEkipComp.
     * 
     * @param value
     *     allowed object is
     *     {@link VINLoyerEkipCompType }
     *     
     */
    public void setVINLoyerEkipComp(VINLoyerEkipCompType value) {
        this.vinLoyerEkipComp = value;
    }

    /**
     * Obtient la valeur de la propriété vinLoyerFront.
     * 
     * @return
     *     possible object is
     *     {@link VINLoyerFrontType }
     *     
     */
    public VINLoyerFrontType getVINLoyerFront() {
        return vinLoyerFront;
    }

    /**
     * Définit la valeur de la propriété vinLoyerFront.
     * 
     * @param value
     *     allowed object is
     *     {@link VINLoyerFrontType }
     *     
     */
    public void setVINLoyerFront(VINLoyerFrontType value) {
        this.vinLoyerFront = value;
    }

    /**
     * Obtient la valeur de la propriété vinRoleAncienneAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VINRoleAncienneAffaireType }
     *     
     */
    public VINRoleAncienneAffaireType getVINRoleAncienneAffaire() {
        return vinRoleAncienneAffaire;
    }

    /**
     * Définit la valeur de la propriété vinRoleAncienneAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRoleAncienneAffaireType }
     *     
     */
    public void setVINRoleAncienneAffaire(VINRoleAncienneAffaireType value) {
        this.vinRoleAncienneAffaire = value;
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
     * Obtient la valeur de la propriété vindatefincontrat.
     * 
     * @return
     *     possible object is
     *     {@link VINDATEFINCONTRATType }
     *     
     */
    public VINDATEFINCONTRATType getVINDATEFINCONTRAT() {
        return vindatefincontrat;
    }

    /**
     * Définit la valeur de la propriété vindatefincontrat.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDATEFINCONTRATType }
     *     
     */
    public void setVINDATEFINCONTRAT(VINDATEFINCONTRATType value) {
        this.vindatefincontrat = value;
    }

    /**
     * Obtient la valeur de la propriété vinflagsinistre.
     * 
     * @return
     *     possible object is
     *     {@link VINFLAGSINISTREType }
     *     
     */
    public VINFLAGSINISTREType getVINFLAGSINISTRE() {
        return vinflagsinistre;
    }

    /**
     * Définit la valeur de la propriété vinflagsinistre.
     * 
     * @param value
     *     allowed object is
     *     {@link VINFLAGSINISTREType }
     *     
     */
    public void setVINFLAGSINISTRE(VINFLAGSINISTREType value) {
        this.vinflagsinistre = value;
    }

    /**
     * Obtient la valeur de la propriété vintypegarantie.
     * 
     * @return
     *     possible object is
     *     {@link VINTYPEGARANTIEType }
     *     
     */
    public VINTYPEGARANTIEType getVINTYPEGARANTIE() {
        return vintypegarantie;
    }

    /**
     * Définit la valeur de la propriété vintypegarantie.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTYPEGARANTIEType }
     *     
     */
    public void setVINTYPEGARANTIE(VINTYPEGARANTIEType value) {
        this.vintypegarantie = value;
    }

    /**
     * Obtient la valeur de la propriété vinmontantexpertise.
     * 
     * @return
     *     possible object is
     *     {@link VINMONTANTEXPERTISEType }
     *     
     */
    public VINMONTANTEXPERTISEType getVINMONTANTEXPERTISE() {
        return vinmontantexpertise;
    }

    /**
     * Définit la valeur de la propriété vinmontantexpertise.
     * 
     * @param value
     *     allowed object is
     *     {@link VINMONTANTEXPERTISEType }
     *     
     */
    public void setVINMONTANTEXPERTISE(VINMONTANTEXPERTISEType value) {
        this.vinmontantexpertise = value;
    }

    /**
     * Obtient la valeur de la propriété vindatecertificat.
     * 
     * @return
     *     possible object is
     *     {@link VINDATECERTIFICATType }
     *     
     */
    public VINDATECERTIFICATType getVINDATECERTIFICAT() {
        return vindatecertificat;
    }

    /**
     * Définit la valeur de la propriété vindatecertificat.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDATECERTIFICATType }
     *     
     */
    public void setVINDATECERTIFICAT(VINDATECERTIFICATType value) {
        this.vindatecertificat = value;
    }

    /**
     * Obtient la valeur de la propriété vinquotepartgr.
     * 
     * @return
     *     possible object is
     *     {@link VINQUOTEPARTGRType }
     *     
     */
    public VINQUOTEPARTGRType getVINQUOTEPARTGR() {
        return vinquotepartgr;
    }

    /**
     * Définit la valeur de la propriété vinquotepartgr.
     * 
     * @param value
     *     allowed object is
     *     {@link VINQUOTEPARTGRType }
     *     
     */
    public void setVINQUOTEPARTGR(VINQUOTEPARTGRType value) {
        this.vinquotepartgr = value;
    }

    /**
     * Obtient la valeur de la propriété vinvillebien.
     * 
     * @return
     *     possible object is
     *     {@link VINVILLEBIENType }
     *     
     */
    public VINVILLEBIENType getVINVILLEBIEN() {
        return vinvillebien;
    }

    /**
     * Définit la valeur de la propriété vinvillebien.
     * 
     * @param value
     *     allowed object is
     *     {@link VINVILLEBIENType }
     *     
     */
    public void setVINVILLEBIEN(VINVILLEBIENType value) {
        this.vinvillebien = value;
    }

    /**
     * Obtient la valeur de la propriété vinRangGarantie.
     * 
     * @return
     *     possible object is
     *     {@link VINRangGarantieType }
     *     
     */
    public VINRangGarantieType getVINRangGarantie() {
        return vinRangGarantie;
    }

    /**
     * Définit la valeur de la propriété vinRangGarantie.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRangGarantieType }
     *     
     */
    public void setVINRangGarantie(VINRangGarantieType value) {
        this.vinRangGarantie = value;
    }

    /**
     * Obtient la valeur de la propriété vintypecontrat.
     * 
     * @return
     *     possible object is
     *     {@link VINTYPECONTRATType }
     *     
     */
    public VINTYPECONTRATType getVINTYPECONTRAT() {
        return vintypecontrat;
    }

    /**
     * Définit la valeur de la propriété vintypecontrat.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTYPECONTRATType }
     *     
     */
    public void setVINTYPECONTRAT(VINTYPECONTRATType value) {
        this.vintypecontrat = value;
    }

    /**
     * Obtient la valeur de la propriété vinecheancerestante.
     * 
     * @return
     *     possible object is
     *     {@link VINECHEANCERESTANTEType }
     *     
     */
    public VINECHEANCERESTANTEType getVINECHEANCERESTANTE() {
        return vinecheancerestante;
    }

    /**
     * Définit la valeur de la propriété vinecheancerestante.
     * 
     * @param value
     *     allowed object is
     *     {@link VINECHEANCERESTANTEType }
     *     
     */
    public void setVINECHEANCERESTANTE(VINECHEANCERESTANTEType value) {
        this.vinecheancerestante = value;
    }

    /**
     * Obtient la valeur de la propriété vinonu.
     * 
     * @return
     *     possible object is
     *     {@link VINONUType }
     *     
     */
    public VINONUType getVINONU() {
        return vinonu;
    }

    /**
     * Définit la valeur de la propriété vinonu.
     * 
     * @param value
     *     allowed object is
     *     {@link VINONUType }
     *     
     */
    public void setVINONU(VINONUType value) {
        this.vinonu = value;
    }

    /**
     * Obtient la valeur de la propriété vinAnneeBilan.
     * 
     * @return
     *     possible object is
     *     {@link VINAnneeBilanType }
     *     
     */
    public VINAnneeBilanType getVINAnneeBilan() {
        return vinAnneeBilan;
    }

    /**
     * Définit la valeur de la propriété vinAnneeBilan.
     * 
     * @param value
     *     allowed object is
     *     {@link VINAnneeBilanType }
     *     
     */
    public void setVINAnneeBilan(VINAnneeBilanType value) {
        this.vinAnneeBilan = value;
    }

    /**
     * Obtient la valeur de la propriété vinctrlinforisk.
     * 
     * @return
     *     possible object is
     *     {@link VINCTRLINFORISKType }
     *     
     */
    public VINCTRLINFORISKType getVINCTRLINFORISK() {
        return vinctrlinforisk;
    }

    /**
     * Définit la valeur de la propriété vinctrlinforisk.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCTRLINFORISKType }
     *     
     */
    public void setVINCTRLINFORISK(VINCTRLINFORISKType value) {
        this.vinctrlinforisk = value;
    }

    /**
     * Obtient la valeur de la propriété vinstocks.
     * 
     * @return
     *     possible object is
     *     {@link VINSTOCKSType }
     *     
     */
    public VINSTOCKSType getVINSTOCKS() {
        return vinstocks;
    }

    /**
     * Définit la valeur de la propriété vinstocks.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSTOCKSType }
     *     
     */
    public void setVINSTOCKS(VINSTOCKSType value) {
        this.vinstocks = value;
    }

    /**
     * Obtient la valeur de la propriété vincreanceactifcirc.
     * 
     * @return
     *     possible object is
     *     {@link VINCREANCEACTIFCIRCType }
     *     
     */
    public VINCREANCEACTIFCIRCType getVINCREANCEACTIFCIRC() {
        return vincreanceactifcirc;
    }

    /**
     * Définit la valeur de la propriété vincreanceactifcirc.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCREANCEACTIFCIRCType }
     *     
     */
    public void setVINCREANCEACTIFCIRC(VINCREANCEACTIFCIRCType value) {
        this.vincreanceactifcirc = value;
    }

    /**
     * Obtient la valeur de la propriété vintresorerieactif.
     * 
     * @return
     *     possible object is
     *     {@link VINTRESORERIEACTIFType }
     *     
     */
    public VINTRESORERIEACTIFType getVINTRESORERIEACTIF() {
        return vintresorerieactif;
    }

    /**
     * Définit la valeur de la propriété vintresorerieactif.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTRESORERIEACTIFType }
     *     
     */
    public void setVINTRESORERIEACTIF(VINTRESORERIEACTIFType value) {
        this.vintresorerieactif = value;
    }

    /**
     * Obtient la valeur de la propriété vintotalactif.
     * 
     * @return
     *     possible object is
     *     {@link VINTOTALACTIFType }
     *     
     */
    public VINTOTALACTIFType getVINTOTALACTIF() {
        return vintotalactif;
    }

    /**
     * Définit la valeur de la propriété vintotalactif.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTOTALACTIFType }
     *     
     */
    public void setVINTOTALACTIF(VINTOTALACTIFType value) {
        this.vintotalactif = value;
    }

    /**
     * Obtient la valeur de la propriété vincapitauxpropres.
     * 
     * @return
     *     possible object is
     *     {@link VINCAPITAUXPROPRESType }
     *     
     */
    public VINCAPITAUXPROPRESType getVINCAPITAUXPROPRES() {
        return vincapitauxpropres;
    }

    /**
     * Définit la valeur de la propriété vincapitauxpropres.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCAPITAUXPROPRESType }
     *     
     */
    public void setVINCAPITAUXPROPRES(VINCAPITAUXPROPRESType value) {
        this.vincapitauxpropres = value;
    }

    /**
     * Obtient la valeur de la propriété vindettesfinancement.
     * 
     * @return
     *     possible object is
     *     {@link VINDETTESFINANCEMENTType }
     *     
     */
    public VINDETTESFINANCEMENTType getVINDETTESFINANCEMENT() {
        return vindettesfinancement;
    }

    /**
     * Définit la valeur de la propriété vindettesfinancement.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDETTESFINANCEMENTType }
     *     
     */
    public void setVINDETTESFINANCEMENT(VINDETTESFINANCEMENTType value) {
        this.vindettesfinancement = value;
    }

    /**
     * Obtient la valeur de la propriété vinprovisionrisquecharge.
     * 
     * @return
     *     possible object is
     *     {@link VINPROVISIONRISQUECHARGEType }
     *     
     */
    public VINPROVISIONRISQUECHARGEType getVINPROVISIONRISQUECHARGE() {
        return vinprovisionrisquecharge;
    }

    /**
     * Définit la valeur de la propriété vinprovisionrisquecharge.
     * 
     * @param value
     *     allowed object is
     *     {@link VINPROVISIONRISQUECHARGEType }
     *     
     */
    public void setVINPROVISIONRISQUECHARGE(VINPROVISIONRISQUECHARGEType value) {
        this.vinprovisionrisquecharge = value;
    }

    /**
     * Obtient la valeur de la propriété vinecartconvpassiffinpermanent.
     * 
     * @return
     *     possible object is
     *     {@link VINECARTCONVPASSIFFINPERMANENTType }
     *     
     */
    public VINECARTCONVPASSIFFINPERMANENTType getVINECARTCONVPASSIFFINPERMANENT() {
        return vinecartconvpassiffinpermanent;
    }

    /**
     * Définit la valeur de la propriété vinecartconvpassiffinpermanent.
     * 
     * @param value
     *     allowed object is
     *     {@link VINECARTCONVPASSIFFINPERMANENTType }
     *     
     */
    public void setVINECARTCONVPASSIFFINPERMANENT(VINECARTCONVPASSIFFINPERMANENTType value) {
        this.vinecartconvpassiffinpermanent = value;
    }

    /**
     * Obtient la valeur de la propriété vindettespassifcirc.
     * 
     * @return
     *     possible object is
     *     {@link VINDETTESPASSIFCIRCType }
     *     
     */
    public VINDETTESPASSIFCIRCType getVINDETTESPASSIFCIRC() {
        return vindettespassifcirc;
    }

    /**
     * Définit la valeur de la propriété vindettespassifcirc.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDETTESPASSIFCIRCType }
     *     
     */
    public void setVINDETTESPASSIFCIRC(VINDETTESPASSIFCIRCType value) {
        this.vindettespassifcirc = value;
    }

    /**
     * Obtient la valeur de la propriété vinautresprovisionrisquecharge.
     * 
     * @return
     *     possible object is
     *     {@link VINAUTRESPROVISIONRISQUECHARGEType }
     *     
     */
    public VINAUTRESPROVISIONRISQUECHARGEType getVINAUTRESPROVISIONRISQUECHARGE() {
        return vinautresprovisionrisquecharge;
    }

    /**
     * Définit la valeur de la propriété vinautresprovisionrisquecharge.
     * 
     * @param value
     *     allowed object is
     *     {@link VINAUTRESPROVISIONRISQUECHARGEType }
     *     
     */
    public void setVINAUTRESPROVISIONRISQUECHARGE(VINAUTRESPROVISIONRISQUECHARGEType value) {
        this.vinautresprovisionrisquecharge = value;
    }

    /**
     * Obtient la valeur de la propriété vinecartconvpassifcirc.
     * 
     * @return
     *     possible object is
     *     {@link VINECARTCONVPASSIFCIRCType }
     *     
     */
    public VINECARTCONVPASSIFCIRCType getVINECARTCONVPASSIFCIRC() {
        return vinecartconvpassifcirc;
    }

    /**
     * Définit la valeur de la propriété vinecartconvpassifcirc.
     * 
     * @param value
     *     allowed object is
     *     {@link VINECARTCONVPASSIFCIRCType }
     *     
     */
    public void setVINECARTCONVPASSIFCIRC(VINECARTCONVPASSIFCIRCType value) {
        this.vinecartconvpassifcirc = value;
    }

    /**
     * Obtient la valeur de la propriété vintotalpassifcirc.
     * 
     * @return
     *     possible object is
     *     {@link VINTOTALPASSIFCIRCType }
     *     
     */
    public VINTOTALPASSIFCIRCType getVINTOTALPASSIFCIRC() {
        return vintotalpassifcirc;
    }

    /**
     * Définit la valeur de la propriété vintotalpassifcirc.
     * 
     * @param value
     *     allowed object is
     *     {@link VINTOTALPASSIFCIRCType }
     *     
     */
    public void setVINTOTALPASSIFCIRC(VINTOTALPASSIFCIRCType value) {
        this.vintotalpassifcirc = value;
    }

    /**
     * Obtient la valeur de la propriété vinchiffreaffairen1.
     * 
     * @return
     *     possible object is
     *     {@link VINCHIFFREAFFAIREN1Type }
     *     
     */
    public VINCHIFFREAFFAIREN1Type getVINCHIFFREAFFAIREN1() {
        return vinchiffreaffairen1;
    }

    /**
     * Définit la valeur de la propriété vinchiffreaffairen1.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCHIFFREAFFAIREN1Type }
     *     
     */
    public void setVINCHIFFREAFFAIREN1(VINCHIFFREAFFAIREN1Type value) {
        this.vinchiffreaffairen1 = value;
    }

    /**
     * Obtient la valeur de la propriété vinchiffreaffairen0.
     * 
     * @return
     *     possible object is
     *     {@link VINCHIFFREAFFAIREN0Type }
     *     
     */
    public VINCHIFFREAFFAIREN0Type getVINCHIFFREAFFAIREN0() {
        return vinchiffreaffairen0;
    }

    /**
     * Définit la valeur de la propriété vinchiffreaffairen0.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCHIFFREAFFAIREN0Type }
     *     
     */
    public void setVINCHIFFREAFFAIREN0(VINCHIFFREAFFAIREN0Type value) {
        this.vinchiffreaffairen0 = value;
    }

    /**
     * Obtient la valeur de la propriété vinvariationstockpdt.
     * 
     * @return
     *     possible object is
     *     {@link VINVARIATIONSTOCKPDTType }
     *     
     */
    public VINVARIATIONSTOCKPDTType getVINVARIATIONSTOCKPDT() {
        return vinvariationstockpdt;
    }

    /**
     * Définit la valeur de la propriété vinvariationstockpdt.
     * 
     * @param value
     *     allowed object is
     *     {@link VINVARIATIONSTOCKPDTType }
     *     
     */
    public void setVINVARIATIONSTOCKPDT(VINVARIATIONSTOCKPDTType value) {
        this.vinvariationstockpdt = value;
    }

    /**
     * Obtient la valeur de la propriété vinautrespdtexpl.
     * 
     * @return
     *     possible object is
     *     {@link VINAUTRESPDTEXPLType }
     *     
     */
    public VINAUTRESPDTEXPLType getVINAUTRESPDTEXPL() {
        return vinautrespdtexpl;
    }

    /**
     * Définit la valeur de la propriété vinautrespdtexpl.
     * 
     * @param value
     *     allowed object is
     *     {@link VINAUTRESPDTEXPLType }
     *     
     */
    public void setVINAUTRESPDTEXPL(VINAUTRESPDTEXPLType value) {
        this.vinautrespdtexpl = value;
    }

    /**
     * Obtient la valeur de la propriété vinachatrevendumarchandise.
     * 
     * @return
     *     possible object is
     *     {@link VINACHATREVENDUMARCHANDISEType }
     *     
     */
    public VINACHATREVENDUMARCHANDISEType getVINACHATREVENDUMARCHANDISE() {
        return vinachatrevendumarchandise;
    }

    /**
     * Définit la valeur de la propriété vinachatrevendumarchandise.
     * 
     * @param value
     *     allowed object is
     *     {@link VINACHATREVENDUMARCHANDISEType }
     *     
     */
    public void setVINACHATREVENDUMARCHANDISE(VINACHATREVENDUMARCHANDISEType value) {
        this.vinachatrevendumarchandise = value;
    }

    /**
     * Obtient la valeur de la propriété vinachatconsmatierefourniture.
     * 
     * @return
     *     possible object is
     *     {@link VINACHATCONSMATIEREFOURNITUREType }
     *     
     */
    public VINACHATCONSMATIEREFOURNITUREType getVINACHATCONSMATIEREFOURNITURE() {
        return vinachatconsmatierefourniture;
    }

    /**
     * Définit la valeur de la propriété vinachatconsmatierefourniture.
     * 
     * @param value
     *     allowed object is
     *     {@link VINACHATCONSMATIEREFOURNITUREType }
     *     
     */
    public void setVINACHATCONSMATIEREFOURNITURE(VINACHATCONSMATIEREFOURNITUREType value) {
        this.vinachatconsmatierefourniture = value;
    }

    /**
     * Obtient la valeur de la propriété vindotationexploitationn1.
     * 
     * @return
     *     possible object is
     *     {@link VINDOTATIONEXPLOITATIONN1Type }
     *     
     */
    public VINDOTATIONEXPLOITATIONN1Type getVINDOTATIONEXPLOITATIONN1() {
        return vindotationexploitationn1;
    }

    /**
     * Définit la valeur de la propriété vindotationexploitationn1.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDOTATIONEXPLOITATIONN1Type }
     *     
     */
    public void setVINDOTATIONEXPLOITATIONN1(VINDOTATIONEXPLOITATIONN1Type value) {
        this.vindotationexploitationn1 = value;
    }

    /**
     * Obtient la valeur de la propriété vindotationexploitationn0.
     * 
     * @return
     *     possible object is
     *     {@link VINDOTATIONEXPLOITATIONN0Type }
     *     
     */
    public VINDOTATIONEXPLOITATIONN0Type getVINDOTATIONEXPLOITATIONN0() {
        return vindotationexploitationn0;
    }

    /**
     * Définit la valeur de la propriété vindotationexploitationn0.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDOTATIONEXPLOITATIONN0Type }
     *     
     */
    public void setVINDOTATIONEXPLOITATIONN0(VINDOTATIONEXPLOITATIONN0Type value) {
        this.vindotationexploitationn0 = value;
    }

    /**
     * Obtient la valeur de la propriété vinchargefin.
     * 
     * @return
     *     possible object is
     *     {@link VINCHARGEFINType }
     *     
     */
    public VINCHARGEFINType getVINCHARGEFIN() {
        return vinchargefin;
    }

    /**
     * Définit la valeur de la propriété vinchargefin.
     * 
     * @param value
     *     allowed object is
     *     {@link VINCHARGEFINType }
     *     
     */
    public void setVINCHARGEFIN(VINCHARGEFINType value) {
        this.vinchargefin = value;
    }

    /**
     * Obtient la valeur de la propriété vinresultatfin.
     * 
     * @return
     *     possible object is
     *     {@link VINRESULTATFINType }
     *     
     */
    public VINRESULTATFINType getVINRESULTATFIN() {
        return vinresultatfin;
    }

    /**
     * Définit la valeur de la propriété vinresultatfin.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRESULTATFINType }
     *     
     */
    public void setVINRESULTATFIN(VINRESULTATFINType value) {
        this.vinresultatfin = value;
    }

    /**
     * Obtient la valeur de la propriété vinresultatnetn1.
     * 
     * @return
     *     possible object is
     *     {@link VINRESULTATNETN1Type }
     *     
     */
    public VINRESULTATNETN1Type getVINRESULTATNETN1() {
        return vinresultatnetn1;
    }

    /**
     * Définit la valeur de la propriété vinresultatnetn1.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRESULTATNETN1Type }
     *     
     */
    public void setVINRESULTATNETN1(VINRESULTATNETN1Type value) {
        this.vinresultatnetn1 = value;
    }

    /**
     * Obtient la valeur de la propriété vinresultatnetn0.
     * 
     * @return
     *     possible object is
     *     {@link VINRESULTATNETN0Type }
     *     
     */
    public VINRESULTATNETN0Type getVINRESULTATNETN0() {
        return vinresultatnetn0;
    }

    /**
     * Définit la valeur de la propriété vinresultatnetn0.
     * 
     * @param value
     *     allowed object is
     *     {@link VINRESULTATNETN0Type }
     *     
     */
    public void setVINRESULTATNETN0(VINRESULTATNETN0Type value) {
        this.vinresultatnetn0 = value;
    }

    /**
     * Obtient la valeur de la propriété vinieaffaireold.
     * 
     * @return
     *     possible object is
     *     {@link VINIEAFFAIREOLDType }
     *     
     */
    public VINIEAFFAIREOLDType getVINIEAFFAIREOLD() {
        return vinieaffaireold;
    }

    /**
     * Définit la valeur de la propriété vinieaffaireold.
     * 
     * @param value
     *     allowed object is
     *     {@link VINIEAFFAIREOLDType }
     *     
     */
    public void setVINIEAFFAIREOLD(VINIEAFFAIREOLDType value) {
        this.vinieaffaireold = value;
    }

    /**
     * Obtient la valeur de la propriété vinFlagReport.
     * 
     * @return
     *     possible object is
     *     {@link VINFlagReportType }
     *     
     */
    public VINFlagReportType getVINFlagReport() {
        return vinFlagReport;
    }

    /**
     * Définit la valeur de la propriété vinFlagReport.
     * 
     * @param value
     *     allowed object is
     *     {@link VINFlagReportType }
     *     
     */
    public void setVINFlagReport(VINFlagReportType value) {
        this.vinFlagReport = value;
    }

    /**
     * Obtient la valeur de la propriété vinDateDernierIMP.
     * 
     * @return
     *     possible object is
     *     {@link VINDateDernierIMPType }
     *     
     */
    public VINDateDernierIMPType getVINDateDernierIMP() {
        return vinDateDernierIMP;
    }

    /**
     * Définit la valeur de la propriété vinDateDernierIMP.
     * 
     * @param value
     *     allowed object is
     *     {@link VINDateDernierIMPType }
     *     
     */
    public void setVINDateDernierIMP(VINDateDernierIMPType value) {
        this.vinDateDernierIMP = value;
    }

}
