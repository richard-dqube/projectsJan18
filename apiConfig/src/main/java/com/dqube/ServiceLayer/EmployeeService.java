package com.dqube.ServiceLayer;

import java.util.List;

import com.dqube.entity.EmployeeEntity;

public interface EmployeeService {

	public void addEmployee(EmployeeEntity employee);
	
	public List<EmployeeEntity> getAllEmployees();
	
}
