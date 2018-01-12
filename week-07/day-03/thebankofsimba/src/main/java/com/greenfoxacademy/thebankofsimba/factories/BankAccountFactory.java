package com.greenfoxacademy.thebankofsimba.factories;

import com.greenfoxacademy.thebankofsimba.modells.BankAccount;
import org.springframework.stereotype.Component;

@Component
public class BankAccountFactory {

  public BankAccount getBankAccount(String name,
                                    double balance,
                                    String greatHouse,
                                    boolean king,
                                    char debt,
                                    boolean dead) {
    return new BankAccount(name, balance, greatHouse, king, debt, dead);
  }
}
