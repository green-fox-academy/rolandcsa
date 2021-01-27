package com.greenfox.groot.controller;

import com.greenfox.groot.model.Response;
import com.greenfox.groot.model.ResponseError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {
    @GetMapping("/groot")
    public ResponseEntity<?> groot(@RequestParam(required = false) String message) {
        if (message == null) {
            return ResponseEntity.badRequest().body(new ResponseError());
        }
        return ResponseEntity.ok(new Response(message));
    }
}
