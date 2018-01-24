package com.example.greenfoxacademy.restbegin.services;

import com.example.greenfoxacademy.restbegin.models.Until;
import org.springframework.stereotype.Service;

@Service
public interface UntilService {

  void checkTheOperation(String what, Integer input);
  int factor(int input);
  int sum(int input);
}
