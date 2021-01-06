package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreetCounterApp {
    AtomicLong atomicLong = new AtomicLong();

    @GetMapping("/greetingcounter")
    @ResponseBody
    public String greetingCounter(@RequestParam String name) {
        return "Hello, " + name + "! This site was loaded " + atomicLong.getAndIncrement() + " times since last server start.";
    }
}
