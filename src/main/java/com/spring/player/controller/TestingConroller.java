package com.spring.player.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:8080
@Controller
@RequestMapping("")
public class TestingConroller {


    //http://localhost:8080/profile
    @GetMapping("/profile")
    public String test(Model model){
        model.addAttribute("name","Im zakaria where are you");
        return "home";
    }
}
