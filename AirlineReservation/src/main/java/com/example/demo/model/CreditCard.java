package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="creditcard")
public class CreditCard {

	@Id
	private long cardNumber;
	private Date expiryDate;
	private long cvv;
}
