package com.project.LLM.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RegistrationConfig {
	
	@Bean
	public RestClient restClient() {
		return RestClient.builder()
				.baseUrl("http://localhost:3030/api/ssn")
				.build();
	}

}
