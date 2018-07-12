package com.capgemini.paw.service;
import com.capgemini.paw.bean.AccountDetails;



public interface IPaymentAppService {

	public boolean loginAccount(String username, String password);
	public int createAccount(AccountDetails accountDetails);
	public double showBalance();
	public boolean deposit(double amount);
	public boolean withdraw(double amount);
	public boolean fundTransfer(int accNo,double amount);
	public AccountDetails printTransaction();

	
}
