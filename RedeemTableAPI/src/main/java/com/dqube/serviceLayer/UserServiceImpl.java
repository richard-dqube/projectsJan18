package com.dqube.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dqube.DAOLayer.UserDAO;
import com.dqube.entity.RedeemEntity;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public List<RedeemEntity> displayDescendingByPoints() {
		
		return userDAO.displayDescendingByPoints();
	}

	@Override
	public void adduser(RedeemEntity user) {

		userDAO.addUser(user);
		
	}

}
