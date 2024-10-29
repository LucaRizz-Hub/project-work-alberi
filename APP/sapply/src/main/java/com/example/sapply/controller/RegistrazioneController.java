package com.example.sapply.controller;

import com.example.sapply.model.Albero;
import com.example.sapply.model.Utente;
import com.example.sapply.service.AlberoService;
import com.example.sapply.service.UtenteService;
import jakarta.servlet.http.HttpSession;
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
    public String getPage(Model model) {

        Map<String, List<Albero>> alberiPerContinente = alberoService.getAlberiPerContinente();
        model.addAttribute("alberiPerContinente", alberiPerContinente);
        Utente utente = new Utente();
        model.addAttribute("utente", utente);
        return "registrazione";
    }

    @PostMapping
    public String formManager(
            @Valid @ModelAttribute("utente") Utente utente,BindingResult result,
            @RequestParam(name = "foto", required = false) MultipartFile foto,

            Model model
    ) {
        if (result.hasErrors()) {
            return "registrazione";
        }

        if (!utenteService.controlloUsername(utente.getUsername())) {
            model.addAttribute("duplicato", "Username già in uso");
            return "registrazione";
        }

        // Controlla che la password rispetti i requisiti di sicurezza
        if (!utenteService.isPasswordSicura(utente.getPassword())) {
            model.addAttribute("passwordError", "La password deve contenere almeno 8 caratteri, un numero e un carattere speciale");
            return "registrazione";
        }

        utenteService.registrazioneUtente(utente, foto);
        return "redirect:/login";
    }
}