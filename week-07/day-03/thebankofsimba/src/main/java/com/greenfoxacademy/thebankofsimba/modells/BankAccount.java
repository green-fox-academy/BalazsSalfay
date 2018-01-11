package com.greenfoxacademy.thebankofsimba.modells;

public class BankAccount {

  private String name;
  private double balance;
  private String animalType;
  private String currency;
  private boolean king;
  private char goodOrBad;

  public BankAccount(String name, double balance, String animalType, boolean king, char goodOrBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = king;
    this.goodOrBad = goodOrBad;
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
    return king;
  }

  public void setKing(boolean king) {
    king = king;
  }

  public char getGoodOrBad() {
    return goodOrBad;
  }

  public void setGoodOrBad(char goodOrBad) {
    this.goodOrBad = goodOrBad;
  }
}
