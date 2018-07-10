package com.capgemini.paw.dao;

import java.util.List;

import com.capgemini.paw.bean.PaymentAppDetails;

public interface IPaymentAppDAO {

	public int createAccount(PaymentAppDetails paymentAppDetails);
	public PaymentAppDetails showBalance(long accountNo);
	public double deposit();
	public void withdraw();
	public void fundTransfer();
	public List<PaymentAppDetails> printPassbook();
	
}
