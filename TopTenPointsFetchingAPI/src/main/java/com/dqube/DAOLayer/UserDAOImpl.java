package com.dqube.DAOLayer;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dqube.entity.Current_Points;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Current_Points> listTopTen() {
		
		String hql = "FROM Current_Points";
		
		return sessionFactory.getCurrentSession().createQuery(hql).getResultList();
	}

	@Override
	public void addUser(Current_Points user) {

		sessionFactory.getCurrentSession().saveOrUpdate(user);

	}
	
	

}
