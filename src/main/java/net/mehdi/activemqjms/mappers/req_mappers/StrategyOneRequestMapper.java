package net.mehdi.activemqjms.mappers.req_mappers;


import net.mehdi.activemqjms.dtos.req_dtos.Body;
import net.mehdi.activemqjms.dtos.req_dtos.Header;
import net.mehdi.activemqjms.dtos.req_dtos.RecordDTO;
import net.mehdi.activemqjms.dtos.req_dtos.StrategyOneRequestDTO;
import net.mehdi.activemqjms.entities.req_entities.RecordRR;
import net.mehdi.activemqjms.entities.req_entities.StrategyOneRequest;
import net.mehdi.activemqjms.utils.IntegerUtils;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class StrategyOneRequestMapper {
    public static StrategyOneRequest toEntity(StrategyOneRequestDTO dto, List<RecordRR> recordRRList) {
        if (dto == null) {
            return null;
        }
        StrategyOneRequest entity = new StrategyOneRequest();
        Header header = dto.getHeader();
        Body body = dto.getBody();
        entity.setOrganizationCode(header.getOrganizationCode());
        entity.setVinRandomNumber( IntegerUtils.parseInteger(body.getRecordNR().getVINRandomNumber().getV()));
        entity.setInquiryCode(IntegerUtils.parseInteger(header.getInquiryCode()));
        entity.setReqDate(new Date());
        entity.setRecordNR(RecordNRMapper.toEntity(body.getRecordNR()));
        entity.setRecordRRs(recordRRList);
        recordRRList.forEach(recordRR -> {
            recordRR.setStrategyOneRequest(entity);
        });
        return entity;
    }
}
