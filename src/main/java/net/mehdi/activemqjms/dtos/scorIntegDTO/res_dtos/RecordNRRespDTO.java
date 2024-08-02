
package net.mehdi.activemqjms.dtos.scorIntegDTO.res_dtos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RecordNRType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RecordNRType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VOUT_Societe_Gestion" type="{}VOUT_Societe_GestionType"/&gt;
 *         &lt;element name="VOUT_Date_Demande" type="{}VOUT_Date_DemandeType"/&gt;
 *         &lt;element name="VOUT_Code_Agence" type="{}VOUT_Code_AgenceType"/&gt;
 *         &lt;element name="VOUT_Random_Number" type="{}VOUT_Random_NumberType"/&gt;
 *         &lt;element name="VOUT_Numero_Demande" type="{}VOUT_Numero_DemandeType"/&gt;
 *         &lt;element name="VOUT_Categorie_Affaire" type="{}VOUT_Categorie_AffaireType"/&gt;
 *         &lt;element name="VOUT_Montant_Demande" type="{}VOUT_Montant_DemandeType"/&gt;
 *         &lt;element name="VOUT_Duree_Demande" type="{}VOUT_Duree_DemandeType"/&gt;
 *         &lt;element name="VOUT_Mensualite_Demande" type="{}VOUT_Mensualite_DemandeType"/&gt;
 *         &lt;element name="VOUT_Flag_Garantie" type="{}VOUT_Flag_GarantieType"/&gt;
 *         &lt;element name="VOUT_NUM_LANCEMENT" type="{}VOUT_NUM_LANCEMENTType"/&gt;
 *         &lt;element name="GRILLE_ALIGNED" type="{}GRILLE_ALIGNEDType"/&gt;
 *         &lt;element name="GRILLE_OBJCODE" type="{}GRILLE_OBJCODEType"/&gt;
 *         &lt;element name="GRILLE_RAW" type="{}GRILLE_RAWType"/&gt;
 *         &lt;element name="NOTATION_FIN" type="{}NOTATION_FINType"/&gt;
 *         &lt;element name="NOTATION_FIN_0_100" type="{}NOTATION_FIN_0_100Type"/&gt;
 *         &lt;element name="NOTATION_HOM" type="{}NOTATION_HOMType"/&gt;
 *         &lt;element name="NOTATION_HOM_0_100" type="{}NOTATION_HOM_0_100Type"/&gt;
 *         &lt;element name="Score_RAT" type="{}Score_RATType"/&gt;
 *         &lt;element name="Note_Score_OP_PM" type="{}Note_Score_OP_PMType"/&gt;
 *         &lt;element name="Score_OP" type="{}Score_OPType"/&gt;
 *         &lt;element name="Scorating" type="{}ScoratingType"/&gt;
 *         &lt;element name="GRILLE_Variable_0" type="{}GRILLE_Variable_0Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_0" type="{}GRILLE_Classe_affectee_var_0Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_0" type="{}GRILLE_Note_var_0Type"/&gt;
 *         &lt;element name="GRILLE_Variable_1" type="{}GRILLE_Variable_1Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_1" type="{}GRILLE_Classe_affectee_var_1Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_1" type="{}GRILLE_Note_var_1Type"/&gt;
 *         &lt;element name="GRILLE_Variable_2" type="{}GRILLE_Variable_2Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_2" type="{}GRILLE_Classe_affectee_var_2Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_2" type="{}GRILLE_Note_var_2Type"/&gt;
 *         &lt;element name="GRILLE_Variable_3" type="{}GRILLE_Variable_3Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_3" type="{}GRILLE_Classe_affectee_var_3Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_3" type="{}GRILLE_Note_var_3Type"/&gt;
 *         &lt;element name="GRILLE_Variable_4" type="{}GRILLE_Variable_4Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_4" type="{}GRILLE_Classe_affectee_var_4Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_4" type="{}GRILLE_Note_var_4Type"/&gt;
 *         &lt;element name="GRILLE_Variable_5" type="{}GRILLE_Variable_5Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_5" type="{}GRILLE_Classe_affectee_var_5Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_5" type="{}GRILLE_Note_var_5Type"/&gt;
 *         &lt;element name="GRILLE_Variable_6" type="{}GRILLE_Variable_6Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_6" type="{}GRILLE_Classe_affectee_var_6Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_6" type="{}GRILLE_Note_var_6Type"/&gt;
 *         &lt;element name="GRILLE_Variable_7" type="{}GRILLE_Variable_7Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_7" type="{}GRILLE_Classe_affectee_var_7Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_7" type="{}GRILLE_Note_var_7Type"/&gt;
 *         &lt;element name="GRILLE_Variable_8" type="{}GRILLE_Variable_8Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_8" type="{}GRILLE_Classe_affectee_var_8Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_8" type="{}GRILLE_Note_var_8Type"/&gt;
 *         &lt;element name="GRILLE_Variable_9" type="{}GRILLE_Variable_9Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_9" type="{}GRILLE_Classe_affectee_var_9Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_9" type="{}GRILLE_Note_var_9Type"/&gt;
 *         &lt;element name="GRILLE_Variable_10" type="{}GRILLE_Variable_10Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_10" type="{}GRILLE_Classe_affectee_var_10Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_10" type="{}GRILLE_Note_var_10Type"/&gt;
 *         &lt;element name="GRILLE_Variable_11" type="{}GRILLE_Variable_11Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_11" type="{}GRILLE_Classe_affectee_var_11Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_11" type="{}GRILLE_Note_var_11Type"/&gt;
 *         &lt;element name="GRILLE_Variable_12" type="{}GRILLE_Variable_12Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_12" type="{}GRILLE_Classe_affectee_var_12Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_12" type="{}GRILLE_Note_var_12Type"/&gt;
 *         &lt;element name="GRILLE_Variable_13" type="{}GRILLE_Variable_13Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_13" type="{}GRILLE_Classe_affectee_var_13Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_13" type="{}GRILLE_Note_var_13Type"/&gt;
 *         &lt;element name="GRILLE_Variable_14" type="{}GRILLE_Variable_14Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_14" type="{}GRILLE_Classe_affectee_var_14Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_14" type="{}GRILLE_Note_var_14Type"/&gt;
 *         &lt;element name="GRILLE_Variable_15" type="{}GRILLE_Variable_15Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_15" type="{}GRILLE_Classe_affectee_var_15Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_15" type="{}GRILLE_Note_var_15Type"/&gt;
 *         &lt;element name="GRILLE_Variable_16" type="{}GRILLE_Variable_16Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_16" type="{}GRILLE_Classe_affectee_var_16Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_16" type="{}GRILLE_Note_var_16Type"/&gt;
 *         &lt;element name="GRILLE_Variable_17" type="{}GRILLE_Variable_17Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_17" type="{}GRILLE_Classe_affectee_var_17Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_17" type="{}GRILLE_Note_var_17Type"/&gt;
 *         &lt;element name="GRILLE_Variable_18" type="{}GRILLE_Variable_18Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_18" type="{}GRILLE_Classe_affectee_var_18Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_18" type="{}GRILLE_Note_var_18Type"/&gt;
 *         &lt;element name="GRILLE_Variable_19" type="{}GRILLE_Variable_19Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_19" type="{}GRILLE_Classe_affectee_var_19Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_19" type="{}GRILLE_Note_var_19Type"/&gt;
 *         &lt;element name="GRILLE_Variable_20" type="{}GRILLE_Variable_20Type"/&gt;
 *         &lt;element name="GRILLE_Classe_affectee_var_20" type="{}GRILLE_Classe_affectee_var_20Type"/&gt;
 *         &lt;element name="GRILLE_Note_var_20" type="{}GRILLE_Note_var_20Type"/&gt;
 *         &lt;element name="VOUT_Coherence" type="{}VOUT_CoherenceType"/&gt;
 *         &lt;element name="VOUT_Score" type="{}VOUT_ScoreType"/&gt;
 *         &lt;element name="VOUT_Output_Regles" type="{}VOUT_Output_ReglesType"/&gt;
 *         &lt;element name="VOUT_Output_Regles_Forcage_ABB" type="{}VOUT_Output_Regles_Forcage_ABBType"/&gt;
 *         &lt;element name="VOUT_Decision_Finale" type="{}VOUT_Decision_FinaleType"/&gt;
 *         &lt;element name="VOUT_Decision_Finale_Forcage_ABB" type="{}VOUT_Decision_Finale_Forcage_ABBType"/&gt;
 *         &lt;element name="VOUT_Niveau_Pouvoir" type="{}VOUT_Niveau_PouvoirType"/&gt;
 *         &lt;element name="VOUT_Code_Niveau_Pouvoir" type="{}VOUT_Code_Niveau_PouvoirType"/&gt;
 *         &lt;element name="VOUT_Decision_Proposition_Ajuste" type="{}VOUT_Decision_Proposition_AjusteType"/&gt;
 *         &lt;element name="VOUT_Montant_Ajuste" type="{}VOUT_Montant_AjusteType"/&gt;
 *         &lt;element name="VOUT_Mensualite_Ajuste" type="{}VOUT_Mensualite_AjusteType"/&gt;
 *         &lt;element name="VOUT_Duree_Ajuste" type="{}VOUT_Duree_AjusteType"/&gt;
 *         &lt;element name="VOUT_Anciennete_Activite_Entr" type="{}VOUT_Anciennete_Activite_EntrType"/&gt;
 *         &lt;element name="VOUT_Taux_Apport" type="{}VOUT_Taux_ApportType"/&gt;
 *         &lt;element name="VOUT_Age_Vehicule" type="{}VOUT_Age_VehiculeType"/&gt;
 *         &lt;element name="VOUT_Encours_Client_FUTUR" type="{}VOUT_Encours_Client_FUTURType"/&gt;
 *         &lt;element name="VOUT_Age_Vehicule_Duree" type="{}VOUT_Age_Vehicule_DureeType"/&gt;
 *         &lt;element name="RC_SO_001" type="{}RC_SO_001Type"/&gt;
 *         &lt;element name="RM_SO_001" type="{}RM_SO_001Type"/&gt;
 *         &lt;element name="RC_SO_002" type="{}RC_SO_002Type"/&gt;
 *         &lt;element name="RM_SO_002" type="{}RM_SO_002Type"/&gt;
 *         &lt;element name="RC_SO_003" type="{}RC_SO_003Type"/&gt;
 *         &lt;element name="RM_SO_003" type="{}RM_SO_003Type"/&gt;
 *         &lt;element name="RC_SO_003_ForcageABB" type="{}RC_SO_003_ForcageABBType"/&gt;
 *         &lt;element name="RM_SO_003_ForcageABB" type="{}RM_SO_003_ForcageABBType"/&gt;
 *         &lt;element name="RC_SO_004" type="{}RC_SO_004Type"/&gt;
 *         &lt;element name="RM_SO_004" type="{}RM_SO_004Type"/&gt;
 *         &lt;element name="RC_SO_004_ForcageABB" type="{}RC_SO_004_ForcageABBType"/&gt;
 *         &lt;element name="RM_SO_004_ForcageABB" type="{}RM_SO_004_ForcageABBType"/&gt;
 *         &lt;element name="RC_SO_005" type="{}RC_SO_005Type"/&gt;
 *         &lt;element name="RM_SO_005" type="{}RM_SO_005Type"/&gt;
 *         &lt;element name="RC_SO_006" type="{}RC_SO_006Type"/&gt;
 *         &lt;element name="RM_SO_006" type="{}RM_SO_006Type"/&gt;
 *         &lt;element name="RC_SO_007" type="{}RC_SO_007Type"/&gt;
 *         &lt;element name="RM_SO_007" type="{}RM_SO_007Type"/&gt;
 *         &lt;element name="RC_SO_008" type="{}RC_SO_008Type"/&gt;
 *         &lt;element name="RM_SO_008" type="{}RM_SO_008Type"/&gt;
 *         &lt;element name="RC_SO_009" type="{}RC_SO_009Type"/&gt;
 *         &lt;element name="RM_SO_009" type="{}RM_SO_009Type"/&gt;
 *         &lt;element name="RC_SO_051" type="{}RC_SO_051Type"/&gt;
 *         &lt;element name="RM_SO_051" type="{}RM_SO_051Type"/&gt;
 *         &lt;element name="RC_SO_052" type="{}RC_SO_052Type"/&gt;
 *         &lt;element name="RM_SO_052" type="{}RM_SO_052Type"/&gt;
 *         &lt;element name="RC_SO_053" type="{}RC_SO_053Type"/&gt;
 *         &lt;element name="RM_SO_053" type="{}RM_SO_053Type"/&gt;
 *         &lt;element name="RC_SO_054" type="{}RC_SO_054Type"/&gt;
 *         &lt;element name="RM_SO_054" type="{}RM_SO_054Type"/&gt;
 *         &lt;element name="RC_SO_055" type="{}RC_SO_055Type"/&gt;
 *         &lt;element name="RM_SO_055" type="{}RM_SO_055Type"/&gt;
 *         &lt;element name="RC_SO_056" type="{}RC_SO_056Type"/&gt;
 *         &lt;element name="RM_SO_056" type="{}RM_SO_056Type"/&gt;
 *         &lt;element name="RC_SO_057" type="{}RC_SO_057Type"/&gt;
 *         &lt;element name="RM_SO_057" type="{}RM_SO_057Type"/&gt;
 *         &lt;element name="RC_SO_058" type="{}RC_SO_058Type"/&gt;
 *         &lt;element name="RM_SO_058" type="{}RM_SO_058Type"/&gt;
 *         &lt;element name="RC_SO_059" type="{}RC_SO_059Type"/&gt;
 *         &lt;element name="RM_SO_059" type="{}RM_SO_059Type"/&gt;
 *         &lt;element name="RC_SO_060" type="{}RC_SO_060Type"/&gt;
 *         &lt;element name="RM_SO_060" type="{}RM_SO_060Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordNRType", propOrder = {
    "voutSocieteGestion",
    "voutDateDemande",
    "voutCodeAgence",
    "voutRandomNumber",
    "voutNumeroDemande",
    "voutCategorieAffaire",
    "voutMontantDemande",
    "voutDureeDemande",
    "voutMensualiteDemande",
    "voutFlagGarantie",
    "voutnumlancement",
    "grillealigned",
    "grilleobjcode",
    "grilleraw",
    "notationfin",
    "notationfin0100",
    "notationhom",
    "notationhom0100",
    "scoreRAT",
    "noteScoreOPPM",
    "scoreOP",
    "scorating",
    "grilleVariable0",
    "grilleClasseAffecteeVar0",
    "grilleNoteVar0",
    "grilleVariable1",
    "grilleClasseAffecteeVar1",
    "grilleNoteVar1",
    "grilleVariable2",
    "grilleClasseAffecteeVar2",
    "grilleNoteVar2",
    "grilleVariable3",
    "grilleClasseAffecteeVar3",
    "grilleNoteVar3",
    "grilleVariable4",
    "grilleClasseAffecteeVar4",
    "grilleNoteVar4",
    "grilleVariable5",
    "grilleClasseAffecteeVar5",
    "grilleNoteVar5",
    "grilleVariable6",
    "grilleClasseAffecteeVar6",
    "grilleNoteVar6",
    "grilleVariable7",
    "grilleClasseAffecteeVar7",
    "grilleNoteVar7",
    "grilleVariable8",
    "grilleClasseAffecteeVar8",
    "grilleNoteVar8",
    "grilleVariable9",
    "grilleClasseAffecteeVar9",
    "grilleNoteVar9",
    "grilleVariable10",
    "grilleClasseAffecteeVar10",
    "grilleNoteVar10",
    "grilleVariable11",
    "grilleClasseAffecteeVar11",
    "grilleNoteVar11",
    "grilleVariable12",
    "grilleClasseAffecteeVar12",
    "grilleNoteVar12",
    "grilleVariable13",
    "grilleClasseAffecteeVar13",
    "grilleNoteVar13",
    "grilleVariable14",
    "grilleClasseAffecteeVar14",
    "grilleNoteVar14",
    "grilleVariable15",
    "grilleClasseAffecteeVar15",
    "grilleNoteVar15",
    "grilleVariable16",
    "grilleClasseAffecteeVar16",
    "grilleNoteVar16",
    "grilleVariable17",
    "grilleClasseAffecteeVar17",
    "grilleNoteVar17",
    "grilleVariable18",
    "grilleClasseAffecteeVar18",
    "grilleNoteVar18",
    "grilleVariable19",
    "grilleClasseAffecteeVar19",
    "grilleNoteVar19",
    "grilleVariable20",
    "grilleClasseAffecteeVar20",
    "grilleNoteVar20",
    "voutCoherence",
    "voutScore",
    "voutOutputRegles",
    "voutOutputReglesForcageABB",
    "voutDecisionFinale",
    "voutDecisionFinaleForcageABB",
    "voutNiveauPouvoir",
    "voutCodeNiveauPouvoir",
    "voutDecisionPropositionAjuste",
    "voutMontantAjuste",
    "voutMensualiteAjuste",
    "voutDureeAjuste",
    "voutAncienneteActiviteEntr",
    "voutTauxApport",
    "voutAgeVehicule",
    "voutEncoursClientFUTUR",
    "voutAgeVehiculeDuree",
    "rcso001",
    "rmso001",
    "rcso002",
    "rmso002",
    "rcso003",
    "rmso003",
    "rcso003ForcageABB",
    "rmso003ForcageABB",
    "rcso004",
    "rmso004",
    "rcso004ForcageABB",
    "rmso004ForcageABB",
    "rcso005",
    "rmso005",
    "rcso006",
    "rmso006",
    "rcso007",
    "rmso007",
    "rcso008",
    "rmso008",
    "rcso009",
    "rmso009",
    "rcso051",
    "rmso051",
    "rcso052",
    "rmso052",
    "rcso053",
    "rmso053",
    "rcso054",
    "rmso054",
    "rcso055",
    "rmso055",
    "rcso056",
    "rmso056",
    "rcso057",
    "rmso057",
    "rcso058",
    "rmso058",
    "rcso059",
    "rmso059",
    "rcso060",
    "rmso060"
})
public class RecordNRRespDTO {

