package net.mehdi.activemqjms.repositories.presCore.res_repo;

import net.mehdi.activemqjms.entities.presCore.res_entities.RecordNRPresRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordNRPresResRepository extends JpaRepository<RecordNRPresRes,Long> {
}