package com.org.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.org.project.model.Employee;
import com.org.project.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository emp;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return emp.findAll();
	}
	
	public Optional<Employee> getEmployeeById(Long id){
	return emp.findById(id);	
	}
	
	public Employee saveEmployee(Employee e) {
		return emp.save(e);
	}
	
	public Employee updateEmployee(Employee e) {
		return emp.save(e);
	}
	public void deleteEmployee(Long id) {
		emp.deleteById(id);
	}
	
}
