package net.mehdi.activemqjms.entities.presCore.res_entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "SPRES_RSP_RECORDNR")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class RecordNRPresRes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "spres_res_recordnr_seq")
    @SequenceGenerator(name = "spres_res_recordnr_seq", sequenceName = "SPRES_RES_RECORDNR_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id ;

    @Column(name = "CAPACITEEND", nullable = false)
    private Double capaciteEnd;

    @Column(name = "CODE_IDENTIFIANT")
    private String codeIdentifiant;

    @Column(name = "DECISION_OFFRE_MAX")
    private String decisionOffreMax;

    @Column(name = "DUREE_MAX")
    private Integer dureeMax;

    @Column(name = "FLAG_COHERANCE_MARCHE")
    private String flagCoheranceMarche;

    @Column(name = "MENSUALITE_OFFRE_MAX", nullable = false)
    private Double mensualiteOffreMax;

    @Column(name = "OFFRE_MAX", nullable = false)
    private Double offreMax;

    @Column(name = "VOUT_CHARGE", nullable = false)
    private Double voutCharge;

    @Column(name = "VOUT_FONCTION")
    private String voutFonction;

    @Column(name = "VOUT_MARCHE")
    private String voutMarche;

    @Column(name = "VOUT_PROFESSION")
    private String voutProfession;

    @Column(name = "VOUT_REVENU", nullable = false)
    private Double voutRevenu;

    @Column(name = "VOUT_SEGMENT")
    private String voutSegment;

    @Column(name = "VOUT_SOCIETE_GESTION")
    private String voutSocieteGestion;

}

