package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Airline;

public class AirlineRepository implements CrudRepository<Airline, Long> {

}
