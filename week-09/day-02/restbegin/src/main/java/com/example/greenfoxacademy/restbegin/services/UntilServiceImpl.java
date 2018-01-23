package com.example.greenfoxacademy.restbegin.services;

import com.example.greenfoxacademy.restbegin.models.Until;
import org.springframework.stereotype.Service;

@Service
public class UntilServiceImpl implements UntilService {


  @Override
  public void checkTheOperation(String what, Until until) {
    if (what.equals("sum")) {
     sum(until.getUntil());
    } else if (what.equals("factor")) {
     factor(until.getUntil());
    }
  }

  @Override
  public int factor(int input) {
    int result = 0;
    for (int i = 0; i < input; i++) {
      result *= i;
    }
    return result;
  }

  @Override
  public int sum(int input) {
    int result = 0;
    for (int i = 0; i < input; i++) {
      result += i;
    }
    return result;
  }
}
