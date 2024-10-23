package com.example.sapply.service;

import com.example.sapply.dao.AdozioneDao;
import com.example.sapply.model.Adozione;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdozioneServiceImpl implements AdozioneService{
    @Autowired
    private AdozioneDao adozioneDao;

    @Override
    public List<Adozione> elencoAdozioni(){
        return (List<Adozione>) adozioneDao.findAll();
    }

    @Override
    public Adozione datiAdozione(int id) {
        return adozioneDao.findById(id).get();
    }

}
