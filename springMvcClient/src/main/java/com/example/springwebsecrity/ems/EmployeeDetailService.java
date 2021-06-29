package com.example.springwebsecrity.ems;

import java.util.List;

import org.springframework.http.ResponseEntity;



public interface EmployeeDetailService {

	public ResponseEntity<List<Employee>> getEmployeeDetails();
	public Employee insertEmployee(Employee employee);
	public ResponseEntity<Employee> getEmployeeDetailById(int id);
}
