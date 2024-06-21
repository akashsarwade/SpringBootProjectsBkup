package com.h2.data.connect;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.h2.data.connect.model.Employee;
import com.h2.data.connect.repository.EmployeeRepo;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepo employeeRepo;

	@PostMapping("/saveEmp")
	public String saveEmp(@RequestBody Employee employee) {
		employeeRepo.save(employee);
		return "Employee Saved";

	}
	@GetMapping("/getAll")
	public List<Employee>getAllEmp(){
		return employeeRepo.findAll();
	}
}
