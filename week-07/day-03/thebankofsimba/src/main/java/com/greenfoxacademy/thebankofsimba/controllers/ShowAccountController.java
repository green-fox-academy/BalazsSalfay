package com.greenfoxacademy.thebankofsimba.controllers;

import com.greenfoxacademy.thebankofsimba.modells.BankAccount;
import com.greenfoxacademy.thebankofsimba.factories.BankAccountFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class ShowAccountController {

  private List<BankAccount> accounts;

  @Autowired
  public ShowAccountController(BankAccountFactory bankAccounts) {
    accounts = Arrays.asList(
      bankAccounts.getBankAccount("Robert", 8100.00, "Baratheon", true, 'Y', true),
      bankAccounts.getBankAccount("Tyrion", 9600.00, "Lannister", false, 'N', false),
      bankAccounts.getBankAccount("Oberyn", 3200.00, "Martell", false, 'Y', true),
      bankAccounts.getBankAccount("Daenerys", 4800.00, "Targaryen", true, 'Y', false),
      bankAccounts.getBankAccount("Eddard", 2750.00, "Stark", false, 'Y', true));
  }

  @RequestMapping(value="/multiaccounts", method = RequestMethod.GET)
  public String showMultiAccount(Model model) {
    model.addAttribute("accounts", accounts);
    model.addAttribute("selectedaccount", new BankAccount());
    return "listofaccounts";
  }

  @PostMapping("/multiaccounts")
  public ModelAndView modifySelectedElement(@ModelAttribute BankAccount selectedAccount){
    for (BankAccount account: accounts) {
      if (account.getName().equals(selectedAccount.getName())) {
        account.getLoan();
      }
    }
    return new ModelAndView("redirect:/multiaccounts");
  }
}
