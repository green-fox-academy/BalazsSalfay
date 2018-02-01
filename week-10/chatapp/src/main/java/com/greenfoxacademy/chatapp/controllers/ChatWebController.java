package com.greenfoxacademy.chatapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class ChatWebController {

  @GetMapping("/")
  public String showMainPage() {
    return "index";
  }

}

