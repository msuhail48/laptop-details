package com.oehm4.basics.utils;

import com.oehm4.basics.dao.AccountDAO;
import com.oehm4.basics.dto.AccountDTO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setId(102L);
		accountDTO.setMobileNumber(785612355L);
		accountDTO.setAccountHodlerName("Naman");
		accountDTO.setAccountNumber("IND1019083");
		accountDTO.setAddress("India");
		accountDTO.setBalance(102000.5D);
		
		AccountDAO dao = new AccountDAO();
		dao.saveAccountDetails(accountDTO);
		System.out.println("operation succssful");
		*/
		AccountDAO dao = new AccountDAO();
		
		AccountDTO accountDTO = dao.getAcoundDetailsById(102L);
		if(accountDTO != null) {
			System.out.println(accountDTO);
		}else {
			System.out.println("Invaid Id");
		}
		
		//dao.updateMobileNumberById(102L, 8951606106L);
	}

}
