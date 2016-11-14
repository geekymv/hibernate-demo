package com.geekymv.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

import com.geekymv.pojo.User;

public class TestUser {

	public Session getSession() {
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder() //
						.applySettings(configuration.getProperties()) //
						.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		return session;
	}
	
	@Test
	public void testAddUser() {
		Session session = getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			User user = new User();
			user.setName("张三");
			session.save(user);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx != null) {
				tx.rollback();
			}
		}finally {
			session.close();
		}
		
	}
}
