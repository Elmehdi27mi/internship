package net.mehdi.activemqjms.mappers.scorInteg.res_mappers;

import net.mehdi.activemqjms.dtos.scorIntegDTO.res_dtos.BodyType;
import net.mehdi.activemqjms.dtos.scorIntegDTO.res_dtos.HeaderType;
import net.mehdi.activemqjms.dtos.scorIntegDTO.res_dtos.StrategyOneResponseDTO;
import net.mehdi.activemqjms.entities.scorInteg.res_entities.RecordRRRes;
import net.mehdi.activemqjms.entities.scorInteg.res_entities.StrategyOneResponse;
import java.util.Date;
import java.util.List;
public class StrategyOneResponseMapper {
    public static StrategyOneResponse toEntity(StrategyOneResponseDTO dto, List<RecordRRRes>recordRRResList) {
        if (dto == null) {
            return null;
        }
        StrategyOneResponse entity = new StrategyOneResponse();
        HeaderType header = dto.getHeader();
        BodyType body = dto.getBody();
        entity.setOrganizationCode(header.getOrganizationCode());
        entity.setResDate(new Date());
        entity.setRecordNRResp(RecordNRRespMapper.toEntity(body.getRecordNR()));
        entity.setRecordRRResps(recordRRResList);
        recordRRResList.forEach(recordRR -> {
            recordRR.setStrategyOneResponse(entity);
        });
        return entity;
    }
}



