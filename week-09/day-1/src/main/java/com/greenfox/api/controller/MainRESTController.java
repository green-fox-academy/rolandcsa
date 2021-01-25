package com.greenfox.api.controller;

import com.greenfox.api.model.appenda.AppendA;
import com.greenfox.api.model.doubling.Doubling;
import com.greenfox.api.model.doubling.ErrorDoubling;
import com.greenfox.api.model.greeter.ErrorMissingName;
import com.greenfox.api.model.greeter.ErrorMissingNameAndTitle;
import com.greenfox.api.model.greeter.ErrorMissingTitle;
import com.greenfox.api.model.greeter.Greeter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRESTController {

    @GetMapping("/doubling")
    public ResponseEntity<?> doubling(@RequestParam(required = false) Integer input) {
        if (input != null) {
            return ResponseEntity.ok(new Doubling(input));
        }
        return ResponseEntity.ok(new ErrorDoubling());
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null || title == null) {
            if (name == null && title == null) {
                return ResponseEntity.badRequest().body(new ErrorMissingNameAndTitle());
            }
            if (title == null) {
                return ResponseEntity.badRequest().body(new ErrorMissingTitle());
            }
        }
        return ResponseEntity.ok(new Greeter(name, title));
    }
    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<AppendA> appenda(@PathVariable String appendable) {
        AppendA appendA = new AppendA(appendable);
        if (appendable == null) {
           return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(appendA);
    }
}