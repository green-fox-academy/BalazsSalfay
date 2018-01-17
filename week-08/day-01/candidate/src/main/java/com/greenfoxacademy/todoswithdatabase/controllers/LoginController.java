package com.greenfoxacademy.todoswithdatabase.controllers;

import com.greenfoxacademy.todoswithdatabase.models.User;
import com.greenfoxacademy.todoswithdatabase.services.UserService;
import com.greenfoxacademy.todoswithdatabase.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/candidate")
public class LoginController {

  @Autowired
  UserServiceImpl userService;

  @GetMapping("/login")
  public String showLoginPage(Model model) {
    User user = new User();
    model.addAttribute("user", user);
    return "login";
  }

  @PostMapping("/login")
  public String loginUser(@ModelAttribute User user) {
    if (userService.access(user.getUserName(), user.getPassword())){
      return "redirect:/candidate/list";
    }
    return "intruder";
  }
}
