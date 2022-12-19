package com.carlaoliver.treinamento.crud.repositories;

import com.carlaoliver.treinamento.crud.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {
}
