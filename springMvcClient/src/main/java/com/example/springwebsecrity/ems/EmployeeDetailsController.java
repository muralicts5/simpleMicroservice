package com.example.springwebsecrity.ems;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/user")
public class EmployeeDetailsController {
	
	@Autowired
	private EmployeeDetailService employeeDetailService;
	
	@RequestMapping("/list")
	public String getEmployeeDetails(HttpSession sesion, ModelMap model){
		System.out.println("inside list.");
		ResponseEntity<List<Employee>> employees=employeeDetailService.getEmployeeDetails();
		model.addAttribute("employees",employees.getBody());
		return "employeeDetails";
	}
	
	@RequestMapping("/employee")
	public String getEmployeeDetailsById(@RequestParam int id, Model model){
		System.out.println(id);
		Employee e=employeeDetailService.getEmployeeDetailById(id).getBody();
		model.addAttribute("employee",e);
		return "employeeView";
	}
	
}
