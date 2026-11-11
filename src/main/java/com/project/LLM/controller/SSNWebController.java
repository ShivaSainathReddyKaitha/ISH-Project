package com.project.LLM.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.LLM.service.SSNWebService;

@RestController
@RequestMapping("/api/ssn")
public class SSNWebController {
	
	private final SSNWebService service;

	public SSNWebController(SSNWebService service) {
		this.service = service;
	}
	
	
	@GetMapping("/state")
	public ResponseEntity<String> findState(@RequestParam(name = "number") String number) {
		
		String state = service.getState(number);
		if(state.equalsIgnoreCase("Invalid Input")) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>(state, HttpStatus.OK);
	}
	
	

}
