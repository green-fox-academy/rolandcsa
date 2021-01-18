package com.greenfox.connectionwithmysql.controller;

import com.greenfox.connectionwithmysql.model.Todo;
import com.greenfox.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TodoController {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "list"})
    public String list(Model model, @RequestParam(required = false) Boolean isDone) {
        List<Todo> todos = (List<Todo>) todoRepository.findAll();
        model.addAttribute("todos", todos.stream().filter(x -> x.getDone()==isDone).collect(Collectors.toList()));
        return "todolist";
    }

    @GetMapping("todo")
    public String todo() {
        return "redirect:/";
    }
}
