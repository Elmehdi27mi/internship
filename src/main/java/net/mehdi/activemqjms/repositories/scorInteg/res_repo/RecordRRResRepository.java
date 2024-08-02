package net.mehdi.activemqjms.repositories.scorInteg.res_repo;

import net.mehdi.activemqjms.entities.scorInteg.res_entities.RecordRRRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRRResRepository extends JpaRepository<RecordRRRes, Long> {
}
