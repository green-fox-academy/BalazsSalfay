package com.greenfoxacademy.thebankofsimba.factories;

import com.greenfoxacademy.thebankofsimba.modells.BankAccount;
import org.springframework.stereotype.Component;

@Component
public class BankAccountFactory {

  public BankAccount getBankAccount(String name, double balance, String animalType, boolean king, char goodOrBad) {
    return new BankAccount(name, balance, animalType, king, goodOrBad);
  }
}
