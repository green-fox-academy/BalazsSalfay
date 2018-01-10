package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.modells.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowWebController {
  BankAccount firstAccount = new BankAccount("Simba", 2000.00, "lion");

  @RequestMapping (value="/show")
  public String showingAnAccount (Model model) {
    model.addAttribute("name", firstAccount.getName());
    model.addAttribute("balance", firstAccount.getBalance());
    model.addAttribute("currency", firstAccount.getCurrency());
    model.addAttribute("animalType", firstAccount.getAnimalType());
    return "account";
  }

  @RequestMapping(value="/exception")
  public String showException () {
    return "exception";
  }
}
