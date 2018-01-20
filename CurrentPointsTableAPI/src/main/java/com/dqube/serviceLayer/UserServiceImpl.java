package com.dqube.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dqube.DAOLayer.UserDAO;
import com.dqube.entity.Current_Points;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public List<Current_Points> listTopTen() {
		
		return userDAO.listTopTen();
	}

	@Override
	public void adduser(Current_Points user) {

		userDAO.addUser(user);
		
	}

}
