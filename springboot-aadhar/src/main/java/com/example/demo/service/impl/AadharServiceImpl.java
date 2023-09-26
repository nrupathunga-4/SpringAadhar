package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourcrNotFoundException;
import com.example.demo.model.Aadhar;
import com.example.demo.repository.AadharRepository;
import com.example.demo.service.AadharService;

@Service
public class AadharServiceImpl implements AadharService{

	public AadharServiceImpl(AadharRepository aadharRepository) {
		super();
		this.aadharRepository = aadharRepository;
	}
	private AadharRepository aadharRepository;
	@Override
	public Aadhar savePerson(Aadhar aadhar) {
		return aadharRepository.save(aadhar);
	}
	@Override
	public List<Aadhar> getPersons() {
		return aadharRepository.findAll();
	}
	@Override
	public Aadhar getPersonById(int id) {
		
		Optional<Aadhar> aadhar=aadharRepository.findById(id);
		 if(aadhar.isPresent())
		 {
			 return aadhar.get();
		 }
		 else
		 {
			 throw new ResourcrNotFoundException("Aadhar", "id", id);
		 }
	}
	@Override
	public Aadhar update(Aadhar aadhar, int id) {
		Aadhar existingaadhar=aadharRepository.findById(id).orElseThrow(()->new ResourcrNotFoundException("Aadhar", "id", id));
		existingaadhar.setFirstname(aadhar.getFirstname());
		existingaadhar.setLastname(aadhar.getLastname());
		existingaadhar.setAadharnumber(aadhar.getAadharnumber());
		aadharRepository.save(existingaadhar);
		return existingaadhar;
	}
	@Override
	public void delete(int id) {
		aadharRepository.deleteById(id);
	}
	
}
