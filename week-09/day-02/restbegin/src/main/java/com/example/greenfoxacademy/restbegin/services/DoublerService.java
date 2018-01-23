package com.example.greenfoxacademy.restbegin.services;

import com.example.greenfoxacademy.restbegin.models.Doubler;
import org.springframework.stereotype.Service;

@Service
public interface DoublerService {

  boolean getTheDoubledValue(Integer input);
}
