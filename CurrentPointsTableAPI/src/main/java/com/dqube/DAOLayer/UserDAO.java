package com.dqube.DAOLayer;

import java.util.List;

import com.dqube.entity.Current_Points;

public interface UserDAO {

	//List Method DAO
	
	public List<Current_Points> listTopTen();
	
	// Adding method DAO
	
	public void addUser(Current_Points user);
	
}
