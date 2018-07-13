package com.capgemini.paw.service;




import java.util.List;

import com.capgemini.paw.bean.AccountDetails;
import com.capgemini.paw.dao.PaymentAppDAO;


public class PaymentAppService implements IPaymentAppService{

	PaymentAppDAO dao=new PaymentAppDAO();
	
	public boolean loginAccount(String username, String password) {
		
		return dao.loginAccount(username, password);
	}
	
	public int createAccount(AccountDetails accountDetails) {
		return dao.createAccount(accountDetails);
		
	}

	public double showBalance() {
		return dao.showBalance();
		
	}

	public boolean deposit(double amount) {
		return dao.deposit(amount);
	}

	public boolean withdraw(double amount) {
		return dao.withdraw(amount);
	}

	public boolean fundTransfer(int accountNo, double amount) {
		return dao.fundTransfer(accountNo, amount);
	}

	public List<String> printTransaction() {
		return dao.printTransaction();
		
	}







}
