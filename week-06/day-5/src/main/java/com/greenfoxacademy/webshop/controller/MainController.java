package com.greenfoxacademy.webshop.controller;

import com.greenfoxacademy.webshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.text.html.Option;
import java.util.*;
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
        List<ShopItem> onlyAvailable;
        onlyAvailable = shopItemList.stream().filter(x -> x.getQuantity() != 0).collect(Collectors.toList());
        model.addAttribute("shopItemList", onlyAvailable);
        return "index";
    }

    @GetMapping("/cheapestfirst")
    public String cheapestFirst(Model model) {
        List<ShopItem> cheapestFirst;
        cheapestFirst = shopItemList.stream().sorted(Comparator.comparing(ShopItem::getPrice)).collect(Collectors.toList());
        model.addAttribute("shopItemList", cheapestFirst);
        return "index";
    }

    @GetMapping("/containsnike")
    public String containsNike(Model model) {
        List<ShopItem> containsNike;
        containsNike = shopItemList.stream().filter(x -> x.getDescription().contains("Nike")).collect(Collectors.toList());
        model.addAttribute("shopItemList", containsNike);
        return "index";
    }

    @GetMapping("/averagestock")
    public String averageStock(Model model) {
        OptionalDouble averageStock;
        averageStock = shopItemList.stream().mapToInt(ShopItem::getQuantity).average();
        Double averageStockAsDouble;
        if (averageStock.isPresent()) {
            averageStockAsDouble = averageStock.getAsDouble();
        } else {
            averageStockAsDouble = 0.0;
        }
        model.addAttribute("averageStock", averageStockAsDouble);
        return "/averagestock";
    }

    @GetMapping("/mostexpensive")
    public String mostExpensive(Model model) {
        Optional<ShopItem> mostExpensiveItem = shopItemList.stream().sorted(Comparator.comparing(ShopItem::getPrice).reversed()).findFirst();
        String mostExpensiveName;
        if (mostExpensiveItem.isPresent()) {
            mostExpensiveName = mostExpensiveItem.get().getName();
        } else {
            mostExpensiveName = "";
        }
        model.addAttribute("mostExpensiveName", mostExpensiveName);
        return "/mostexpensive";
    }
}

