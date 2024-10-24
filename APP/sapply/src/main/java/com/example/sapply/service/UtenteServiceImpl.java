package com.example.sapply.service;

import com.example.sapply.dao.UtenteDao;
import com.example.sapply.model.Utente;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteServiceImpl  implements UtenteService {

    @Autowired
    private UtenteDao utenteDao;

    @Override
    public boolean loginUtente(String username, String password, HttpSession session) {
        Utente utente = utenteDao.findByUsernameAndPassword(username, password);
        if(utente != null) {
            session.setAttribute("utente", utente);
            return true;
        }
        return false;
    }

    @Override
    public void registrazioneUtente(Utente utente) {
        utenteDao.save(utente);
    }

    @Override
    public boolean controlloUsername(String username) {
        if(utenteDao.findByUsername(username) == null)
            return true;
        return false;
    }
}

