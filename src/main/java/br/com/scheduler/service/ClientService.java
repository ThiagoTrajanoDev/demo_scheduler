package br.com.scheduler.service;

import br.com.scheduler.domain.Client;
import br.com.scheduler.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private  final ClientRepository  clientRepository;

    public Client create(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public Client findById(Long id){
        return clientRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Cliente não encontrado"));

    }
}
