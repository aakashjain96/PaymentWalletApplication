package com.capgemini.paw.bean;

import java.time.LocalDate;

public class PaymentAppDetails {

	long accountNumber;
	String customerName;
	long customerPhoneNo;
	String age;
	String gender;
	double balance;
	String address;
	long aadharNo;
	LocalDate date;
	
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerPhoneNo() {
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(long customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "PaymentAppDetails [accountNumber=" + accountNumber + ", customerName=" + customerName
				+ ", customerPhoneNo=" + customerPhoneNo + ", age=" + age + ", gender=" + gender + ", balance="
				+ balance + ", address=" + address + ", aadharNo=" + aadharNo + ", date=" + date + "]";
	}
	
	

	
}
