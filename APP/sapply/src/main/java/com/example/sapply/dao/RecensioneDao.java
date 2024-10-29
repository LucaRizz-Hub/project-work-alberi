package com.example.sapply.dao;

import com.example.sapply.model.Recensione;
import org.springframework.data.repository.CrudRepository;

public interface RecensioneDao extends CrudRepository<Recensione, Integer> {
    Recensione findByAdozioneId(int idAdozione);
}
