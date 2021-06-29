package com.example.springwebsecrity.ems;

import java.util.List;



public interface EmployeeDetailDao {
	public List<Employee> getEmployeeDetails();
	public Employee getEmployeeDetailById(int id);
	public Employee insertEmployee(Employee employee);
	
}
