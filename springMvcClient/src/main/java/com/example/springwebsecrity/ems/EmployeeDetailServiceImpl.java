package com.example.springwebsecrity.ems;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;


@Service
public class EmployeeDetailServiceImpl implements EmployeeDetailService {

	@Autowired
	private EmployeeDetailDao employeeDetailsDao;
	
	@Autowired
	private EurekaClient eurekaClient;
	
	public ResponseEntity<List<Employee>> getEmployeeDetails() {
		RestTemplate restTemplate = new RestTemplate();
		InstanceInfo instanceInfo=eurekaClient.getNextServerFromEureka("EMPLOYEESERVICE", false);
		String url=instanceInfo.getHomePageUrl();
		System.out.println("url:"+url);
		String fooResourceUrl = "http://localhost:8090/employees";
		ResponseEntity<List<Employee>> response=restTemplate.exchange(url+"/employees", 
									HttpMethod.GET, null,  
									new ParameterizedTypeReference<List<Employee>>() {});
		return response;
	}

	public Employee insertEmployee(Employee employee) {
		return employeeDetailsDao.insertEmployee(employee);
	}
	
	public ResponseEntity<Employee> getEmployeeDetailById(int id){
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "http://localhost:8090/employees/"+id;
		ResponseEntity<Employee> response=restTemplate.exchange(fooResourceUrl, 
									HttpMethod.GET, null,  
									new ParameterizedTypeReference<Employee>() {});
		return response;	
		}

}
