package com.example.service;

import com.example.bindings.DcChild;
import com.example.bindings.DcEducation;
import com.example.bindings.DcIncome;
import com.example.bindings.planSelection;

public interface DcService {
	
	public boolean savePlan(planSelection planSelection);
	
	public boolean saveIncome(DcIncome dcIncome);
	
	public boolean saveChild(DcChild dcChild);
	
	public boolean saveEducation(DcEducation dcEducation);
	
	
}	
