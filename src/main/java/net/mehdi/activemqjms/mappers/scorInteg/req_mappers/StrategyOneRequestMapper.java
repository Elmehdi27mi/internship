package net.mehdi.activemqjms.mappers.scorInteg.req_mappers;


import net.mehdi.activemqjms.dtos.scorIntegDTO.req_dtos.Body;
import net.mehdi.activemqjms.dtos.scorIntegDTO.req_dtos.Header;
import net.mehdi.activemqjms.dtos.scorIntegDTO.req_dtos.StrategyOneRequestDTO;
import net.mehdi.activemqjms.entities.scorInteg.req_entities.RecordRR;
import net.mehdi.activemqjms.entities.scorInteg.req_entities.StrategyOneRequest;
import net.mehdi.activemqjms.utils.IntegerUtils;

import java.util.Date;
import java.util.List;

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
