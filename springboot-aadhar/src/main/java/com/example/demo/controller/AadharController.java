package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Aadhar;
import com.example.demo.service.AadharService;

@RestController
@RequestMapping("/api/aadhars")
public class AadharController {

	private AadharService aadharService;

	public AadharController(AadharService aadharService) {
		super();
		this.aadharService = aadharService;
	}
	
	@PostMapping
	 public ResponseEntity<Aadhar> savePerson(@RequestBody Aadhar aadhar)
	 {
		 return new ResponseEntity<Aadhar>(aadharService.savePerson(aadhar), HttpStatus.CREATED);
	 }
	
	@GetMapping
	public List<Aadhar> getPersons()
	{
		return aadharService.getPersons();
	}
	
	@PostMapping("{id}")
	public ResponseEntity<Aadhar> getPersonById(@PathVariable(name="id")int id)
	{
		return new ResponseEntity<Aadhar>(aadharService.getPersonById(id), HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Aadhar> update(@PathVariable(name="id")int id,@RequestBody Aadhar aadhar)
	{
		return new ResponseEntity<Aadhar>(aadharService.update(aadhar, id), HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> delete(@PathVariable int id)
	{
		aadharService.delete(id);
		return new ResponseEntity<String>("Aadhar Card Deleted from DB", HttpStatus.OK);		
	}
}
