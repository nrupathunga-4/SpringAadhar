package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Aadhar;

public interface AadharService {
   Aadhar savePerson(Aadhar aadhar);
   List<Aadhar> getPersons();
   Aadhar getPersonById(int id);
   Aadhar update(Aadhar aadhar,int id);
   void delete(int id);
}
