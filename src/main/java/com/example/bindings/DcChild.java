package com.example.bindings;

import java.time.LocalDate;

import lombok.Data;

@Data
public class DcChild {
	
	private Long caseNumber;
	
	private String childName;
	
	private LocalDate childDOB;
	
	private Long childSSN;
}