    @XmlElement(name = "VOUT_Societe_Gestion", required = true)
    protected VOUTSocieteGestionType voutSocieteGestion;
    @XmlElement(name = "VOUT_Date_Demande", required = true)
    protected VOUTDateDemandeType voutDateDemande;
    @XmlElement(name = "VOUT_Code_Agence", required = true)
    protected VOUTCodeAgenceType voutCodeAgence;
    @XmlElement(name = "VOUT_Random_Number", required = true)
    protected VOUTRandomNumberType voutRandomNumber;
    @XmlElement(name = "VOUT_Numero_Demande", required = true)
    protected VOUTNumeroDemandeType voutNumeroDemande;
    @XmlElement(name = "VOUT_Categorie_Affaire", required = true)
    protected VOUTCategorieAffaireType voutCategorieAffaire;
    @XmlElement(name = "VOUT_Montant_Demande", required = true)
    protected VOUTMontantDemandeType voutMontantDemande;
    @XmlElement(name = "VOUT_Duree_Demande", required = true)
    protected VOUTDureeDemandeType voutDureeDemande;
    @XmlElement(name = "VOUT_Mensualite_Demande", required = true)
    protected VOUTMensualiteDemandeType voutMensualiteDemande;
    @XmlElement(name = "VOUT_Flag_Garantie", required = true)
    protected VOUTFlagGarantieType voutFlagGarantie;
    @XmlElement(name = "VOUT_NUM_LANCEMENT", required = true)
    protected VOUTNUMLANCEMENTType voutnumlancement;
    @XmlElement(name = "GRILLE_ALIGNED", required = true)
    protected GRILLEALIGNEDType grillealigned;
    @XmlElement(name = "GRILLE_OBJCODE", required = true)
    protected GRILLEOBJCODEType grilleobjcode;
    @XmlElement(name = "GRILLE_RAW", required = true)
    protected GRILLERAWType grilleraw;
    @XmlElement(name = "NOTATION_FIN", required = true)
    protected NOTATIONFINType notationfin;
    @XmlElement(name = "NOTATION_FIN_0_100", required = true)
    protected NOTATIONFIN0100Type notationfin0100;
    @XmlElement(name = "NOTATION_HOM", required = true)
    protected NOTATIONHOMType notationhom;
    @XmlElement(name = "NOTATION_HOM_0_100", required = true)
    protected NOTATIONHOM0100Type notationhom0100;
    @XmlElement(name = "Score_RAT", required = true)
    protected ScoreRATType scoreRAT;
    @XmlElement(name = "Note_Score_OP_PM", required = true)
    protected NoteScoreOPPMType noteScoreOPPM;
    @XmlElement(name = "Score_OP", required = true)
    protected ScoreOPType scoreOP;
    @XmlElement(name = "Scorating", required = true)
    protected ScoratingType scorating;
    @XmlElement(name = "GRILLE_Variable_0", required = true)
    protected GRILLEVariable0Type grilleVariable0;
    @XmlElement(name = "GRILLE_Classe_affectee_var_0", required = true)
    protected GRILLEClasseAffecteeVar0Type grilleClasseAffecteeVar0;
    @XmlElement(name = "GRILLE_Note_var_0", required = true)
    protected GRILLENoteVar0Type grilleNoteVar0;
    @XmlElement(name = "GRILLE_Variable_1", required = true)
    protected GRILLEVariable1Type grilleVariable1;
    @XmlElement(name = "GRILLE_Classe_affectee_var_1", required = true)
    protected GRILLEClasseAffecteeVar1Type grilleClasseAffecteeVar1;
    @XmlElement(name = "GRILLE_Note_var_1", required = true)
    protected GRILLENoteVar1Type grilleNoteVar1;
    @XmlElement(name = "GRILLE_Variable_2", required = true)
    protected GRILLEVariable2Type grilleVariable2;
    @XmlElement(name = "GRILLE_Classe_affectee_var_2", required = true)
    protected GRILLEClasseAffecteeVar2Type grilleClasseAffecteeVar2;
    @XmlElement(name = "GRILLE_Note_var_2", required = true)
    protected GRILLENoteVar2Type grilleNoteVar2;
    @XmlElement(name = "GRILLE_Variable_3", required = true)
    protected GRILLEVariable3Type grilleVariable3;
    @XmlElement(name = "GRILLE_Classe_affectee_var_3", required = true)
    protected GRILLEClasseAffecteeVar3Type grilleClasseAffecteeVar3;
    @XmlElement(name = "GRILLE_Note_var_3", required = true)
    protected GRILLENoteVar3Type grilleNoteVar3;
    @XmlElement(name = "GRILLE_Variable_4", required = true)
    protected GRILLEVariable4Type grilleVariable4;
    @XmlElement(name = "GRILLE_Classe_affectee_var_4", required = true)
    protected GRILLEClasseAffecteeVar4Type grilleClasseAffecteeVar4;
    @XmlElement(name = "GRILLE_Note_var_4", required = true)
    protected GRILLENoteVar4Type grilleNoteVar4;
    @XmlElement(name = "GRILLE_Variable_5", required = true)
    protected GRILLEVariable5Type grilleVariable5;
    @XmlElement(name = "GRILLE_Classe_affectee_var_5", required = true)
    protected GRILLEClasseAffecteeVar5Type grilleClasseAffecteeVar5;
    @XmlElement(name = "GRILLE_Note_var_5", required = true)
    protected GRILLENoteVar5Type grilleNoteVar5;
    @XmlElement(name = "GRILLE_Variable_6", required = true)
    protected GRILLEVariable6Type grilleVariable6;
    @XmlElement(name = "GRILLE_Classe_affectee_var_6", required = true)
    protected GRILLEClasseAffecteeVar6Type grilleClasseAffecteeVar6;
    @XmlElement(name = "GRILLE_Note_var_6", required = true)
    protected GRILLENoteVar6Type grilleNoteVar6;
    @XmlElement(name = "GRILLE_Variable_7", required = true)
    protected GRILLEVariable7Type grilleVariable7;
    @XmlElement(name = "GRILLE_Classe_affectee_var_7", required = true)
    protected GRILLEClasseAffecteeVar7Type grilleClasseAffecteeVar7;
    @XmlElement(name = "GRILLE_Note_var_7", required = true)
    protected GRILLENoteVar7Type grilleNoteVar7;
    @XmlElement(name = "GRILLE_Variable_8", required = true)
    protected GRILLEVariable8Type grilleVariable8;
    @XmlElement(name = "GRILLE_Classe_affectee_var_8", required = true)
    protected GRILLEClasseAffecteeVar8Type grilleClasseAffecteeVar8;
    @XmlElement(name = "GRILLE_Note_var_8", required = true)
    protected GRILLENoteVar8Type grilleNoteVar8;
    @XmlElement(name = "GRILLE_Variable_9", required = true)
    protected GRILLEVariable9Type grilleVariable9;
    @XmlElement(name = "GRILLE_Classe_affectee_var_9", required = true)
    protected GRILLEClasseAffecteeVar9Type grilleClasseAffecteeVar9;
    @XmlElement(name = "GRILLE_Note_var_9", required = true)
    protected GRILLENoteVar9Type grilleNoteVar9;
    @XmlElement(name = "GRILLE_Variable_10", required = true)
    protected GRILLEVariable10Type grilleVariable10;
    @XmlElement(name = "GRILLE_Classe_affectee_var_10", required = true)
    protected GRILLEClasseAffecteeVar10Type grilleClasseAffecteeVar10;
    @XmlElement(name = "GRILLE_Note_var_10", required = true)
    protected GRILLENoteVar10Type grilleNoteVar10;
    @XmlElement(name = "GRILLE_Variable_11", required = true)
    protected GRILLEVariable11Type grilleVariable11;
    @XmlElement(name = "GRILLE_Classe_affectee_var_11", required = true)
    protected GRILLEClasseAffecteeVar11Type grilleClasseAffecteeVar11;
    @XmlElement(name = "GRILLE_Note_var_11", required = true)
    protected GRILLENoteVar11Type grilleNoteVar11;
    @XmlElement(name = "GRILLE_Variable_12", required = true)
    protected GRILLEVariable12Type grilleVariable12;
    @XmlElement(name = "GRILLE_Classe_affectee_var_12", required = true)
    protected GRILLEClasseAffecteeVar12Type grilleClasseAffecteeVar12;
    @XmlElement(name = "GRILLE_Note_var_12", required = true)
    protected GRILLENoteVar12Type grilleNoteVar12;
    @XmlElement(name = "GRILLE_Variable_13", required = true)
    protected GRILLEVariable13Type grilleVariable13;
    @XmlElement(name = "GRILLE_Classe_affectee_var_13", required = true)
    protected GRILLEClasseAffecteeVar13Type grilleClasseAffecteeVar13;
    @XmlElement(name = "GRILLE_Note_var_13", required = true)
    protected GRILLENoteVar13Type grilleNoteVar13;
    @XmlElement(name = "GRILLE_Variable_14", required = true)
    protected GRILLEVariable14Type grilleVariable14;
    @XmlElement(name = "GRILLE_Classe_affectee_var_14", required = true)
    protected GRILLEClasseAffecteeVar14Type grilleClasseAffecteeVar14;
    @XmlElement(name = "GRILLE_Note_var_14", required = true)
    protected GRILLENoteVar14Type grilleNoteVar14;
    @XmlElement(name = "GRILLE_Variable_15", required = true)
    protected GRILLEVariable15Type grilleVariable15;
    @XmlElement(name = "GRILLE_Classe_affectee_var_15", required = true)
    protected GRILLEClasseAffecteeVar15Type grilleClasseAffecteeVar15;
    @XmlElement(name = "GRILLE_Note_var_15", required = true)
    protected GRILLENoteVar15Type grilleNoteVar15;
    @XmlElement(name = "GRILLE_Variable_16", required = true)
    protected GRILLEVariable16Type grilleVariable16;
    @XmlElement(name = "GRILLE_Classe_affectee_var_16", required = true)
    protected GRILLEClasseAffecteeVar16Type grilleClasseAffecteeVar16;
    @XmlElement(name = "GRILLE_Note_var_16", required = true)
    protected GRILLENoteVar16Type grilleNoteVar16;
    @XmlElement(name = "GRILLE_Variable_17", required = true)
    protected GRILLEVariable17Type grilleVariable17;
    @XmlElement(name = "GRILLE_Classe_affectee_var_17", required = true)
    protected GRILLEClasseAffecteeVar17Type grilleClasseAffecteeVar17;
    @XmlElement(name = "GRILLE_Note_var_17", required = true)
    protected GRILLENoteVar17Type grilleNoteVar17;
    @XmlElement(name = "GRILLE_Variable_18", required = true)
    protected GRILLEVariable18Type grilleVariable18;
    @XmlElement(name = "GRILLE_Classe_affectee_var_18", required = true)
    protected GRILLEClasseAffecteeVar18Type grilleClasseAffecteeVar18;
    @XmlElement(name = "GRILLE_Note_var_18", required = true)
    protected GRILLENoteVar18Type grilleNoteVar18;
    @XmlElement(name = "GRILLE_Variable_19", required = true)
    protected GRILLEVariable19Type grilleVariable19;
    @XmlElement(name = "GRILLE_Classe_affectee_var_19", required = true)
    protected GRILLEClasseAffecteeVar19Type grilleClasseAffecteeVar19;
    @XmlElement(name = "GRILLE_Note_var_19", required = true)
    protected GRILLENoteVar19Type grilleNoteVar19;
    @XmlElement(name = "GRILLE_Variable_20", required = true)
    protected GRILLEVariable20Type grilleVariable20;
    @XmlElement(name = "GRILLE_Classe_affectee_var_20", required = true)
    protected GRILLEClasseAffecteeVar20Type grilleClasseAffecteeVar20;
    @XmlElement(name = "GRILLE_Note_var_20", required = true)
    protected GRILLENoteVar20Type grilleNoteVar20;
    @XmlElement(name = "VOUT_Coherence", required = true)
    protected VOUTCoherenceType voutCoherence;
    @XmlElement(name = "VOUT_Score", required = true)
    protected VOUTScoreType voutScore;
    @XmlElement(name = "VOUT_Output_Regles", required = true)
    protected VOUTOutputReglesType voutOutputRegles;
    @XmlElement(name = "VOUT_Output_Regles_Forcage_ABB", required = true)
    protected VOUTOutputReglesForcageABBType voutOutputReglesForcageABB;
    @XmlElement(name = "VOUT_Decision_Finale", required = true)
    protected VOUTDecisionFinaleType voutDecisionFinale;
    @XmlElement(name = "VOUT_Decision_Finale_Forcage_ABB", required = true)
    protected VOUTDecisionFinaleForcageABBType voutDecisionFinaleForcageABB;
    @XmlElement(name = "VOUT_Niveau_Pouvoir", required = true)
    protected VOUTNiveauPouvoirType voutNiveauPouvoir;
    @XmlElement(name = "VOUT_Code_Niveau_Pouvoir", required = true)
    protected VOUTCodeNiveauPouvoirType voutCodeNiveauPouvoir;
    @XmlElement(name = "VOUT_Decision_Proposition_Ajuste", required = true)
    protected VOUTDecisionPropositionAjusteType voutDecisionPropositionAjuste;
    @XmlElement(name = "VOUT_Montant_Ajuste", required = true)
    protected VOUTMontantAjusteType voutMontantAjuste;
    @XmlElement(name = "VOUT_Mensualite_Ajuste", required = true)
    protected VOUTMensualiteAjusteType voutMensualiteAjuste;
    @XmlElement(name = "VOUT_Duree_Ajuste", required = true)
    protected VOUTDureeAjusteType voutDureeAjuste;
    @XmlElement(name = "VOUT_Anciennete_Activite_Entr", required = true)
    protected VOUTAncienneteActiviteEntrType voutAncienneteActiviteEntr;
    @XmlElement(name = "VOUT_Taux_Apport", required = true)
    protected VOUTTauxApportType voutTauxApport;
    @XmlElement(name = "VOUT_Age_Vehicule", required = true)
    protected VOUTAgeVehiculeType voutAgeVehicule;
    @XmlElement(name = "VOUT_Encours_Client_FUTUR", required = true)
    protected VOUTEncoursClientFUTURType voutEncoursClientFUTUR;
    @XmlElement(name = "VOUT_Age_Vehicule_Duree", required = true)
    protected VOUTAgeVehiculeDureeType voutAgeVehiculeDuree;
    @XmlElement(name = "RC_SO_001", required = true)
    protected RCSO001Type rcso001;
    @XmlElement(name = "RM_SO_001", required = true)
    protected RMSO001Type rmso001;
    @XmlElement(name = "RC_SO_002", required = true)
    protected RCSO002Type rcso002;
    @XmlElement(name = "RM_SO_002", required = true)
    protected RMSO002Type rmso002;
    @XmlElement(name = "RC_SO_003", required = true)
    protected RCSO003Type rcso003;
    @XmlElement(name = "RM_SO_003", required = true)
    protected RMSO003Type rmso003;
    @XmlElement(name = "RC_SO_003_ForcageABB", required = true)
    protected RCSO003ForcageABBType rcso003ForcageABB;
    @XmlElement(name = "RM_SO_003_ForcageABB", required = true)
    protected RMSO003ForcageABBType rmso003ForcageABB;
    @XmlElement(name = "RC_SO_004", required = true)
    protected RCSO004Type rcso004;
    @XmlElement(name = "RM_SO_004", required = true)
    protected RMSO004Type rmso004;
    @XmlElement(name = "RC_SO_004_ForcageABB", required = true)
    protected RCSO004ForcageABBType rcso004ForcageABB;
    @XmlElement(name = "RM_SO_004_ForcageABB", required = true)
    protected RMSO004ForcageABBType rmso004ForcageABB;
    @XmlElement(name = "RC_SO_005", required = true)
    protected RCSO005Type rcso005;
    @XmlElement(name = "RM_SO_005", required = true)
    protected RMSO005Type rmso005;
    @XmlElement(name = "RC_SO_006", required = true)
    protected RCSO006Type rcso006;
    @XmlElement(name = "RM_SO_006", required = true)
    protected RMSO006Type rmso006;
    @XmlElement(name = "RC_SO_007", required = true)
    protected RCSO007Type rcso007;
    @XmlElement(name = "RM_SO_007", required = true)
    protected RMSO007Type rmso007;
    @XmlElement(name = "RC_SO_008", required = true)
    protected RCSO008Type rcso008;
    @XmlElement(name = "RM_SO_008", required = true)
    protected RMSO008Type rmso008;
    @XmlElement(name = "RC_SO_009", required = true)
    protected RCSO009Type rcso009;
    @XmlElement(name = "RM_SO_009", required = true)
    protected RMSO009Type rmso009;
    @XmlElement(name = "RC_SO_051", required = true)
    protected RCSO051Type rcso051;
    @XmlElement(name = "RM_SO_051", required = true)
    protected RMSO051Type rmso051;
    @XmlElement(name = "RC_SO_052", required = true)
    protected RCSO052Type rcso052;
    @XmlElement(name = "RM_SO_052", required = true)
    protected RMSO052Type rmso052;
    @XmlElement(name = "RC_SO_053", required = true)
    protected RCSO053Type rcso053;
    @XmlElement(name = "RM_SO_053", required = true)
    protected RMSO053Type rmso053;
    @XmlElement(name = "RC_SO_054", required = true)
    protected RCSO054Type rcso054;
    @XmlElement(name = "RM_SO_054", required = true)
    protected RMSO054Type rmso054;
    @XmlElement(name = "RC_SO_055", required = true)
    protected RCSO055Type rcso055;
    @XmlElement(name = "RM_SO_055", required = true)
    protected RMSO055Type rmso055;
    @XmlElement(name = "RC_SO_056", required = true)
    protected RCSO056Type rcso056;
    @XmlElement(name = "RM_SO_056", required = true)
    protected RMSO056Type rmso056;
    @XmlElement(name = "RC_SO_057", required = true)
    protected RCSO057Type rcso057;
    @XmlElement(name = "RM_SO_057", required = true)
    protected RMSO057Type rmso057;
    @XmlElement(name = "RC_SO_058", required = true)
    protected RCSO058Type rcso058;
    @XmlElement(name = "RM_SO_058", required = true)
    protected RMSO058Type rmso058;
    @XmlElement(name = "RC_SO_059", required = true)
    protected RCSO059Type rcso059;
    @XmlElement(name = "RM_SO_059", required = true)
    protected RMSO059Type rmso059;
    @XmlElement(name = "RC_SO_060", required = true)
    protected RCSO060Type rcso060;
    @XmlElement(name = "RM_SO_060", required = true)
    protected RMSO060Type rmso060;

