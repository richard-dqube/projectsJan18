package com.dqube.DAOLayer;

import java.util.List;

import com.dqube.entity.Current_Points;

public interface UserDAO {

	public List<Current_Points> listTopTen();
	
	public void addUser(Current_Points user);
	
}
