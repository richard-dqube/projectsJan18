package com.dqube.serviceLayer;

import java.util.List;

import com.dqube.entity.RedeemEntity;

public interface UserService {
	
	public List<RedeemEntity> displayDescendingByPoints();
	
	public void adduser(RedeemEntity user);

}
