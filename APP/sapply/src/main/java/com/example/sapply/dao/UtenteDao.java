package com.example.sapply.dao;

import com.example.sapply.model.Utente;
import org.springframework.data.repository.CrudRepository;

public interface UtenteDao extends CrudRepository<Utente, Integer> {
    Utente findByUsernameAndPassword(String username, String password);

    //servirà effettivamente?
    Utente findByUsername(String username);
}
