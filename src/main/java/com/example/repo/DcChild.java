package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.DataCollecChild;

public interface DcChild extends JpaRepository<DataCollecChild, Serializable>{

}
