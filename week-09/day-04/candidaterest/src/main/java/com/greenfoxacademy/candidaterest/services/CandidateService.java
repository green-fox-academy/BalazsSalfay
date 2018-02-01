package com.greenfoxacademy.candidaterest.services;

import com.greenfoxacademy.candidaterest.models.Candidate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CandidateService {

  List<Candidate> listAllCandidates();
  Candidate getCandidateById(int id);
  void update(Candidate candidate);
  void create(Candidate candidate);
  void delete(int id);
  List<Candidate> searchCandidateByName(String name);
}
