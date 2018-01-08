package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.modell.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong counter = new AtomicLong();

  @RequestMapping(value="/greeting")
  public Greeting greeting(@RequestParam(value="name")String name) {
    counter.incrementAndGet();
    Greeting greeting = new Greeting(counter,name);
    return greeting;
  }
}
