package com.example.sapply.service;

import com.example.sapply.model.Utente;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UtenteService {
    boolean loginUtente(String username, String password, HttpSession session);
    void registrazioneUtente(Utente utente);
    boolean controlloUsername(String username);

}
