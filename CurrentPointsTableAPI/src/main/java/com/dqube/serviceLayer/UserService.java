package com.dqube.serviceLayer;

import java.util.List;

import com.dqube.entity.Current_Points;

public interface UserService {
	
	// List method Service
	
	public List<Current_Points> listTopTen();
	
	// Add user Service
	
	public void adduser(Current_Points user);

}
