package com.example.sapply.controller;


import com.example.sapply.service.AlberoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/adozione")
public class AdozioneController {



    @GetMapping("/adozione")
    public String mostraPaginaAdozione(Model model, Principal principal) {
        if (principal == null) { // nessun utente loggato
            return "redirect:/login";
        }
        // Utente loggato: visualizza il modulo per l’adozione
        model.addAttribute("albero", AlberoService.());
        return "adozione"; // Nome della pagina HTML
    }

}
