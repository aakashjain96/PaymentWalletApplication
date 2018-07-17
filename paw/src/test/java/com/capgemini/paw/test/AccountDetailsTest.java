package com.capgemini.paw.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.paw.bean.AccountDetails;

public class AccountDetailsTest {

	static AccountDetails account=new AccountDetails();
	
	@Test
	public void testGetAccountNumber() {
		account.setAccountNumber(123456);
		assertEquals("123456",account.getAccountNumber());
	}


	@Test
	public void testGetBalance() {
		account.setBalance(1500.0);
		System.out.println(account.getBalance());
		Assert.assertEquals(1500.0, account.getBalance());
	}

	@Test
	public void testGetDate() {
		LocalDate date=LocalDate.now();
		account.setDate(date);
		Assert.assertEquals(date,account.getDate());
	}

	
	

	}
