package com.capgemini.paw.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.capgemini.paw.bean.AccountDetails;


public class PaymentAppDAO implements IPaymentAppDAO {

	public static AccountDetails accountDetails;
	public static Map<String,AccountDetails> map=new HashMap<String, AccountDetails>();

	
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

		String dep=transactionId +"  Amount of "+amount+" is deposited:      "+accountDetails.getBalance();
		accountDetails.getTransaction().add(dep);
		return true;
	}




	public boolean withdraw(double amount) {
		if(accountDetails.getBalance()>=amount)
		{
		accountDetails.setBalance(accountDetails.getBalance()-amount);
		String with=transactionId +"  Amount of "+amount+" is withdrawn:      "+accountDetails.getBalance();
		accountDetails.getTransaction().add(with);
		return true;
		}
		else
		{
			return false;
		}
	}




	public boolean fundTransfer(int accountNo, double amount) {
	
		if(accountDetails.getBalance()>=amount && accountNo!=accountDetails.getAccountNumber()) {
			for(String key : map.keySet())
			{
				AccountDetails recieverAccount = map.get(key);
				if(recieverAccount.getAccountNumber()==accountNo)
				{
					recieverAccount.setBalance(recieverAccount.getBalance()+amount);
					accountDetails.setBalance(accountDetails.getBalance()-amount);
					String transfer=transactionId +"  Amount of "+amount+" is transferred:      "+accountDetails.getBalance();
					accountDetails.getTransaction().add(transfer);
					return true;
				}
			}
			return false;
		}
		else {
			return false;
		}	
	}
	




	public List<String> printTransaction() {
		return accountDetails.getTransaction();

		}
	}


