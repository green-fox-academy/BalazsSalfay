package com.greenfoxacademy.todoswithdatabase.repositories;

import com.greenfoxacademy.todoswithdatabase.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {

}
