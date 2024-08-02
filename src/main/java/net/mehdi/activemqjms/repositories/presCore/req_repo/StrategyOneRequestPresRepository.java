package net.mehdi.activemqjms.repositories.presCore.req_repo;

import net.mehdi.activemqjms.entities.presCore.req_entities.StrategyOneRequestPres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrategyOneRequestPresRepository extends JpaRepository<StrategyOneRequestPres,Long> {
}
