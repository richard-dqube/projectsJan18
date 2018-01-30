package com.dqube.DAOLayer;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dqube.entity.PokeTable;


@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<PokeTable> listTopTen(String user_id) {
			
		String sql ="call poke_procedure(:parameter1)";
		@SuppressWarnings("deprecation")
		Query query = sessionFactory.getCurrentSession().createNativeQuery(sql).addEntity(PokeTable.class).setParameter("parameter1", user_id);
		List<PokeTable> topten = query.getResultList();
		return  topten;
	}

	@Override
	public void addUser(PokeTable user) {
		
		

		sessionFactory.getCurrentSession().saveOrUpdate(user);

	}
	
	

}
