package com.capgemini.paw.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

import com.capgemini.paw.bean.PaymentAppDetails;
import com.capgemini.paw.service.PaymentAppService;
import com.capgemini.paw.service.PaymentAppValidation;

public class PaymentAppClient {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println(".....................................................");
		System.out.println("............PAYMENT WALLET APPLICATION...............");
		System.out.println(".....................................................");
		System.out.println("..                                                 ..");
		System.out.println("..              1.SignUp                           ..");
		System.out.println("..              1.Login                            ..");
		System.out.println("..              3.Exit                             ..");
		System.out.println("..                                                 ..");
		System.out.println(".....................................................");
		System.out.println(".....................................................");
		System.out.println("                                                     ");
		
		int choice1 = Integer.parseInt(br.readLine());
		switch (choice1) {
		case 1:
			createAccount();
			//continue;
		case 2:
			
			int choice = -1;
			while (choice != 6) {

				System.out.println("                                                     ");
				System.out.println(".....................................................");
				System.out.println("............PAYMENT WALLET APPLICATION...............");
				System.out.println(".....................................................");
				System.out.println("..                                                 ..");
				System.out.println("..              1.Show Balance                     ..");
				System.out.println("..              2.Deposit                          ..");
				System.out.println("..              3.Withdraw                         ..");
				System.out.println("..              4.Fund Transfer                    ..");
				System.out.println("..              5.Passbook                         ..");
				System.out.println("..              6.Exit                             ..");
				System.out.println("..                                                 ..");
				System.out.println(".....................................................");
				System.out.println(".....................................................");
				System.out.println("                                                     ");
				
				
				
				
					choice = Integer.parseInt(br.readLine());
			
			

			switch (choice) {
			case 1:
				showBalance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				
				break;			
			case 4:
				
				break;			
			case 5:
				
				break;			
			case 6:
				
				break;	
			case 7:
				
				break;			
						
			default:
				break;
			}
			
		}
		
		case 3:
			break;
		
			}} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		}
	
	
	
	
	static PaymentAppService service = new PaymentAppService();
	static PaymentAppDetails paymentAppDetails = new PaymentAppDetails();
	
	public static void createAccount()
	{
		try {

		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			long accountNumber = (long) ((Math.random() * 1234) + 111111111);
			System.out.println("Enter your Name: ");
			String customerName = br.readLine();
			System.out.println("Enter your 10 digit PhoneNo: ");
			String phoneNo = br.readLine();
			System.out.println("Enter your Age: ");
			int age = Integer.parseInt(br.readLine());
			System.out.println("Enter your Gender: ");
			String gender = br.readLine();
			System.out.println("Enter your Address");
			String address = br.readLine();
			System.out.println("Enter your 12 digit AadharNo: ");
			String aadharNo = br.readLine();
			System.out.println("Enter your opening balance: ");
			double balance =Double.parseDouble( br.readLine());

			paymentAppDetails.setAccountNumber(accountNumber);
			paymentAppDetails.setCustomerName(customerName);
			paymentAppDetails.setPhoneNo(phoneNo);
			paymentAppDetails.setAge(age);
			paymentAppDetails.setGender(gender);
			paymentAppDetails.setAddress(address);
			paymentAppDetails.setAadharNo(aadharNo);
			paymentAppDetails.setBalance(balance);
			
			PaymentAppValidation validate = new PaymentAppValidation();

			boolean isValidPhoneNo = validate.validatePhoneNo(phoneNo);
			boolean isValidAadharNo = validate.validateAadharNo(aadharNo);
			boolean isValidGender = validate.validateGender(gender);
			

			if (isValidPhoneNo && isValidAadharNo && isValidGender) {
				int worked = service.createAccount(paymentAppDetails);
				if (worked == 1) {
					System.out.println("Account created with Account no.  " + paymentAppDetails.getAccountNumber());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void showBalance()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your AccountNumber: ");
		try {
			int accountNo=Integer.parseInt(br.readLine());
		
			PaymentAppDetails payApp=service.showBalance(accountNo);
			System.out.println(payApp.getBalance());
			
		} catch (NumberFormatException e) {
			System.err.println("Enter valid Account Number");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void deposit() {
		try {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the amount you want to deposit: ");
					
			double deposit=Double.parseDouble(br.readLine());
			double balance=service.deposit();
		System.out.println(balance);
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	}
	

