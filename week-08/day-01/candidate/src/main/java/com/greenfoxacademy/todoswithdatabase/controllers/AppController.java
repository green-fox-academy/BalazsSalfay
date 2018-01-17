package com.greenfoxacademy.todoswithdatabase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

  @RequestMapping("/candidate")
  public String showIndexPage () {
    return "index";
  }
}
