package com.example.sapply.controller;

import com.example.sapply.model.Albero;
import com.example.sapply.service.AlberoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private AlberoService alberoService;

    @GetMapping
    public String getPage(Model model){
        List<Albero> alberi = alberoService.elencoAlberi();
        model.addAttribute("alberi", alberi);
        return "index";
    }

}
