package com.greenfoxacademy.todoswithdatabase;

import com.greenfoxacademy.todoswithdatabase.models.Todo;
import com.greenfoxacademy.todoswithdatabase.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoswithdatabaseApplication implements CommandLineRunner {

	@Autowired
	TodoRepository todoRepo;

	public static void main(String[] args) {
		SpringApplication.run(TodoswithdatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepo.save(new Todo("Start the day", true, true));
		todoRepo.save(new Todo("Have a breakfast", true, false));
		todoRepo.save(new Todo("Go to GreenFox", true, true));
		todoRepo.save(new Todo("Start the workshop", true, false));
	}
}
