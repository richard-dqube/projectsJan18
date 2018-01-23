package com.dqube.serviceLayer;

import java.util.List;

import com.dqube.entity.MyPointsEntity;

public interface UserService {
	
	public List<MyPointsEntity> cumulativePointsPerUser();
	
	public void adduser(MyPointsEntity user);

}
