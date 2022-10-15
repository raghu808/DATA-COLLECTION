package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.PlanSelec;

public interface PlanSel extends JpaRepository<PlanSelec, Serializable> {
	
	
}
