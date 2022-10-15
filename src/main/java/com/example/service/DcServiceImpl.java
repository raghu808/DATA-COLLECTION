package com.example.service;

import org.springframework.stereotype.Service;

import com.example.bindings.DcChild;
import com.example.bindings.DcEducation;
import com.example.bindings.DcIncome;
import com.example.bindings.planSelection;

@Service
public class DcServiceImpl implements DcService{

	@Override
	public boolean savePlan(planSelection planSelection) {
		return false;
	}

	@Override
	public boolean saveIncome(DcIncome dcIncome) {
		return false;
	}

	@Override
	public boolean saveChild(DcChild dcChild) {
		return false;
	}

	@Override
	public boolean saveEducation(DcEducation dcEducation) {
		return false;
	}
	
}
