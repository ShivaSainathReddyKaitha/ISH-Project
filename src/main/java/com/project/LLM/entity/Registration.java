package com.project.LLM.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "REGISTRATION_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration {
	
	@Id
	@SequenceGenerator(name = "IdGenerator", sequenceName = "APP_ID_GEN",
						initialValue = 1000, allocationSize = 100)
	@GeneratedValue(generator = "IdGenerator", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String email;
	private String gender;
	private Long phoneNo;
	private Long ssn;
	private String stateName;
	private LocalDate dob;
	
	private String createdBy;
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdAt;
	private String updatedBy;
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate updatedAt;

}
