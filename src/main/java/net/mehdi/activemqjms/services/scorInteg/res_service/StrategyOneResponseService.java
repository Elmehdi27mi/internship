package net.mehdi.activemqjms.services.scorInteg.res_service;

import net.mehdi.activemqjms.entities.scorInteg.res_entities.RecordNRRes;
import net.mehdi.activemqjms.entities.scorInteg.res_entities.RecordRRRes;
import net.mehdi.activemqjms.entities.scorInteg.res_entities.StrategyOneResponse;

public interface StrategyOneResponseService {
    StrategyOneResponse saveStrategyOneResponseService(StrategyOneResponse strategyOneResponse);
    RecordNRRes saveRecordNRRes(RecordNRRes recordNRRes);
    RecordRRRes saveRecordRRRes(RecordRRRes recordRRRes);
}
