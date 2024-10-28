package com.example.sapply.service;

import com.example.sapply.model.Adozione;
import com.example.sapply.model.Albero;
import com.example.sapply.model.Utente;
import jakarta.servlet.http.HttpSession;

import java.util.List;

public interface AdozioneService {

    List<Adozione> elencoAdozioni(Utente utente);
    Adozione datiAdozione(int id);
    Adozione creaAdozione(Utente utente, Albero albero, int quantita);
//    void invioOrdine(HttpSession session);
}
