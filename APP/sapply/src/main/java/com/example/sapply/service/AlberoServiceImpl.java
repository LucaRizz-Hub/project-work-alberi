package com.example.sapply.service;

import com.example.sapply.model.Albero;
import com.example.sapply.dao.AlberoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AlberoServiceImpl implements AlberoService {

    @Autowired
    private AlberoDao alberoDao;

    @Override
    public List<Albero> elencoAlberi() {
        return (List<Albero>) alberoDao.findAll();
    }

   /* public Map<String, List<Albero>> getAlberiPerContinente(){
        Map<String, List<Albero>> alberiPerContinente = new HashMap<>();
        // Aggiungi ogni lista di alberi per continente
        alberiPerContinente.put("Europa", alberoDao.findByContinente("Europa"));
        alberiPerContinente.put("Asia", alberoDao.findByContinente("Asia"));
        alberiPerContinente.put("Oceania", alberoDao.findByContinente("Oceania"));
        alberiPerContinente.put("America", alberoDao.findByContinente("America"));
        alberiPerContinente.put("Africa", alberoDao.findByContinente("Africa"));

        return alberiPerContinente;
    }*/

    @Override
    public Albero dettaglioAlbero(int idAlbero) {
        Optional<Albero> alberoOptional = alberoDao.findById(idAlbero);

        if (alberoOptional.isPresent()) {
            return alberoOptional.get();
        }

        return null;
    }


}
