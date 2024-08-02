package net.mehdi.activemqjms.repositories.scorInteg.req_repo;

import net.mehdi.activemqjms.entities.scorInteg.req_entities.StrategyOneRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrategyOneRequestRepository extends JpaRepository<StrategyOneRequest, Long> {
}
