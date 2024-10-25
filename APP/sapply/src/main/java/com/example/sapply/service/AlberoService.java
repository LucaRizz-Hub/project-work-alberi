package com.example.sapply.service;

import com.example.sapply.model.Albero;
import jakarta.servlet.http.HttpSession;

import java.util.List;
import java.util.Map;

public interface AlberoService {

List<Albero> elencoAlberi();
Albero adozioneAlbero(int idAlbero);
    public Map<String, List<Albero>> getAlberiPerContinente();

//gestione carrello

   // boolean aggiuntaCarrello (int idAlbero, HttpSession session);
   // List<Albero> ottieniCarrello (HttpSession session);
   // void rimozioneAlberoCarello(int idAlbero, HttpSession session);
    // double totaleCarrello (HttpSession session);

}
