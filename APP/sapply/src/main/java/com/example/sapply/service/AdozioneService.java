package com.example.sapply.service;

import com.example.sapply.model.Adozione;
import jakarta.servlet.http.HttpSession;

import java.util.List;

public interface AdozioneService {

    List<Adozione> elencoAdozioni();
    Adozione datiAdozione(int id);
    void invioOrdine(HttpSession session);
}
