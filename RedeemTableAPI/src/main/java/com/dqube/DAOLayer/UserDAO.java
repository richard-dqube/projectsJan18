package com.dqube.DAOLayer;

import java.util.List;

import com.dqube.entity.RedeemEntity;

public interface UserDAO {

	public List<RedeemEntity> displayDescendingByPoints();
	
	public void addUser(RedeemEntity user);
	
}
