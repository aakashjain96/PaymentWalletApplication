package com.capgemini.paw.service;



import com.capgemini.paw.bean.PaymentAppDetails;

public interface IPaymentAppService {

	public int CreateAccount(PaymentAppDetails paymentappdetails);
	public PaymentAppDetails ShowBalance(int accountNo);
	public void Deposit();
	public void Withdraw();
	public void FundTransfer();
	//public Map<accountNo,PaymentAppDetails> PrintPassbook();

	
}
