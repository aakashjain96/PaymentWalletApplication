package com.capgemini.paw.bean;

import java.time.LocalDate;

public class PaymentAppDetails {
	private String username;
	private String password;
	private long accountNumber;
	private String customerName;
	private String phoneNo;
	private int age;
	private String gender;
	private double balance;
	private String address;
	private String aadharNo;
	private LocalDate date;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
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
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
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
		return "PaymentAppDetails [accountNumber=" + accountNumber + ", customerName=" + customerName + ", phoneNo="
				+ phoneNo + ", age=" + age + ", gender=" + gender + ", balance=" + balance + ", address=" + address
				+ ", aadharNo=" + aadharNo + ", date=" + date + "]";
	}
	
	
	
	
	
	

	
}
