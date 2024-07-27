package br.com.scheduler.controller;


import br.com.scheduler.domain.Client;
import br.com.scheduler.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> list(){
        return new ResponseEntity<>(clientService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Client> create(@RequestBody Client client){
        return new ResponseEntity<>(clientService.create(client),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findById(@PathVariable Long id){
        return ResponseEntity.ok(clientService.findById(id));
    }



}
