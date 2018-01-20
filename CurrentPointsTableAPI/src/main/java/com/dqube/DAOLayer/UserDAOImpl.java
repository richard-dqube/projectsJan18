package com.dqube.DAOLayer;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dqube.entity.Current_Points;;


@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Current_Points> listTopTen() {
		
		String sql = "call sort_by_points_current_points()";
		@SuppressWarnings("deprecation")
		Query query = sessionFactory.getCurrentSession().createNativeQuery(sql).addEntity(Current_Points.class);
		List<Current_Points> topten = query.getResultList();
		return  topten;
	}

	@Override
	public void addUser(Current_Points user) {

		sessionFactory.getCurrentSession().saveOrUpdate(user);

	}
	
	

}
