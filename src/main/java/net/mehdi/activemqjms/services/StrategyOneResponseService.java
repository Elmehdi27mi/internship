package net.mehdi.activemqjms.services;

import net.mehdi.activemqjms.entities.res_entities.RecordNRRes;
import net.mehdi.activemqjms.entities.res_entities.RecordRRRes;
import net.mehdi.activemqjms.entities.res_entities.StrategyOneResponse;

public interface StrategyOneResponseService {
    StrategyOneResponse saveStrategyOneResponseService(StrategyOneResponse strategyOneResponse);
    RecordNRRes saveRecordNRRes(RecordNRRes recordNRRes);
    RecordRRRes saveRecordRRRes(RecordRRRes recordRRRes);
}
