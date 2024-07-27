package br.com.scheduler.controller;

import br.com.scheduler.domain.Worker;
import br.com.scheduler.service.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("worker")
@RequiredArgsConstructor
public class WorkerController {

    public final WorkerService workerService;


    @PostMapping
    public ResponseEntity<Worker> create(@RequestBody Worker workerDTO) {
        Worker worker  = workerService.create(workerDTO);
        return new ResponseEntity<>(worker, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Worker>> list() {
        return new ResponseEntity<>(workerService.findAll(),HttpStatus.OK);
    }

}
