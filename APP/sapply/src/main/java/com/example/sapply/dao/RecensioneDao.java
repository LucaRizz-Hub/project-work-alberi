package com.example.sapply.dao;

import com.example.sapply.model.Recensione;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecensioneDao extends CrudRepository<Recensione, Integer> {
    Recensione findByAdozioneId(int idAdozione);
    // trova recensioni per l'ID dell'Albero, questa e' una join query in teoria
    List<Recensione> findByAdozione_Albero_Id(int idAlbero);
}
