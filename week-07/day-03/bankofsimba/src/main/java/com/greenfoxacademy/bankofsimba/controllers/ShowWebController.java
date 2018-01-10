package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.modells.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowWebController {

  private List<BankAccount> accounts = new ArrayList<>();
  private BankAccount firstAccount = new BankAccount("Simba", 2000.00, "lion");
  private BankAccount secondAccount = new BankAccount("Zazu", 3500.00, "bird");
  private BankAccount thirdAccount = new BankAccount("Zordon", 6200.00, "lion");
  private BankAccount fourthAccount = new BankAccount("Timon", 2900.00, "meerkat");
  private BankAccount fifthAccount = new BankAccount("Pumba", 4700.00, "pig");


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
    accounts.add(firstAccount);
    accounts.add(secondAccount);
    accounts.add(thirdAccount);
    accounts.add(fourthAccount);
    accounts.add(fifthAccount);
    model.addAttribute("accounts", accounts);
    return "listaccount";
  }
}
