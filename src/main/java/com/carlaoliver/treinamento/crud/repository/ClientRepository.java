package com.carlaoliver.treinamento.crud.repository;

import com.carlaoliver.treinamento.crud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Integer> {

}
