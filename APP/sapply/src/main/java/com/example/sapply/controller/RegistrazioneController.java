package com.example.sapply.controller;

import com.example.sapply.model.Utente;
import com.example.sapply.service.UtenteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registrazione")
public class RegistrazioneController {
    @Autowired
    private UtenteService utenteService;

    @GetMapping
    public String getPage(Model model){
        Utente utente = new Utente();
        model.addAttribute("utente", utente);
        return "registrazione";
    }

    @PostMapping
    public String formManager(
            @Valid @ModelAttribute("utente") Utente utente,
            BindingResult result,
            Model model
    ){
        if(result.hasErrors())
            return "registrazione";
        if(!utenteService.controlloUsername(utente.getUsername())){
            model.addAttribute("duplicato", "username già in uso");
            return "registrazione";
        }
        utenteService.registrazioneUtente(utente);
        return "redirect:/login";
    }
}
