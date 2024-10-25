package com.example.sapply.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/profiloutente")
public class ProfiloUtenteController {

    @GetMapping
    public String getPage(Model model, HttpSession session){
        return "profilo-utente";

    }
}
