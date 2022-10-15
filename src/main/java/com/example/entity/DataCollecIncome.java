package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DATA_COLLC_INCOME")
public class DataCollecIncome {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer incomeId;
	
	private Integer caseNumber;
	
	private Long empIncome;
	
	private Long rentIncome;
	
	private Long propertyIncome;
	
}
