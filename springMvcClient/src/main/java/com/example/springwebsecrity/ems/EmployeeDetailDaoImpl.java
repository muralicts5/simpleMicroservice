package com.example.springwebsecrity.ems;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public class EmployeeDetailDaoImpl implements EmployeeDetailDao {

	private List<Employee> employees=new ArrayList<Employee>();
	
	public EmployeeDetailDaoImpl(){
		Employee e1=new Employee(1001,"ramesh",new Date(), 5464.45f, "sdfds@gmail.com", "developer");
		Employee e2=new Employee(1002,"suresh",new Date(), 5464.45f, "sdfds@gmail.com", "developer");
		Employee e3=new Employee(1003,"dhinesh",new Date(), 5464.45f, "sdfds@gmail.com", "developer");
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
	}
	
	public List<Employee> getEmployeeDetails() {
		return employees;
	}
	
	public Employee insertEmployee(Employee employee){
		employees.add(employee);
		return employee;
	}

	public Employee getEmployeeDetailById(int id) {
		return employees.get(1);
		
	}
	
}
