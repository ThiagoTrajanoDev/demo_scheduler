package br.com.scheduler.service;


import br.com.scheduler.domain.Schedule;
import br.com.scheduler.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    public final ScheduleRepository scheduleRepository;

    public Schedule create(Schedule schedule){
            return scheduleRepository.save(schedule);
    }

    public List<Schedule> findAll(){
        return scheduleRepository.findAll();
    }

}
