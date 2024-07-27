package br.com.scheduler.service;


import br.com.scheduler.domain.WorkTime;
import br.com.scheduler.repository.WorkTimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkTimeService {

    private final WorkTimeRepository workTimeRepository;

    public List<WorkTime> findAll(){
        return workTimeRepository.findAll();
    }

    public WorkTime create(WorkTime workTime) {
        return workTimeRepository.save(workTime);
    }

}
