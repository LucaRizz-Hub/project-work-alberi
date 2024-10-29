package com.example.sapply.controller;

import com.example.sapply.model.Albero;
import com.example.sapply.model.Utente;
import com.example.sapply.service.AlberoService;
import com.example.sapply.service.UtenteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/registrazione")
public class RegistrazioneController {
    @Autowired
    private UtenteService utenteService;
    @Autowired
    private AlberoService alberoService;

    @GetMapping
    public String getPage(Model model){
        Map<String, List<Albero>> alberiPerContinente = alberoService.getAlberiPerContinente();
        model.addAttribute("alberiPerContinente", alberiPerContinente);
        Utente utente = new Utente();
        model.addAttribute("utente", utente);
        return "registrazione";
    }

    @PostMapping
    public String formManager(
            @Valid @ModelAttribute("utente") Utente utente,
            @RequestParam(name = "foto", required = false) MultipartFile foto,
            BindingResult result,
            Model model
    ) {
        if (result.hasErrors()) {
            return "registrazione";
        }
        if (!utenteService.controlloUsername(utente.getUsername())) {
            model.addAttribute("duplicato", "username già in uso");
            return "registrazione";
        }
        utenteService.registrazioneUtente(utente, foto);
        return "redirect:/login";
    }

}
