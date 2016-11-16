package com.geekymv.hibernate_demo;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.geekymv.common.enums.Status.ArticleStatus;
import com.geekymv.pojo.Article;
import com.geekymv.pojo.Tag;
import com.geekymv.pojo.User;

public class TestArticle {
	private Session session;

	@Before
	public void getSession() {
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder() //
				.applySettings(configuration.getProperties()) //
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);
		session = sessionFactory.openSession();
	}

	@Test
	public void testAddArticle() {
		
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			@SuppressWarnings("unchecked")
			List<Tag> tags = session.createQuery("select new Tag(id, name) from Tag where user.id = :userId ")
					.setParameter("userId", 1)
					.list();
			Set<Tag> sets = new HashSet<Tag>();
			sets.addAll(tags);
			
			User user = (User) session.get(User.class, 1);
			
			Article article = new Article();	
			article.setTitle("我是新手...");
			article.setTags(sets);
			article.setAuthor(user);
			article.setArticleStatus(ArticleStatus.ACTIVE);
			article.setCreateTime(new Date());
			
			session.save(article);
			
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
	
	
	@Test
	public void testGetArticle() {
		Article article = (Article) session.get(Article.class, 2);
		System.out.println(article);
	}
	
	@Test
	public void testDeleteArticle() {
		
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Article article = (Article) session.get(Article.class, 1);
			session.delete(article);
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