    /**
     * Obtient la valeur de la propriété voutSocieteGestion.
     * 
     * @return
     *     possible object is
     *     {@link VOUTSocieteGestionType }
     *     
     */
    public VOUTSocieteGestionType getVOUTSocieteGestion() {
        return voutSocieteGestion;
    }

    /**
     * Définit la valeur de la propriété voutSocieteGestion.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTSocieteGestionType }
     *     
     */
    public void setVOUTSocieteGestion(VOUTSocieteGestionType value) {
        this.voutSocieteGestion = value;
    }

    /**
     * Obtient la valeur de la propriété voutDateDemande.
     * 
     * @return
     *     possible object is
     *     {@link VOUTDateDemandeType }
     *     
     */
    public VOUTDateDemandeType getVOUTDateDemande() {
        return voutDateDemande;
    }

    /**
     * Définit la valeur de la propriété voutDateDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTDateDemandeType }
     *     
     */
    public void setVOUTDateDemande(VOUTDateDemandeType value) {
        this.voutDateDemande = value;
    }

    /**
     * Obtient la valeur de la propriété voutCodeAgence.
     * 
     * @return
     *     possible object is
     *     {@link VOUTCodeAgenceType }
     *     
     */
    public VOUTCodeAgenceType getVOUTCodeAgence() {
        return voutCodeAgence;
    }

