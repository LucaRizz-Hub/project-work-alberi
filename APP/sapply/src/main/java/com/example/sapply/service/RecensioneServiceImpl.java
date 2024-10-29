package com.example.sapply.service;

import com.example.sapply.dao.RecensioneDao;
import com.example.sapply.model.Albero;
import com.example.sapply.model.Recensione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecensioneServiceImpl implements RecensioneService{
    @Autowired
    private RecensioneDao recensioneDao;

    @Override
    public void salvaRecensione(Recensione recensione){
        recensioneDao.save(recensione);
    }

    @Override
    public Recensione trovaRecensione(int idAdozione) {
        return recensioneDao.findByAdozioneId(idAdozione);
    }


}
