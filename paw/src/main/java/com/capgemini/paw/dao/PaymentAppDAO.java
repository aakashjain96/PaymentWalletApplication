package com.capgemini.paw.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.paw.bean.PaymentAppDetails;

public class PaymentAppDAO implements IPaymentAppDAO {

	public static PaymentAppDetails paymentAppDetails;
	public static Map<String,PaymentAppDetails> map=new HashMap<String, PaymentAppDetails>();
	
	
public boolean loginAccount(String username, String password) {
		
		for(String key : map.keySet())
		{
			paymentAppDetails=map.get(key);
			if( paymentAppDetails.getUsername().equals(username) && paymentAppDetails.getPassword().equals(password))
			{
				return true;
			}
		}
		return false;
		
	}

	
	public int createAccount(PaymentAppDetails paymentAppDetails) {
		
		map.put(paymentAppDetails.getUsername(), paymentAppDetails);
		return 1;
	}



	public double showBalance() {
		return paymentAppDetails.getBalance();
	}




	public boolean deposit(double amount) {
		paymentAppDetails.setBalance(paymentAppDetails.getBalance()+amount);
		return true;
	}




	public boolean withdraw(double amount) {
		if(paymentAppDetails.getBalance()>=amount)
		{
		paymentAppDetails.setBalance(paymentAppDetails.getBalance()-amount);
		return true;
		}
		else
		{
			return false;
		}
	}




	public boolean fundTransfer(int accountNo, double amount) {
		paymentAppDetails.setBalance(paymentAppDetails.getBalance()-amount);
		map.keySet();
		
		return true;
	}




	public PaymentAppDetails printTransaction() {
		return paymentAppDetails;
		
	}


}