package fr.m2i.dao;

import fr.m2i.model.Account;

import javax.persistence.EntityManagerFactory;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private EntityManagerFactory emf;

    public AccountDaoImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public void save(Account account) {
        throw new UnsupportedOperationException("I don't wanna work without implementation!"); // todo
    }

    @Override
    public Account findById(Long id) {
        throw new UnsupportedOperationException("I don't wanna work without implementation!"); // todo
    }

    @Override
    public Account findByEmail(String email) {
        throw new UnsupportedOperationException("I don't wanna work without implementation!"); // todo
    }

    @Override
    public List<Account> findAll() {
        throw new UnsupportedOperationException("I don't wanna work without implementation!"); // todo
    }

    @Override
    public void update(Account account) {
        throw new UnsupportedOperationException("I don't wanna work without implementation!"); // todo
    }

    @Override
    public void remove(Account account) {
        throw new UnsupportedOperationException("I don't wanna work without implementation!"); // todo
    }
}


