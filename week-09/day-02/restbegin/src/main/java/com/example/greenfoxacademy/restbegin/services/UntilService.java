package com.example.greenfoxacademy.restbegin.services;

import com.example.greenfoxacademy.restbegin.models.Until;
import org.springframework.stereotype.Service;

@Service
public interface UntilService {

  void checkTheOperation(String what, Until until);
  int factor(int input);
  int sum(int input);
}
