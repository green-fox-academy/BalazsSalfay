package com.greenfoxacademy.licenceplatesearch.models;

import org.springframework.stereotype.Component;

@Component
public class Response {

  private String status;

  public Response() {
  }

  public Response(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
