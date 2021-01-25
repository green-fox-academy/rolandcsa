package com.greenfox.api.controller;

import com.greenfox.api.model.Doubling;
import com.greenfox.api.model.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRESTController {

    @GetMapping("/doubling")
    public ResponseEntity<?> doubling(@RequestParam(required = false) Integer input) {
        if (input != null) {
            return ResponseEntity.ok(new Doubling(input));
        }
        return ResponseEntity.ok(new Error());
    }
}
