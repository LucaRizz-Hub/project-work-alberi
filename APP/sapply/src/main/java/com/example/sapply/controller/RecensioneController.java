package com.example.sapply.controller;

import com.example.sapply.model.Adozione;
import com.example.sapply.model.Recensione;
import com.example.sapply.service.AdozioneService;
import com.example.sapply.service.RecensioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@RequestMapping("/recensione")
public class RecensioneController {

    @Autowired
    private RecensioneService recensioneService;

    @Autowired
    private AdozioneService adozioneService;

    @GetMapping("/crea")
    public String creaRecensione(@RequestParam("idAdozione") int idAdozione,
                                 Model model){
        // cerco la adozione dall'ID
        Adozione adozione = adozioneService.datiAdozione(idAdozione);

        model.addAttribute("adozione", adozione);
        model.addAttribute("idAdozione", idAdozione);

        return "crea-recensione";
    }

    @PostMapping("/salva")
    public String salvaRecensione(@RequestParam int idAdozione,
                                  @RequestParam String commento,
                                  @RequestParam int valutazione){
        // Recupera l'adozione per associalre la recensione
        Adozione adozione = adozioneService.datiAdozione(idAdozione);

        // crea e salva la nuova recensione
        Recensione recensione = new Recensione();
        recensione.setAdozione(adozione);
        recensione.setCommento(commento);
        recensione.setValutazione(valutazione);
        recensione.setDataRecensione(LocalDate.now());

        recensioneService.salvaRecensione(recensione);

        // reindirizza all'area utente dopo il salvataggio
        return "redirect:/areariservata";
    }
}
