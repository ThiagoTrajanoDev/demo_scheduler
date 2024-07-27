package br.com.scheduler.service;

import br.com.scheduler.domain.Worker;
import br.com.scheduler.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerService {

    public final WorkerRepository workerRepository;

    public Worker create(Worker workerDTO){
        return workerRepository.save(workerDTO);
    }


    public List<Worker> findAll() {
        return workerRepository.findAll();
    }
}
