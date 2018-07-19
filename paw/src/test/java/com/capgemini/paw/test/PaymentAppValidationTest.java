package com.capgemini.paw.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.paw.service.PaymentAppValidation;



public class PaymentAppValidationTest {

	PaymentAppValidation validate = new PaymentAppValidation();
	
	@Test
	public void testValidatePhoneNo() {
		Assert.assertEquals(true, validate.validatePhoneNo("9543839359"));
		Assert.assertEquals(false, validate.validatePhoneNo("sdgshgdf"));
	}

	@Test
	public void testValidateAadharNo() {
		Assert.assertEquals(true, validate.validateAadharNo("267617192989"));
		Assert.assertEquals(false, validate.validateAadharNo("12345"));
	}

	@Test
	public void testValidateGender() {
		Assert.assertEquals(true, validate.validateGender("Male"));
		Assert.assertEquals(true, validate.validateGender("Female"));
		Assert.assertEquals(true, validate.validateGender("others"));
		Assert.assertEquals(false, validate.validateGender("Hello"));
	}

	@Test
	public void testValidateUserName() {
		Assert.assertEquals(true, validate.validateUserName("aakash"));
		Assert.assertEquals(true, validate.validateUserName("aka"));
	}

	@Test
	public void testValidateUserPassword() {
		Assert.assertEquals(true , validate.validateUserPassword("12345678"));
		Assert.assertEquals(true, validate.validateUserPassword("12345"));
	}

}
