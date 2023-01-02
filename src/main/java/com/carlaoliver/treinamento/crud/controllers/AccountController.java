package com.carlaoliver.treinamento.crud.controllers;

import com.carlaoliver.treinamento.crud.entities.Account;
import com.carlaoliver.treinamento.crud.services.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/accounts")
public class AccountController {

    final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> listAccounts() {
        return accountService.findAll();
    }

    @GetMapping("/{id}")
    public Account listAccountsingle(@PathVariable(value = "id") Integer id) {
        return accountService.findById(id);
    }

    @PostMapping
    public Account saveAccount(@RequestBody Account account) {
        return accountService.save(account);
    }

    @DeleteMapping("/{id}")
    public void deletAccount(@PathVariable(value = "id") Integer id) {
        accountService.deleteById(id);
    }


    @PutMapping
    public Account updateAccount(@RequestBody Account account) {
        return accountService.save(account);
    }


}
