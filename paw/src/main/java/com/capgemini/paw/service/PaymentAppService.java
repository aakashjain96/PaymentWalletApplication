package com.capgemini.paw.service;

import com.capgemini.paw.bean.PaymentAppDetails;
import com.capgemini.paw.dao.PaymentAppDAO;

public class PaymentAppService implements IPaymentAppService{

	PaymentAppDAO dao=new PaymentAppDAO();
	
	public boolean loginAccount(String username, String password) {
		
		return dao.loginAccount(username, password);
	}
	
	public int createAccount(PaymentAppDetails paymentAppDetails) {
		return dao.createAccount(paymentAppDetails);
		
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

	public PaymentAppDetails printTransaction() {
		return dao.printTransaction();
		
	}

}
