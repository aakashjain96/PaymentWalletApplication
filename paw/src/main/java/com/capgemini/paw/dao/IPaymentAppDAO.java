package com.capgemini.paw.dao;


import com.capgemini.paw.bean.PaymentAppDetails;

public interface IPaymentAppDAO {

	public boolean loginAccount(String username, String password);
	public int createAccount(PaymentAppDetails paymentAppDetails);
	public double showBalance();
	public boolean deposit(double amount);
	public boolean withdraw(double amount);
	public boolean fundTransfer(int accNo,double amount);
	public PaymentAppDetails printTransaction();
	
}
