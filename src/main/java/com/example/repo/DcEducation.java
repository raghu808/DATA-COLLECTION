package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.DataCollecEducation;

public interface DcEducation extends JpaRepository<DataCollecEducation, Serializable>{

}
