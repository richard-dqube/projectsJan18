package com.dqube.DAOLayer;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dqube.entity.MyPointsEntity;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<MyPointsEntity> cumulativePointsPerUser() {
		
		String sql = "CALL cumulate_userid_points()";
		@SuppressWarnings("deprecation")
		Query query = sessionFactory.getCurrentSession().createNativeQuery(sql).addEntity(MyPointsEntity.class);
		List<MyPointsEntity> points = query.getResultList();
		return  points;
	}

	@Override
	public void addUser(MyPointsEntity user) {

		sessionFactory.getCurrentSession().saveOrUpdate(user);

	}
	
	

}
