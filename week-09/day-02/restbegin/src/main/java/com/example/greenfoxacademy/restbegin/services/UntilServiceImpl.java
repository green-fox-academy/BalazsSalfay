package com.example.greenfoxacademy.restbegin.services;

import com.example.greenfoxacademy.restbegin.models.Until;
import org.springframework.stereotype.Service;

@Service
public class UntilServiceImpl implements UntilService {

  private Integer result;

  public UntilServiceImpl() {
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  @Override
  public void checkTheOperation(String what, Until until) {
    if (what.equals("sum")) {
     result = sum(until.getUntil());
    } else if (what.equals("factor")) {
     result = factor(until.getUntil());
    }
  }

  @Override
  public int factor(int input) {
    int resultFactor = 1;
    for (int i = 1; i <= input; i++) {
      resultFactor *= i;
    }
    return resultFactor;
  }

  @Override
  public int sum(int input) {
    int resultSum = 0;
    for (int i = 0; i <= input; i++) {
      resultSum += i;
    }
    return resultSum;
  }
}
