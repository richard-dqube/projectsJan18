package com.dqube.DAOLayer;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dqube.entity.RedeemEntity;

@Repository
public class UserDAOImpl implements UserDAO {
	
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

	@Override
	public void addUser(RedeemEntity user) {

		sessionFactory.getCurrentSession().saveOrUpdate(user);

	}
	
	

}
