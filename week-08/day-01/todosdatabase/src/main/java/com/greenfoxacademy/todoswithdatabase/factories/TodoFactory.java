package com.greenfoxacademy.todoswithdatabase.factories;

import com.greenfoxacademy.todoswithdatabase.models.Todo;
import org.springframework.stereotype.Component;

@Component
public class TodoFactory {

  public Todo getNewTodo() {
   return new Todo();
  }
}
