package com.oehm4.basics.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
public class AccountDTO implements Serializable{

	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;
	@Column(name = "ACCOUNT_HOLDER_NAME")
	private String accountHodlerName;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "MOBILE_NUMBER")
	private Long mobileNumber;
	@Column(name = "BALANCE")
	private Double balance;
	
	public AccountDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHodlerName() {
		return accountHodlerName;
	}

	public void setAccountHodlerName(String accountHodlerName) {
		this.accountHodlerName = accountHodlerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AccountDTO [id=" + id + ", accountNumber=" + accountNumber + ", accountHodlerName=" + accountHodlerName
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + ", balance=" + balance + "]";
	}
}
