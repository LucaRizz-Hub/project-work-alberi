package com.example.sapply.service;

import com.example.sapply.dao.UtenteDao;
import com.example.sapply.model.Utente;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.util.*;

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
    public void registrazioneUtente(Utente utente, MultipartFile foto) {
        if (foto != null && !foto.isEmpty()) {
            try {
                String formato = foto.getContentType();
                String fotoCodificata = "data:" + formato + ";base64," + Base64.getEncoder().encodeToString(foto.getBytes());
                utente.setFotoCodificata(fotoCodificata);
            } catch (Exception e) {
                e.printStackTrace();  // Log per il debug
            }
        }
        utenteDao.save(utente);
    }


    @Override
    public boolean controlloUsername(String username) {
        if(utenteDao.findByUsername(username) == null)
            return true;
        return false;
    }
}

