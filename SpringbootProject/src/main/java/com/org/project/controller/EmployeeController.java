package com.org.project.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.project.model.Employee;
import com.org.project.service.EmployeeService;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
	
	private EmployeeService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
		Optional<Employee> employee = service.getEmployeeById(id);
		return employee.map(ResponseEntity :: ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
		
	}
}
