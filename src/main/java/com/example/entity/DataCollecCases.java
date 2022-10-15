package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DATA_COLLC_CASES")
public class DataCollecCases {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer caseId;
	
	private Long caseNumber;
	
	private Integer appId;
	
	private Integer planId;
}
