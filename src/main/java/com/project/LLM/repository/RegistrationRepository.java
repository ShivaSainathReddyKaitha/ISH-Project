package com.project.LLM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.LLM.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
