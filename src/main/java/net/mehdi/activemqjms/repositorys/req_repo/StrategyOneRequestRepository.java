package net.mehdi.activemqjms.repositorys.req_repo;

import net.mehdi.activemqjms.entities.req_entities.StrategyOneRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrategyOneRequestRepository extends JpaRepository<StrategyOneRequest, Long> {
}
