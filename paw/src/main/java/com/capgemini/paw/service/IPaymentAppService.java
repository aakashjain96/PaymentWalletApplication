package com.capgemini.paw.service;



import java.util.List;

import com.capgemini.paw.bean.PaymentAppDetails;

public interface IPaymentAppService {

	public int createAccount(PaymentAppDetails paymentAppDetails);
	public PaymentAppDetails showBalance(long accountNo);
	public double deposit();
	public void withdraw();
	public void fundTransfer();
	public List<PaymentAppDetails> printPassbook();

	
}
