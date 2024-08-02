package net.mehdi.activemqjms.mappers.presCore.res_mappers;

import net.mehdi.activemqjms.dtos.presCoreDTO.res_dtos.RecordNRPresResDTO;
import net.mehdi.activemqjms.entities.presCore.res_entities.RecordNRPresRes;
import net.mehdi.activemqjms.utils.DoubleUtils;
import net.mehdi.activemqjms.utils.IntegerUtils;


public class RecordNRPresRespMapper {
    public static RecordNRPresRes toEntity(RecordNRPresResDTO dto) {
        if (dto == null) {
            return null;
        }
        RecordNRPresRes entity = new RecordNRPresRes();
        entity.setCapaciteEnd(DoubleUtils.parseDouble(dto.getCapaciteEND().getV()));
        entity.setCodeIdentifiant(dto.getCodeIdentifiant().getV());
        entity.setDecisionOffreMax(dto.getDecisionOffreMax().getV());
        entity.setDureeMax(IntegerUtils.parseInteger(dto.getDureeMax().getV()));
        entity.setFlagCoheranceMarche(dto.getFLAGCoheranceMarche().getV());
        entity.setMensualiteOffreMax(DoubleUtils.parseDouble(dto.getMensualiteOffreMax().getV()));
        entity.setOffreMax(DoubleUtils.parseDouble(dto.getOffreMax().getV()));
        entity.setVoutCharge(DoubleUtils.parseDouble(dto.getVOUTCharge().getV()));
        entity.setVoutFonction(dto.getVOUTFonction().getV());
        entity.setVoutMarche(dto.getVOUTMarche().getV());
        entity.setVoutProfession(dto.getVOUTProfession().getS());
        entity.setVoutRevenu(DoubleUtils.parseDouble(dto.getVOUTRevenu().getV()));
        entity.setVoutSegment(dto.getVOUTSegment().getV());
        entity.setVoutSocieteGestion(dto.getVOUTSocieteGestion().getV());
        return entity;
    }
}
