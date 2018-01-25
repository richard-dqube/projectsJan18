package com.dqube.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dqube.DAOLayer.UserDAO;
import com.dqube.entity.Current_Points;

//Service Implementation

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	//Autowired With DAO Layer
	
	@Autowired
	private UserDAO userDAO;
	
	//List method Service implementation
	
	@Override
	public List<Current_Points> listTopTen() {
		
		return userDAO.listTopTen();
	}
	
	//Adding User service Implementation
	
	@Override
	public void adduser(Current_Points user) {

		userDAO.addUser(user);
		
	}

}
