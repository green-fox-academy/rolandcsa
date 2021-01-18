package com.greenfox.connectionwithmysql.controller;

import com.greenfox.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "list"})
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }

    @GetMapping("todo")
    public String todo() {
        return "redirect:/";
    }
}
