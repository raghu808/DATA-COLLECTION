package com.example.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DATA_COLLC_CHILD")
public class DataCollecChild {
	
	@Id
	private Integer childrenId;
	
	private Long caseNumber;
	
	private String childName;
	
	private LocalDate childDOB;
	
	private Long childSSN;
	
}
