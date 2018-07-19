package com.capgemini.paw.service;

import com.capgemini.paw.exception.InvalidAadharNo;
import com.capgemini.paw.exception.InvalidGender;
import com.capgemini.paw.exception.InvalidphoneNo;

public class PaymentAppValidation {

	public boolean validatePhoneNo(String phoneNo) {
		if (phoneNo.length() == 10) {
			return true;
		} else {
			try {
				throw new InvalidphoneNo();
			} catch (InvalidphoneNo e) {
				System.err.println("Enter Valid Phone No.");
			}
			
			return false;
		}
	}

	public boolean validateAadharNo(String aadharNo) {
		if (aadharNo.length() == 12) {
			return true;
		} else {
			try {
				throw new InvalidAadharNo();
			} catch (InvalidAadharNo e) {
				System.err.println("Enter Valid Aadhar No.");
			}
			
			return false;
		}

	}

	public boolean validateGender(String gender) {
		if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("others")) {
			return true;
		} else {
			try {
				throw new InvalidGender();
			} catch (InvalidGender e) {
				System.err.println("Enter Valid Gender");
			}
			
			return false;
		}
	}
	public boolean validateUserName(String username)
	{
		return true;
		
	}
	
	public boolean validateUserPassword(String password)
	{
		return true;
		
	}

}
