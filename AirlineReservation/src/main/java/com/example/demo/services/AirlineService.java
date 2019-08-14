package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Airline;
import com.example.demo.repos.AirlineRepository;

@Service
public class AirlineService {

	@Autowired
	private AirlineRepository repo;
	
	public Airline save(Airline entity) {
		return repo.save(entity);
	}
	
	public Iterable<Airline> findAll(){
		return repo.findAll();
	}
	
}
