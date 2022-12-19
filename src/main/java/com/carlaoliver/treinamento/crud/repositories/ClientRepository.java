package com.carlaoliver.treinamento.crud.repositories;

import com.carlaoliver.treinamento.crud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {

}
