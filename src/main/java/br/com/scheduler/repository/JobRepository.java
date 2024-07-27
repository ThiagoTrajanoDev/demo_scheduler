package br.com.scheduler.repository;


import br.com.scheduler.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Long> {
}
