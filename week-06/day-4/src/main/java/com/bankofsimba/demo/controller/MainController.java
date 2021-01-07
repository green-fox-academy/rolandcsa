package com.bankofsimba.demo.controller;

import com.bankofsimba.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    BankAccount simba = new BankAccount("Simba", 2000, "lion");

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("name", simba.getName());
        model.addAttribute("balance", simba.getBalance());
        model.addAttribute("animalType", simba.getAnimalType());
        return "show";
    }
    @GetMapping("/text")
    public String text(Model model){
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "text";
    }
}
