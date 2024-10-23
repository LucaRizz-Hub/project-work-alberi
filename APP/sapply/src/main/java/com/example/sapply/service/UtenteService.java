package com.example.sapply.service;

import com.example.sapply.dao.UtenteDao;
import com.example.sapply.model.Utente;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Autowired
private UtenteDao utenteDao;

@Service
public interface UtenteService {

    @Override
    public boolean loginUtente(String username, String password, HttpSession session) {
        Utente utente = utenteDao.findByProfiloUsernameAndProfiloPassword(username, password);
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
        if(utenteDao.findByProfiloUsername(username) == null)
            return true;
        return false;
    }
}
