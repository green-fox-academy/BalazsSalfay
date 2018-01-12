package com.greenfoxacademy.thebankofsimba.modells;

import com.greenfoxacademy.thebankofsimba.controllers.ShowAccountController;

public class BankAccount {

  private String name;
  private double balance;
  private String greatHouse;
  private String currency;
  private boolean king;
  private char debt;
  private boolean dead;

  public BankAccount(String name, double balance, String greatHouse, boolean king, char debt, boolean dead) {
    this.name = name;
    this.balance = balance;
    this.greatHouse = greatHouse;
    this.king = king;
    this.debt = debt;
    this.dead = dead;
    currency = "gold dragon";
  }

  public BankAccount() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getGreatHouse() {
    return greatHouse;
  }

  public void setGreatHouse(String animalType) {
    this.greatHouse = animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public boolean getKing() {
    return king;
  }

  public void setKing(boolean king) {
    king = king;
  }

  public char getDebt() {
    return debt;
  }

  public void setDebt(char goodOrBad) {
    this.debt = goodOrBad;
  }


  public boolean getDead() {
    return dead;
  }

  public void setDead(boolean dead) {
    this.dead = dead;
  }

  public void getLoan() {
      if (king) {
        balance+=5000;
      } else {
        balance+=1000;
      }
  }
}
