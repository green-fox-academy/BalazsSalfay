package com.greenfoxacademy.todoswithdatabase.services;

import com.greenfoxacademy.todoswithdatabase.models.Candidate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CandidateService {

  List<Candidate> getAllCandidate();
  Candidate getCandidateById(int id);
  void update(Candidate candidate);
  void create(Candidate candidate);
  void delete(int id);
}
