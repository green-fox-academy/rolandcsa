package com.greenfoxacademy.webshop.controller;

import com.greenfoxacademy.webshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {
    List<ShopItem> shopItemList = new ArrayList<>();

    public MainController() {
        shopItemList.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
        shopItemList.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
        shopItemList.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
        shopItemList.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
        shopItemList.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("shopItemList", shopItemList);
        return "index";
    }

    @GetMapping("/onlyavailable")
    public String onlyAvailable(Model model) {
        shopItemList = shopItemList.stream().filter(x -> x.getQuantity() != 0).collect(Collectors.toList());
        model.addAttribute("shopItemList", shopItemList);
        return "redirect:/";
    }
}
