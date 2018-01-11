package com.greenfoxacademy.thebankofsimba.controllers;

import com.greenfoxacademy.thebankofsimba.modells.BankAccount;
import com.greenfoxacademy.thebankofsimba.factories.BankAccountFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ShowAccountController {

  private List<BankAccount> accounts;

  @Autowired
  public ShowAccountController(BankAccountFactory bankAccounts) {
    accounts = Arrays.asList(
            bankAccounts.getBankAccount("Simba", 8100.00, "lion", true, 'G'),
            bankAccounts.getBankAccount("Zazu", 3500.00, "bird", false, 'G'),
            bankAccounts.getBankAccount("Zordon", 6200.00, "lion", true, 'B'),
            bankAccounts.getBankAccount("Timon", 2900.00, "meerkat", false, 'G'),
            bankAccounts.getBankAccount("Pumba", 4700.00, "warthog", false, 'G'));
  }

  @RequestMapping(value="/multiaccounts")
  public String showMultiAccount (Model model) {
    model.addAttribute("accounts", accounts);
    return "listofaccounts";
  }

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
}