    /**
     * Définit la valeur de la propriété voutCodeAgence.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTCodeAgenceType }
     *     
     */
    public void setVOUTCodeAgence(VOUTCodeAgenceType value) {
        this.voutCodeAgence = value;
    }

    /**
     * Obtient la valeur de la propriété voutRandomNumber.
     * 
     * @return
     *     possible object is
     *     {@link VOUTRandomNumberType }
     *     
     */
    public VOUTRandomNumberType getVOUTRandomNumber() {
        return voutRandomNumber;
    }

    /**
     * Définit la valeur de la propriété voutRandomNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTRandomNumberType }
     *     
     */
    public void setVOUTRandomNumber(VOUTRandomNumberType value) {
        this.voutRandomNumber = value;
    }

    /**
     * Obtient la valeur de la propriété voutNumeroDemande.
     * 
     * @return
     *     possible object is
     *     {@link VOUTNumeroDemandeType }
     *     
     */
    public VOUTNumeroDemandeType getVOUTNumeroDemande() {
        return voutNumeroDemande;
    }

    /**
     * Définit la valeur de la propriété voutNumeroDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTNumeroDemandeType }
     *     
     */
    public void setVOUTNumeroDemande(VOUTNumeroDemandeType value) {
        this.voutNumeroDemande = value;
    }

    /**
     * Obtient la valeur de la propriété voutCategorieAffaire.
     * 
     * @return
     *     possible object is
     *     {@link VOUTCategorieAffaireType }
     *     
     */
    public VOUTCategorieAffaireType getVOUTCategorieAffaire() {
        return voutCategorieAffaire;
    }

    /**
     * Définit la valeur de la propriété voutCategorieAffaire.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTCategorieAffaireType }
     *     
     */
    public void setVOUTCategorieAffaire(VOUTCategorieAffaireType value) {
        this.voutCategorieAffaire = value;
    }

    /**
     * Obtient la valeur de la propriété voutMontantDemande.
     * 
     * @return
     *     possible object is
     *     {@link VOUTMontantDemandeType }
     *     
     */
    public VOUTMontantDemandeType getVOUTMontantDemande() {
        return voutMontantDemande;
    }

    /**
     * Définit la valeur de la propriété voutMontantDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTMontantDemandeType }
     *     
     */
    public void setVOUTMontantDemande(VOUTMontantDemandeType value) {
        this.voutMontantDemande = value;
    }

    /**
     * Obtient la valeur de la propriété voutDureeDemande.
     * 
     * @return
     *     possible object is
     *     {@link VOUTDureeDemandeType }
     *     
     */
    public VOUTDureeDemandeType getVOUTDureeDemande() {
        return voutDureeDemande;
    }

    /**
     * Définit la valeur de la propriété voutDureeDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTDureeDemandeType }
     *     
     */
    public void setVOUTDureeDemande(VOUTDureeDemandeType value) {
        this.voutDureeDemande = value;
    }

    /**
     * Obtient la valeur de la propriété voutMensualiteDemande.
     * 
     * @return
     *     possible object is
     *     {@link VOUTMensualiteDemandeType }
     *     
     */
    public VOUTMensualiteDemandeType getVOUTMensualiteDemande() {
        return voutMensualiteDemande;
    }

    /**
     * Définit la valeur de la propriété voutMensualiteDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTMensualiteDemandeType }
     *     
     */
    public void setVOUTMensualiteDemande(VOUTMensualiteDemandeType value) {
        this.voutMensualiteDemande = value;
    }

    /**
     * Obtient la valeur de la propriété voutFlagGarantie.
     * 
     * @return
     *     possible object is
     *     {@link VOUTFlagGarantieType }
     *     
     */
    public VOUTFlagGarantieType getVOUTFlagGarantie() {
        return voutFlagGarantie;
    }

    /**
     * Définit la valeur de la propriété voutFlagGarantie.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTFlagGarantieType }
     *     
     */
    public void setVOUTFlagGarantie(VOUTFlagGarantieType value) {
        this.voutFlagGarantie = value;
    }

    /**
     * Obtient la valeur de la propriété voutnumlancement.
     * 
     * @return
     *     possible object is
     *     {@link VOUTNUMLANCEMENTType }
     *     
     */
    public VOUTNUMLANCEMENTType getVOUTNUMLANCEMENT() {
        return voutnumlancement;
    }

    /**
     * Définit la valeur de la propriété voutnumlancement.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTNUMLANCEMENTType }
     *     
     */
    public void setVOUTNUMLANCEMENT(VOUTNUMLANCEMENTType value) {
        this.voutnumlancement = value;
    }

    /**
     * Obtient la valeur de la propriété grillealigned.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEALIGNEDType }
     *     
     */
    public GRILLEALIGNEDType getGRILLEALIGNED() {
        return grillealigned;
    }

    /**
     * Définit la valeur de la propriété grillealigned.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEALIGNEDType }
     *     
     */
    public void setGRILLEALIGNED(GRILLEALIGNEDType value) {
        this.grillealigned = value;
    }

    /**
     * Obtient la valeur de la propriété grilleobjcode.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEOBJCODEType }
     *     
     */
    public GRILLEOBJCODEType getGRILLEOBJCODE() {
        return grilleobjcode;
    }

    /**
     * Définit la valeur de la propriété grilleobjcode.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEOBJCODEType }
     *     
     */
    public void setGRILLEOBJCODE(GRILLEOBJCODEType value) {
        this.grilleobjcode = value;
    }

    /**
     * Obtient la valeur de la propriété grilleraw.
     * 
     * @return
     *     possible object is
     *     {@link GRILLERAWType }
     *     
     */
    public GRILLERAWType getGRILLERAW() {
        return grilleraw;
    }

    /**
     * Définit la valeur de la propriété grilleraw.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLERAWType }
     *     
     */
    public void setGRILLERAW(GRILLERAWType value) {
        this.grilleraw = value;
    }

    /**
     * Obtient la valeur de la propriété notationfin.
     * 
     * @return
     *     possible object is
     *     {@link NOTATIONFINType }
     *     
     */
    public NOTATIONFINType getNOTATIONFIN() {
        return notationfin;
    }

    /**
     * Définit la valeur de la propriété notationfin.
     * 
     * @param value
     *     allowed object is
     *     {@link NOTATIONFINType }
     *     
     */
    public void setNOTATIONFIN(NOTATIONFINType value) {
        this.notationfin = value;
    }

    /**
     * Obtient la valeur de la propriété notationfin0100.
     * 
     * @return
     *     possible object is
     *     {@link NOTATIONFIN0100Type }
     *     
     */
    public NOTATIONFIN0100Type getNOTATIONFIN0100() {
        return notationfin0100;
    }

    /**
     * Définit la valeur de la propriété notationfin0100.
     * 
     * @param value
     *     allowed object is
     *     {@link NOTATIONFIN0100Type }
     *     
     */
    public void setNOTATIONFIN0100(NOTATIONFIN0100Type value) {
        this.notationfin0100 = value;
    }

    /**
     * Obtient la valeur de la propriété notationhom.
     * 
     * @return
     *     possible object is
     *     {@link NOTATIONHOMType }
     *     
     */
    public NOTATIONHOMType getNOTATIONHOM() {
        return notationhom;
    }

    /**
     * Définit la valeur de la propriété notationhom.
     * 
     * @param value
     *     allowed object is
     *     {@link NOTATIONHOMType }
     *     
     */
    public void setNOTATIONHOM(NOTATIONHOMType value) {
        this.notationhom = value;
    }

    /**
     * Obtient la valeur de la propriété notationhom0100.
     * 
     * @return
     *     possible object is
     *     {@link NOTATIONHOM0100Type }
     *     
     */
    public NOTATIONHOM0100Type getNOTATIONHOM0100() {
        return notationhom0100;
    }

    /**
     * Définit la valeur de la propriété notationhom0100.
     * 
     * @param value
     *     allowed object is
     *     {@link NOTATIONHOM0100Type }
     *     
     */
    public void setNOTATIONHOM0100(NOTATIONHOM0100Type value) {
        this.notationhom0100 = value;
    }

    /**
     * Obtient la valeur de la propriété scoreRAT.
     * 
     * @return
     *     possible object is
     *     {@link ScoreRATType }
     *     
     */
    public ScoreRATType getScoreRAT() {
        return scoreRAT;
    }

    /**
     * Définit la valeur de la propriété scoreRAT.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreRATType }
     *     
     */
    public void setScoreRAT(ScoreRATType value) {
        this.scoreRAT = value;
    }

    /**
     * Obtient la valeur de la propriété noteScoreOPPM.
     * 
     * @return
     *     possible object is
     *     {@link NoteScoreOPPMType }
     *     
     */
    public NoteScoreOPPMType getNoteScoreOPPM() {
        return noteScoreOPPM;
    }

    /**
     * Définit la valeur de la propriété noteScoreOPPM.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteScoreOPPMType }
     *     
     */
    public void setNoteScoreOPPM(NoteScoreOPPMType value) {
        this.noteScoreOPPM = value;
    }

