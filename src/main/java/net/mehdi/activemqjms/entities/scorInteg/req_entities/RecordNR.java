package net.mehdi.activemqjms.entities.scorInteg.req_entities;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import lombok.*;

import java.util.Date;
@Entity
@Table(name = "SINTEG_RQ_RECORDNR")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class RecordNR {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sinteg_rq_recordnr_seq")
    @SequenceGenerator(name = "sinteg_rq_recordnr_seq", sequenceName = "SINTEG_RQ_RECORDNR_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "VIN_SOCIETE_GESTION")
    private String vinSocieteGestion;

    @Column(name = "VIN_DATE_DEMANDE")
    private Date vinDateDemande;

    @Column(name = "VIN_NUMERO_DEMANDE")
    private String vinNumeroDemande;

    @Column(name = "VIN_Code_Agence")
    private String vinCodeAgence;

    @Column(name = "VIN_CATEGORIE_AFFAIRE")
    private String vinCategorieAffaire;

    @Column(name = "VIN_TYPE_PRELEVEMENT")
    private String vinTypePrelevement;

    @Column(name = "VIN_MONTANT_DEMANDE")
    private Double vinMontantDemande;

    @Column(name = "VIN_DUREE_DEMANDE")
    private Integer vinDureeDemande;

    @Column(name = "VIN_MENSUALITE_DEMANDE")
    private Double vinMensualiteDemande;

    @Column(name = "VIN_PREM_LOYER")
    private Double vinPremLoyer;

    @Column(name = "VIN_Montant_Apport")
    private Double vinMontantApport;

    @Column(name = "VIN_PRIX_VEHICULE")
    private Double vinPrixVehicule;

    @Column(name = "VIN_DATE_MISE_CIRC")
    private Date vinDateMiseCirc;

    @Column(name = "VIN_TAUX_INTERET")
    private Double vinTauxInteret;

    @Column(name = "VIN_DEPOT_GARANTIE")
    private Double vinDepotGarantie;

    @Column(name = "VINNUMLANCEMENT")
    private Integer vinNumLancement;

    @Column(name = "VIN_ECHEANCE_RESERVATION")
    private Double vinEcheanceReservation;

    @Column(name = "VIN_ECHEANCE_CONFIRMATION")
    private Double vinEcheanceConfirmation;

    @Column(name = "VIN_DATE_RESERVATION")
    private Date vinDateReservation;

    @Column(name = "VIN_DATE_CONFIRMATION")
    private Date vinDateConfirmation;

    @Column(name = "VIN_CODE_FOURNISSEUR")
    private String vinCodeFournisseur;

    @Column(name = "VIN_CODE_GESTIONNAIRE")
    private String vinCodeGestionnaire;

    @Column(name = "VIN_FLAG_FLOTTE")
    private String vinFlagFlotte;

    @Column(name = "VIN_PRIX_VENTE_CATALOGUE")
    private Double vinPrixVenteCatalogue;

    @Column(name = "VIN_MARQUE")
    private String vinMarque;

    @Column(name = "VIN_GENRE")
    private String vinGenre;

    @Column(name = "VIN_GAMME")
    private String vinGamme;

}
