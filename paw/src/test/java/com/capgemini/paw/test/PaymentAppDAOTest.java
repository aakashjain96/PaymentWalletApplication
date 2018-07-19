package com.capgemini.paw.test;

import org.junit.Test;

import com.capgemini.paw.bean.AccountDetails;
import com.capgemini.paw.dao.PaymentAppDAO;

import junit.framework.Assert;

public class PaymentAppDAOTest extends Exception {

	PaymentAppDAO dao=new PaymentAppDAO();
	AccountDetails accountDetails=new AccountDetails();
	@Test
	public void testCreateAccount() {
		Assert.assertEquals(1,dao.createAccount(accountDetails));
				
	}

}
