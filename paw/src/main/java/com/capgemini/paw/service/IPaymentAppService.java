package com.capgemini.paw.service;
import com.capgemini.paw.bean.PaymentAppDetails;

public interface IPaymentAppService {

	public boolean loginAccount(String username, String password);
	public int createAccount(PaymentAppDetails paymentAppDetails);
	public double showBalance();
	public boolean deposit(double amount);
	public boolean withdraw(double amount);
	public boolean fundTransfer(int accNo,double amount);
	public PaymentAppDetails printTransaction();

	
}
