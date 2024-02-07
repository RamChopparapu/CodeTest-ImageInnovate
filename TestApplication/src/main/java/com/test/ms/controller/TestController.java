package com.test.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.ms.entity.Employee;
import com.test.ms.service.EmpService;

@RestController
@RequestMapping("/test")
public class TestController {
	
	 @Autowired
	 EmpService employeeService;
	
	 	@GetMapping("/employees")
	    private List getAllEmployees() {
	        return employeeService.getAllEmployees();
	    }
	 	
	 	@GetMapping("/getTax")
	    private List taxForEmps(@RequestParam("finYear")String finYear) {
	        return employeeService.taxForEmps(finYear);
	    }


	    @PostMapping("/createEmp")
	    private ResponseEntity createEmployee(@RequestBody Employee employee) {
	    	try {
	    	if (employee.getEmpCode() <= 0 ) {
		    		return ResponseEntity.ok("Ivalid Data,Employee code should be give");
			}else if (employee.getEmail() == "" && employee.getEmail().equalsIgnoreCase("")) {
	    		return ResponseEntity.ok("Ivalid Data,Email should not be null");
			}else if (employee.getFirstName() == "" && employee.getFirstName().equalsIgnoreCase("")) {
				return ResponseEntity.ok("Ivalid Data,FirstName should not be null");
			}else if (employee.getLastName() == "" && employee.getLastName().equalsIgnoreCase("")) {
				return ResponseEntity.ok("Ivalid Data,LastName should not be null");
			}else if (employee.getMobileNumbers().size()<1) {
				return ResponseEntity.ok("Ivalid Data,atleast one mobile number should give");
			}else if (employee.getDoj() == null) {
	    		return ResponseEntity.ok("Ivalid Data,DOJ should not be empty");
			}else if (employee.getMonthSal() <= 0 ) {
				return ResponseEntity.ok("Ivalid Data,Please provide monthly Salary");
			}else {
				employeeService.createEmp(employee);
				  return new ResponseEntity("New employee created with id: " + employee.getEmpCode(), HttpStatus.CREATED);
			}
	        } catch (Exception exception) {
	            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	      
	    	
	    	}


}
