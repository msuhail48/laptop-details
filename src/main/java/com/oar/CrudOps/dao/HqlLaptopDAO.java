package com.oar.CrudOps.dao;

import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.oar.CrudOps.dto.LaptopDTO;
import com.oar.CrudOps.utils.SessionFactoryUtil;

public class HqlLaptopDAO {
	public List<LaptopDTO> getLaptopDetails() {

		Session session = SessionFactoryUtil.createSessionFactory().openSession();
		String hql = "from LaptopDTO";
		Query query = session.createQuery(hql);
		query.setCacheable(true);
		List<LaptopDTO> list = query.list();
		return list;

	}

	public LaptopDTO getLaptopDetailsByBrand(String brand) {

		Session session = SessionFactoryUtil.createSessionFactory().openSession();
		String hql = "from LaptopDTO where brand=:brand";
		Query query = session.createQuery(hql);
		query.setCacheable(true);
		query.setParameter("brand", brand);
		LaptopDTO uniqueResult = (LaptopDTO) query.uniqueResult();
		return uniqueResult;

	}

	public void updateRamByBrand(String brand, String updatedRam) {

		Session session = SessionFactoryUtil.createSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "update LaptopDTO set ram=:updatedRam where brand=:brand";
		Query query = session.createQuery(hql);
		query.setCacheable(true);
		query.setParameter("updatedRam", updatedRam);
		query.setParameter("brand", brand);
		int updateRows = query.executeUpdate();
		transaction.commit();
		if (updateRows == 0) {
			System.out.println(" Update operation failed..........");
		}
		System.out.println("Update operation completed successfully.......");
	}

	public void deleteByid(Long id) {

		Session session = SessionFactoryUtil.createSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "delete LaptopDTO where id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		int updateRows = query.executeUpdate();
		transaction.commit();
		if (updateRows == 0) {
			System.out.println("Delete operation failed........");
		}
		System.out.println("Delete operation successfull......");

	}

}
