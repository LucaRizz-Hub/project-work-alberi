package com.example.sapply.service;

import com.example.sapply.model.Recensione;

import java.util.List;

public interface RecensioneService {
    void salvaRecensione(Recensione recensione);
    Recensione trovaRecensione(int idAdozione);
    List<Recensione> trovaRecensioniPerAlbero(int idAlbero);
    // trova la recensione per idAdozione
}
