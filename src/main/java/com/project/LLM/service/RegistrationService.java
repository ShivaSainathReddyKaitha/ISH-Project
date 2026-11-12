package com.project.LLM.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.project.LLM.binding.RegistrationInput;
import com.project.LLM.entity.Registration;
import com.project.LLM.repository.RegistrationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RegistrationService {
	
	private final RegistrationRepository repository;
	private final RestClient restClient;
	
	@Value("${app.target.stateName}")
	private String targetState;
	
	public Long saveDetails(RegistrationInput entity) {
		String state = checkIfValid(entity.getSsn());
		if(state.equalsIgnoreCase(targetState)) {
			Registration registration = new Registration();
			BeanUtils.copyProperties(entity, registration);
			registration.setStateName(targetState);
			return repository.save(registration).getId();
		}
		return 0l;
	}
	
	public String checkIfValid(String number) {
		return restClient.get()
					.uri("/state?number={number}",number)
					.retrieve()
					.body(String.class);
	}

}
