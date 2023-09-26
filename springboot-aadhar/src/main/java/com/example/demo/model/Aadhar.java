package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="aadhar")
public class Aadhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
	@Column(name="first_name",nullable = false)
   private String firstname;
	@Column(name="last_name")
   private String lastname;
	@Column(name="aadhar_number",nullable = false)
   private long  aadharnumber;
   
}
