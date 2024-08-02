package net.mehdi.activemqjms.mappers.presCore.req_mappers;


import net.mehdi.activemqjms.dtos.presCoreDTO.req_dtos.BodyType;
import net.mehdi.activemqjms.dtos.presCoreDTO.req_dtos.HeaderType;
import net.mehdi.activemqjms.dtos.presCoreDTO.req_dtos.StrategyOneRequestPresDTO;
import net.mehdi.activemqjms.entities.presCore.req_entities.StrategyOneRequestPres;

import java.util.Date;

public class StrategyOneRequestPresMapper {
    public static StrategyOneRequestPres toEntity(StrategyOneRequestPresDTO dto, String requestXML) {
        if (dto == null) {
            return null;
        }
        StrategyOneRequestPres entity = new StrategyOneRequestPres();
        HeaderType header = dto.getHeader();
        BodyType body = dto.getBody();
        entity.setOrganizationCode(header.getOrganizationCode());
        entity.setProcessCode(dto.getHeader().getProcessCode());
        entity.setPresReqDate(new Date());
        entity.setRequestXML(requestXML);
        entity.setRecordNR(RecordNRPresMapper.toEntity(body.getRecordNR()));

        return entity;
    }
}

