package com.dqube.DAOLayer;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dqube.entity.Current_Points;
import com.dqube.entity.MyPointsEntity;
import com.dqube.entity.PokeTableEntity;
import com.dqube.entity.RedeemEntity;

@Repository
public class TamizhThonduDAOImpl implements ThamizhThonduDAO {
		
		@Autowired
		SessionFactory sessionFactory;

		@SuppressWarnings("unchecked")
		@Override
		public List<RedeemEntity> displayDescendingByPoints() {
			
			String sql = "call sort_by_points_redeem()";
			@SuppressWarnings("deprecation")
			Query query = sessionFactory.getCurrentSession().createNativeQuery(sql).addEntity(RedeemEntity.class);
			List<RedeemEntity> points = query.getResultList();
			return  points;
		}
	
	
		@SuppressWarnings("unchecked")
		@Override
		public List<Current_Points> listTopTen() {
			
			String sql = "call sort_by_points_current_points()";
			@SuppressWarnings("deprecation")
			Query query = sessionFactory.getCurrentSession().createNativeQuery(sql).addEntity(Current_Points.class);
			List<Current_Points> points = query.getResultList();
			
			return  points;
		}

		
		@SuppressWarnings("unchecked")
		@Override
		public List<MyPointsEntity> cumulativePointsPerUser() {
			
			String sql = "CALL cumulate_userid_points()";
			@SuppressWarnings("deprecation")
			Query query = sessionFactory.getCurrentSession().createNativeQuery(sql).addEntity(MyPointsEntity.class);
			List<MyPointsEntity> points = query.getResultList();
			return  points;
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<PokeTableEntity> listPokes(String user_id) {
				
			String sql ="call poke_procedure(:parameter1)";
			@SuppressWarnings("deprecation")
			Query query = sessionFactory.getCurrentSession().createNativeQuery(sql).addEntity(PokeTableEntity.class).setParameter("parameter1", user_id);
			List<PokeTableEntity> pokeList = query.getResultList();
			return  pokeList;
		}
}
