package com.greenfoxacademy.todoswithdatabase.factories;

import com.greenfoxacademy.todoswithdatabase.models.Candidate;
import org.springframework.stereotype.Component;

@Component
public class CandidateFactory {

  public Candidate getNewCandidate() {
   return new Candidate();
  }
}
