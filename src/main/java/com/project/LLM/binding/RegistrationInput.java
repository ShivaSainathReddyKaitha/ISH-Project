package com.project.LLM.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class RegistrationInput {
	
	private String name;
	private String email;
	private String gender;
	private Long phoneNo;
	private String ssn;
	private LocalDate dob;

}

