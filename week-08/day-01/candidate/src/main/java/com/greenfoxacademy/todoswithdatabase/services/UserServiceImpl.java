package com.greenfoxacademy.todoswithdatabase.services;

import com.greenfoxacademy.todoswithdatabase.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  User user;

  boolean accessGranted = false;

  @Override
  public boolean access(String userName, String password) {
    if (userName.equals("noone") && password.equals("valarmorghulis")) {
      accessGranted = true;
    }
    return accessGranted;
  }
}
