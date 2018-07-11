package com.capgemini.paw.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;


import com.capgemini.paw.bean.PaymentAppDetails;
import com.capgemini.paw.service.PaymentAppService;
import com.capgemini.paw.service.PaymentAppValidation;




public class PaymentAppClient {
	public static PaymentAppDetails paymentAppDetails = new PaymentAppDetails();

	public static void main(String[] args) {
		
		
		
		
		
		int choice1=-1;
		while(choice1!=3) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println(".....................................................");
		System.out.println("............PAYMENT WALLET APPLICATION...............");
		System.out.println(".....................................................");
		System.out.println("..                                                 ..");
		System.out.println("..              1.SignUp                           ..");
		System.out.println("..              2.Login                            ..");
		System.out.println("..              3.Exit                             ..");
		System.out.println("..                                                 ..");
		System.out.println(".....................................................");
		System.out.println(".....................................................");
		System.out.println("                                                     ");
		
		 choice1 = Integer.parseInt(br.readLine());
		switch (choice1) {
		case 1:
			createAccount();
		break;
			
		case 2:
			boolean b= loginAccount();
if(b) {
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
				System.out.println("..              5.Print Transaction                ..");
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
				withdraw();
				break;			
			case 4:
				
				break;			
			case 5:
				printTransaction();
				break;			
			case 6:
				System.out.println("Thank you");
				System.exit(0);
				break;	
					
						
			default:
				break;
			}
			
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
		
		}
	
	
	
	
	

	
	static boolean b=false;
	public static boolean loginAccount()
	{
		 PaymentAppService service = new PaymentAppService();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Your Username");
		String username;
		try {
			username = br.readLine();
		
		System.out.println("Enter Your Password");
		String password = br.readLine();
		
		
		 b= service.loginAccount(username, password);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(b)
		{
			return true;
		}
		else
		{
			System.err.println("enter valid username and password");
		return false;
		}
	
		
	}
	
	
	public static void createAccount()
	{
		try {

			 PaymentAppService service = new PaymentAppService();
	
			 PaymentAppValidation validate = new PaymentAppValidation();
		
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
			System.out.println("Enter your username: ");
			String username = br.readLine();
			System.out.println("Enter your password: ");
			String password = br.readLine();
			LocalDate date = LocalDate.now();
			

			
			
			
			boolean isValidPhoneNo = validate.validatePhoneNo(phoneNo);
			boolean isValidAadharNo = validate.validateAadharNo(aadharNo);
			boolean isValidGender = validate.validateGender(gender);
			

			if (isValidPhoneNo && isValidAadharNo && isValidGender) {
				
				paymentAppDetails.setAccountNumber(accountNumber);
				paymentAppDetails.setCustomerName(customerName);
				paymentAppDetails.setPhoneNo(phoneNo);
				paymentAppDetails.setAge(age);
				paymentAppDetails.setGender(gender);
				paymentAppDetails.setAddress(address);
				paymentAppDetails.setAadharNo(aadharNo);
				paymentAppDetails.setBalance(balance);
				paymentAppDetails.setUsername(username);
				paymentAppDetails.setPassword(password);
				paymentAppDetails.setDate(date);
				
				int worked = service.createAccount(paymentAppDetails);
				if (worked == 1) {
					System.out.println("Account created with Account no.  " + accountNumber);
					System.out.println("Your UserName is: "+username);
					System.out.println("Your Password is :"+password);
					
				}
				else {
					System.out.println("Account not created");
				}
			}
			else
			{
				System.out.println("Enter valid Details");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void showBalance()
	{
		 PaymentAppService service = new PaymentAppService();
		double bal= service.showBalance();
		System.out.println("Your wallet balance is: "+bal);
	
	}
	
	public static void deposit() {
		 PaymentAppService service = new PaymentAppService();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter amount to deposit");
		try {
			double amount=Double.parseDouble(br.readLine());
			boolean isDepositAmount = service.deposit(amount);
			if(isDepositAmount)
			{
				System.out.println("Amount is deposited in your wallet");
				System.out.println("Your current balance is "+paymentAppDetails.getBalance());
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void withdraw()
	{
		PaymentAppService service = new PaymentAppService();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the amount you want to withdraw");
		
		try {
			double amount=Double.parseDouble(br.readLine());
			boolean isWithdrawAmount = service.withdraw(amount);
			if(isWithdrawAmount)
			{
				System.out.println("Amount is debited from your wallet");
				System.out.println("Your current balance is "+paymentAppDetails.getBalance());
			}
			else
			{
				System.err.println("no balance");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void fundTransfer()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter the Account Number you want to transfer the amount");
		int accountNo;
		try {
			accountNo = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Amount to Transfer");
		double amount = Double.parseDouble(br.readLine());
		
		PaymentAppService service = new PaymentAppService();
		b= service.fundTransfer(accountNo,amount);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(b)
		{
			System.out.println("Fund is Successfully Transfered");
		}
		else
		{
			System.out.println("Enter valid details");
		}
		
	}
	
	
	public static void printTransaction()
	{
		PaymentAppService service = new PaymentAppService();
		PaymentAppDetails payApp=service.printTransaction();
		System.out.println("PaymentAppDetails [accountNumber=" + payApp.getAccountNumber() + ", customerName=" + payApp.getCustomerName() + ", balance="
				+ payApp.getBalance() + ", date=" + payApp.getDate() + "]");
	}
	
	
	}
	

