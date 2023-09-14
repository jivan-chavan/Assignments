package com.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Book;

public final class MyConnection {

	
	private MyConnection() {

	}

	public static SessionFactory getMySessionFactory() {
    	Configuration configuration = new Configuration(); 
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Book.class);
    	
    	
        SessionFactory sessionFactory =configuration.buildSessionFactory();
        		
        return sessionFactory;
    }
}
