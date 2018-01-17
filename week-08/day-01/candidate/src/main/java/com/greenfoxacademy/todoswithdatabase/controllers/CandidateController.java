package com.greenfoxacademy.todoswithdatabase.controllers;

import com.greenfoxacademy.todoswithdatabase.factories.CandidateFactory;
import com.greenfoxacademy.todoswithdatabase.models.Candidate;
import com.greenfoxacademy.todoswithdatabase.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/candidate")
public class CandidateController {

  @Autowired
  CandidateService candidateService;

  @Autowired
  CandidateFactory candidateFactory;

  @GetMapping("/list")
  public String showMyCandidates(Model model) {
    List<Candidate> candidates = candidateService.getAllCandidate();
    model.addAttribute("candidates", candidates);
    model.addAttribute("newCandidate", candidateFactory.getNewCandidate());
    return "candidate";
  }

  @PostMapping("/create")
  public String createNewCandidate(@ModelAttribute Candidate candidate) {
    candidateService.create(candidate);
    return "redirect:/candidate/list";
  }

  @PostMapping("/delete/{candidateId}")
  public String deleteCandidate(@PathVariable int candidateId) {
    candidateService.delete(candidateId);
    return "redirect:/candidate/list";
  }

  @GetMapping("/update/{candidateId}")
  public String showUpdatePage(@PathVariable int candidateId, Model model) {
    Candidate candidate = candidateService.getCandidateById(candidateId);
    model.addAttribute("candidate", candidate);
    return "update";
  }

  @PostMapping("/update/{candidateId}")
  public String updateCandidate(@PathVariable int candidateId, @ModelAttribute Candidate candidate) {
    candidate.setId(candidateId);
    candidateService.update(candidate);
    return "redirect:/candidate/list";
  }
}

