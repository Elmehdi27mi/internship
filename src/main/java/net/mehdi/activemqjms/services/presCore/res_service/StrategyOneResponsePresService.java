package net.mehdi.activemqjms.services.presCore.res_service;

import net.mehdi.activemqjms.entities.presCore.res_entities.RecordNRPresRes;
import net.mehdi.activemqjms.entities.presCore.res_entities.StrategyOneResponsePres;

public interface StrategyOneResponsePresService {
    StrategyOneResponsePres saveStartegyOneResponseService(StrategyOneResponsePres strategyOneResponsePresResDTO);
    RecordNRPresRes saveRecordNR(RecordNRPresRes recordNRPresRes);
}
