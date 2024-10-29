package com.example.sapply.controller;

import com.example.sapply.model.Albero;
import com.example.sapply.model.Utente;
import com.example.sapply.service.AlberoService;
import com.example.sapply.service.UtenteService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    private UtenteService utenteService;

    @Autowired
    private AlberoService alberoService;

    @GetMapping
    public String getPage(Model model, HttpSession session) {
        Utente utente = (Utente) session.getAttribute("utente");
        model.addAttribute("utente", utente);
        Map<String, List<Albero>> alberiPerContinente = alberoService.getAlberiPerContinente();
        model.addAttribute("alberiPerContinente", alberiPerContinente);
        List<Albero> alberi = alberoService.elencoAlberi();
        model.addAttribute("alberi", alberi);
        return "index";
    }



}
