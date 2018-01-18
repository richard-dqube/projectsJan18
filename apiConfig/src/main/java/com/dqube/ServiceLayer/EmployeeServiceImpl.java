package com.dqube.ServiceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dqube.DAOLayer.EmployeeDAO;
import com.dqube.entity.EmployeeEntity;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional
	@Override
	public void addEmployee(EmployeeEntity employee) {
		
		employeeDAO.addEmployee(employee);	
		
	}

	@Override
	public List<EmployeeEntity> getAllEmployees() {
		
		return employeeDAO.getAllEmployees();
	}

	
	
}
