//package com.carlaoliver.treinamento.crud.services;
//
//import com.carlaoliver.treinamento.crud.entities.Client;
//import com.carlaoliver.treinamento.crud.repositories.ClientRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ClientService {
//
//    @Autowired
//    ClientRepository clientRepository;
//
//
//    public List<Client> listClients() {
//        return clientRepository.findAll();
//    }
//
//    public Client listClientsingle(Integer id) {
//        Optional<Client> qualquercoisa = clientRepository.findById(id);
//        if (qualquercoisa.isPresent()) {
//            return qualquercoisa.get();
//        }
//        return null;
//    }
//}
