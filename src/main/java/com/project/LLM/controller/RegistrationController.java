package com.project.LLM.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.LLM.binding.RegistrationInput;
import com.project.LLM.service.RegistrationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ish/registration")
@RequiredArgsConstructor
public class RegistrationController {
	
	private final RegistrationService service;
	
	@PostMapping
	public ResponseEntity getState(@RequestBody RegistrationInput registrationInput) {
		try {
			Long details = service.saveDetails(registrationInput);
			if(details > 0) {
				return ResponseEntity.ok("Application Details are saved");
			}
			return ResponseEntity.badRequest().body("Invalid SSN or Candidate is not from New York State");
		}
		catch(Exception ex) {
			return ResponseEntity.badRequest().body(ex.getMessage());
		}
	}

}
