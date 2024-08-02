package net.mehdi.activemqjms.repositories.scorInteg.req_repo;

import net.mehdi.activemqjms.entities.scorInteg.req_entities.RecordRR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RecordRRRepository extends JpaRepository<RecordRR,Long> {
}
