package com.example.springwebsecrity.ems;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Employee {
	
	@Max(value=2000, message="Enter Proper employee id")
	private int employeeId;
	
	@NotEmpty(message="please enter username")
	@Pattern(regexp="[a-z]{4,6}", message="Please enter 4-6 small case character")
	private String name;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Past(message="please enter proper date of birth")
	@NotNull(message="please enter date of birth")
	private Date dob;
	
	private float salary;
	
	@Email(message="please enter proper email")
	@NotEmpty(message="please enter email")
	private String email;
	
	@NotEmpty
	private String designation;
	
	public Employee() {
	}
	
	public Employee(int employeeId, String name, Date dob, float salary, 
			String email, String designation) {
		this.employeeId=employeeId;
		this.name=name;
		this.salary=salary;
		this.dob=dob;
		this.email=email;
		this.designation=designation;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return employeeId+", "+name+" "+dob+" "+salary;
	}
	
}
