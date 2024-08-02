package net.mehdi.activemqjms.services.presCore.req_service;

import net.mehdi.activemqjms.entities.presCore.req_entities.RecordNRPres;
import net.mehdi.activemqjms.entities.presCore.req_entities.StrategyOneRequestPres;

public interface StrategyOneRequestPresService {
    StrategyOneRequestPres saveStrategyOneRequestService(StrategyOneRequestPres strategyOneRequestPres);
    RecordNRPres saveRecordNR(RecordNRPres recordNR);
}
