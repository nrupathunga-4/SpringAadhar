package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Aadhar;

public interface AadharRepository extends JpaRepository<Aadhar, Integer> {

	
}
