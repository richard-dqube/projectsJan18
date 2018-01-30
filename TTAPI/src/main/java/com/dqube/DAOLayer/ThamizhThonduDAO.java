package com.dqube.DAOLayer;

import java.util.List;


import com.dqube.entity.RedeemEntity;
import com.dqube.entity.Current_Points;
import com.dqube.entity.MyPointsEntity;
import com.dqube.entity.PokeTableEntity;

public interface ThamizhThonduDAO {

		public List<RedeemEntity> displayDescendingByPoints();
		
		public List<Current_Points> listTopTen();

		public List<MyPointsEntity> cumulativePointsPerUser();

		public List<PokeTableEntity> listPokes(String user_id);

}
