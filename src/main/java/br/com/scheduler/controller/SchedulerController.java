package br.com.scheduler.controller;


import br.com.scheduler.domain.Schedule;
import br.com.scheduler.repository.ScheduleRepository;
import br.com.scheduler.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("agendar")
@RequiredArgsConstructor
public class SchedulerController {

    public final ScheduleService scheduleService;

    @PostMapping
    public ResponseEntity<Schedule> create(@RequestBody Schedule secheduleDTO) {
        Schedule scheduleCreated =  scheduleService.create(secheduleDTO);
        return new ResponseEntity<>(scheduleCreated, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<Schedule>> list() {
        return new ResponseEntity<>(scheduleService.findAll(),HttpStatus.OK);
    }


}
