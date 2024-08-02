package net.mehdi.activemqjms.mappers.presCore.res_mappers;

import net.mehdi.activemqjms.dtos.presCoreDTO.res_dtos.BodyType;
import net.mehdi.activemqjms.dtos.presCoreDTO.res_dtos.HeaderType;
import net.mehdi.activemqjms.dtos.presCoreDTO.res_dtos.StrategyOneResponsePresResDTO;
import net.mehdi.activemqjms.entities.presCore.res_entities.StrategyOneResponsePres;

import java.util.Date;

public class StrategyOneResponsePresMapper {
    public static StrategyOneResponsePres toEntity(StrategyOneResponsePresResDTO dto, String requestXML) {
        if (dto == null) {
            return null;
        }
        StrategyOneResponsePres entity = new StrategyOneResponsePres();
        HeaderType header = dto.getHeader();
        BodyType body = dto.getBody();
        entity.setOrganizationCode(header.getOrganizationCode());
        entity.setProcessCode(dto.getHeader().getProcessCode());
        entity.setPresResDate(new Date());
        entity.setResponseXML(requestXML);
        entity.setRecordNR(RecordNRPresRespMapper.toEntity(body.getRecordNR()));

        return entity;
    }
}
