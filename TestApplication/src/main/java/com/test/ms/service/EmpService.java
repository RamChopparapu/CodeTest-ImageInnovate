package com.test.ms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.ms.entity.EmpVO;
import com.test.ms.entity.Employee;

@Service
public interface EmpService {
	public List getAllEmployees();
	public void createEmp(Employee employee);
	List<EmpVO> taxForEmps(String finYear);
	
}
