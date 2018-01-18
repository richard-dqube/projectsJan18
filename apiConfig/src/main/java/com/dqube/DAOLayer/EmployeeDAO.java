package com.dqube.DAOLayer;

import java.util.List;

import com.dqube.entity.EmployeeEntity;

public interface EmployeeDAO {

	public void addEmployee(EmployeeEntity employee);
	
	public List<EmployeeEntity> getAllEmployees();
	
}
