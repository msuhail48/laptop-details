package com.oar.CrudOps.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	private static SessionFactory sessionFactory = null;

	private SessionFactoryUtil() {

	}

	public static SessionFactory createSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = new Configuration().configure().buildSessionFactory();
		return sessionFactory;

	}
}
