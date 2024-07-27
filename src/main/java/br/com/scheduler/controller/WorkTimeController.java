package br.com.scheduler.controller;


import br.com.scheduler.domain.WorkTime;
import br.com.scheduler.service.WorkTimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("worktime")
@RequiredArgsConstructor
public class WorkTimeController {

    private final WorkTimeService workTimeService;


    @GetMapping
    public ResponseEntity<List<WorkTime>> list() {
        return new ResponseEntity<>(workTimeService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<WorkTime> create(@RequestBody WorkTime workTime) {
        return new ResponseEntity<>(workTimeService.create(workTime),HttpStatus.CREATED);
    }


}
