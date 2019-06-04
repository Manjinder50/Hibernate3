package com.kaushik.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kaushik.entity.User;

public class HibernateTest {

	public static void main(String[] args) {

		User user = new User();
		
		user.setUserId(2);
		user.setUserName("Second User");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
