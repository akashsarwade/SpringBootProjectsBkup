package com.h2.data.connect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private int id;
	private String name;
	private int salary;
	private String address;
	
	
	
	
}
