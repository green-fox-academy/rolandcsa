package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import com.greenfoxacademy.programmerfoxclub.service.FoxService;
import com.greenfoxacademy.programmerfoxclub.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    Fox fox;
    FoxService foxService;

    @Autowired
    public MainController(InformationService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String index(Model model, @RequestParam(required = false, defaultValue = "Fox") String name) {
        foxService.setFox(name);
        model.addAttribute("fox", foxService.getFox());
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(Model model, @RequestParam(required = false) String name) {
        foxService.setFox(name);
        model.addAttribute("fox", foxService.getFox());
        return "index";
    }

    @PostMapping("/add-fox")
    public String addFox(@ModelAttribute Fox fox) {
        foxService.addFox(fox);
        return "redirect:/";
    }

    @GetMapping("/nutrition-store")
    public String nutritionStore() {
        return "nutrition-store";
    }

    @PostMapping("/nutrition-store")
    public String postNutritionStore(Model model, String food, String drink) {
        foxService.getFox().setFood(food);
        foxService.getFox().setDrink(drink);
        model.addAttribute("foxFood", foxService.getFox().getFood());
        model.addAttribute("foxDrink", foxService.getFox().getDrink());
        return "redirect:/";
    }
}
