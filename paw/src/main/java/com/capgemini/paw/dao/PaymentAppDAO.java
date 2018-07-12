package com.capgemini.paw.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.paw.bean.AccountDetails;


public class PaymentAppDAO implements IPaymentAppDAO {

	public static AccountDetails accountDetails;
	public static Map<String,AccountDetails> map=new HashMap<String, AccountDetails>();
	public static Map<String,Double> transaction=new HashMap<String, Double>();
	
	int transactionId=(int) ((Math.random()*123)+999);	
	
public boolean loginAccount(String username, String password) {
		
		for(String key : map.keySet())
		{
			accountDetails=map.get(key);
			if( accountDetails.getCustomerDetails().getUsername().equals(username) && accountDetails.getCustomerDetails().getPassword().equals(password))
			{
				return true;
			}
		}
		return false;
		
	}

	
	public int createAccount(AccountDetails accountDetails) {
		
		map.put(accountDetails.getCustomerDetails().getUsername(), accountDetails);
		return 1;
	}



	public double showBalance() {
		return accountDetails.getBalance();
	}




	public boolean deposit(double amount) {
		accountDetails.setBalance(accountDetails.getBalance()+amount);
		String dep=transactionId +"  Amount of "+accountDetails.getBalance()+" is deposited: ";
		transaction.put(dep,amount);
		return true;
	}




	public boolean withdraw(double amount) {
		if(accountDetails.getBalance()>=amount)
		{
		accountDetails.setBalance(accountDetails.getBalance()-amount);
		String with=transactionId +"  Amount of "+accountDetails.getBalance()+" is withdrawn: ";
		transaction.put(with,amount);
		return true;
		}
		else
		{
			return false;
		}
	}




	public boolean fundTransfer(int accountNo, double amount) {
	
			
			for(String key : map.keySet())
			{
				AccountDetails recieverAccount = map.get(key);
				if(recieverAccount.getAccountNumber()==accountNo)
				{
					recieverAccount.setBalance(recieverAccount.getBalance()+amount);
					accountDetails.setBalance(recieverAccount.getBalance()-amount);
					String transfer=transactionId +"  Amount of "+ accountDetails.getBalance() +" is withdrawn from "+accountDetails.getAccountNumber() +"and deposited in"+recieverAccount.getAccountNumber();
					transaction.put(transfer,amount);
					return true;
				}
			}
			return false;
		}
	




	public AccountDetails printTransaction() {
		return null;
		
		
	}


}