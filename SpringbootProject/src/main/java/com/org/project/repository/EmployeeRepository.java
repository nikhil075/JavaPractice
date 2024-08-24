package com.org.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.org.project.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
