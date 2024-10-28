package com.example.sapply.dao;

import com.example.sapply.model.Adozione;
import com.example.sapply.model.Utente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdozioneDao extends CrudRepository<Adozione, Integer> {
    List<Adozione> findByUtente(Utente utente);
}
