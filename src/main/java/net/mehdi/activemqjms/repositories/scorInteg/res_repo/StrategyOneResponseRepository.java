package net.mehdi.activemqjms.repositories.scorInteg.res_repo;

import net.mehdi.activemqjms.entities.scorInteg.res_entities.StrategyOneResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrategyOneResponseRepository extends JpaRepository<StrategyOneResponse,Long> {
}
