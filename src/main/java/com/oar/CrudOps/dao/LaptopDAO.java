package com.oar.CrudOps.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.oar.CrudOps.dto.LaptopDTO;
import com.oar.CrudOps.utils.SessionFactoryUtil;

public class LaptopDAO {
	public void saveLaptopDetails(LaptopDTO lapDTO) {

		Session session = SessionFactoryUtil.createSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(lapDTO);
		transaction.commit();
	}

	public LaptopDTO getLaptopDetailsByid(Long id) {

		Session session = SessionFactoryUtil.createSessionFactory().openSession();
		return session.get(LaptopDTO.class, id);

	}

	public void updateRamByid(Long id, String ram) {
		LaptopDTO lapDTO = getLaptopDetailsByid(id);
		if (lapDTO != null) {
			Session session = SessionFactoryUtil.createSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			lapDTO.setRam(ram);
			session.update(lapDTO);
			transaction.commit();

		} else {
			System.out.println("ram  Update failed");
		}
	}

	public void deleteRecordByid(Long id) {
		LaptopDTO lapDTO = getLaptopDetailsByid(id);
		if (lapDTO != null) {
			Session session = SessionFactoryUtil.createSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(lapDTO);
			transaction.commit();

			System.out.println("Deleted Record Sucessfully........");

		} else {
			System.out.println("Delete Operation  failed");
		}
	}
}
