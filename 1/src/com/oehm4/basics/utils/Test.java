package com.oehm4.basics.utils;

import com.oehm4.basics.dao.AccountDAO;
import com.oehm4.basics.dto.AccountDTO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setId(101L);
		accountDTO.setMobileNumber(78561235L);
		accountDTO.setAccountHodlerName("manas");
		accountDTO.setAccountNumber("IND101");
		accountDTO.setAddress("India");
		accountDTO.setBalance(10202.5D);
		
		AccountDAO dao = new AccountDAO();
		dao.saveAccountDetails(accountDTO);
	}

}
