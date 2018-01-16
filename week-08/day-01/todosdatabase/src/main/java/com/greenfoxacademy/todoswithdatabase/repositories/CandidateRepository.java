package com.greenfoxacademy.todoswithdatabase.repositories;

import com.greenfoxacademy.todoswithdatabase.models.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Integer> {

}
