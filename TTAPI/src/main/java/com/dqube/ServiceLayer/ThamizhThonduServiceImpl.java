package com.dqube.ServiceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dqube.DAOLayer.ThamizhThonduDAO;
import com.dqube.entity.Current_Points;
import com.dqube.entity.MyPointsEntity;
import com.dqube.entity.PokeTableEntity;
import com.dqube.entity.RedeemEntity;

@Service
@Transactional
public class ThamizhThonduServiceImpl implements ThamizhThonduService {

		@Autowired
		private ThamizhThonduDAO thamizhThonduDAO;
		
		@Override
		public List<RedeemEntity> displayDescendingByPoints() {
			
			return thamizhThonduDAO.displayDescendingByPoints();
		}
		
		@Override
		public List<Current_Points> listTopTen() {
			
			return thamizhThonduDAO.listTopTen();
		}
		
		@Override
		public List<MyPointsEntity> cumulativePointsPerUser() {
			
			return thamizhThonduDAO.cumulativePointsPerUser();
		}
		
		@Override
		public List<PokeTableEntity> listPokes(String user_id) {
			
			return thamizhThonduDAO.listPokes(user_id);
	
		}
		

}