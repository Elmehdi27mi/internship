package net.mehdi.activemqjms.mappers.req_mappers;

import net.mehdi.activemqjms.dtos.req_dtos.RecordDTO;
import net.mehdi.activemqjms.entities.req_entities.RecordRR;
import net.mehdi.activemqjms.utils.DateUtils;
import net.mehdi.activemqjms.utils.DoubleUtils;
import net.mehdi.activemqjms.utils.IntegerUtils;

public class RecordRRMapper {

    public static RecordRR toEntity(RecordDTO dto) {
        if (dto == null) {
            return null;
        }

        RecordRR entity = new RecordRR();
        entity.setVinRole(dto.getVINRole().getV());
        entity.setVinProgressifRole(IntegerUtils.parseInteger(dto.getVINProgressifRole().getV()));
        entity.setVinIdentifiantClient(dto.getVINIdentifiantClient().getV());
        entity.setVinTypeClient(dto.getVINTypeClient().getV());
        entity.setVinFormeJuridique(dto.getVINFormeJuridique().getV());
        entity.setVinPartPM(IntegerUtils.parseInteger(dto.getVINPartPM().getV()));
        entity.setVinSexe(dto.getVINSexe().getV());
        entity.setVinDateNaissance(DateUtils.toDate(dto.getVINDateNaissance().getV()) );
        entity.setVinDateCreatEntr(DateUtils.toDate(dto.getVINDateCreatEntr().getV()));
        entity.setVinNouveauClientON(dto.getVINNouveauClientON().getV());
        entity.setVinNationalite(dto.getVINNationalite().getV());
        entity.setVinDateEmbauche(DateUtils.toDate(dto.getVINDateEmbauche().getV()));
        entity.setVinDateCreationRC(DateUtils.toDate(dto.getVINDateCreationRC().getV()));
        entity.setVinSituationLogement(dto.getVINSituationLogement().getV());
        entity.setVinProfession(dto.getVINProfession().getV());
        entity.setVinCodeActivite(dto.getVINCodeActivite().getV());
        entity.setVinDateIntegrationSociete(DateUtils.toDate(dto.getVINDateIntegrationSociete().getV()));
        entity.setVinCodeVille(dto.getVINCodeVille().getV());
        entity.setVinCodeBanque(dto.getVINCodeBanque().getV());
        entity.setVinDateRelationBanque(DateUtils.toDate(dto.getVINDateRelationBanque().getV()));
        entity.setVinNbrAnciensDossiers(IntegerUtils.parseInteger(dto.getVINNbrAnciensDossiers().getV()));
        entity.setVinBlackList(dto.getVINBlackList().getV());
        entity.setVinRevenusMensuels(DoubleUtils.parseDouble(dto.getVINRevenusMensuels().getV()) );
        entity.setVinAutreRevenus(DoubleUtils.parseDouble(dto.getVINAutreRevenus().getV()));
        entity.setVinRevenuConjoint(DoubleUtils.parseDouble(dto.getVINRevenuConjoint().getV()));
        entity.setVinAutreCharges(DoubleUtils.parseDouble(dto.getVINAutreCharges().getV()));
        entity.setVinChargeImm(DoubleUtils.parseDouble(dto.getVINChargeImm().getV()));
        entity.setVinCreditLogement(dto.getVINCreditLogement().getV());
        entity.setVinMaxNbrImpayes(IntegerUtils.parseInteger(dto.getVINMaxNbrImpayes().getV()));
        entity.setVinMtImpayes(DoubleUtils.parseDouble(dto.getVINMtImpayes().getV()));
        entity.setVinMaxNbrMoisRetard(IntegerUtils.parseInteger(dto.getVINMaxNbrMoisRetard().getV()));
        entity.setVinTotalMtNegative(DoubleUtils.parseDouble(dto.getVINTotalMtNegative().getV()));
        entity.setVinSoldeInit(DoubleUtils.parseDouble(dto.getVINSoldeInit().getV()));
        entity.setVinCreditM1(DoubleUtils.parseDouble(dto.getVINCreditM1().getV()));
        entity.setVinCreditM2(DoubleUtils.parseDouble(dto.getVINCreditM2().getV()));
        entity.setVinCreditM3(DoubleUtils.parseDouble(dto.getVINCreditM3().getV()));
        entity.setVinDebitM1(DoubleUtils.parseDouble(dto.getVINDebitM1().getV()));
        entity.setVinDebitM2(DoubleUtils.parseDouble(dto.getVINDebitM2().getV()));
        entity.setVinDebitM3(DoubleUtils.parseDouble(dto.getVINDebitM3().getV()));
        entity.setVinSource(dto.getVINSource().getV());
        entity.setVinReferenceProgressifRole(IntegerUtils.parseInteger(dto.getVINReferenceProgressifRole().getV()));
        entity.setVinNumeroChequiers(dto.getVINNumeroChequiers().getV());
        entity.setVinDateEffet(DateUtils.toDate(dto.getVINDateEffet().getV()));
        entity.setVinDateSortie(DateUtils.toDate(dto.getVINDateSortie().getV()));
        entity.setVinStatutChequiers(dto.getVINStatutChequiers().getV());
        entity.setVinMontantChequier(DoubleUtils.parseDouble(dto.getVINMontantChequier().getV()));
        entity.setVinProduitAffaire(dto.getVINProduitAffaire().getV());
        entity.setVinContentieux(dto.getVINContentieux().getV());
        entity.setVinNbrImpayes(IntegerUtils.parseInteger(dto.getVINNbrImpayes().getV()));
        entity.setVinNbrImpayes12(IntegerUtils.parseInteger(dto.getVINNbrImpayes12().getV()));
        entity.setVinDatePremiereEcheance(DateUtils.toDate(dto.getVINDatePremiereEcheance().getV()));
        entity.setVinDateCreationAffaire(DateUtils.toDate(dto.getVINDateCreationAffaire().getV()));
        entity.setVinCompensation(dto.getVINCompensation().getV());
        entity.setVinCRD(DoubleUtils.parseDouble(dto.getVINCRD().getV()));
        entity.setVinSolde(DoubleUtils.parseDouble(dto.getVINSOLDE().getV()));
        entity.setVinStatutAffaire(dto.getVINStatutAffaire().getV());
        entity.setVinMtPremiereEcheancheAncienneAffaire(DoubleUtils.parseDouble(dto.getVINMtPremiereEcheancheAncienneAffaire().getV()));
        entity.setVinNbrIncidents(IntegerUtils.parseInteger(dto.getVINNbrIncidents().getV()));
        entity.setVinLoyerEkip(DoubleUtils.parseDouble(dto.getVINLoyerEkip().getV()));
        entity.setVinLoyerEkipComp(DoubleUtils.parseDouble(dto.getVINLoyerEkipComp().getV()));
        entity.setVinLoyerFront(DoubleUtils.parseDouble(dto.getVINLoyerFront().getV()));
        entity.setVinRoleAncienneAffaire(dto.getVINRoleAncienneAffaire().getV());
        entity.setVinMarche(dto.getVINMarche().getV());
        entity.setVinSegment(dto.getVINSegment().getV());
        entity.setVinEmployeur(dto.getVINEmployeur().getV());
        entity.setVinFonction(dto.getVINFonction().getV());
        entity.setVinDateFinContrat(DateUtils.toDate(dto.getVINDATEFINCONTRAT().getV()));
        entity.setVinFlagSinistre(dto.getVINFLAGSINISTRE().getV());
        entity.setVinTypeGarantie(dto.getVINTYPEGARANTIE().getV());
        entity.setVinMontantExpertise(DoubleUtils.parseDouble(dto.getVINMONTANTEXPERTISE().getV()));
        entity.setVinDateCertificat(DateUtils.toDate(dto.getVINDATECERTIFICAT().getV()));
        entity.setVinQuotePartGr(DoubleUtils.parseDouble(dto.getVINQUOTEPARTGR().getV()));
        entity.setVinVilleBien(dto.getVINCodeVille().getV());
        entity.setVinRangGarantie(IntegerUtils.parseInteger(dto.getVINRangGarantie().getV()));
        entity.setVinTypeContrat(dto.getVINTYPECONTRAT().getV());
        entity.setVinEcheanceRestante(DoubleUtils.parseDouble(dto.getVINECHEANCERESTANTE().getV()));
        entity.setVinONU(DoubleUtils.parseDouble(dto.getVINONU().getV()));
        entity.setVinAnneeBilan(dto.getVINAnneeBilan().getV());
        entity.setVinCtrlInforisk(IntegerUtils.parseInteger(dto.getVINCTRLINFORISK().getV()));
        entity.setVinStocks(DoubleUtils.parseDouble(dto.getVINSTOCKS().getV()));
        entity.setVinCreanceActifCirc(DoubleUtils.parseDouble(dto.getVINCREANCEACTIFCIRC().getV()));
        entity.setVinTresorerieActif(DoubleUtils.parseDouble(dto.getVINTOTALACTIF().getV()));
        entity.setVinTotalActif(DoubleUtils.parseDouble(dto.getVINTOTALACTIF().getV()));
        entity.setVinCapitauxPropres(DoubleUtils.parseDouble(dto.getVINCAPITAUXPROPRES().getV()));
        entity.setVinDettesFinancement(DoubleUtils.parseDouble(dto.getVINDETTESFINANCEMENT().getV()));
        entity.setVinProvisionRisqueCharge(DoubleUtils.parseDouble(dto.getVINPROVISIONRISQUECHARGE().getV()));
        entity.setVinEcartConvPassifFinPermanent(DoubleUtils.parseDouble(dto.getVINECARTCONVPASSIFFINPERMANENT().getV()));
        entity.setVinDettesPassifCirc(DoubleUtils.parseDouble(dto.getVINDETTESPASSIFCIRC().getV()));
        entity.setVinAutresProvisionRisqueCharge(DoubleUtils.parseDouble(dto.getVINAUTRESPROVISIONRISQUECHARGE().getV()));
        entity.setVinEcartConvPassifCirc(DoubleUtils.parseDouble(dto.getVINECARTCONVPASSIFCIRC().getV()));
        entity.setVinTotalPassifCirc(DoubleUtils.parseDouble(dto.getVINTOTALPASSIFCIRC().getV()));
        entity.setVinChiffreAffaireN1(DoubleUtils.parseDouble(dto.getVINCHIFFREAFFAIREN1().getV()));
        entity.setVinChiffreAffaireN0(DoubleUtils.parseDouble(dto.getVINCHIFFREAFFAIREN0().getV()));
        entity.setVinVariationStockPdt(DoubleUtils.parseDouble(dto.getVINVARIATIONSTOCKPDT().getV()));
        entity.setVinAutresPdtExpl(DoubleUtils.parseDouble(dto.getVINAUTRESPDTEXPL().getV()));
        entity.setVinAchatRevenduMarchandise(DoubleUtils.parseDouble(dto.getVINACHATREVENDUMARCHANDISE().getV()));
        entity.setVinAchatConsMatiereFourniture(DoubleUtils.parseDouble(dto.getVINACHATCONSMATIEREFOURNITURE().getV()));
        entity.setVinDotationExploitationN1(DoubleUtils.parseDouble(dto.getVINDOTATIONEXPLOITATIONN1().getV()));
        entity.setVinDotationExploitationN0(DoubleUtils.parseDouble(dto.getVINDOTATIONEXPLOITATIONN0().getV()));
        entity.setVinChargeFin(DoubleUtils.parseDouble(dto.getVINCHARGEFIN().getV()));
        entity.setVinResultatFin(DoubleUtils.parseDouble(dto.getVINRESULTATFIN().getV()));
        entity.setVinResultatNetN1(DoubleUtils.parseDouble(dto.getVINRESULTATNETN1().getV()));
        entity.setVinResultatNetN0(DoubleUtils.parseDouble(dto.getVINRESULTATNETN0().getV()));
        entity.setVinIeAffaireOld(dto.getVINIEAFFAIREOLD().getV());
        entity.setVinFlagReport(dto.getVINFlagReport().getV());
        entity.setVinDateDernierIMP(DateUtils.toDate(dto.getVINDateDernierIMP().getV()));

        return entity;
    }










}
