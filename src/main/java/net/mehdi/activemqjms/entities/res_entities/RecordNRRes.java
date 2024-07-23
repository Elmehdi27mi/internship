package net.mehdi.activemqjms.entities.res_entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "SINTEG_RSP_RECORDNR")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class RecordNRRes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sinteg_res_recordrr_seq")
    //@SequenceGenerator(name = "sinteg_res_recordrr_seq", sequenceName = "INTEG_RES_RECORDRR_SEQ", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR0")
    private String grilleClasseAffectVar0;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR1")
    private String grilleClasseAffectVar1;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR10")
    private String grilleClasseAffectVar10;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR11")
    private String grilleClasseAffectVar11;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR12")
    private String grilleClasseAffectVar12;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR13")
    private String grilleClasseAffectVar13;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR14")
    private String grilleClasseAffectVar14;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR15")
    private String grilleClasseAffectVar15;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR16")
    private String grilleClasseAffectVar16;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR17")
    private String grilleClasseAffectVar17;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR18")
    private String grilleClasseAffectVar18;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR19")
    private String grilleClasseAffectVar19;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR2")
    private String grilleClasseAffectVar2;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR20")
    private String grilleClasseAffectVar20;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR3")
    private String grilleClasseAffectVar3;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR4")
    private String grilleClasseAffectVar4;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR5")
    private String grilleClasseAffectVar5;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR6")
    private String grilleClasseAffectVar6;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR7")
    private String grilleClasseAffectVar7;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR8")
    private String grilleClasseAffectVar8;

    @Column(name = "GRILLE_CLASSE_AFFECT_VAR9")
    private String grilleClasseAffectVar9;


    @Column(name = "GRILLE_NOTE_VAR0")
    private Integer grilleNoteVar0;

    @Column(name = "GRILLE_NOTE_VAR1")
    private Integer grilleNoteVar1;

    @Column(name = "GRILLE_NOTE_VAR10")
    private Integer grilleNoteVar10;

    @Column(name = "GRILLE_NOTE_VAR11")
    private Integer grilleNoteVar11;

    @Column(name = "GRILLE_NOTE_VAR12")
    private Integer grilleNoteVar12;

    @Column(name = "GRILLE_NOTE_VAR13")
    private Integer grilleNoteVar13;

    @Column(name = "GRILLE_NOTE_VAR14")
    private Integer grilleNoteVar14;

    @Column(name = "GRILLE_NOTE_VAR15")
    private Integer grilleNoteVar15;

    @Column(name = "GRILLE_NOTE_VAR16")
    private Integer grilleNoteVar16;

    @Column(name = "GRILLE_NOTE_VAR17")
    private Integer grilleNoteVar17;

    @Column(name = "GRILLE_NOTE_VAR18")
    private Integer grilleNoteVar18;

    @Column(name = "GRILLE_NOTE_VAR19")
    private Integer grilleNoteVar19;

    @Column(name = "GRILLE_NOTE_VAR2")
    private Integer grilleNoteVar2;

    @Column(name = "GRILLE_NOTE_VAR20")
    private Integer grilleNoteVar20;

    @Column(name = "GRILLE_NOTE_VAR3")
    private Integer grilleNoteVar3;

    @Column(name = "GRILLE_NOTE_VAR4")
    private Integer grilleNoteVar4;

    @Column(name = "GRILLE_NOTE_VAR5")
    private Integer grilleNoteVar5;

    @Column(name = "GRILLE_NOTE_VAR6")
    private Integer grilleNoteVar6;

    @Column(name = "GRILLE_NOTE_VAR7")
    private Integer grilleNoteVar7;

    @Column(name = "GRILLE_NOTE_VAR8")
    private Integer grilleNoteVar8;

    @Column(name = "GRILLE_NOTE_VAR9")
    private Integer grilleNoteVar9;



    @Column(name = "GRILLE_VARIABLE0")
    private String grilleVariable0;

    @Column(name = "GRILLE_VARIABLE1")
    private String grilleVariable1;

    @Column(name = "GRILLE_VARIABLE10")
    private String grilleVariable10;

    @Column(name = "GRILLE_VARIABLE11")
    private String grilleVariable11;

    @Column(name = "GRILLE_VARIABLE12")
    private String grilleVariable12;

    @Column(name = "GRILLE_VARIABLE13")
    private String grilleVariable13;

    @Column(name = "GRILLE_VARIABLE14")
    private String grilleVariable14;

    @Column(name = "GRILLE_VARIABLE15")
    private String grilleVariable15;

    @Column(name = "GRILLE_VARIABLE16")
    private String grilleVariable16;

    @Column(name = "GRILLE_VARIABLE17")
    private String grilleVariable17;

    @Column(name = "GRILLE_VARIABLE18")
    private String grilleVariable18;

    @Column(name = "GRILLE_VARIABLE19")
    private String grilleVariable19;

    @Column(name = "GRILLE_VARIABLE2")
    private String grilleVariable2;

    @Column(name = "GRILLE_VARIABLE20")
    private String grilleVariable20;

    @Column(name = "GRILLE_VARIABLE3")
    private String grilleVariable3;

    @Column(name = "GRILLE_VARIABLE4")
    private String grilleVariable4;

    @Column(name = "GRILLE_VARIABLE5")
    private String grilleVariable5;

    @Column(name = "GRILLE_VARIABLE6")
    private String grilleVariable6;

    @Column(name = "GRILLE_VARIABLE7")
    private String grilleVariable7;

    @Column(name = "GRILLE_VARIABLE8")
    private String grilleVariable8;

    @Column(name = "GRILLE_VARIABLE9")
    private String grilleVariable9;



    @Column(name = "GRILLEALIGNED")
    private Integer grilleAligned;

    @Column(name = "GRILLEOBJCODE")
    private String grilleObjCode;

    @Column(name = "GRILLERAW")
    private Integer grilleRaw;

    @Column(name = "NOTATIONFIN", nullable = false)
    private Double notationFin;

    @Column(name = "NOTATIONFIN0100", nullable = false)
    private Double notationFin0100;

    @Column(name = "NOTATIONHOM", nullable = false)
    private Double notationHom;

    @Column(name = "NOTATIONHOM0100", nullable = false)
    private Double notationHom0100;

    @Column(name = "NOTE_SCOREOPPM", nullable = false)
    private Double noteScoreOppm;

    @Column(name = "RCSO001")
    private String rcso001;

    @Column(name = "RCSO002")
    private String rcso002;

    @Column(name = "RCSO003")
    private String rcso003;

    @Column(name = "RCSO003FORCAGEABB")
    private String rcso003ForcageAbb;

    @Column(name = "RCSO004")
    private String rcso004;

    @Column(name = "RCSO004FORCAGEABB")
    private String rcso004ForcageAbb;

    @Column(name = "RCSO005")
    private String rcso005;

    @Column(name = "RCSO006")
    private String rcso006;

    @Column(name = "RCSO007")
    private String rcso007;

    @Column(name = "RCSO008")
    private String rcso008;

    @Column(name = "RCSO009")
    private String rcso009;

    @Column(name = "RCSO051")
    private String rcso051;

    @Column(name = "RCSO052")
    private String rcso052;

    @Column(name = "RCSO053")
    private String rcso053;

    @Column(name = "RCSO054")
    private String rcso054;

    @Column(name = "RCSO055")
    private String rcso055;

    @Column(name = "RCSO056")
    private String rcso056;

    @Column(name = "RCSO057")
    private String rcso057;

    @Column(name = "RCSO058")
    private String rcso058;

    @Column(name = "RCSO059")
    private String rcso059;

    @Column(name = "RCSO060")
    private String rcso060;

    @Column(name = "RMSO001")
    private String rmso001;

    @Column(name = "RMSO002")
    private String rmso002;

    @Column(name = "RMSO003")
    private String rmso003;

    @Column(name = "RMSO003FORCAGEABB")
    private String rmso003ForcageAbb;

    @Column(name = "RMSO004")
    private String rmso004;

    @Column(name = "RMSO004FORCAGEABB")
    private String rmso004ForcageAbb;

    @Column(name = "RMSO005")
    private String rmso005;

    @Column(name = "RMSO006")
    private String rmso006;

    @Column(name = "RMSO007")
    private String rmso007;

    @Column(name = "RMSO008")
    private String rmso008;

    @Column(name = "RMSO009")
    private String rmso009;

    @Column(name = "RMSO051")
    private String rmso051;

    @Column(name = "RMSO052")
    private String rmso052;

    @Column(name = "RMSO053")
    private String rmso053;

    @Column(name = "RMSO054")
    private String rmso054;

    @Column(name = "RMSO055")
    private String rmso055;

    @Column(name = "RMSO056")
    private String rmso056;

    @Column(name = "RMSO057")
    private String rmso057;

    @Column(name = "RMSO058")
    private String rmso058;

    @Column(name = "RMSO059")
    private String rmso059;

    @Column(name = "RMSO060")
    private String rmso060;



    @Column(name = "SCORATING", nullable = false)
    private Double scOrating;

    @Column(name = "SCOREOP", nullable = false)
    private Double scoreOp;

    @Column(name = "SCORERAT", nullable = false)
    private Double scoreRat;

    @Column(name = "VOUT_AGE_VEHICULE", nullable = false)
    private Double voutAgeVehicule;

    @Column(name = "VOUT_AGE_VEHICULE_DUREE", nullable = false)
    private Double voutAgeVehiculeDuree;

    @Column(name = "VOUT_ANCI_ACTIVITE_ENTR")
    private Double voutAnciActiviteEntr;

    @Column(name = "VOUT_CATEGORIE_AFFAIRE")
    private String voutCategorieAffaire;

    @Column(name = "VOUT_CODE_AGENCE")
    private String voutCodeAgence;

    @Column(name = "VOUT_CODE_NIVEAU_POUVOIR")
    private String voutCodeNiveauPouvoir;

    @Column(name = "VOUT_COHERENCE")
    private String voutCoherence;

    @Column(name = "VOUT_DATE_DEMANDE")
    private Date voutDateDemande;

    @Column(name = "VOUT_DECISION_FINALE")
    private String voutDecisionFinale;

    @Column(name = "VOUT_DEC_FIN_FORCAGEABB")
    private String voutDecFinForcageAbb;

    @Column(name = "VOUT_DEC_PROPOS_AJUSTE")
    private String voutDecProposAjuste;

    @Column(name = "VOUT_DUREE_AJUSTE", nullable = false)
    private Double voutDureeAjuste;

    @Column(name = "VOUT_DUREE_DEMANDE")
    private Integer voutDureeDemande;

    @Column(name = "VOUT_ENCOURS_CLIENTFUTUR", nullable = false)
    private Double voutEncoursClientFutur;

    @Column(name = "VOUT_FLAG_GARANTIE")
    private String voutFlagGarantie;

    @Column(name = "VOUT_MENSUALITE_AJUSTE", nullable = false)
    private Double voutMensualiteAjuste;

    @Column(name = "VOUT_MENSUALITE_DEMANDE", nullable = false)
    private Double voutMensualiteDemande;

    @Column(name = "VOUT_MONTANT_AJUSTE", nullable = false)
    private Double voutMontantAjuste;

    @Column(name = "VOUT_MONTANT_DEMANDE", nullable = false)
    private Double voutMontantDemande;

    @Column(name = "VOUT_NIVEAU_POUVOIR")
    private String voutNiveauPouvoir;

    @Column(name = "VOUT_OUTPUT_REGLES")
    private String voutOutputRegles;

    @Column(name = "VOUT_OUT_REGL_FORCAGEABB")
    private String voutOutReglForcageAbb;

    @Column(name = "VOUT_RANDOM_NUMBER")
    private String voutRandomNumber;

    @Column(name = "VOUT_SCORE")
    private String voutScore;

    @Column(name = "VOUT_SOCIETE_GESTION")
    private String voutSocieteGestion;

    @Column(name = "VOUT_TAUX_APPORT", nullable = false)
    private Double voutTauxApport;

    @Column(name = "VOUTNUM_DEMANDE")
    private String voutNumDemande;

    @Column(name = "VOUTNUMLANCEMENT")
    private Integer voutNumLancement;

}
