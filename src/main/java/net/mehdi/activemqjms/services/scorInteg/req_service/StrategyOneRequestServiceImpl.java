package net.mehdi.activemqjms.services.scorInteg.req_service;

import lombok.AllArgsConstructor;
import net.mehdi.activemqjms.entities.scorInteg.req_entities.RecordNR;
import net.mehdi.activemqjms.entities.scorInteg.req_entities.RecordRR;
import net.mehdi.activemqjms.entities.scorInteg.req_entities.StrategyOneRequest;
import net.mehdi.activemqjms.repositories.scorInteg.req_repo.RecordNRRepository;
import net.mehdi.activemqjms.repositories.scorInteg.req_repo.RecordRRRepository;
import net.mehdi.activemqjms.repositories.scorInteg.req_repo.StrategyOneRequestRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StrategyOneRequestServiceImpl implements StrategyOneRequestService {

    private final StrategyOneRequestRepository strategyOneRequestRepository;
    private final RecordNRRepository recordNRRepository;
    private final RecordRRRepository recordRRRepository;

    @Override
    public StrategyOneRequest saveStrategyOneRequestService(StrategyOneRequest strategyOneRequest) {
        try {
            return strategyOneRequestRepository.save(strategyOneRequest);
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors de la sauvegarde de StrategyOneRequest", e);
        }
    }

    @Override
    public RecordNR saveRecordNR(RecordNR recordNR) {
        try {
            return recordNRRepository.save(recordNR);
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors de la sauvegarde de RecordNR", e);
        }
    }

    @Override
    public RecordRR saveRecordRR(RecordRR recordRR) {
        try {
            return recordRRRepository.save(recordRR);
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors de la sauvegarde de RecordRR", e);
        }
    }
}
