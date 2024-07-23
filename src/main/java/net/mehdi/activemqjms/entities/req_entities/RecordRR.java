package net.mehdi.activemqjms.entities.req_entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "SINTEG_RQ_RECORDRR")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RecordRR {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sinteg_rq_recordrr_seq")
    @SequenceGenerator(name = "sinteg_rq_recordrr_seq", sequenceName = "SINTEG_RQ_RECORDRR_SEQ", allocationSize = 1)
    @Column(name = "RECORD_ID")
    private Long id;

    @Column(name = "VIN_Role")
    private String vinRole;

    @Column(name = "VIN_PROGRESSIF_ROLE")
    private Integer vinProgressifRole;

    @Column(name = "VIN_IDENTIFIANT_CLIENT")
    private String vinIdentifiantClient;

    @Column(name = "VIN_TYPE_CLIENT ")
    private String vinTypeClient;

    @Column(name = " VIN_FORME_JURIDIQUE  ")
    private String vinFormeJuridique;

    @Column(name = "VIN_PARTPM ")
    private Integer vinPartPM;

    @Column(name = "VIN_SEXE ")
    private String vinSexe;

    @Column(name = "VIN_Date_Naissance")
    private Date vinDateNaissance;

    @Column(name = "VIN_DATE_CREAT_ENTR")
    private Date vinDateCreatEntr;

    @Column(name = "VIN_NOUVEAU_CLIENTON")
    private String vinNouveauClientON;

    @Column(name = "VIN_NATIONALITE")
    private String vinNationalite;

    @Column(name = "VIN_DATE_EMBAUCHE")
    private Date vinDateEmbauche;

    @Column(name = "VIN_DATE_CREATIONRC")
    private Date vinDateCreationRC;

    @Column(name = "VIN_SITUATION_LOGEMENT")
    private String vinSituationLogement;

    @Column(name = "VIN_PROFESSION ")
    private String vinProfession;

    @Column(name = " VIN_CODE_ACTIVITE ")
    private String vinCodeActivite;

    @Column(name = "VVIN_DATE_INTEG_SCT")
    private Date vinDateIntegrationSociete;

    @Column(name = " VIN_CODE_VILLE")
    private String vinCodeVille;

    @Column(name = "VIN_CODE_BANQUE")
    private String vinCodeBanque;

    @Column(name = " VIN_DATE_RELATION_BANQUE")
    private Date vinDateRelationBanque;

    @Column(name = "VIN_NBR_ANCIENS_DOSSIERS")
    private Integer vinNbrAnciensDossiers;

    @Column(name = "VIN_BLACK_LIST")
    private String vinBlackList;

    @Column(name = "VIN_REVENUS_MENSUELS")
    private Double vinRevenusMensuels;

    @Column(name = "VIN_AUTRE_REVENUS")
    private Double vinAutreRevenus;

    @Column(name = "VIN_REVENU_CONJOINT")
    private Double vinRevenuConjoint;

    @Column(name = "VIN_AUTRE_CHARGES ")
    private Double vinAutreCharges;

    @Column(name = " VIN_CHARGE_IMM")
    private Double vinChargeImm;

    @Column(name = "VIN_CREDIT_LOGEMENT")
    private String vinCreditLogement;

    @Column(name = "VIN_MAX_NBR_IMPAYES")
    private Integer vinMaxNbrImpayes;

    @Column(name = " VIN_MT_IMPAYES")
    private Double vinMtImpayes;

    @Column(name = "VIN_MAX_NBR_MOIS_RETARD")
    private Integer vinMaxNbrMoisRetard;

    @Column(name = "VIN_TOTAL_MT_NEGATIVE")
    private Double vinTotalMtNegative;

    @Column(name = "VIN_SOLDE_INIT")
    private Double vinSoldeInit;

    @Column(name = "VIN_CREDITM1")
    private Double vinCreditM1;

    @Column(name = "VIN_CREDITM2")
    private Double vinCreditM2;

    @Column(name = "VIN_CREDITM3")
    private Double vinCreditM3;

    @Column(name = "VIN_DEBITM1")
    private Double vinDebitM1;

    @Column(name = "VIN_DEBITM2")
    private Double vinDebitM2;

    @Column(name = "VIN_DEBITM3")
    private Double vinDebitM3;

    @Column(name = "VIN_SOURCE")
    private String vinSource;

    @Column(name = "VIN_REFERENCE_PROG_ROLE")
    private Integer vinReferenceProgressifRole;

    @Column(name = "VIN_NUMERO_CHEQUIERS")
    private String vinNumeroChequiers;

    @Column(name = "VIN_DATE_EFFET")
    private Date vinDateEffet;

    @Column(name = "VIN_DATE_SORTIE")
    private Date vinDateSortie;

    @Column(name = "VIN_STATUT_CHEQUIERS")
    private String vinStatutChequiers;

    @Column(name = "VIN_MONTANT_CHEQUIER")
    private Double vinMontantChequier;

    @Column(name = "VIN_PRODUIT_AFFAIRE")
    private String vinProduitAffaire;

    @Column(name = "VIN_CONTENTIEUX")
    private String vinContentieux;

    @Column(name = "VIN_NBR_IMPAYES")
    private Integer vinNbrImpayes;

    @Column(name = "VIN_NBR_IMPAYES12")
    private Integer vinNbrImpayes12;

    @Column(name = "VIN_DATE_PREMIERE_ECHEANCE")
    private Date vinDatePremiereEcheance;

    @Column(name = "VIN_DATE_CREATION_AFFAIRE")
    private Date vinDateCreationAffaire;

    @Column(name = "VIN_COMPENSATION")
    private String vinCompensation;

    @Column(name = " VINCRD")
    private Double vinCRD;

    @Column(name = " VINSOLDE")
    private Double vinSolde;//////////////////////////////////////////

    @Column(name = "VIN_STATUT_AFFAIRE")
    private String vinStatutAffaire;

    @Column(name = "VIN_MT_PREM_ECHEA_ANC_AFF")
    private Double vinMtPremiereEcheancheAncienneAffaire;//////////////////////

    @Column(name = "VIN_NBR_INCIDENTS")
    private Integer vinNbrIncidents;

    @Column(name = "VIN_LOYER_EKIP")
    private Double vinLoyerEkip;/////////////////

    @Column(name = "VIN_LOYER_EKIP_COMP")
    private Double vinLoyerEkipComp;///////////////////

    @Column(name = "VIN_LOYER_FRONT")
    private Double vinLoyerFront;

    @Column(name = "VIN_ROLE_ANCIENNE_AFFAIRE")
    private String vinRoleAncienneAffaire;

    @Column(name = "VIN_MARCHE")
    private String vinMarche;

    @Column(name = "VIN_SEGMENT")
    private String vinSegment;

    @Column(name = "VIN_EMPLOYEUR")
    private String vinEmployeur;

    @Column(name = "VIN_FONCTION")
    private String vinFonction;

    @Column(name = "VINDATEFINCONTRAT")
    private Date vinDateFinContrat;

    @Column(name = "VINFLAGSINISTRE")
    private String vinFlagSinistre;

    @Column(name = "VIN_TYPE_GARANTIE")
    private String vinTypeGarantie;

    @Column(name = "VINMONTANTEXPERTISE")
    private Double vinMontantExpertise;

    @Column(name = "VINDATECERTIFICAT")
    private Date vinDateCertificat;

    @Column(name = "VINQUOTEPARTGR")
    private Double vinQuotePartGr;

    @Column(name = "VINVILLEBIEN")
    private String vinVilleBien;

    @Column(name = "VIN_RANG_GARANTIE")
    private Integer vinRangGarantie;

    @Column(name = "VINTYPECONTRAT")
    private String vinTypeContrat;

    @Column(name = "VINECHEANCERESTANTE")
    private Double vinEcheanceRestante;/////////////////////////

    @Column(name = "VINONU")
    private Double vinONU;

    @Column(name = "VIN_ANNEE_BILAN")
    private String vinAnneeBilan;

    @Column(name = "VIN_CTRL_INFORISK")
    private Integer vinCtrlInforisk;

    @Column(name = "VINSTOCKS")
    private Double vinStocks;

    @Column(name = "VINCREANCEACTIFCIRC")
    private Double vinCreanceActifCirc;

    @Column(name = "VINTRESORERIEACTIF")
    private Double vinTresorerieActif;

    @Column(name = "VINTOTALACTIF")
    private Double vinTotalActif;

    @Column(name = "VINCAPITAUXPROPRES")
    private Double vinCapitauxPropres;

    @Column(name = "VINDETTESFINANCEMENT")
    private Double vinDettesFinancement;

    @Column(name = "VINPROVRSQCHARGE")
    private Double vinProvisionRisqueCharge;

    @Column(name = "VINECACONVPASINPERMT")
    private Double vinEcartConvPassifFinPermanent;

    @Column(name = "VINDETTESPASSIFCIRC")
    private Double vinDettesPassifCirc;

    @Column(name = "VINAUTRESPROVRSQCHRG")
    private Double vinAutresProvisionRisqueCharge;

    @Column(name = "VINECARTCONVPASSIFCIRC")
    private Double vinEcartConvPassifCirc;

    @Column(name = "VINTOTALPASSIFCIRC")
    private Double vinTotalPassifCirc;

    @Column(name = "VINCHIFFREAFFAIREN1")
    private Double vinChiffreAffaireN1;

    @Column(name = "VINCHIFFREAFFAIREN0")
    private Double vinChiffreAffaireN0;

    @Column(name = "VINVARIATIONSTOCKPDT")
    private Double vinVariationStockPdt;

    @Column(name = "VINAUTRESPDTEXPL")
    private Double vinAutresPdtExpl;

    @Column(name = "VINACHATREVENMRCHNDSE")
    private Double vinAchatRevenduMarchandise;

    @Column(name = "VINACHATCONSMTRFRTURE")
    private Double vinAchatConsMatiereFourniture;

    @Column(name = "VINDOTATIONEXPN1")
    private Double vinDotationExploitationN1;

    @Column(name = "VINDOTATIONEXPN0")
    private Double vinDotationExploitationN0;

    @Column(name = "VINCHARGEFIN")
    private Double vinChargeFin;

    @Column(name = "VINRESULTATFIN")
    private Double vinResultatFin;

    @Column(name = "VINRESULTATNETN1")
    private Double vinResultatNetN1;

    @Column(name = "VINRESULTATNETN0")
    private Double vinResultatNetN0;

    @Column(name = "VIN_IE_AFFAIRE_OLD")
    private String vinIeAffaireOld;

    @Column(name = "VIN_FLAG_REPORT")
    private String vinFlagReport;

    @Column(name = "VIN_DATE_DERNIER_IMP")
    private Date vinDateDernierIMP;
    @ManyToOne
    @JoinColumn(name = "REQUEST_ID")
    private StrategyOneRequest strategyOneRequest;
}
