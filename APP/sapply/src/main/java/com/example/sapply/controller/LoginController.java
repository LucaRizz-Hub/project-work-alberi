package com.example.sapply.controller;

import com.example.sapply.service.UtenteService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// localhost:8080/login
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UtenteService utenteService;

    @GetMapping
    public String getPage(
            @RequestParam(name = "error", required = false)String error,
            Model model,
            HttpSession session
    ){
        if(session.getAttribute("utente") != null)
            return "redirect:/areariservata";
        model.addAttribute("error", error != null);
        return "login";
    }

    @PostMapping
    public String formManager(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpSession session
    ){
        if(!utenteService.loginUtente(username, password, session))
            return "redirect:/login?error";
        return "redirect:/areariservata";
    }
}
