package com.carlaoliver.treinamento.crud.controllers;

import com.carlaoliver.treinamento.crud.entities.Client;
import com.carlaoliver.treinamento.crud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Client saveClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }

    @DeleteMapping
    public void deletClient(@RequestBody Client client) {
       clientRepository.delete(client);
    }


}
