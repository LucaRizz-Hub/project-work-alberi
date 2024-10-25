package com.example.sapply.controller;

import com.example.sapply.model.Utente;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/profiloutente")
public class ProfiloUtenteController {


    @GetMapping
    public String getPage(Model model, HttpSession session){
        Utente utente = (Utente) session.getAttribute("utente");
        // dovrebbe essere già presente dalla fase di Login/Registrazione

        if(utente != null){ // se l'utente è effettivamente loggato in sessione
            model.addAttribute("utente", utente);
            // aggiungi al model l'utente (ricavato da session)
            // questo serve perchè altrimenti la pagina .html non sa da dove prendere le info dell'utente
            return "profilo-utente";
        }
        else{ // se non lo è lo rimandi al login immediatamente
            return "redirect:/login";
        }
    }
}
