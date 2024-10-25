package com.example.sapply.controller;


import com.example.sapply.model.Albero;
import com.example.sapply.service.AlberoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//localhost:8080/adozione?id
@Controller
@RequestMapping("/adozione")
public class AdozioneController {

    @Autowired
    private AlberoService alberoService;

    @GetMapping
    public String getPage(@RequestParam( required = false, name="id" ) int idAlbero ,
                          Model model) {
        Albero albero = alberoService.adozioneAlbero(idAlbero);
        model.addAttribute("albero", albero);
        return "adozione";

    }


}
