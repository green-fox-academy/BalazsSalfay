package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.modells.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowWebController {
  BankAccount firstAccount = new BankAccount("Simba", 2000.00, "lion");
  List<BankAccount> accounts = new ArrayList<>();

  @RequestMapping (value="/oneaccount")
  public String showingAnAccount (Model model) {
    model.addAttribute("name", firstAccount.getName());
    model.addAttribute("balance", firstAccount.getBalance());
    model.addAttribute("currency", firstAccount.getCurrency());
    model.addAttribute("animalType", firstAccount.getAnimalType());
    return "account";
  }

  @RequestMapping(value="/exception")
  public String showException (Model model) {
    model.addAttribute("format1", "<em>HTML</em>");
    model.addAttribute("format2","<b>Enjoy yourself!</b>");
    return "except";
  }

  @RequestMapping(value="/multiaccounts")
  public String showMultiAccount (Model model) {

    return "listaccount";
  }
}
