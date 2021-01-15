package com.greenfox.programmerfoxclub.controller;

import com.greenfox.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
    Fox fox = new Fox();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("foxName", fox.getName());
        model.addAttribute("foxFood", fox.getFood());
        model.addAttribute("foxDrink", fox.getDrink());
        if (fox.getTricks().size() == 0) {
            model.addAttribute("foxTrickNumber", 0);
        } else {
            model.addAttribute("foxTrickNumber", fox.getTricks().size());
        }
        model.addAttribute("foxTricks", fox.getTricks());
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam String name) {
        fox.setName(name);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/nutrition-store")
    public String getNutritionStore() {
        return "nutrition-store";
    }

    @PostMapping("/nutrition-store")
    public String postNutritionStore(@RequestParam String food, @RequestParam String drink) {
        fox.setFood(food);
        fox.setDrink(drink);
        return "redirect:/";
    }

    @GetMapping("/trick-center")
    public String getTrickCenter() {
        return "trick-center";
    }

    @PostMapping("/trick-center")
    public String postTrickCenter(@RequestParam String trick) {
        fox.getTricks().add(trick);
        return "redirect:/";
    }
}
