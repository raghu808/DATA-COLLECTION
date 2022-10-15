package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.DataCollecCases;

public interface DcCases extends JpaRepository<DataCollecCases, Serializable>{

}
