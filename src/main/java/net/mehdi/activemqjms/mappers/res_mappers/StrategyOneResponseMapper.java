package net.mehdi.activemqjms.mappers.res_mappers;

import net.mehdi.activemqjms.dtos.req_dtos.Body;
import net.mehdi.activemqjms.dtos.req_dtos.Header;
import net.mehdi.activemqjms.dtos.req_dtos.StrategyOneRequestDTO;
import net.mehdi.activemqjms.dtos.res_dtos.*;
import net.mehdi.activemqjms.entities.req_entities.StrategyOneRequest;
import net.mehdi.activemqjms.entities.res_entities.RecordRRRes;
import net.mehdi.activemqjms.entities.res_entities.StrategyOneResponse;
import net.mehdi.activemqjms.mappers.req_mappers.RecordNRMapper;
import net.mehdi.activemqjms.mappers.req_mappers.RecordRRMapper;
import net.mehdi.activemqjms.utils.IntegerUtils;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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



