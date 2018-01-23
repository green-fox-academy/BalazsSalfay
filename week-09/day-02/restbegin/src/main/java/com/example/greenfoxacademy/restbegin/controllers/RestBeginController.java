package com.example.greenfoxacademy.restbegin.controllers;

import com.example.greenfoxacademy.restbegin.models.*;
import com.example.greenfoxacademy.restbegin.services.DoublerServiceImpl;
import com.example.greenfoxacademy.restbegin.services.UntilService;
import com.example.greenfoxacademy.restbegin.services.UntilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestBeginController {

  @Autowired
  DoublerServiceImpl doubleServiceImpl;

  @Autowired
  ErrorResponse errorResponse;

  @Autowired
  Doubler doubler1;

  @Autowired
  Greeter greeter;

  @Autowired
  UntilServiceImpl untilServiceImpl;

  @GetMapping("/doubling")
  public Object getDoubleValue(@RequestParam (value = "input", required = false) Integer received) {
    if (doubleServiceImpl.getTheDoubledValue(received)) {
      return doubler1;
    } else {
      errorResponse.setError("Please provide an input!");
      return errorResponse;
    }
  }

  @GetMapping("/greeter")
  public Object getGreeting(@RequestParam (value = "name", required = false) String name,
                            @RequestParam (value = "title", required = false) String title) {
    if (name == null) {
      ErrorResponse error = new ErrorResponse();
      error.setError("Please provide a name!");
      return error;
    } else if (title == null) {
      errorResponse.setError("Please provide a title!");
      return errorResponse;
    } else {
      greeter.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
      return greeter;
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendWithA(@PathVariable String appendable) {
    if (appendable == null) {
      ErrorResponse error2 = new ErrorResponse();
      error2.setError("404");
      return error2;
    } else {
      return new Append(appendable + "a");
    }
  }

  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable String what, @RequestBody Until until) {
    if (until == null) {
      ErrorResponse error3 = new ErrorResponse();
      error3.setError("Please provide a number!");
      return error3;
    } else {
      untilServiceImpl.checkTheOperation(what, until);
      return untilServiceImpl;
    }
  }
}
