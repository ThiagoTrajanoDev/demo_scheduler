package br.com.scheduler.repository;

import br.com.scheduler.domain.WorkTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkTimeRepository extends JpaRepository<WorkTime,Long> {
}
