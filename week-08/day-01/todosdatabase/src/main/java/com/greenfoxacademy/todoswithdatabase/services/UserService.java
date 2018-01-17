package com.greenfoxacademy.todoswithdatabase.services;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

  boolean access(String userName, String password);
}
