package com.greenfoxacademy.candidaterest.repositories;

import com.greenfoxacademy.candidaterest.models.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Integer> {

  List<Candidate> findAllByNameContains(String name);
}
