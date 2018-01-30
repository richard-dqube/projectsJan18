package com.dqube.config;


import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import com.dqube.entity.PokeTable;

@Component
@ComponentScan(basePackages="com.dqube")
@Configuration
public class ConfigurationClass {

	@Autowired
	@Bean(name="dataSource")
	public DataSource getMySQLDataSource() {
		DriverManagerDataSource driverMgrDataSource=new DriverManagerDataSource();
		driverMgrDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverMgrDataSource.setUrl("jdbc:mysql://localhost:3306/tamil_thondu_reward"); //tamil_thondu_reward
		driverMgrDataSource.setUsername("root");
		driverMgrDataSource.setPassword("root");
		System.out.println("connection established");
		return driverMgrDataSource;
	}

	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties hibernateProperties=new Properties();
		hibernateProperties.put("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		hibernateProperties.setProperty("hibernate.format_sql", "true");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto","update");

		
		LocalSessionFactoryBuilder localSessionFacBuilder=new LocalSessionFactoryBuilder(getMySQLDataSource());
		localSessionFacBuilder.addProperties(hibernateProperties);

//		localSessionFacBuilder.addAnnotatedClass(Category.class);
//		localSessionFacBuilder.addAnnotatedClass(Supplier.class);
//		localSessionFacBuilder.addAnnotatedClass(Product.class);
		
		localSessionFacBuilder.addAnnotatedClass(PokeTable.class);
		
		SessionFactory sessionFactory=localSessionFacBuilder.buildSessionFactory();
		System.out.println("Session Factory Object Created");
		return sessionFactory;
	}
	
	@Autowired
	@Bean(name="transactionManager")
	
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager hibernateTranMgr=new HibernateTransactionManager(sessionFactory);
		return hibernateTranMgr;
	}
	
}
