package com.dqube.serviceLayer;

import java.util.List;

import com.dqube.entity.Current_Points;

public interface UserService {
	
	public List<Current_Points> listTopTen();
	
	public void adduser(Current_Points user);

}
