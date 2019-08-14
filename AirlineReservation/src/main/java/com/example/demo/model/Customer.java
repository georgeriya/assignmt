package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="Customer")
@Component
public class Customer {

	@Id
	private long customerId;
	private String customerName;
	private String address;
	private String city;
	private String state;
	private long cardNumber, contactNumber; 
}
