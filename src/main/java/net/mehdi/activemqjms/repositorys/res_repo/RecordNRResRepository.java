package net.mehdi.activemqjms.repositorys.res_repo;

import net.mehdi.activemqjms.entities.res_entities.RecordNRRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordNRResRepository extends JpaRepository<RecordNRRes, Long> {
}
