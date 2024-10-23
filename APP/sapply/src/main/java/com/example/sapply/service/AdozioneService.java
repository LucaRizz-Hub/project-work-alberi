package com.example.sapply.service;

import com.example.sapply.model.Adozione;

import java.util.List;

public interface AdozioneService {

    List<Adozione> elencoAdozioni();
    Adozione datiAdozione(int id);
}
