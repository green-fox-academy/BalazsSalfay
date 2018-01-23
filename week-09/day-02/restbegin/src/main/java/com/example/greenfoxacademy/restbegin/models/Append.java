package com.example.greenfoxacademy.restbegin.models;

import org.springframework.stereotype.Component;

@Component
public class Append {

  private String appended;

  public Append() {
  }

  public Append(String appended) {
    this.appended = appended;
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
