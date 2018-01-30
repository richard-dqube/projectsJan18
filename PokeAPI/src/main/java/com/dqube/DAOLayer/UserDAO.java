package com.dqube.DAOLayer;

import java.util.List;

import com.dqube.entity.PokeTable;

public interface UserDAO {

	public List<PokeTable> listTopTen(String user_id);
	
	public void addUser(PokeTable user);
	
}
