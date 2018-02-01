package com.greenfoxacademy.candidaterest.controllers;

import com.greenfoxacademy.candidaterest.models.Candidate;
import com.greenfoxacademy.candidaterest.models.ResultMessage;
import com.greenfoxacademy.candidaterest.services.CandidateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/candidate")
public class CandidateRestController {

  @Autowired
  ResultMessage resultMessage;

  @Autowired
  CandidateServiceImpl candidateServiceimpl;

  @GetMapping("/list")
  public ResponseEntity listAllCandidate(@RequestBody Candidate candidate, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return ResponseEntity.badRequest().body(new ResultMessage("error"));
    } else {
      List<Candidate> candidates = candidateServiceimpl.listAllCandidates();
      return ResponseEntity.ok().body(candidates);
    }
  }
}
