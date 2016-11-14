package com.geekymv.hibernate_demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.geekymv.pojo.Tag;
import com.geekymv.pojo.User;

public class TestTag {
	
	private Session session;
	
	@Before
	public void getSession() {
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder() //
						.applySettings(configuration.getProperties()) //
						.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		session = sessionFactory.openSession();
	}
	
	@Test
	public void testGetUser() {
		// select new Tag(id, name) 
		@SuppressWarnings("unchecked")
		List<Tag> tags = session.createQuery("from Tag where user.id = :userId ")
				.setParameter("userId", 1)
				.list();
		/*
		String sql = "select id, name from t_tag t where t.user_id = :userId ";
		List<Tag> tags = session.createSQLQuery(sql)
						.setParameter("userId", 1)
						.setResultTransformer(Transformers.aliasToBean(Tag.class))
						.list();
		*/
		for (Tag tag : tags) {
			System.out.println(tag.getUser());
		}
	}
	
	@Test
	public void testGetTag() {
		Tag tag = (Tag) session.get(Tag.class, 1);
		System.out.println(tag.getId());
	}
	
	@Test
	public void testAddTag() {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Tag tag = new Tag();
			tag.setName("c");
			User user = (User) session.get(User.class, 1);
			tag.setUser(user);
			session.save(tag);
			
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
