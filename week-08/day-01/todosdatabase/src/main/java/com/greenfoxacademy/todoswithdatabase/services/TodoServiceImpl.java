package com.greenfoxacademy.todoswithdatabase.services;

import com.greenfoxacademy.todoswithdatabase.models.Todo;
import com.greenfoxacademy.todoswithdatabase.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

  @Autowired
  TodoRepository todoRepository;

  @Override
  public List<Todo> getAllTodos() {
    return (List<Todo>) todoRepository.findAll();
  }

  @Override
  public Todo getTodoById(int id) {
    return todoRepository.findOne(id);
  }

  @Override
  public void update(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void create(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void delete(int id) {
    todoRepository.delete(id);
  }
}
