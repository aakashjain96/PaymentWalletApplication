package com.capgemini.paw.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PaymentAppDetailsTest {


	
	@Test
	public void testGetCustomerName() {
		Assert.assertEquals("aakash","aakash");
		Assert.assertNotEquals("aakash", "12345");
		Assert.assertNotEquals("aakash", "");

	}

	@Test
	public void testGetPhoneNo() {
		Assert.assertEquals("1234567890","1234567890");
		Assert.assertNotEquals("1234567890", "12345");
		Assert.assertNotEquals("1234567890", "");

	}

	@Test
	public void testGetAge() {
		Assert.assertEquals("12","12");
		Assert.assertNotEquals("12", "12345");
		Assert.assertNotEquals("12", "");
	}

	@Test
	public void testGetGender() {
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

	@Test
	public void testGetBalance() {
		Assert.assertEquals("1225","1225");
		Assert.assertNotEquals("1248", "12345");
		Assert.assertNotEquals("1278", "");
	}

	@Test
	public void testGetAddress() {
		Assert.assertEquals("delhi","delhi");
		Assert.assertNotEquals("delhi", "hyderabad");
		Assert.assertNotEquals("delhi", "");
	}

	@Test
	public void testGetAadharNo() {
		Assert.assertEquals("123456789012","123456789012");
		Assert.assertNotEquals("123456789012", "12345");
		Assert.assertNotEquals("123456789012", "");
	}

	

}
