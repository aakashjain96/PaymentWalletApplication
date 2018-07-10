package com.capgemini.paw.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.paw.bean.PaymentAppDetails;

public class PaymentAppDAO implements IPaymentAppDAO {

	static Map<Long,PaymentAppDetails> map=new HashMap<Long, PaymentAppDetails>();
	
	public int createAccount(PaymentAppDetails paymentAppDetails) {
		
		map.put(paymentAppDetails.getAccountNumber(), paymentAppDetails);
		return 1;
	}


	public PaymentAppDetails showBalance(long accountNo) {
		
	
		
	for (long i : map.keySet()) {
			if(i==accountNo) {
				
			return map.get(accountNo);
			}
		}
		return null;
			
	
		
	}

	public double deposit() {
		return 0;

		
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
