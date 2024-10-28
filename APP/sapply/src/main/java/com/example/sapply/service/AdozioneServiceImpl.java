package com.example.sapply.service;

import com.example.sapply.dao.AdozioneDao;
import com.example.sapply.model.Adozione;
import com.example.sapply.model.Albero;
import com.example.sapply.model.Utente;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


@Service
public class AdozioneServiceImpl implements AdozioneService{
    @Autowired
    private AdozioneDao adozioneDao;

    @Override
    public List<Adozione> elencoAdozioni(Utente utente){
        return adozioneDao.findByUtente(utente);
    }

    @Override
    public Adozione datiAdozione(int id) {
        return adozioneDao.findById(id).get();
    }

    @Override
    public Adozione creaAdozione(Utente utente, Albero albero, int quantita) {
        Adozione adozione = new Adozione();
        adozione.setUtente(utente);
        adozione.setAlbero(albero);
        adozione.setQuantita(quantita);

        adozione.setDataAdozione(LocalDate.now());
        double costoTotale = albero.getPrezzo() * quantita;
        adozione.setCostoTotale(costoTotale);

        return adozioneDao.save(adozione);
    }

//    @Override
//    public void invioOrdine(HttpSession session) {
//
//    }

}
