package com.sma.springbootmongoapi.controller;

import com.sma.springbootmongoapi.model.Todo;
import com.sma.springbootmongoapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    TodoRepository todoRepository;

    @RequestMapping("/todos")
//    public String getTodo(Model model) {
//        // return "Hello Todos";
//        model.addAttribute("todos", todoRepository.findAll());
//        System.out.println("This is the changes");
//        return "getTodo" + todoRepository.findAll();
//    }

    @GetMapping(produces = "application/JSON")
    public List<Todo> getAllUsers() {
        return (List<Todo>) todoRepository.findAll();
    }
}
