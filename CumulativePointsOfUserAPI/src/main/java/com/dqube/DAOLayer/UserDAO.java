package com.dqube.DAOLayer;

import java.util.List;

import com.dqube.entity.MyPointsEntity;

public interface UserDAO {

	public List<MyPointsEntity> cumulativePointsPerUser();
	
	public void addUser(MyPointsEntity user);
	
}
