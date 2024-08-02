package net.mehdi.activemqjms.entities.presCore.req_entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "SPRES_RQ_RECORDNR")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RecordNRPres {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "spres_rq_recordnr_seq")
    @SequenceGenerator(name = "spres_rq_recordnr_seq", sequenceName = "SPRES_RQ_RECORDNR_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODE_IDENTIFIANT")
    private String codeIdentifiant;

    @Column(name = "VIN_CATEGORIE_AFFAIRE")
    private String vinCategorieAffaire;

    @Column(name = "VIN_CHARGE", nullable = false)
    private Double vinCharge;

    @Column(name = "VIN_DATE_DEMANDE")
    private Date vinDateDemande;

    @Column(name = "VIN_DATE_NAISSANCE")
    private Date vinDateNaissance;

    @Column(name = "VIN_DUREE")
    private Integer vinDuree;

    @Column(name = "VIN_EMPLOYEUR")
    private String vinEmployeur;

    @Column(name = "VIN_FONCTION")
    private String vinFonction;

    @Column(name = "VIN_MARCHE")
    private String vinMarche;

    @Column(name = "VIN_MENSUALITE")
    private Double vinMensualite;

    @Column(name = "VIN_MONTANT_DEMANDE")
    private Double vinMontantDemande;

    @Column(name = "VIN_PROFESSION")
    private String vinProfession;

    @Column(name = "VIN_REVENU")
    private Double vinRevenu;

    @Column(name = "VIN_SEGMENT")
    private String vinSegment;

    @Column(name = "VIN_SOCIETE_GESTION")
    private String vinSocieteGestion;

    @Column(name = "VIN_TAUX_INTERET", nullable = false)
    private Double vinTauxInteret;
}

