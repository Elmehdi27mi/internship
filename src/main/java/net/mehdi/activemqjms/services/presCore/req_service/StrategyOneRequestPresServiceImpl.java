package net.mehdi.activemqjms.services.presCore.req_service;

import lombok.AllArgsConstructor;
import net.mehdi.activemqjms.entities.presCore.req_entities.RecordNRPres;
import net.mehdi.activemqjms.entities.presCore.req_entities.StrategyOneRequestPres;
import net.mehdi.activemqjms.repositories.presCore.req_repo.RecordNRPresRepository;
import net.mehdi.activemqjms.repositories.presCore.req_repo.StrategyOneRequestPresRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StrategyOneRequestPresServiceImpl implements StrategyOneRequestPresService {
    private  StrategyOneRequestPresRepository strategyOneRequestRepository;
    private  RecordNRPresRepository recordNRRepository;
    @Override
    public StrategyOneRequestPres saveStrategyOneRequestService(StrategyOneRequestPres strategyOneRequestPres) {
        try {
            return strategyOneRequestRepository.save(strategyOneRequestPres);
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors de la sauvegarde de StrategyOneRequest", e);
        }
    }

    @Override
    public RecordNRPres saveRecordNR(RecordNRPres recordNR) {
        try {
            return recordNRRepository.save(recordNR);
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors de la sauvegarde de RecordNR", e);
        }
    }
}
