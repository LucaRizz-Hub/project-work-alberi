package com.example.sapply.controller;

import com.example.sapply.model.Albero;
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

// localhost:8080/alberi
@Controller
@RequestMapping("/alberi")
public class AlberiController {

    @Autowired
    private UtenteService utenteService;

    @Autowired
    private AlberoService alberoService;

    @GetMapping
    public String getPage(
            @RequestParam(name = "error", required = false) String error,
            Model model,
            HttpSession session
    ) {
        if (session.getAttribute("utente") != null)
            return "redirect:/areariservata";
        model.addAttribute("error", error != null);
        Map<String, List<Albero>> alberiPerContinente = alberoService.getAlberiPerContinente();
        model.addAttribute("alberiPerContinente", alberiPerContinente);

        return "alberi";
    }
}