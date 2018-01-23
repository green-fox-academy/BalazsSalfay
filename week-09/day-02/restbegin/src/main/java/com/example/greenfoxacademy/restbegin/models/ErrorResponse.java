package com.example.greenfoxacademy.restbegin.models;

import org.springframework.stereotype.Component;

@Component
public class ErrorResponse {

  private String error;

  public ErrorResponse() {
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
