package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.modells.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ShowWebController {

  private List<BankAccount> accounts = new ArrayList<BankAccount>(Arrays.asList(
          new BankAccount("Simba", 2000.00, "lion", true),
          new BankAccount("Zazu", 3500.00, "bird", false),
          new BankAccount("Zordon", 6200.00, "lion", true),
          new BankAccount("Timon", 2900.00, "meerkat", false),
          new BankAccount("Pumba", 4700.00, "warthog", false)
  ));
  @RequestMapping (value="/oneaccount")
  public String showingAnAccount (Model model) {
    model.addAttribute("name", accounts.get(0).getName());
    model.addAttribute("balance", accounts.get(0).getBalance());
    model.addAttribute("currency", accounts.get(0).getCurrency());
    model.addAttribute("animalType", accounts.get(0).getAnimalType());
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
    model.addAttribute("accounts", accounts);
    return "listaccount";
  }
}
