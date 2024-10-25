package com.example.sapply.controller;

import com.example.sapply.service.UtenteService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/areariservata")
public class AreaRiservataController {

    @Autowired
    private UtenteService utenteService;

    @GetMapping
    public String getPage(Model model,
                          HttpSession session){

        return "area-riservata";
    }

}
