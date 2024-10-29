package com.example.sapply.controller;

import com.example.sapply.model.Adozione;
import com.example.sapply.model.Albero;
import com.example.sapply.model.Utente;
import com.example.sapply.service.AdozioneService;
import com.example.sapply.service.AlberoService;
import com.example.sapply.service.UtenteService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/areariservata")
public class AreaRiservataController {

    @Autowired
    private UtenteService utenteService;

    @Autowired
    private AlberoService alberoService;

    @Autowired
    private AdozioneService adozioneService;

    @GetMapping
    public String getPage(Model model,
                          HttpSession session){
        Utente utente = (Utente) session.getAttribute("utente");
        // Reindirizza al login se l'utente non è loggato
        if(utente == null){
            return "redirect:/login";
        }
        // Ottieni la lista di adozioni dell'utente
        List<Adozione> adozioni = adozioneService.elencoAdozioni(utente);
        // aggiungi questa lista al model così che l'HTML possa accedervi
        List<Albero> alberi = alberoService.elencoAlberi();
        model.addAttribute("alberi", alberi);
        Map<String, List<Albero>> alberiPerContinente = alberoService.getAlberiPerContinente();
        model.addAttribute("alberiPerContinente", alberiPerContinente);
        model.addAttribute("adozioni", adozioni);
        return "area-riservata";
    }

    @GetMapping("/logout")
    public String logoutUtente(HttpSession session){
        session.removeAttribute("utente");
        return "redirect:/login";
    }

}
