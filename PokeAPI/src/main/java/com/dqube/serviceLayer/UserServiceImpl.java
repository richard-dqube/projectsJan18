package com.dqube.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dqube.DAOLayer.UserDAO;
import com.dqube.entity.PokeTable;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public List<PokeTable> listTopTen(String user_id) {
		
		return userDAO.listTopTen(user_id);
	}

	@Override
	public void adduser(PokeTable user) {

		userDAO.addUser(user);
	
	}

}
