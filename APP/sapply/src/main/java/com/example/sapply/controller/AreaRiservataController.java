package com.example.sapply.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/areariservata")
public class AreaRiservataController {

    @GetMapping
    public String getPage(Model model){
        return "area-riservata";
    }

}
