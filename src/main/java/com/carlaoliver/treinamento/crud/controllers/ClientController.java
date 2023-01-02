package com.carlaoliver.treinamento.crud.controllers;

import com.carlaoliver.treinamento.crud.entities.Client;
import com.carlaoliver.treinamento.crud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping
    public List<Client> listClients() {
        return clientRepository.findAll();
    }


    @GetMapping("/{id}")
    public Client listClientsingle(@PathVariable(value = "id") Integer id) {
        return clientRepository.findById(id).get();
    }

    @PostMapping
    public List<Client> saveClient(@RequestBody List<Client> client) {
        List<Client> listClients = client.stream()
                .map(item -> clientRepository.save(item))
                .collect(Collectors.toList());
        return listClients;
    }

    @DeleteMapping("/{id}")
    public void deletClient(@PathVariable(value = "id") Integer id) {
        clientRepository.deleteById(id);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }

}
