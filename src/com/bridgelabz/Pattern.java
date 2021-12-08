package com.bridgelabz;

import java.util.Scanner;

import com.bridgelabz.InvalidUserDetailException.Exception;

public class Pattern {

	public final static String NAME = "^([A-Z]{1}+[a-z]{2,})*$";
	public final static String EMAIL = "^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]*.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$";
	public final static String PHONE_NUMBER = "^([0-9]{1,2})\\s([0-9]{10})$";
	public final static String PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@]).{8,}$";
//	public final static String PHONE_NUMBER = "^[6-9]{1}[0-9]{9,}$";
	private String firstName, lastName, email, phoneNumber, password;

	Scanner sc = new Scanner(System.in);
	User_Data user_Data = new User_Data();
	
	I_User_Reg isvalidateFirstName = (FirstName) -> {
		System.out.print("Enter First Name : ");
		String firstName = sc.nextLine();
		user_Data.setFirstName(firstName);
		if (FirstName.matches(NAME))
			return true;
		throw new InvalidUserDetailException("First Name Invalid ", Exception.FirstName);
	};

	I_User_Reg isvalidateLastName = (LastName) -> {
		System.out.println("Enter Last Name :  ");
		String lastName = sc.nextLine();
		user_Data.setLastName(lastName);
		if (LastName.matches(NAME))
			return true;
		throw new InvalidUserDetailException("Last Name Invalid ", Exception.LastName);
	};

	I_User_Reg isvalidateEmail = (Email) -> {
		System.out.print("Enter Email : ");
		String email = sc.nextLine();
		user_Data.setEmail(email);
		if (Email.matches(EMAIL))
			return true;
		throw new InvalidUserDetailException("Email Invalid ", Exception.Email);
	};

	I_User_Reg isvalidatePhone = (phone) -> {
		System.out.println("Enter PhoneNumber:  ");
		String phoneNumber = sc.nextLine();
		user_Data.setPhoneNumber(phoneNumber);
		if (phone.matches(PHONE_NUMBER))
			return true;
		throw new InvalidUserDetailException(" Phone Number Invalid ", Exception.PhoneNumber);
	};

	I_User_Reg isvalidatePassword = (pass) -> {
		System.out.println("Enter Password:  ");
		String password = sc.nextLine();
		user_Data.setPassword(password);
		if (pass.matches(PASSWORD))
			return true;
		throw new InvalidUserDetailException("Password Invalid ", Exception.Password);
	};

	public boolean addEmail(String email2) {
		email = email2;
		boolean check = email.matches(EMAIL);
		return check;
	}

	}
	