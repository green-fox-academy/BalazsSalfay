package com.greenfoxacademy.todoswithdatabase.services;

import com.greenfoxacademy.todoswithdatabase.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  List<Todo> getAllTodos();
  Todo getTodoById(int id);
  void update(Todo todo);
  void create(Todo todo);
  void delete(int id);
}
