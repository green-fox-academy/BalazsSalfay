package com.example.greenfoxacademy.restbegin.services;

import com.example.greenfoxacademy.restbegin.models.Doubler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoublerServiceImpl implements DoublerService {

  @Autowired
  Doubler doubler;

  @Override
  public boolean getTheDoubledValue(Integer input) {
    if (input == null) {
      return false;
    } else {
      doubler.setReceived(input);
      doubler.setResult(doubler.getReceived() * 2);
      return true;
    }
  }
}
