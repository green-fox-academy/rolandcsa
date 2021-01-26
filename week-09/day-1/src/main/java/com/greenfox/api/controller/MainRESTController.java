package com.greenfox.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfox.api.model.appenda.AppendA;
import com.greenfox.api.model.arrayhandler.ArrayHandler;
import com.greenfox.api.model.arrayhandler.ArrayHandlerError;
import com.greenfox.api.model.arrayhandler.ArrayHandlerResult;
import com.greenfox.api.model.arrayhandler.ArrayHandlerResultArray;
import com.greenfox.api.model.doubling.Doubling;
import com.greenfox.api.model.doubling.ErrorDoubling;
import com.greenfox.api.model.dountil.DoUntil;
import com.greenfox.api.model.dountil.DoUntilResult;
import com.greenfox.api.model.dountil.ErrorDoUntil;
import com.greenfox.api.model.greeter.ErrorMissingNameAndTitle;
import com.greenfox.api.model.greeter.ErrorMissingTitle;
import com.greenfox.api.model.greeter.Greeter;
import com.greenfox.api.model.logentries.LogEntries;
import com.greenfox.api.model.logentries.LogEntriesRequestDTO;
import com.greenfox.api.service.LogEntriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRESTController {
    private final LogEntriesService logEntriesService;

    @Autowired
    public MainRESTController(LogEntriesService logEntriesService) {
        this.logEntriesService = logEntriesService;
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> doubling(@RequestParam(required = false) Integer input) {
        if (input != null) {
            logEntriesService.newEntry(new LogEntries("/doubling", "input=" + input));
            return ResponseEntity.ok(new Doubling(input));
        }
        logEntriesService.newEntry(new LogEntries("/doubling", "input=" + input));
        return ResponseEntity.ok(new ErrorDoubling());
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null || title == null) {
            if (name == null && title == null) {
                logEntriesService.newEntry(new LogEntries("/greeter", "name=" + name + " title=" + title));
                return ResponseEntity.badRequest().body(new ErrorMissingNameAndTitle());
            }
            if (title == null) {
                logEntriesService.newEntry(new LogEntries("/greeter", "name=" + name + " title=" + title));
                return ResponseEntity.badRequest().body(new ErrorMissingTitle());
            }
        }
        logEntriesService.newEntry(new LogEntries("/greeter", "name=" + name + " title=" + title));
        return ResponseEntity.ok(new Greeter(name, title));
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<AppendA> appenda(@PathVariable String appendable) {
        AppendA appendA = new AppendA(appendable);
        if (appendable == null) {
            return ResponseEntity.notFound().build();
        }
        logEntriesService.newEntry(new LogEntries("/appenda/{appendable}", "appendable=" + appendable));
        return ResponseEntity.ok(appendA);
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@PathVariable String action, @RequestBody DoUntil doUntil) {
        if (action.equals("sum") || action.equals("factor")) {
            logEntriesService.newEntry(new LogEntries("/dountil/{action}", "action=" + action + " until=" + doUntil.getUntil()));
            return ResponseEntity.ok(new DoUntilResult(action, doUntil.getUntil()));
        }
        logEntriesService.newEntry(new LogEntries("/dountil/{action}", "action=" + action + " until=" + doUntil.getUntil()));
        return ResponseEntity.ok(new ErrorDoUntil());
    }

    @PostMapping("/arrays")
    public ResponseEntity<?> arrayHandler(@RequestBody ArrayHandler arrayHandler) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        if (arrayHandler.getWhat().equals("sum") || arrayHandler.getWhat().equals("multiply")) {
            logEntriesService.newEntry(new LogEntries("/arrays", objectMapper.writeValueAsString(arrayHandler)));
            return ResponseEntity.ok(new ArrayHandlerResult(arrayHandler));
        }
        if (arrayHandler.getWhat().equals("double")) {
            logEntriesService.newEntry(new LogEntries("/arrays", objectMapper.writeValueAsString(arrayHandler)));
            return ResponseEntity.ok(new ArrayHandlerResultArray(arrayHandler));
        }
        logEntriesService.newEntry(new LogEntries("/arrays", objectMapper.writeValueAsString(arrayHandler)));
        return ResponseEntity.ok(new ArrayHandlerError());
    }

    @GetMapping("/log")
    public ResponseEntity<?> log() {
        return ResponseEntity.ok(new LogEntriesRequestDTO(logEntriesService.findAll(), logEntriesService.findAll().size()));
    }
}
