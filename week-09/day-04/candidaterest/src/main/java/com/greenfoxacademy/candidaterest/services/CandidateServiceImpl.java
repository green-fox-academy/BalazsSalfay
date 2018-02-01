package com.greenfoxacademy.candidaterest.services;

import com.greenfoxacademy.candidaterest.models.Candidate;
import com.greenfoxacademy.candidaterest.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {

  @Autowired
  CandidateRepository candidateRepository;

  @Override
  public List<Candidate> listAllCandidates() {
    return (List<Candidate>) candidateRepository.findAll();
  }

  @Override
  public Candidate getCandidateById(int id) {
    return candidateRepository.findOne(id);
  }

  @Override
  public void update(Candidate candidate) {
    candidateRepository.save(candidate);
  }

  @Override
  public void create(Candidate candidate) {
    candidateRepository.save(candidate);
  }

  @Override
  public void delete(int id) {
    candidateRepository.delete(id);
  }

  @Override
  public List<Candidate> searchCandidateByName(String name) {
    return candidateRepository.findAllByNameContains(name);
  }
}
