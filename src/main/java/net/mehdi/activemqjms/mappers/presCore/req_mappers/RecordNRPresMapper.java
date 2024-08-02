package net.mehdi.activemqjms.mappers.presCore.req_mappers;

import net.mehdi.activemqjms.dtos.presCoreDTO.req_dtos.RecordNRPresDTO;
import net.mehdi.activemqjms.entities.presCore.req_entities.RecordNRPres;
import net.mehdi.activemqjms.utils.DateUtils;
import net.mehdi.activemqjms.utils.DoubleUtils;
import net.mehdi.activemqjms.utils.IntegerUtils;

public class RecordNRPresMapper {
    public static RecordNRPres toEntity(RecordNRPresDTO dto) {
        if (dto == null) {
            return null;
        }
        RecordNRPres entity = new RecordNRPres();
        entity.setCodeIdentifiant(dto.getCodeIdentifiant().getV());
        entity.setVinCategorieAffaire(dto.getVINCategorieAffaire().getV());
        entity.setVinCharge(DoubleUtils.parseDouble(dto.getVINCharge().getV()));
        entity.setVinDateDemande(DateUtils.toDate(dto.getVINDateDemande().getV()));
        entity.setVinDateNaissance(DateUtils.toDate(dto.getVINDateNaissance().getV()));
        entity.setVinDuree(IntegerUtils.parseInteger(dto.getVINDuree().getV()));
        entity.setVinEmployeur(dto.getVINEmployeur().getV());
        entity.setVinFonction(dto.getVINFonction().getV());
        entity.setVinMarche(dto.getVINMarche().getV());
        entity.setVinMensualite(DoubleUtils.parseDouble(dto.getVINMensualite().getV()));
        entity.setVinMontantDemande(Double.parseDouble(dto.getVINMontantDemande().getV()));
        entity.setVinProfession(dto.getVINProfession().getV());
        entity.setVinRevenu(DoubleUtils.parseDouble(dto.getVINRevenu().getV()));
        entity.setVinSegment(dto.getVINSegment().getV());
        entity.setVinSocieteGestion(dto.getVINSocieteGestion().getV());
        entity.setVinTauxInteret(DoubleUtils.parseDouble(dto.getVINTauxInteret().getV()));


        return entity;
    }
}
