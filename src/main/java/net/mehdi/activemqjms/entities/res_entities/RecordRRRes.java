package net.mehdi.activemqjms.entities.res_entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "SINTEG_RSP_RECORDRR")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class RecordRRRes {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sinteg_res_recordrr_seq")
    @SequenceGenerator(name = "sinteg_res_recordrr_seq", sequenceName = "SINTEG_RES_RECORDRR_SEQ", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "RCMO010")
    private String rcmo010;

    @Column(name = "RCMO011")
    private String rcmo011;

    @Column(name = "RCMO012")
    private String rcmo012;

    @Column(name = "RCMO013")
    private String rcmo013;

    @Column(name = "RCMO014")
    private String rcmo014;

    @Column(name = "RCMO015")
    private String rcmo015;

    @Column(name = "RCMO016")
    private String rcmo016;

    @Column(name = "RCMO017")
    private String rcmo017;

    @Column(name = "RCMO018")
    private String rcmo018;

    @Column(name = "RCMO019")
    private String rcmo019;

    @Column(name = "RCMO020")
    private String rcmo020;

    @Column(name = "RCMO021")
    private String rcmo021;

    @Column(name = "RCMO021FORCAGEABB")
    private String rcmo021ForcageAbb;

    @Column(name = "RCMO022")
    private String rcmo022;

    @Column(name = "RCMO023")
    private String rcmo023;

    @Column(name = "RCMO024")
    private String rcmo024;

    @Column(name = "RCMO025")
    private String rcmo025;

    @Column(name = "RCMO026")
    private String rcmo026;

    @Column(name = "RCMO027")
    private String rcmo027;

    @Column(name = "RCMO028")
    private String rcmo028;

    @Column(name = "RCMO029")
    private String rcmo029;

    @Column(name = "RCMO030")
    private String rcmo030;

    @Column(name = "RCMO031")
    private String rcmo031;

    @Column(name = "RCMO032")
    private String rcmo032;

    @Column(name = "RCMO033")
    private String rcmo033;

    @Column(name = "RCMO034")
    private String rcmo034;

    @Column(name = "RCMO035")
    private String rcmo035;

    @Column(name = "RCMO036")
    private String rcmo036;

    @Column(name = "RCMO037")
    private String rcmo037;

    @Column(name = "RCMO038")
    private String rcmo038;

    @Column(name = "RCMO039")
    private String rcmo039;

    @Column(name = "RCMO040")
    private String rcmo040;

    @Column(name = "RCMO041")
    private String rcmo041;

    @Column(name = "RCMO042")
    private String rcmo042;

    @Column(name = "RCMO043")
    private String rcmo043;

    @Column(name = "RCMO044")
    private String rcmo044;

    @Column(name = "RCMO045")
    private String rcmo045;

    @Column(name = "RCMO046")
    private String rcmo046;

    @Column(name = "RCMO047")
    private String rcmo047;

    @Column(name = "RCMO048")
    private String rcmo048;

    @Column(name = "RCMO049")
    private String rcmo049;

    @Column(name = "RCMO050")
    private String rcmo050;

    @Column(name = "RMMO010")
    private String rmmo010;

    @Column(name = "RMMO011")
    private String rmmo011;

    @Column(name = "RMMO012")
    private String rmmo012;

    @Column(name = "RMMO013")
    private String rmmo013;

    @Column(name = "RMMO014")
    private String rmmo014;

    @Column(name = "RMMO015")
    private String rmmo015;

    @Column(name = "RMMO016")
    private String rmmo016;

    @Column(name = "RMMO017")
    private String rmmo017;

    @Column(name = "RMMO018")
    private String rmmo018;

    @Column(name = "RMMO019")
    private String rmmo019;

    @Column(name = "RMMO020")
    private String rmmo020;

    @Column(name = "RMMO021")
    private String rmmo021;

    @Column(name = "RMMO021FORCAGEABB")
    private String rmmo021ForcageAbb;

    @Column(name = "RMMO022")
    private String rmmo022;

    @Column(name = "RMMO023")
    private String rmmo023;

    @Column(name = "RMMO024")
    private String rmmo024;

    @Column(name = "RMMO025")
    private String rmmo025;

    @Column(name = "RMMO026")
    private String rmmo026;

    @Column(name = "RMMO027")
    private String rmmo027;

    @Column(name = "RMMO028")
    private String rmmo028;

    @Column(name = "RMMO029")
    private String rmmo029;

    @Column(name = "RMMO030")
    private String rmmo030;

    @Column(name = "RMMO031")
    private String rmmo031;

    @Column(name = "RMMO032")
    private String rmmo032;

    @Column(name = "RMMO033")
    private String rmmo033;

    @Column(name = "RMMO034")
    private String rmmo034;

    @Column(name = "RMMO035")
    private String rmmo035;

    @Column(name = "RMMO036")
    private String rmmo036;

    @Column(name = "RMMO037")
    private String rmmo037;

    @Column(name = "RMMO038")
    private String rmmo038;

    @Column(name = "RMMO039")
    private String rmmo039;

    @Column(name = "RMMO040")
    private String rmmo040;

    @Column(name = "RMMO041")
    private String rmmo041;

    @Column(name = "RMMO042")
    private String rmmo042;

    @Column(name = "RMMO043")
    private String rmmo043;

    @Column(name = "RMMO044")
    private String rmmo044;

    @Column(name = "RMMO045")
    private String rmmo045;

    @Column(name = "RMMO046")
    private String rmmo046;

    @Column(name = "RMMO047")
    private String rmmo047;

    @Column(name = "RMMO048")
    private String rmmo048;

    @Column(name = "RMMO049")
    private String rmmo049;

    @Column(name = "RMMO050")
    private String rmmo050;

    @Column(name = "VOUT_AGE", nullable = false)
    private Double voutAge;

    @Column(name = "VOUT_AGE_DUREE_PRET", nullable = false)
    private Double voutAgeDureePret;

    @Column(name = "VOUT_ANCIENNETE_ACT_PART")
    private Double voutAncienneteActPart;

    @Column(name = "VOUT_ANCIENNETE_BANCAIRE", nullable = false)
    private Double voutAncienneteBancaire;

    @Column(name = "VOUT_ANCIENNETE_TETE_SOCI")
    private Double voutAncienneteTeteSoci;

    @Column(name = "VOUT_CODE_BANQUE")
    private String voutCodeBanque;

    @Column(name = "VOUT_EMPLOYEUR")
    private String voutEmployeur;

    @Column(name = "VOUT_ENCOURS_ANCIENNE_AFF")
    private Double voutEncoursAncienneAff;

    @Column(name = "VOUT_ENCOURS_CLIENTHISTO", nullable = false)
    private Double voutEncoursClientHisto;

    @Column(name = "VOUT_ENCOURS_COMPENSEES", nullable = false)
    private Double voutEncoursCompensees;

    @Column(name = "VOUT_ENCOURS_PRODUITASSU", nullable = false)
    private Double voutEncoursProduitAssu;

    @Column(name = "VOUT_ENCOURS_PRODUITAUTO", nullable = false)
    private Double voutEncoursProduitAuto;

    @Column(name = "VOUT_ENCOURS_PRODUITEDM", nullable = false)
    private Double voutEncoursProduitEdm;

    @Column(name = "VOUT_ENCOURS_PRODUITMOU", nullable = false)
    private Double voutEncoursProduitMou;

    @Column(name = "VOUT_ENCOURS_PRODUITPP", nullable = false)
    private Double voutEncoursProduitPp;




    @Column(name = "VOUT_FICHAGE_CHEQUIERS_ANN")
    private Double voutFichageChequiersAnn;

    @Column(name = "VOUT_FICHAGE_CHEQUIERS_ECHU", nullable = false)
    private Double voutFichageChequiersEchu;

    @Column(name = "VOUT_FICHAGE_CHEQU_ENCOURS")
    private Double voutFichageChequEnCours;

    @Column(name = "VOUT_FICHAGE_CHEQUIERS_REGU")
    private Double voutFichageChequiersRegu;

    @Column(name = "VOUT_IDENTIFIANT_CLIENT")
    private String voutIdentifiantClient;

    @Column(name = "VOUT_IMPAYE_FLAG")
    private String voutImpayeFlag;

    @Column(name = "VOUT_MARCHE")
    private String voutMarche;

    @Column(name = "VOUT_MINIMUM_VITAL", nullable = false)
    private Double voutMinimumVital;

    @Column(name = "VOUT_MONTANT_REVENU", nullable = false)
    private Double voutMontantRevenu;

    @Column(name = "VOUT_MOUVEMENTS_CREDIT")
    private Double voutMouvementsCredit;

    @Column(name = "VOUT_NBR_IMPAYES")
    private Integer voutNbrImpayes;

    @Column(name = "VOUT_NBR_IMPAYES12")
    private Integer voutNbrImpayes12;

    @Column(name = "VOUT_NBR_INCIDENTS")
    private Integer voutNbrIncidents;

    @Column(name = "VOUT_NOUVEAU_CLIENTON")
    private String voutNouveauClienton;

    @Column(name = "VOUT_PROFESSION")
    private String voutProfession;

    @Column(name = "VOUT_REVENU_TOTAL", nullable = false)
    private Double voutRevenuTotal;

    @Column(name = "VOUT_ROLE")
    private String voutRole;

    @Column(name = "VOUT_SEGMENT")
    private String voutSegment;

    @Column(name = "VOUT_SEXE")
    private String voutSexe;

    @Column(name = "VOUT_SITUATION_LOGEMENT")
    private String voutSituationLogement;

    @Column(name = "VOUT_SOLDE_IMPAYES", nullable = false)
    private Double voutSoldeImpayes;

    @Column(name = "VOUT_SOLDE_MOYEN3MOIS", nullable = false)
    private Double voutSoldeMoyen3mois;

    @Column(name = "VOUT_TAUX_ENDETTEMENT", nullable = false)
    private Double voutTauxEndettement;

    @Column(name = "VOUT_TEMPORISATION", nullable = false)
    private Double voutTemporisation;

    @Column(name = "VOUT_TYPE_CLIENT")
    private String voutTypeClient;

    @Column(name = "VOUTCSP")
    private String voutCsp;

    @Column(name = "VOUTCSP_CODE")
    private String voutCspCode;

    @ManyToOne
    @JoinColumn(name = "RESPONSE_ID")
    private StrategyOneResponse strategyOneResponse;
}