    /**
     * Obtient la valeur de la propriété scoreOP.
     * 
     * @return
     *     possible object is
     *     {@link ScoreOPType }
     *     
     */
    public ScoreOPType getScoreOP() {
        return scoreOP;
    }

    /**
     * Définit la valeur de la propriété scoreOP.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreOPType }
     *     
     */
    public void setScoreOP(ScoreOPType value) {
        this.scoreOP = value;
    }

    /**
     * Obtient la valeur de la propriété scorating.
     * 
     * @return
     *     possible object is
     *     {@link ScoratingType }
     *     
     */
    public ScoratingType getScorating() {
        return scorating;
    }

    /**
     * Définit la valeur de la propriété scorating.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoratingType }
     *     
     */
    public void setScorating(ScoratingType value) {
        this.scorating = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable0.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable0Type }
     *     
     */
    public GRILLEVariable0Type getGRILLEVariable0() {
        return grilleVariable0;
    }

    /**
     * Définit la valeur de la propriété grilleVariable0.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable0Type }
     *     
     */
    public void setGRILLEVariable0(GRILLEVariable0Type value) {
        this.grilleVariable0 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar0.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar0Type }
     *     
     */
    public GRILLEClasseAffecteeVar0Type getGRILLEClasseAffecteeVar0() {
        return grilleClasseAffecteeVar0;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar0.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar0Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar0(GRILLEClasseAffecteeVar0Type value) {
        this.grilleClasseAffecteeVar0 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar0.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar0Type }
     *     
     */
    public GRILLENoteVar0Type getGRILLENoteVar0() {
        return grilleNoteVar0;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar0.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar0Type }
     *     
     */
    public void setGRILLENoteVar0(GRILLENoteVar0Type value) {
        this.grilleNoteVar0 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable1.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable1Type }
     *     
     */
    public GRILLEVariable1Type getGRILLEVariable1() {
        return grilleVariable1;
    }

    /**
     * Définit la valeur de la propriété grilleVariable1.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable1Type }
     *     
     */
    public void setGRILLEVariable1(GRILLEVariable1Type value) {
        this.grilleVariable1 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar1.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar1Type }
     *     
     */
    public GRILLEClasseAffecteeVar1Type getGRILLEClasseAffecteeVar1() {
        return grilleClasseAffecteeVar1;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar1.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar1Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar1(GRILLEClasseAffecteeVar1Type value) {
        this.grilleClasseAffecteeVar1 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar1.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar1Type }
     *     
     */
    public GRILLENoteVar1Type getGRILLENoteVar1() {
        return grilleNoteVar1;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar1.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar1Type }
     *     
     */
    public void setGRILLENoteVar1(GRILLENoteVar1Type value) {
        this.grilleNoteVar1 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable2.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable2Type }
     *     
     */
    public GRILLEVariable2Type getGRILLEVariable2() {
        return grilleVariable2;
    }

    /**
     * Définit la valeur de la propriété grilleVariable2.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable2Type }
     *     
     */
    public void setGRILLEVariable2(GRILLEVariable2Type value) {
        this.grilleVariable2 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar2.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar2Type }
     *     
     */
    public GRILLEClasseAffecteeVar2Type getGRILLEClasseAffecteeVar2() {
        return grilleClasseAffecteeVar2;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar2.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar2Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar2(GRILLEClasseAffecteeVar2Type value) {
        this.grilleClasseAffecteeVar2 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar2.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar2Type }
     *     
     */
    public GRILLENoteVar2Type getGRILLENoteVar2() {
        return grilleNoteVar2;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar2.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar2Type }
     *     
     */
    public void setGRILLENoteVar2(GRILLENoteVar2Type value) {
        this.grilleNoteVar2 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable3.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable3Type }
     *     
     */
    public GRILLEVariable3Type getGRILLEVariable3() {
        return grilleVariable3;
    }

    /**
     * Définit la valeur de la propriété grilleVariable3.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable3Type }
     *     
     */
    public void setGRILLEVariable3(GRILLEVariable3Type value) {
        this.grilleVariable3 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar3.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar3Type }
     *     
     */
    public GRILLEClasseAffecteeVar3Type getGRILLEClasseAffecteeVar3() {
        return grilleClasseAffecteeVar3;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar3.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar3Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar3(GRILLEClasseAffecteeVar3Type value) {
        this.grilleClasseAffecteeVar3 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar3.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar3Type }
     *     
     */
    public GRILLENoteVar3Type getGRILLENoteVar3() {
        return grilleNoteVar3;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar3.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar3Type }
     *     
     */
    public void setGRILLENoteVar3(GRILLENoteVar3Type value) {
        this.grilleNoteVar3 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable4.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable4Type }
     *     
     */
    public GRILLEVariable4Type getGRILLEVariable4() {
        return grilleVariable4;
    }

    /**
     * Définit la valeur de la propriété grilleVariable4.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable4Type }
     *     
     */
    public void setGRILLEVariable4(GRILLEVariable4Type value) {
        this.grilleVariable4 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar4.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar4Type }
     *     
     */
    public GRILLEClasseAffecteeVar4Type getGRILLEClasseAffecteeVar4() {
        return grilleClasseAffecteeVar4;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar4.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar4Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar4(GRILLEClasseAffecteeVar4Type value) {
        this.grilleClasseAffecteeVar4 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar4.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar4Type }
     *     
     */
    public GRILLENoteVar4Type getGRILLENoteVar4() {
        return grilleNoteVar4;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar4.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar4Type }
     *     
     */
    public void setGRILLENoteVar4(GRILLENoteVar4Type value) {
        this.grilleNoteVar4 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable5.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable5Type }
     *     
     */
    public GRILLEVariable5Type getGRILLEVariable5() {
        return grilleVariable5;
    }

    /**
     * Définit la valeur de la propriété grilleVariable5.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable5Type }
     *     
     */
    public void setGRILLEVariable5(GRILLEVariable5Type value) {
        this.grilleVariable5 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar5.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar5Type }
     *     
     */
    public GRILLEClasseAffecteeVar5Type getGRILLEClasseAffecteeVar5() {
        return grilleClasseAffecteeVar5;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar5.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar5Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar5(GRILLEClasseAffecteeVar5Type value) {
        this.grilleClasseAffecteeVar5 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar5.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar5Type }
     *     
     */
    public GRILLENoteVar5Type getGRILLENoteVar5() {
        return grilleNoteVar5;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar5.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar5Type }
     *     
     */
    public void setGRILLENoteVar5(GRILLENoteVar5Type value) {
        this.grilleNoteVar5 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable6.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable6Type }
     *     
     */
    public GRILLEVariable6Type getGRILLEVariable6() {
        return grilleVariable6;
    }

    /**
     * Définit la valeur de la propriété grilleVariable6.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable6Type }
     *     
     */
    public void setGRILLEVariable6(GRILLEVariable6Type value) {
        this.grilleVariable6 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar6.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar6Type }
     *     
     */
    public GRILLEClasseAffecteeVar6Type getGRILLEClasseAffecteeVar6() {
        return grilleClasseAffecteeVar6;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar6.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar6Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar6(GRILLEClasseAffecteeVar6Type value) {
        this.grilleClasseAffecteeVar6 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar6.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar6Type }
     *     
     */
    public GRILLENoteVar6Type getGRILLENoteVar6() {
        return grilleNoteVar6;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar6.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar6Type }
     *     
     */
    public void setGRILLENoteVar6(GRILLENoteVar6Type value) {
        this.grilleNoteVar6 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable7.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable7Type }
     *     
     */
    public GRILLEVariable7Type getGRILLEVariable7() {
        return grilleVariable7;
    }

    /**
     * Définit la valeur de la propriété grilleVariable7.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable7Type }
     *     
     */
    public void setGRILLEVariable7(GRILLEVariable7Type value) {
        this.grilleVariable7 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar7.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar7Type }
     *     
     */
    public GRILLEClasseAffecteeVar7Type getGRILLEClasseAffecteeVar7() {
        return grilleClasseAffecteeVar7;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar7.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar7Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar7(GRILLEClasseAffecteeVar7Type value) {
        this.grilleClasseAffecteeVar7 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar7.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar7Type }
     *     
     */
    public GRILLENoteVar7Type getGRILLENoteVar7() {
        return grilleNoteVar7;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar7.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar7Type }
     *     
     */
    public void setGRILLENoteVar7(GRILLENoteVar7Type value) {
        this.grilleNoteVar7 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable8.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable8Type }
     *     
     */
    public GRILLEVariable8Type getGRILLEVariable8() {
        return grilleVariable8;
    }

    /**
     * Définit la valeur de la propriété grilleVariable8.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable8Type }
     *     
     */
    public void setGRILLEVariable8(GRILLEVariable8Type value) {
        this.grilleVariable8 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar8.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar8Type }
     *     
     */
    public GRILLEClasseAffecteeVar8Type getGRILLEClasseAffecteeVar8() {
        return grilleClasseAffecteeVar8;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar8.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar8Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar8(GRILLEClasseAffecteeVar8Type value) {
        this.grilleClasseAffecteeVar8 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar8.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar8Type }
     *     
     */
    public GRILLENoteVar8Type getGRILLENoteVar8() {
        return grilleNoteVar8;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar8.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar8Type }
     *     
     */
    public void setGRILLENoteVar8(GRILLENoteVar8Type value) {
        this.grilleNoteVar8 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable9.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable9Type }
     *     
     */
    public GRILLEVariable9Type getGRILLEVariable9() {
        return grilleVariable9;
    }

    /**
     * Définit la valeur de la propriété grilleVariable9.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable9Type }
     *     
     */
    public void setGRILLEVariable9(GRILLEVariable9Type value) {
        this.grilleVariable9 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar9.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar9Type }
     *     
     */
    public GRILLEClasseAffecteeVar9Type getGRILLEClasseAffecteeVar9() {
        return grilleClasseAffecteeVar9;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar9.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar9Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar9(GRILLEClasseAffecteeVar9Type value) {
        this.grilleClasseAffecteeVar9 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar9.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar9Type }
     *     
     */
    public GRILLENoteVar9Type getGRILLENoteVar9() {
        return grilleNoteVar9;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar9.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar9Type }
     *     
     */
    public void setGRILLENoteVar9(GRILLENoteVar9Type value) {
        this.grilleNoteVar9 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable10.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable10Type }
     *     
     */
    public GRILLEVariable10Type getGRILLEVariable10() {
        return grilleVariable10;
    }

    /**
     * Définit la valeur de la propriété grilleVariable10.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable10Type }
     *     
     */
    public void setGRILLEVariable10(GRILLEVariable10Type value) {
        this.grilleVariable10 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar10.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar10Type }
     *     
     */
    public GRILLEClasseAffecteeVar10Type getGRILLEClasseAffecteeVar10() {
        return grilleClasseAffecteeVar10;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar10.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar10Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar10(GRILLEClasseAffecteeVar10Type value) {
        this.grilleClasseAffecteeVar10 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar10.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar10Type }
     *     
     */
    public GRILLENoteVar10Type getGRILLENoteVar10() {
        return grilleNoteVar10;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar10.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar10Type }
     *     
     */
    public void setGRILLENoteVar10(GRILLENoteVar10Type value) {
        this.grilleNoteVar10 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable11.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable11Type }
     *     
     */
    public GRILLEVariable11Type getGRILLEVariable11() {
        return grilleVariable11;
    }

    /**
     * Définit la valeur de la propriété grilleVariable11.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable11Type }
     *     
     */
    public void setGRILLEVariable11(GRILLEVariable11Type value) {
        this.grilleVariable11 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar11.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar11Type }
     *     
     */
    public GRILLEClasseAffecteeVar11Type getGRILLEClasseAffecteeVar11() {
        return grilleClasseAffecteeVar11;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar11.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar11Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar11(GRILLEClasseAffecteeVar11Type value) {
        this.grilleClasseAffecteeVar11 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar11.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar11Type }
     *     
     */
    public GRILLENoteVar11Type getGRILLENoteVar11() {
        return grilleNoteVar11;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar11.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar11Type }
     *     
     */
    public void setGRILLENoteVar11(GRILLENoteVar11Type value) {
        this.grilleNoteVar11 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable12.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable12Type }
     *     
     */
    public GRILLEVariable12Type getGRILLEVariable12() {
        return grilleVariable12;
    }

    /**
     * Définit la valeur de la propriété grilleVariable12.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable12Type }
     *     
     */
    public void setGRILLEVariable12(GRILLEVariable12Type value) {
        this.grilleVariable12 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar12.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar12Type }
     *     
     */
    public GRILLEClasseAffecteeVar12Type getGRILLEClasseAffecteeVar12() {
        return grilleClasseAffecteeVar12;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar12.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar12Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar12(GRILLEClasseAffecteeVar12Type value) {
        this.grilleClasseAffecteeVar12 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar12.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar12Type }
     *     
     */
    public GRILLENoteVar12Type getGRILLENoteVar12() {
        return grilleNoteVar12;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar12.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar12Type }
     *     
     */
    public void setGRILLENoteVar12(GRILLENoteVar12Type value) {
        this.grilleNoteVar12 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable13.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable13Type }
     *     
     */
    public GRILLEVariable13Type getGRILLEVariable13() {
        return grilleVariable13;
    }

    /**
     * Définit la valeur de la propriété grilleVariable13.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable13Type }
     *     
     */
    public void setGRILLEVariable13(GRILLEVariable13Type value) {
        this.grilleVariable13 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar13.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar13Type }
     *     
     */
    public GRILLEClasseAffecteeVar13Type getGRILLEClasseAffecteeVar13() {
        return grilleClasseAffecteeVar13;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar13.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar13Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar13(GRILLEClasseAffecteeVar13Type value) {
        this.grilleClasseAffecteeVar13 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar13.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar13Type }
     *     
     */
    public GRILLENoteVar13Type getGRILLENoteVar13() {
        return grilleNoteVar13;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar13.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar13Type }
     *     
     */
    public void setGRILLENoteVar13(GRILLENoteVar13Type value) {
        this.grilleNoteVar13 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable14.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable14Type }
     *     
     */
    public GRILLEVariable14Type getGRILLEVariable14() {
        return grilleVariable14;
    }

    /**
     * Définit la valeur de la propriété grilleVariable14.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable14Type }
     *     
     */
    public void setGRILLEVariable14(GRILLEVariable14Type value) {
        this.grilleVariable14 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar14.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar14Type }
     *     
     */
    public GRILLEClasseAffecteeVar14Type getGRILLEClasseAffecteeVar14() {
        return grilleClasseAffecteeVar14;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar14.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar14Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar14(GRILLEClasseAffecteeVar14Type value) {
        this.grilleClasseAffecteeVar14 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar14.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar14Type }
     *     
     */
    public GRILLENoteVar14Type getGRILLENoteVar14() {
        return grilleNoteVar14;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar14.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar14Type }
     *     
     */
    public void setGRILLENoteVar14(GRILLENoteVar14Type value) {
        this.grilleNoteVar14 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable15.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable15Type }
     *     
     */
    public GRILLEVariable15Type getGRILLEVariable15() {
        return grilleVariable15;
    }

    /**
     * Définit la valeur de la propriété grilleVariable15.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable15Type }
     *     
     */
    public void setGRILLEVariable15(GRILLEVariable15Type value) {
        this.grilleVariable15 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar15.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar15Type }
     *     
     */
    public GRILLEClasseAffecteeVar15Type getGRILLEClasseAffecteeVar15() {
        return grilleClasseAffecteeVar15;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar15.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar15Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar15(GRILLEClasseAffecteeVar15Type value) {
        this.grilleClasseAffecteeVar15 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar15.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar15Type }
     *     
     */
    public GRILLENoteVar15Type getGRILLENoteVar15() {
        return grilleNoteVar15;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar15.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar15Type }
     *     
     */
    public void setGRILLENoteVar15(GRILLENoteVar15Type value) {
        this.grilleNoteVar15 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable16.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable16Type }
     *     
     */
    public GRILLEVariable16Type getGRILLEVariable16() {
        return grilleVariable16;
    }

    /**
     * Définit la valeur de la propriété grilleVariable16.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable16Type }
     *     
     */
    public void setGRILLEVariable16(GRILLEVariable16Type value) {
        this.grilleVariable16 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar16.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar16Type }
     *     
     */
    public GRILLEClasseAffecteeVar16Type getGRILLEClasseAffecteeVar16() {
        return grilleClasseAffecteeVar16;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar16.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar16Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar16(GRILLEClasseAffecteeVar16Type value) {
        this.grilleClasseAffecteeVar16 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar16.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar16Type }
     *     
     */
    public GRILLENoteVar16Type getGRILLENoteVar16() {
        return grilleNoteVar16;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar16.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar16Type }
     *     
     */
    public void setGRILLENoteVar16(GRILLENoteVar16Type value) {
        this.grilleNoteVar16 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable17.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable17Type }
     *     
     */
    public GRILLEVariable17Type getGRILLEVariable17() {
        return grilleVariable17;
    }

    /**
     * Définit la valeur de la propriété grilleVariable17.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable17Type }
     *     
     */
    public void setGRILLEVariable17(GRILLEVariable17Type value) {
        this.grilleVariable17 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar17.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar17Type }
     *     
     */
    public GRILLEClasseAffecteeVar17Type getGRILLEClasseAffecteeVar17() {
        return grilleClasseAffecteeVar17;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar17.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar17Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar17(GRILLEClasseAffecteeVar17Type value) {
        this.grilleClasseAffecteeVar17 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar17.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar17Type }
     *     
     */
    public GRILLENoteVar17Type getGRILLENoteVar17() {
        return grilleNoteVar17;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar17.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar17Type }
     *     
     */
    public void setGRILLENoteVar17(GRILLENoteVar17Type value) {
        this.grilleNoteVar17 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable18.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable18Type }
     *     
     */
    public GRILLEVariable18Type getGRILLEVariable18() {
        return grilleVariable18;
    }

    /**
     * Définit la valeur de la propriété grilleVariable18.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable18Type }
     *     
     */
    public void setGRILLEVariable18(GRILLEVariable18Type value) {
        this.grilleVariable18 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar18.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar18Type }
     *     
     */
    public GRILLEClasseAffecteeVar18Type getGRILLEClasseAffecteeVar18() {
        return grilleClasseAffecteeVar18;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar18.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar18Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar18(GRILLEClasseAffecteeVar18Type value) {
        this.grilleClasseAffecteeVar18 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar18.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar18Type }
     *     
     */
    public GRILLENoteVar18Type getGRILLENoteVar18() {
        return grilleNoteVar18;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar18.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar18Type }
     *     
     */
    public void setGRILLENoteVar18(GRILLENoteVar18Type value) {
        this.grilleNoteVar18 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable19.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable19Type }
     *     
     */
    public GRILLEVariable19Type getGRILLEVariable19() {
        return grilleVariable19;
    }

    /**
     * Définit la valeur de la propriété grilleVariable19.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable19Type }
     *     
     */
    public void setGRILLEVariable19(GRILLEVariable19Type value) {
        this.grilleVariable19 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar19.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar19Type }
     *     
     */
    public GRILLEClasseAffecteeVar19Type getGRILLEClasseAffecteeVar19() {
        return grilleClasseAffecteeVar19;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar19.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar19Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar19(GRILLEClasseAffecteeVar19Type value) {
        this.grilleClasseAffecteeVar19 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar19.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar19Type }
     *     
     */
    public GRILLENoteVar19Type getGRILLENoteVar19() {
        return grilleNoteVar19;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar19.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar19Type }
     *     
     */
    public void setGRILLENoteVar19(GRILLENoteVar19Type value) {
        this.grilleNoteVar19 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleVariable20.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEVariable20Type }
     *     
     */
    public GRILLEVariable20Type getGRILLEVariable20() {
        return grilleVariable20;
    }

    /**
     * Définit la valeur de la propriété grilleVariable20.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEVariable20Type }
     *     
     */
    public void setGRILLEVariable20(GRILLEVariable20Type value) {
        this.grilleVariable20 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleClasseAffecteeVar20.
     * 
     * @return
     *     possible object is
     *     {@link GRILLEClasseAffecteeVar20Type }
     *     
     */
    public GRILLEClasseAffecteeVar20Type getGRILLEClasseAffecteeVar20() {
        return grilleClasseAffecteeVar20;
    }

    /**
     * Définit la valeur de la propriété grilleClasseAffecteeVar20.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLEClasseAffecteeVar20Type }
     *     
     */
    public void setGRILLEClasseAffecteeVar20(GRILLEClasseAffecteeVar20Type value) {
        this.grilleClasseAffecteeVar20 = value;
    }

    /**
     * Obtient la valeur de la propriété grilleNoteVar20.
     * 
     * @return
     *     possible object is
     *     {@link GRILLENoteVar20Type }
     *     
     */
    public GRILLENoteVar20Type getGRILLENoteVar20() {
        return grilleNoteVar20;
    }

    /**
     * Définit la valeur de la propriété grilleNoteVar20.
     * 
     * @param value
     *     allowed object is
     *     {@link GRILLENoteVar20Type }
     *     
     */
    public void setGRILLENoteVar20(GRILLENoteVar20Type value) {
        this.grilleNoteVar20 = value;
    }

    /**
     * Obtient la valeur de la propriété voutCoherence.
     * 
     * @return
     *     possible object is
     *     {@link VOUTCoherenceType }
     *     
     */
    public VOUTCoherenceType getVOUTCoherence() {
        return voutCoherence;
    }

    /**
     * Définit la valeur de la propriété voutCoherence.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTCoherenceType }
     *     
     */
    public void setVOUTCoherence(VOUTCoherenceType value) {
        this.voutCoherence = value;
    }

    /**
     * Obtient la valeur de la propriété voutScore.
     * 
     * @return
     *     possible object is
     *     {@link VOUTScoreType }
     *     
     */
    public VOUTScoreType getVOUTScore() {
        return voutScore;
    }

    /**
     * Définit la valeur de la propriété voutScore.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTScoreType }
     *     
     */
    public void setVOUTScore(VOUTScoreType value) {
        this.voutScore = value;
    }

    /**
     * Obtient la valeur de la propriété voutOutputRegles.
     * 
     * @return
     *     possible object is
     *     {@link VOUTOutputReglesType }
     *     
     */
    public VOUTOutputReglesType getVOUTOutputRegles() {
        return voutOutputRegles;
    }

    /**
     * Définit la valeur de la propriété voutOutputRegles.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTOutputReglesType }
     *     
     */
    public void setVOUTOutputRegles(VOUTOutputReglesType value) {
        this.voutOutputRegles = value;
    }

    /**
     * Obtient la valeur de la propriété voutOutputReglesForcageABB.
     * 
     * @return
     *     possible object is
     *     {@link VOUTOutputReglesForcageABBType }
     *     
     */
    public VOUTOutputReglesForcageABBType getVOUTOutputReglesForcageABB() {
        return voutOutputReglesForcageABB;
    }

    /**
     * Définit la valeur de la propriété voutOutputReglesForcageABB.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTOutputReglesForcageABBType }
     *     
     */
    public void setVOUTOutputReglesForcageABB(VOUTOutputReglesForcageABBType value) {
        this.voutOutputReglesForcageABB = value;
    }

    /**
     * Obtient la valeur de la propriété voutDecisionFinale.
     * 
     * @return
     *     possible object is
     *     {@link VOUTDecisionFinaleType }
     *     
     */
    public VOUTDecisionFinaleType getVOUTDecisionFinale() {
        return voutDecisionFinale;
    }

    /**
     * Définit la valeur de la propriété voutDecisionFinale.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTDecisionFinaleType }
     *     
     */
    public void setVOUTDecisionFinale(VOUTDecisionFinaleType value) {
        this.voutDecisionFinale = value;
    }

    /**
     * Obtient la valeur de la propriété voutDecisionFinaleForcageABB.
     * 
     * @return
     *     possible object is
     *     {@link VOUTDecisionFinaleForcageABBType }
     *     
     */
    public VOUTDecisionFinaleForcageABBType getVOUTDecisionFinaleForcageABB() {
        return voutDecisionFinaleForcageABB;
    }

    /**
     * Définit la valeur de la propriété voutDecisionFinaleForcageABB.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTDecisionFinaleForcageABBType }
     *     
     */
    public void setVOUTDecisionFinaleForcageABB(VOUTDecisionFinaleForcageABBType value) {
        this.voutDecisionFinaleForcageABB = value;
    }

    /**
     * Obtient la valeur de la propriété voutNiveauPouvoir.
     * 
     * @return
     *     possible object is
     *     {@link VOUTNiveauPouvoirType }
     *     
     */
    public VOUTNiveauPouvoirType getVOUTNiveauPouvoir() {
        return voutNiveauPouvoir;
    }

    /**
     * Définit la valeur de la propriété voutNiveauPouvoir.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTNiveauPouvoirType }
     *     
     */
    public void setVOUTNiveauPouvoir(VOUTNiveauPouvoirType value) {
        this.voutNiveauPouvoir = value;
    }

    /**
     * Obtient la valeur de la propriété voutCodeNiveauPouvoir.
     * 
     * @return
     *     possible object is
     *     {@link VOUTCodeNiveauPouvoirType }
     *     
     */
    public VOUTCodeNiveauPouvoirType getVOUTCodeNiveauPouvoir() {
        return voutCodeNiveauPouvoir;
    }

    /**
     * Définit la valeur de la propriété voutCodeNiveauPouvoir.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTCodeNiveauPouvoirType }
     *     
     */
    public void setVOUTCodeNiveauPouvoir(VOUTCodeNiveauPouvoirType value) {
        this.voutCodeNiveauPouvoir = value;
    }

    /**
     * Obtient la valeur de la propriété voutDecisionPropositionAjuste.
     * 
     * @return
     *     possible object is
     *     {@link VOUTDecisionPropositionAjusteType }
     *     
     */
    public VOUTDecisionPropositionAjusteType getVOUTDecisionPropositionAjuste() {
        return voutDecisionPropositionAjuste;
    }

    /**
     * Définit la valeur de la propriété voutDecisionPropositionAjuste.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTDecisionPropositionAjusteType }
     *     
     */
    public void setVOUTDecisionPropositionAjuste(VOUTDecisionPropositionAjusteType value) {
        this.voutDecisionPropositionAjuste = value;
    }

    /**
     * Obtient la valeur de la propriété voutMontantAjuste.
     * 
     * @return
     *     possible object is
     *     {@link VOUTMontantAjusteType }
     *     
     */
    public VOUTMontantAjusteType getVOUTMontantAjuste() {
        return voutMontantAjuste;
    }

    /**
     * Définit la valeur de la propriété voutMontantAjuste.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTMontantAjusteType }
     *     
     */
    public void setVOUTMontantAjuste(VOUTMontantAjusteType value) {
        this.voutMontantAjuste = value;
    }

    /**
     * Obtient la valeur de la propriété voutMensualiteAjuste.
     * 
     * @return
     *     possible object is
     *     {@link VOUTMensualiteAjusteType }
     *     
     */
    public VOUTMensualiteAjusteType getVOUTMensualiteAjuste() {
        return voutMensualiteAjuste;
    }

    /**
     * Définit la valeur de la propriété voutMensualiteAjuste.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTMensualiteAjusteType }
     *     
     */
    public void setVOUTMensualiteAjuste(VOUTMensualiteAjusteType value) {
        this.voutMensualiteAjuste = value;
    }

    /**
     * Obtient la valeur de la propriété voutDureeAjuste.
     * 
     * @return
     *     possible object is
     *     {@link VOUTDureeAjusteType }
     *     
     */
    public VOUTDureeAjusteType getVOUTDureeAjuste() {
        return voutDureeAjuste;
    }

    /**
     * Définit la valeur de la propriété voutDureeAjuste.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTDureeAjusteType }
     *     
     */
    public void setVOUTDureeAjuste(VOUTDureeAjusteType value) {
        this.voutDureeAjuste = value;
    }

    /**
     * Obtient la valeur de la propriété voutAncienneteActiviteEntr.
     * 
     * @return
     *     possible object is
     *     {@link VOUTAncienneteActiviteEntrType }
     *     
     */
    public VOUTAncienneteActiviteEntrType getVOUTAncienneteActiviteEntr() {
        return voutAncienneteActiviteEntr;
    }

    /**
     * Définit la valeur de la propriété voutAncienneteActiviteEntr.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTAncienneteActiviteEntrType }
     *     
     */
    public void setVOUTAncienneteActiviteEntr(VOUTAncienneteActiviteEntrType value) {
        this.voutAncienneteActiviteEntr = value;
    }

    /**
     * Obtient la valeur de la propriété voutTauxApport.
     * 
     * @return
     *     possible object is
     *     {@link VOUTTauxApportType }
     *     
     */
    public VOUTTauxApportType getVOUTTauxApport() {
        return voutTauxApport;
    }

    /**
     * Définit la valeur de la propriété voutTauxApport.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTTauxApportType }
     *     
     */
    public void setVOUTTauxApport(VOUTTauxApportType value) {
        this.voutTauxApport = value;
    }

    /**
     * Obtient la valeur de la propriété voutAgeVehicule.
     * 
     * @return
     *     possible object is
     *     {@link VOUTAgeVehiculeType }
     *     
     */
    public VOUTAgeVehiculeType getVOUTAgeVehicule() {
        return voutAgeVehicule;
    }

    /**
     * Définit la valeur de la propriété voutAgeVehicule.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTAgeVehiculeType }
     *     
     */
    public void setVOUTAgeVehicule(VOUTAgeVehiculeType value) {
        this.voutAgeVehicule = value;
    }

    /**
     * Obtient la valeur de la propriété voutEncoursClientFUTUR.
     * 
     * @return
     *     possible object is
     *     {@link VOUTEncoursClientFUTURType }
     *     
     */
    public VOUTEncoursClientFUTURType getVOUTEncoursClientFUTUR() {
        return voutEncoursClientFUTUR;
    }

    /**
     * Définit la valeur de la propriété voutEncoursClientFUTUR.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTEncoursClientFUTURType }
     *     
     */
    public void setVOUTEncoursClientFUTUR(VOUTEncoursClientFUTURType value) {
        this.voutEncoursClientFUTUR = value;
    }

    /**
     * Obtient la valeur de la propriété voutAgeVehiculeDuree.
     * 
     * @return
     *     possible object is
     *     {@link VOUTAgeVehiculeDureeType }
     *     
     */
    public VOUTAgeVehiculeDureeType getVOUTAgeVehiculeDuree() {
        return voutAgeVehiculeDuree;
    }

    /**
     * Définit la valeur de la propriété voutAgeVehiculeDuree.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUTAgeVehiculeDureeType }
     *     
     */
    public void setVOUTAgeVehiculeDuree(VOUTAgeVehiculeDureeType value) {
        this.voutAgeVehiculeDuree = value;
    }

    /**
     * Obtient la valeur de la propriété rcso001.
     * 
     * @return
     *     possible object is
     *     {@link RCSO001Type }
     *     
     */
    public RCSO001Type getRCSO001() {
        return rcso001;
    }

    /**
     * Définit la valeur de la propriété rcso001.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO001Type }
     *     
     */
    public void setRCSO001(RCSO001Type value) {
        this.rcso001 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso001.
     * 
     * @return
     *     possible object is
     *     {@link RMSO001Type }
     *     
     */
    public RMSO001Type getRMSO001() {
        return rmso001;
    }

    /**
     * Définit la valeur de la propriété rmso001.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO001Type }
     *     
     */
    public void setRMSO001(RMSO001Type value) {
        this.rmso001 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso002.
     * 
     * @return
     *     possible object is
     *     {@link RCSO002Type }
     *     
     */
    public RCSO002Type getRCSO002() {
        return rcso002;
    }

    /**
     * Définit la valeur de la propriété rcso002.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO002Type }
     *     
     */
    public void setRCSO002(RCSO002Type value) {
        this.rcso002 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso002.
     * 
     * @return
     *     possible object is
     *     {@link RMSO002Type }
     *     
     */
    public RMSO002Type getRMSO002() {
        return rmso002;
    }

    /**
     * Définit la valeur de la propriété rmso002.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO002Type }
     *     
     */
    public void setRMSO002(RMSO002Type value) {
        this.rmso002 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso003.
     * 
     * @return
     *     possible object is
     *     {@link RCSO003Type }
     *     
     */
    public RCSO003Type getRCSO003() {
        return rcso003;
    }

    /**
     * Définit la valeur de la propriété rcso003.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO003Type }
     *     
     */
    public void setRCSO003(RCSO003Type value) {
        this.rcso003 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso003.
     * 
     * @return
     *     possible object is
     *     {@link RMSO003Type }
     *     
     */
    public RMSO003Type getRMSO003() {
        return rmso003;
    }

    /**
     * Définit la valeur de la propriété rmso003.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO003Type }
     *     
     */
    public void setRMSO003(RMSO003Type value) {
        this.rmso003 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso003ForcageABB.
     * 
     * @return
     *     possible object is
     *     {@link RCSO003ForcageABBType }
     *     
     */
    public RCSO003ForcageABBType getRCSO003ForcageABB() {
        return rcso003ForcageABB;
    }

    /**
     * Définit la valeur de la propriété rcso003ForcageABB.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO003ForcageABBType }
     *     
     */
    public void setRCSO003ForcageABB(RCSO003ForcageABBType value) {
        this.rcso003ForcageABB = value;
    }

    /**
     * Obtient la valeur de la propriété rmso003ForcageABB.
     * 
     * @return
     *     possible object is
     *     {@link RMSO003ForcageABBType }
     *     
     */
    public RMSO003ForcageABBType getRMSO003ForcageABB() {
        return rmso003ForcageABB;
    }

    /**
     * Définit la valeur de la propriété rmso003ForcageABB.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO003ForcageABBType }
     *     
     */
    public void setRMSO003ForcageABB(RMSO003ForcageABBType value) {
        this.rmso003ForcageABB = value;
    }

    /**
     * Obtient la valeur de la propriété rcso004.
     * 
     * @return
     *     possible object is
     *     {@link RCSO004Type }
     *     
     */
    public RCSO004Type getRCSO004() {
        return rcso004;
    }

    /**
     * Définit la valeur de la propriété rcso004.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO004Type }
     *     
     */
    public void setRCSO004(RCSO004Type value) {
        this.rcso004 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso004.
     * 
     * @return
     *     possible object is
     *     {@link RMSO004Type }
     *     
     */
    public RMSO004Type getRMSO004() {
        return rmso004;
    }

    /**
     * Définit la valeur de la propriété rmso004.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO004Type }
     *     
     */
    public void setRMSO004(RMSO004Type value) {
        this.rmso004 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso004ForcageABB.
     * 
     * @return
     *     possible object is
     *     {@link RCSO004ForcageABBType }
     *     
     */
    public RCSO004ForcageABBType getRCSO004ForcageABB() {
        return rcso004ForcageABB;
    }

    /**
     * Définit la valeur de la propriété rcso004ForcageABB.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO004ForcageABBType }
     *     
     */
    public void setRCSO004ForcageABB(RCSO004ForcageABBType value) {
        this.rcso004ForcageABB = value;
    }

    /**
     * Obtient la valeur de la propriété rmso004ForcageABB.
     * 
     * @return
     *     possible object is
     *     {@link RMSO004ForcageABBType }
     *     
     */
    public RMSO004ForcageABBType getRMSO004ForcageABB() {
        return rmso004ForcageABB;
    }

    /**
     * Définit la valeur de la propriété rmso004ForcageABB.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO004ForcageABBType }
     *     
     */
    public void setRMSO004ForcageABB(RMSO004ForcageABBType value) {
        this.rmso004ForcageABB = value;
    }

    /**
     * Obtient la valeur de la propriété rcso005.
     * 
     * @return
     *     possible object is
     *     {@link RCSO005Type }
     *     
     */
    public RCSO005Type getRCSO005() {
        return rcso005;
    }

    /**
     * Définit la valeur de la propriété rcso005.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO005Type }
     *     
     */
    public void setRCSO005(RCSO005Type value) {
        this.rcso005 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso005.
     * 
     * @return
     *     possible object is
     *     {@link RMSO005Type }
     *     
     */
    public RMSO005Type getRMSO005() {
        return rmso005;
    }

    /**
     * Définit la valeur de la propriété rmso005.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO005Type }
     *     
     */
    public void setRMSO005(RMSO005Type value) {
        this.rmso005 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso006.
     * 
     * @return
     *     possible object is
     *     {@link RCSO006Type }
     *     
     */
    public RCSO006Type getRCSO006() {
        return rcso006;
    }

    /**
     * Définit la valeur de la propriété rcso006.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO006Type }
     *     
     */
    public void setRCSO006(RCSO006Type value) {
        this.rcso006 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso006.
     * 
     * @return
     *     possible object is
     *     {@link RMSO006Type }
     *     
     */
    public RMSO006Type getRMSO006() {
        return rmso006;
    }

    /**
     * Définit la valeur de la propriété rmso006.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO006Type }
     *     
     */
    public void setRMSO006(RMSO006Type value) {
        this.rmso006 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso007.
     * 
     * @return
     *     possible object is
     *     {@link RCSO007Type }
     *     
     */
    public RCSO007Type getRCSO007() {
        return rcso007;
    }

    /**
     * Définit la valeur de la propriété rcso007.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO007Type }
     *     
     */
    public void setRCSO007(RCSO007Type value) {
        this.rcso007 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso007.
     * 
     * @return
     *     possible object is
     *     {@link RMSO007Type }
     *     
     */
    public RMSO007Type getRMSO007() {
        return rmso007;
    }

    /**
     * Définit la valeur de la propriété rmso007.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO007Type }
     *     
     */
    public void setRMSO007(RMSO007Type value) {
        this.rmso007 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso008.
     * 
     * @return
     *     possible object is
     *     {@link RCSO008Type }
     *     
     */
    public RCSO008Type getRCSO008() {
        return rcso008;
    }

    /**
     * Définit la valeur de la propriété rcso008.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO008Type }
     *     
     */
    public void setRCSO008(RCSO008Type value) {
        this.rcso008 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso008.
     * 
     * @return
     *     possible object is
     *     {@link RMSO008Type }
     *     
     */
    public RMSO008Type getRMSO008() {
        return rmso008;
    }

    /**
     * Définit la valeur de la propriété rmso008.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO008Type }
     *     
     */
    public void setRMSO008(RMSO008Type value) {
        this.rmso008 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso009.
     * 
     * @return
     *     possible object is
     *     {@link RCSO009Type }
     *     
     */
    public RCSO009Type getRCSO009() {
        return rcso009;
    }

    /**
     * Définit la valeur de la propriété rcso009.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO009Type }
     *     
     */
    public void setRCSO009(RCSO009Type value) {
        this.rcso009 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso009.
     * 
     * @return
     *     possible object is
     *     {@link RMSO009Type }
     *     
     */
    public RMSO009Type getRMSO009() {
        return rmso009;
    }

    /**
     * Définit la valeur de la propriété rmso009.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO009Type }
     *     
     */
    public void setRMSO009(RMSO009Type value) {
        this.rmso009 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso051.
     * 
     * @return
     *     possible object is
     *     {@link RCSO051Type }
     *     
     */
    public RCSO051Type getRCSO051() {
        return rcso051;
    }

    /**
     * Définit la valeur de la propriété rcso051.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO051Type }
     *     
     */
    public void setRCSO051(RCSO051Type value) {
        this.rcso051 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso051.
     * 
     * @return
     *     possible object is
     *     {@link RMSO051Type }
     *     
     */
    public RMSO051Type getRMSO051() {
        return rmso051;
    }

    /**
     * Définit la valeur de la propriété rmso051.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO051Type }
     *     
     */
    public void setRMSO051(RMSO051Type value) {
        this.rmso051 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso052.
     * 
     * @return
     *     possible object is
     *     {@link RCSO052Type }
     *     
     */
    public RCSO052Type getRCSO052() {
        return rcso052;
    }

    /**
     * Définit la valeur de la propriété rcso052.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO052Type }
     *     
     */
    public void setRCSO052(RCSO052Type value) {
        this.rcso052 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso052.
     * 
     * @return
     *     possible object is
     *     {@link RMSO052Type }
     *     
     */
    public RMSO052Type getRMSO052() {
        return rmso052;
    }

    /**
     * Définit la valeur de la propriété rmso052.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO052Type }
     *     
     */
    public void setRMSO052(RMSO052Type value) {
        this.rmso052 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso053.
     * 
     * @return
     *     possible object is
     *     {@link RCSO053Type }
     *     
     */
    public RCSO053Type getRCSO053() {
        return rcso053;
    }

    /**
     * Définit la valeur de la propriété rcso053.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO053Type }
     *     
     */
    public void setRCSO053(RCSO053Type value) {
        this.rcso053 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso053.
     * 
     * @return
     *     possible object is
     *     {@link RMSO053Type }
     *     
     */
    public RMSO053Type getRMSO053() {
        return rmso053;
    }

    /**
     * Définit la valeur de la propriété rmso053.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO053Type }
     *     
     */
    public void setRMSO053(RMSO053Type value) {
        this.rmso053 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso054.
     * 
     * @return
     *     possible object is
     *     {@link RCSO054Type }
     *     
     */
    public RCSO054Type getRCSO054() {
        return rcso054;
    }

    /**
     * Définit la valeur de la propriété rcso054.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO054Type }
     *     
     */
    public void setRCSO054(RCSO054Type value) {
        this.rcso054 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso054.
     * 
     * @return
     *     possible object is
     *     {@link RMSO054Type }
     *     
     */
    public RMSO054Type getRMSO054() {
        return rmso054;
    }

    /**
     * Définit la valeur de la propriété rmso054.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO054Type }
     *     
     */
    public void setRMSO054(RMSO054Type value) {
        this.rmso054 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso055.
     * 
     * @return
     *     possible object is
     *     {@link RCSO055Type }
     *     
     */
    public RCSO055Type getRCSO055() {
        return rcso055;
    }

    /**
     * Définit la valeur de la propriété rcso055.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO055Type }
     *     
     */
    public void setRCSO055(RCSO055Type value) {
        this.rcso055 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso055.
     * 
     * @return
     *     possible object is
     *     {@link RMSO055Type }
     *     
     */
    public RMSO055Type getRMSO055() {
        return rmso055;
    }

    /**
     * Définit la valeur de la propriété rmso055.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO055Type }
     *     
     */
    public void setRMSO055(RMSO055Type value) {
        this.rmso055 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso056.
     * 
     * @return
     *     possible object is
     *     {@link RCSO056Type }
     *     
     */
    public RCSO056Type getRCSO056() {
        return rcso056;
    }

    /**
     * Définit la valeur de la propriété rcso056.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO056Type }
     *     
     */
    public void setRCSO056(RCSO056Type value) {
        this.rcso056 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso056.
     * 
     * @return
     *     possible object is
     *     {@link RMSO056Type }
     *     
     */
    public RMSO056Type getRMSO056() {
        return rmso056;
    }

    /**
     * Définit la valeur de la propriété rmso056.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO056Type }
     *     
     */
    public void setRMSO056(RMSO056Type value) {
        this.rmso056 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso057.
     * 
     * @return
     *     possible object is
     *     {@link RCSO057Type }
     *     
     */
    public RCSO057Type getRCSO057() {
        return rcso057;
    }

    /**
     * Définit la valeur de la propriété rcso057.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO057Type }
     *     
     */
    public void setRCSO057(RCSO057Type value) {
        this.rcso057 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso057.
     * 
     * @return
     *     possible object is
     *     {@link RMSO057Type }
     *     
     */
    public RMSO057Type getRMSO057() {
        return rmso057;
    }

    /**
     * Définit la valeur de la propriété rmso057.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO057Type }
     *     
     */
    public void setRMSO057(RMSO057Type value) {
        this.rmso057 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso058.
     * 
     * @return
     *     possible object is
     *     {@link RCSO058Type }
     *     
     */
    public RCSO058Type getRCSO058() {
        return rcso058;
    }

    /**
     * Définit la valeur de la propriété rcso058.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO058Type }
     *     
     */
    public void setRCSO058(RCSO058Type value) {
        this.rcso058 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso058.
     * 
     * @return
     *     possible object is
     *     {@link RMSO058Type }
     *     
     */
    public RMSO058Type getRMSO058() {
        return rmso058;
    }

    /**
     * Définit la valeur de la propriété rmso058.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO058Type }
     *     
     */
    public void setRMSO058(RMSO058Type value) {
        this.rmso058 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso059.
     * 
     * @return
     *     possible object is
     *     {@link RCSO059Type }
     *     
     */
    public RCSO059Type getRCSO059() {
        return rcso059;
    }

    /**
     * Définit la valeur de la propriété rcso059.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO059Type }
     *     
     */
    public void setRCSO059(RCSO059Type value) {
        this.rcso059 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso059.
     * 
     * @return
     *     possible object is
     *     {@link RMSO059Type }
     *     
     */
    public RMSO059Type getRMSO059() {
        return rmso059;
    }

    /**
     * Définit la valeur de la propriété rmso059.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO059Type }
     *     
     */
    public void setRMSO059(RMSO059Type value) {
        this.rmso059 = value;
    }

    /**
     * Obtient la valeur de la propriété rcso060.
     * 
     * @return
     *     possible object is
     *     {@link RCSO060Type }
     *     
     */
    public RCSO060Type getRCSO060() {
        return rcso060;
    }

    /**
     * Définit la valeur de la propriété rcso060.
     * 
     * @param value
     *     allowed object is
     *     {@link RCSO060Type }
     *     
     */
    public void setRCSO060(RCSO060Type value) {
        this.rcso060 = value;
    }

    /**
     * Obtient la valeur de la propriété rmso060.
     * 
     * @return
     *     possible object is
     *     {@link RMSO060Type }
     *     
     */
    public RMSO060Type getRMSO060() {
        return rmso060;
    }

    /**
     * Définit la valeur de la propriété rmso060.
     * 
     * @param value
     *     allowed object is
     *     {@link RMSO060Type }
     *     
     */
    public void setRMSO060(RMSO060Type value) {
        this.rmso060 = value;
    }

}
