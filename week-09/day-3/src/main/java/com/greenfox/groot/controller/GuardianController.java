package com.greenfox.groot.controller;

import com.greenfox.groot.model.arrow.Arrow;
import com.greenfox.groot.model.response.Response;
import com.greenfox.groot.model.response.ResponseError;
import com.greenfox.groot.model.rocket.FillRocket;
import com.greenfox.groot.model.rocket.Rocket;
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

    @GetMapping("/yondu")
    public ResponseEntity<?> yondu(@RequestParam(required = false) Double distance, @RequestParam(required = false) Double time) {
        if (distance == null || time == null) {
            return ResponseEntity.badRequest().body(new ResponseError());
        } else if (time == 0.0) {
            return ResponseEntity.ok(new Arrow(distance, time));
        }
        return ResponseEntity.ok(new Arrow(distance, time));
    }

    @GetMapping("/rocket")
    public ResponseEntity<?> rocket() {
        return ResponseEntity.ok(new Rocket(12500, 0, 0));
    }

    @GetMapping("/rocket/fill")
    public ResponseEntity<?> fillRocket(@RequestParam String caliber, @RequestParam Integer amount) {
        return ResponseEntity.ok(new FillRocket(caliber, amount));
    }
}
