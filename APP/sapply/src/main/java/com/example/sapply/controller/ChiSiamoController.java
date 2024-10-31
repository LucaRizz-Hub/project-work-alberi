package com.example.sapply.controller;

import com.example.sapply.model.Albero;
import com.example.sapply.service.AlberoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/chisiamo")
public class ChiSiamoController {

    @Autowired
    private AlberoService alberoService;

    @GetMapping
    private String getPage(Model model, HttpSession session){

        Map<String, List<Albero>> alberiPerContinente = alberoService.getAlberiPerContinente();
        model.addAttribute("alberiPerContinente", alberiPerContinente);
        List<Albero> alberi = alberoService.elencoAlberi();
        model.addAttribute("alberi", alberi);
        return "chi-siamo";
    }

}
