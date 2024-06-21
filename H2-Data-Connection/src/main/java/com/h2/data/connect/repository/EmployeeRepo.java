package com.h2.data.connect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2.data.connect.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
