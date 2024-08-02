package net.mehdi.activemqjms.services.scorInteg.res_service;

import lombok.AllArgsConstructor;
import net.mehdi.activemqjms.entities.scorInteg.res_entities.RecordNRRes;
import net.mehdi.activemqjms.entities.scorInteg.res_entities.RecordRRRes;
import net.mehdi.activemqjms.entities.scorInteg.res_entities.StrategyOneResponse;
import net.mehdi.activemqjms.repositories.scorInteg.res_repo.RecordNRResRepository;
import net.mehdi.activemqjms.repositories.scorInteg.res_repo.RecordRRResRepository;
import net.mehdi.activemqjms.repositories.scorInteg.res_repo.StrategyOneResponseRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StrategyOneResponseServiceImpl implements StrategyOneResponseService {
    private StrategyOneResponseRepository strategyOneResponseRepository;
    private RecordRRResRepository recordRRResRepository;
    private RecordNRResRepository recordNRResRepository;

    @Override
    public StrategyOneResponse saveStrategyOneResponseService(StrategyOneResponse strategyOneResponse) {
        try{
        return strategyOneResponseRepository.save(strategyOneResponse);
        } catch (Exception e) {

            throw new RuntimeException("Erreur lors de la sauvegarde de StrategyOneResponse", e);
        }
    }

    @Override
    public RecordNRRes saveRecordNRRes(RecordNRRes recordNRRes) {
        try{
        return recordNRResRepository.save(recordNRRes);
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors de la sauvegarde de RecordNRRes", e);
        }
    }

    @Override
    public RecordRRRes saveRecordRRRes(RecordRRRes recordRRRes) {
        try{
        return recordRRResRepository.save(recordRRRes);
        } catch (Exception e) {

            throw new RuntimeException("Erreur lors de la sauvegarde de RecordRRRess", e);
        }
    }
}
