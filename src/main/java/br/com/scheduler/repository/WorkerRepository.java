package br.com.scheduler.repository;

import br.com.scheduler.domain.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
