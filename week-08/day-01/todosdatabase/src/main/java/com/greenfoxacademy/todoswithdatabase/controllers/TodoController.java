package com.greenfoxacademy.todoswithdatabase.controllers;

import com.greenfoxacademy.todoswithdatabase.factories.TodoFactory;
import com.greenfoxacademy.todoswithdatabase.models.Todo;
import com.greenfoxacademy.todoswithdatabase.repositories.TodoRepository;
import com.greenfoxacademy.todoswithdatabase.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoService todoService;

  @Autowired
  TodoFactory todoFactory;

  @GetMapping("/list")
  public String listMyTodos(Model model) {
    List<Todo> todos = todoService.getAllTodos();
    model.addAttribute("todos", todos);
    model.addAttribute("newTodo", todoFactory.getNewTodo());
    return "todo";
  }

  @PostMapping("/create")
  public String createNewTodo(@ModelAttribute Todo todo) {
    todoService.create(todo);
    return "redirect:/todo/list";
  }

  @PostMapping("/delete/{todoId}")
  public String deleteTodo(@PathVariable int todoId) {
    todoService.delete(todoId);
    return "redirect:/todo/list";
  }
}

