package com.oehm4.basics.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oehm4.basics.dto.AccountDTO;

public class AccountDAO {

	
		public void saveAccountDetails(AccountDTO accountDTO) {
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(AccountDTO.class);
		 	SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(accountDTO);
			transaction.commit();	
		}
		
		public AccountDTO getAcoundDetailsById(Long id) {
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(AccountDTO.class);
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			return session.get(AccountDTO.class, id);
		}
		
		public void updateMobileNumberById(Long id, Long mobileNumber) {
			AccountDTO accountDTO = getAcoundDetailsById(id);
			if(accountDTO != null) {
				Configuration configuration = new Configuration();
				configuration.configure();
				configuration.addAnnotatedClass(AccountDTO.class);
				SessionFactory sessionFactory = configuration.buildSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				accountDTO.setMobileNumber(mobileNumber);
				session.update(accountDTO);
				transaction.commit();
			}else {
				System.out.println("Moblie number Update failed");
			}
		
		}
	
}

