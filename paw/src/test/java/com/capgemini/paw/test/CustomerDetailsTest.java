package com.capgemini.paw.test;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.paw.bean.CustomerDetails;

public class CustomerDetailsTest {
	CustomerDetails cd=new CustomerDetails();

	@Test
	public void testGetUsername() {
		cd.setUsername("aakash");
		Assert.assertEquals("aakash",cd.getUsername());
		cd.setUsername("aak");
		Assert.assertNotEquals("aakash",cd.getUsername());
		
	}

	@Test
	public void testGetPassword() {
		cd.setPassword("123");
		Assert.assertEquals("123",cd.getPassword());
		cd.setPassword("afgb");
		Assert.assertNotEquals("123",cd.getPassword());
		
	}

	

	@Test
	public void testGetCustomerName() {
		
		
		cd.setCustomerName("aakash");
		Assert.assertEquals("aakash",cd.getCustomerName());
		cd.setCustomerName("aa");
		Assert.assertNotEquals("aakash",cd.getCustomerName());
		cd.setCustomerName("12345");
		Assert.assertNotEquals("aakash", cd.getCustomerName());
		cd.setCustomerName("");
		Assert.assertNotEquals("aakash", cd.getCustomerName());

	}

	@Test
	public void testGetPhoneNo() {
		cd.setPhoneNo("1234567890");
		Assert.assertEquals("1234567890","1234567890");
		cd.setPhoneNo("12345");
		Assert.assertNotEquals("1234567890", cd.getPhoneNo());
		cd.setPhoneNo("");
		Assert.assertNotEquals("1234567890",cd.getPhoneNo());

	}

	@Test
	public void testGetAge() {
		cd.setAge(12);
		Assert.assertEquals(12,cd.getAge());
		cd.setAge(12345);
		Assert.assertNotEquals(12, cd.getAge());
		cd.setAge(0);
		Assert.assertNotEquals(12, cd.getAge());
	}

	@Test
	public void testGetGender() {
		cd.setGender("male");
		Assert.assertEquals("male",cd.getGender());
		cd.setGender("female");
		Assert.assertEquals("female",cd.getGender());
		cd.setGender("others");
		Assert.assertEquals("others",cd.getGender());
		cd.setGender("12345");
		Assert.assertNotEquals("male", cd.getGender());
		cd.setGender("");
		Assert.assertNotEquals("male", cd.getGender());
		cd.setGender("12345");
		Assert.assertNotEquals("female", cd.getGender());
		cd.setGender("");
		Assert.assertNotEquals("female",cd.getGender());
		cd.setGender("12345");
		Assert.assertNotEquals("others", cd.getGender());
		cd.setGender("");
		Assert.assertNotEquals("others",cd.getGender());
	}


	@Test
	public void testGetAddress() {
		cd.setAddress("delhi");
		Assert.assertEquals("delhi",cd.getAddress());
		cd.setAddress("hyderabad");
		Assert.assertNotEquals("delhi", cd.getAddress());
		cd.setAddress("");
		Assert.assertNotEquals("delhi", cd.getAddress());
	}

	@Test
	public void testGetAadharNo() {
		cd.setAadharNo("123456789012");
		Assert.assertEquals("123456789012",cd.getAadharNo());
		cd.setPhoneNo("12345");
		Assert.assertNotEquals("1234567890", cd.getAadharNo());
		cd.setPhoneNo("");
		Assert.assertNotEquals("1234567890",cd.getAadharNo());
	
	}
}
