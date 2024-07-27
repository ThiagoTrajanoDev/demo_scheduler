package br.com.scheduler.service;


import br.com.scheduler.domain.Job;
import br.com.scheduler.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobService {

    private final JobRepository jobRepository;

    public List<Job> findAll(){
        return jobRepository.findAll();
    }

    public Job create(Job job) {
        return jobRepository.save(job);
    }

}
