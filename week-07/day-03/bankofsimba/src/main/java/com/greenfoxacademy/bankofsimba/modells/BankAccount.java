package com.greenfoxacademy.bankofsimba.modells;

public class BankAccount {

  private String name;
  private double balance;
  private String animalType;
  private String currency;
  private boolean King;

  public BankAccount(String name, double balance, String animalType, boolean King) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.King = King;
    currency = "Zebra";
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

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public boolean getKing() {
    return King;
  }

  public void setKing(boolean king) {
    King = king;
  }
}
