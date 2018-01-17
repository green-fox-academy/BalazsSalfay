package com.greenfoxacademy.todoswithdatabase;

import com.greenfoxacademy.todoswithdatabase.models.Candidate;
import com.greenfoxacademy.todoswithdatabase.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeathlistApplication implements CommandLineRunner {

	@Autowired
	CandidateRepository candidateRepository;

	public static void main(String[] args) {
		SpringApplication.run(DeathlistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		candidateRepository.save(new Candidate("Ilyn Payne", true, false));
		candidateRepository.save(new Candidate("Walder Frey", true, true));
		candidateRepository.save(new Candidate("Cersei", true, false));
		candidateRepository.save(new Candidate("The Mountain", true, false));
		candidateRepository.save(new Candidate("Mervyn Trant", true, false));
		candidateRepository.save(new Candidate("Joffrey", true, true));
	}
}
