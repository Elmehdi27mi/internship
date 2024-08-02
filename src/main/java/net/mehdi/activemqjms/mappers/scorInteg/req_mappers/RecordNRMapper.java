package net.mehdi.activemqjms.mappers.scorInteg.req_mappers;

import net.mehdi.activemqjms.dtos.scorIntegDTO.req_dtos.RecordNRDTO;
import net.mehdi.activemqjms.entities.scorInteg.req_entities.RecordNR;
import net.mehdi.activemqjms.utils.DateUtils;
import net.mehdi.activemqjms.utils.DoubleUtils;
import net.mehdi.activemqjms.utils.IntegerUtils;

public class RecordNRMapper {

    public static RecordNR toEntity(RecordNRDTO dto) {
        if (dto == null) {
            return null;
        }

        RecordNR entity = new RecordNR();
        entity.setVinSocieteGestion(dto.getVINSocieteGestion().getV());
        entity.setVinDateDemande(DateUtils.toDate(dto.getVINDateDemande().getV()));
        entity.setVinNumeroDemande(dto.getVINNumeroDemande().getV());
        entity.setVinCodeAgence(dto.getVINCodeAgence().getV());
        entity.setVinCategorieAffaire(dto.getVINCategorieAffaire().getV());
        entity.setVinTypePrelevement(dto.getVINTypePrelevement().getV());
        entity.setVinMontantDemande(DoubleUtils.parseDouble(dto.getVINMontantDemande().getV()));
        entity.setVinDureeDemande(IntegerUtils.parseInteger(dto.getVINDureeDemande().getV()));
        entity.setVinMensualiteDemande(DoubleUtils.parseDouble(dto.getVINMensualiteDemande().getV()));
        entity.setVinPremLoyer(DoubleUtils.parseDouble(dto.getVINPremLoyer().getV()));
        entity.setVinPrixVehicule(DoubleUtils.parseDouble(dto.getVINPrixVehicule().getV()));
        entity.setVinMontantApport(DoubleUtils.parseDouble(dto.getVINMontantApport().getV()));
        entity.setVinDateMiseCirc(net.mehdi.activemqjms.utils.DateUtils.toDate(dto.getVINDateMiseCirc().getV()));
        entity.setVinTauxInteret(DoubleUtils.parseDouble(dto.getVINTauxInteret().getV()));
        entity.setVinDepotGarantie(DoubleUtils.parseDouble(dto.getVINDepotGarantie().getV()));
        entity.setVinNumLancement(IntegerUtils.parseInteger(dto.getVINNUMLANCEMENT().getV()));
        entity.setVinEcheanceReservation(DoubleUtils.parseDouble(dto.getVINEcheanceReservation().getV()));
        entity.setVinEcheanceConfirmation(DoubleUtils.parseDouble(dto.getVINEcheanceConfirmation().getV()));
        entity.setVinDateReservation(DateUtils.toDate(dto.getVINDateReservation().getV()));
        entity.setVinDateConfirmation(DateUtils.toDate(dto.getVINDateConfirmation().getV()));
        entity.setVinCodeFournisseur(dto.getVINCodeFournisseur().getV());
        entity.setVinCodeGestionnaire(dto.getVINCodeGestionnaire().getV());
        entity.setVinFlagFlotte(dto.getVINFlagFlotte().getV());
        entity.setVinPrixVenteCatalogue(DoubleUtils.parseDouble(dto.getVINPrixVenteCatalogue().getV()));
        entity.setVinMarque(dto.getVINMarque().getV());
        entity.setVinGenre(dto.getVINGenre().getV());
        entity.setVinGamme(dto.getVINGamme().getV());

        return entity;
    }

   }
