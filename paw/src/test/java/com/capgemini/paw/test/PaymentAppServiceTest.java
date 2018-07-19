package com.capgemini.paw.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.paw.bean.AccountDetails;
import com.capgemini.paw.dao.PaymentAppDAO;
import com.capgemini.paw.service.PaymentAppService;

public class PaymentAppServiceTest {

	AccountDetails account=new AccountDetails();
	PaymentAppService service=new PaymentAppService();
	

	@Test
	public void testCreateAccount() {
	
		Assert.assertEquals("1", service.createAccount(account));
	}

	

}
