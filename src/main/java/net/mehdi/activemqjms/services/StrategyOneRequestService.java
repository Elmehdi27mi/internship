package net.mehdi.activemqjms.services;

import net.mehdi.activemqjms.entities.req_entities.RecordNR;
import net.mehdi.activemqjms.entities.req_entities.RecordRR;
import net.mehdi.activemqjms.entities.req_entities.StrategyOneRequest;

public interface StrategyOneRequestService {
    StrategyOneRequest saveStrategyOneRequestService(StrategyOneRequest strategyOneRequest);
    RecordNR saveRecordNR(RecordNR recordNR);
    RecordRR saveRecordRR(RecordRR recordRR);
}
