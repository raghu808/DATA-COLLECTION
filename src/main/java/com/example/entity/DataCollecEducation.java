package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DATA_COLL_EDUC")
public class DataCollecEducation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer educationId;
	
	private Long caseNumber;
	
	private String highestQualification;
	
	private String universityName;
	
	private Integer educationYear;
	
	
}	
