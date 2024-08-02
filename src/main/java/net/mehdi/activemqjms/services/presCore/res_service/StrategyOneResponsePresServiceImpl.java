package net.mehdi.activemqjms.services.presCore.res_service;

import lombok.AllArgsConstructor;
import net.mehdi.activemqjms.entities.presCore.res_entities.RecordNRPresRes;
import net.mehdi.activemqjms.entities.presCore.res_entities.StrategyOneResponsePres;
import net.mehdi.activemqjms.repositories.presCore.res_repo.RecordNRPresResRepository;
import net.mehdi.activemqjms.repositories.presCore.res_repo.StrategyOneResponsePresRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StrategyOneResponsePresServiceImpl implements StrategyOneResponsePresService {
    private StrategyOneResponsePresRepository strategyOneResponsePresRepository;
    private RecordNRPresResRepository recordNRPresResRepository;
    @Override
    public StrategyOneResponsePres saveStartegyOneResponseService(StrategyOneResponsePres strategyOneResponsePres) {
        try{
            return strategyOneResponsePresRepository.save(strategyOneResponsePres);
        }catch (Exception e) {
            throw new RuntimeException("Erreur lors de la sauvegarde de StrategyOneResponse", e);
        }
    }

    @Override
    public RecordNRPresRes saveRecordNR(RecordNRPresRes recordNRPresRes) {
        try{
            return recordNRPresResRepository.save(recordNRPresRes);
        }catch (Exception e) {
            throw new RuntimeException("Erreur lors de la sauvegarde de RecordNR", e);
        }
    }
}
