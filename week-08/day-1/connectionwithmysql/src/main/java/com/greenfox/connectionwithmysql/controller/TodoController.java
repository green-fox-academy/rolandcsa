package com.greenfox.connectionwithmysql.controller;

import com.greenfox.connectionwithmysql.model.Assignee;
import com.greenfox.connectionwithmysql.model.Todo;
import com.greenfox.connectionwithmysql.repository.AssigneeRepository;
import com.greenfox.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TodoController {
    private final TodoRepository todoRepository;
    private final AssigneeRepository assigneeRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(required = false) Boolean isDone) {
        List<Todo> todos = (List<Todo>) todoRepository.findAll();
        if (isDone == null) {
            model.addAttribute("todos", todoRepository.findAll());
        } else {
            model.addAttribute("todos", todos.stream().filter(x -> x.getDone() == !isDone).collect(Collectors.toList()));
        }
        return "todolist";
    }

    @GetMapping("/todo")
    public String todo() {
        return "redirect:/";
    }

    @GetMapping("/newtodo")
    public String getNewTodo() {
        return "newtodo";
    }

    @PostMapping("/newtodo")
    public String postNewTodo(@RequestParam String title) {
        todoRepository.save(new Todo(title));
        return "redirect:/";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam String search) {
        List<Todo> todos = (List<Todo>) todoRepository.findAll();
        List<Todo> foundTodos;
        foundTodos = todos.stream().filter(x -> x.getTitle().contains(search)).collect(Collectors.toList());
        model.addAttribute("todos", foundTodos);
        return "todolist";
    }

    @GetMapping("/listofassignees")
    public String listOfAssignees(Model model) {
        List<Assignee> assignees = (List<Assignee>) assigneeRepository.findAll();
        model.addAttribute("assignees", assignees);
        return "listofassignees";
    }

    @GetMapping("/newassignee")
    public String getNewAssignee() {
        return "newassignee";
    }

    @PostMapping("/newassignee")
    public String postNewAssignee(@RequestParam String name, @RequestParam String email) {
        assigneeRepository.save(new Assignee(name, email));
        return "redirect:/listofassignees";
    }

    @GetMapping("/deletetodo/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/deleteassignee/{id}")
    public String deleteAssignee(@PathVariable Long id) {
        assigneeRepository.deleteById(id);
        return "redirect:/listofassignees";
    }

    @GetMapping("/editassignee/{id}")
    public String editAssignee(@PathVariable Long id) {
        return "editassignee/{id}";
    }
}
