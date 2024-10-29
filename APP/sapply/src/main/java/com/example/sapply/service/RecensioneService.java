package com.example.sapply.service;

import com.example.sapply.model.Recensione;

public interface RecensioneService {
    void salvaRecensione(Recensione recensione);
    Recensione trovaRecensione(int idAdozione);
    // trova la recensione per idAdozione
}
