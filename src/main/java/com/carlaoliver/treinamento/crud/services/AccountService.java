package com.carlaoliver.treinamento.crud.services;

import com.carlaoliver.treinamento.crud.entities.Account;
import com.carlaoliver.treinamento.crud.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Transactional(readOnly = true)
    public List<Account> findAll() {
        List<Account> listAccounts = accountRepository.findAll();
        return listAccounts;

    }

    @Transactional(readOnly = true)
    public Account findById(Integer id) {
        Account accountSingle = accountRepository.findById(id).get();
        return accountSingle;
    }

    @Transactional(readOnly = false)
    public Account save(Account account) {
        Account saveAccount = accountRepository.save(account);
        return saveAccount;
    }

    @Transactional(readOnly = false)
    public Account save(Integer id, Account account) throws Exception {
        if (id != null) {
            account.setId(id);
            Account saveAccount = accountRepository.save(account);
            return saveAccount;
        }
        throw new Exception("O id não poderá ser nulo");
    }

    public void deleteById(Integer id) {
        accountRepository.deleteById(id);
    }
}
