package com.capgemini.paw.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PaymentAppValidationTest {

	@Test
	public void testValidatePhoneNo() {
		Assert.assertEquals("1234567890","1234567890");
		Assert.assertNotEquals("1234567890", "12345");
		Assert.assertNotEquals("1234567890", "");
	}

	@Test
	public void testValidateAadharNo() {
		Assert.assertEquals("123456789012","123456789012");
		Assert.assertNotEquals("123456789012", "12345");
		Assert.assertNotEquals("123456789012", "");
	}

	@Test
	public void testValidateGender() {
		Assert.assertEquals("male","male");
		Assert.assertEquals("female","female");
		Assert.assertEquals("others","others");
		Assert.assertNotEquals("male", "12345");
		Assert.assertNotEquals("male", "");
		Assert.assertNotEquals("female", "12345");
		Assert.assertNotEquals("female", "");
		Assert.assertNotEquals("others", "12345");
		Assert.assertNotEquals("others", "");
	}

}
