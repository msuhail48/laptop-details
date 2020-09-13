package com.oar.CrudOps.utils;

import java.util.List;
import com.oar.CrudOps.dao.HqlLaptopDAO;
import com.oar.CrudOps.dao.LaptopDAO;
import com.oar.CrudOps.dto.LaptopDTO;

public class Test {

	public static void main(String[] args) {
		/*
		 * LaptopDTO lapDTO = new LaptopDTO(); lapDTO.setBrand("Toshiba");
		 * lapDTO.setModel("Satellite"); lapDTO.setDisplaySize("15.60-inch");
		 * lapDTO.setProcessor("Core i3"); lapDTO.setOs("windows10");
		 * lapDTO.setRam("6GB"); lapDTO.setPrice(40000.00);
		 * 
		 * 
		 * LaptopDAO lapDAO = new LaptopDAO(); lapDAO.saveLaptopDetails(lapDTO);
		 */

		/*
		 * LaptopDAO lapDAO = new LaptopDAO(); LaptopDTO lapDTO =
		 * lapDAO.getLaptopDetailsByid(1L); if(lapDTO!=null) {
		 * System.out.println(lapDTO); System.out.println(
		 * "Data Fetched Successfully.......");
		 * 
		 * } else { System.out.println("Invalid RollNum"); }
		 */

		// LaptopDAO lapDAO = new LaptopDAO();
		// lapDAO.updateRamByid(1L,"256GB");
		// System.out.println("Data Updated Successfully.......");

		// LaptopDAO lapDAO = new LaptopDAO();
		// lapDAO.deleteRecordByid(1L);

		/*
		 * HqlLaptopDAO hqlLaptopDAO = new HqlLaptopDAO(); List<LaptopDTO>
		 * laptopDetails1 = hqlLaptopDAO.getLaptopDetails(); List<LaptopDTO>
		 * laptopDetails2 = hqlLaptopDAO.getLaptopDetails(); System.out.println(
		 * "size of laptopDetails1 is "+laptopDetails1.size());
		 * System.out.println("size of laptopDetails2 is "
		 * +laptopDetails2.size());
		 */

		// HqlLaptopDAO hqlLaptopDAO = new HqlLaptopDAO();
		// LaptopDTO laptopDTO = hqlLaptopDAO.getLaptopDetailsByBrand("Apple");
		// LaptopDTO laptopDTO1 = hqlLaptopDAO.getLaptopDetailsByBrand("Apple");
		// System.out.println(laptopDTO);
		// System.out.println(laptopDTO1);

		HqlLaptopDAO hqlLaptopDAO = new HqlLaptopDAO();
		// hqlLaptopDAO.updateRamByBrand("HP","10GB");

		hqlLaptopDAO.deleteByid(3L);

	}
}
