package com.capgemini.paw.service;

import java.util.List;

import com.capgemini.paw.bean.PaymentAppDetails;
import com.capgemini.paw.dao.PaymentAppDAO;

public class PaymentAppService implements IPaymentAppService{

	PaymentAppDAO dao=new PaymentAppDAO();
	
	public int createAccount(PaymentAppDetails paymentAppDetails) {
		return dao.createAccount(paymentAppDetails);
		
	}

	public PaymentAppDetails showBalance(long accountNo) {
	return dao.showBalance(accountNo);
		
	}

	public double deposit() {
		return dao.deposit();
		// TODO Auto-generated method stub
		
	}

	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	public void fundTransfer() {
		// TODO Auto-generated method stub
		
	}

	public List<PaymentAppDetails> printPassbook() {
		// TODO Auto-generated method stub
		return null;
	}

}
