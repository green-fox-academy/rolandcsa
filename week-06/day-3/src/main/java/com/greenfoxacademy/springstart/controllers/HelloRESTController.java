package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong atomicLong = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    public Greeting greeting(@RequestParam String name) {
        return new Greeting(atomicLong.getAndIncrement(), "Hello, " + name);
    }
}
