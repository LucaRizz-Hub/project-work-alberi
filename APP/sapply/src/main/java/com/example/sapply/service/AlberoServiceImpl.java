package com.example.sapply.service;

import com.example.sapply.model.Albero;
import com.example.sapply.dao.AlberoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AlberoServiceImpl implements AlberoService {

    @Autowired
    private AlberoDao alberoDao;

    @Override
    public List<Albero> elencoAlberi() {
        return (List<Albero>) alberoDao.findAll();
    }

    @Override
    public Albero dettaglioAlbero(int idAlbero) {
        Optional<Albero> alberoOptional = alberoDao.findById(idAlbero);

        if (alberoOptional.isPresent()) {
            return alberoOptional.get();
        }

        return null;
    }

    //da gestire il carrello
    //aggiunta carrello
    //ottieni carrello
    //rimozioneAlberoCarrello
    //totaleCarrello

}
