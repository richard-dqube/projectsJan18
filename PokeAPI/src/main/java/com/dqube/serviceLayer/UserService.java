package com.dqube.serviceLayer;

import java.util.List;

import com.dqube.entity.PokeTable;

public interface UserService {
	
	public List<PokeTable> listTopTen(String user_id);
	
	public void adduser(PokeTable user);

}
