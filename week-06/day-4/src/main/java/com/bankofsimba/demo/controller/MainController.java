package com.bankofsimba.demo.controller;

import com.bankofsimba.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    BankAccount simba = new BankAccount("Simba", 2000.00, "lion", true);

    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("name", simba.getName());
        model.addAttribute("balance", simba.getBalanceFormatted());
        model.addAttribute("animalType", simba.getAnimalType());
        model.addAttribute("index", simba.getCurrency());
        return "show";
    }

    @GetMapping("/text")
    public String text(Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "text";
    }

    @GetMapping("/accounts")
    public String accounts(Model model) {
        List<BankAccount> characters = new ArrayList<>();
        characters.add(new BankAccount("Simba", 2000.00, "lion", true));
        characters.add(new BankAccount("Timon", 1500.00, "mongoose", false));
        characters.add(new BankAccount("Pumba", 1000.00, "mongoose", false));
        characters.add(new BankAccount("Nala", 3000.00, "lion", false));
        characters.add(new BankAccount("Mufasa", 1750.00, "lion", false));
        model.addAttribute("characters", characters);
        return "accounts";
    }
}
