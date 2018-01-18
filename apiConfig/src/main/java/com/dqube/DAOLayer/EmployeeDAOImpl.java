package com.dqube.DAOLayer;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dqube.entity.EmployeeEntity;;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addEmployee(EmployeeEntity employee) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
		
	}

	
	
}