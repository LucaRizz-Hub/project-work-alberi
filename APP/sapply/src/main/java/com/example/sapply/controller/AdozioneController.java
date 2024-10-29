package com.example.sapply.controller;


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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;


//localhost:8080/adozione?id
@Controller
@RequestMapping("/adozione")
public class AdozioneController {

    @Autowired
    private AlberoService alberoService;

    @Autowired
    private AdozioneService adozioneService;

    @Autowired
    private UtenteService utenteService;


    @GetMapping
    public String getPage(@RequestParam(name="id", required = true) int idAlbero,
                          Model model,
                          HttpSession session) {
        // per trovare l'id dell' albero
        Albero albero = alberoService.adozioneAlbero(idAlbero);
        // aggiungi l'albero al model così la pagina HTML può leggerla
        model.addAttribute("albero", albero);
        Map<String, List<Albero>> alberiPerContinente = alberoService.getAlberiPerContinente();
        model.addAttribute("alberiPerContinente", alberiPerContinente);
        Utente utente = (Utente) session.getAttribute("utente");
        model.addAttribute("utente", utente);
        return "adozione"; // la pagina di dettaglio e conferma
    }

    @PostMapping("/conferma")
    public String confermaAdozione(
            @RequestParam int alberoId,
            @RequestParam int quantita,
            HttpSession session,
            Model model
    ){
        // QUI effettivamente fa il controllo se l'utente è loggato
        Utente utente = (Utente) session.getAttribute("utente");
        if(utente == null){
            return "redirect:/login";
        }

        // credo che adozioneAlbero sia il findById()...
        Albero albero = alberoService.adozioneAlbero(alberoId);
        String metodoPagamento = utente.getMetodoPagamento();
        adozioneService.creaAdozione(utente, albero, quantita);

        return "redirect:/areariservata";
    }


}
