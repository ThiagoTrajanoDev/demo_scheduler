package br.com.scheduler.controller;


import br.com.scheduler.domain.Job;
import br.com.scheduler.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("job")
@RequiredArgsConstructor
public class JobController {

    private final JobService jobService;

    @GetMapping
    public ResponseEntity<List<Job>> list(){
        return new ResponseEntity<>(jobService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Job> create(@RequestBody Job job){
        return new ResponseEntity<>(jobService.create(job), HttpStatus.CREATED);
    }

}
