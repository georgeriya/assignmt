package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="Airline")
@Component
public class Airline {

	@Id
	private long flightNumber;
	private String flightName;
	private String departure;
	private String arrival;
	private Date arrivalDate;
	
}
