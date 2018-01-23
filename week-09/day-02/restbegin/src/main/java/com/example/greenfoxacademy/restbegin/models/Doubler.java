package com.example.greenfoxacademy.restbegin.models;

import org.springframework.stereotype.Component;

@Component
public class Doubler {

  private int received;
  private int result;

  public Doubler() {
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
