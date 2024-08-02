package net.mehdi.activemqjms.services.scorInteg.req_service;

import net.mehdi.activemqjms.entities.scorInteg.req_entities.RecordNR;
import net.mehdi.activemqjms.entities.scorInteg.req_entities.RecordRR;
import net.mehdi.activemqjms.entities.scorInteg.req_entities.StrategyOneRequest;

public interface StrategyOneRequestService {
    StrategyOneRequest saveStrategyOneRequestService(StrategyOneRequest strategyOneRequest);
    RecordNR saveRecordNR(RecordNR recordNR);
    RecordRR saveRecordRR(RecordRR recordRR);
}
