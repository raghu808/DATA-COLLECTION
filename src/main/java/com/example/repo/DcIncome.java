package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.DataCollecIncome;

public interface DcIncome extends JpaRepository<DataCollecIncome, Serializable>{

}
