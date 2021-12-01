package com.bridgelabz;

import java.util.Scanner;

import com.bridgelabz.InvalidUserDetailException.Invalid;

public class Pattern {
	private static Pattern instance;

	public static String NAME = "^([A-Z]{1}+[a-z]{2,})*$";
	public final static String EMAIL = "^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]*.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$";
	public final static String PHONE_NUMBER = "^([0-9]{1,2})\\s([0-9]{10})$)";
	public final static String PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@]).{8,}$";
//	public final static String PHONE_NUMBER = "^[6-9]{1}[0-9]{9,}$";

	User_Data user_Data = User_Data.getInstance();
	Scanner sc = new Scanner(System.in);

	Pattern() {

	}

	public static Pattern getInstance() {
		if (instance == null) {
			instance = new Pattern();
		}
		return instance;
	}

	public void isValidName() throws InvalidUserDetailException {
		try {
			User_Data user_Data = User_Data.getInstance();
			System.out.print("Enter First Name : ");
			String firstName = sc.nextLine();
			if (firstName == null) {
				throw new InvalidUserDetailException(Invalid.firstName, null);
			}
			user_Data.setFirstName(firstName);
		} catch (InvalidUserDetailException e) {
		}

//		boolean check = firstName.matches(NAME);
//		if (check == true) {
//	//		user_Data.setFirstName(firstName);
//			System.out.println("Valid");
//		} else {
//			System.out.println("Invalid");
//		}

	}

	public void addLastName() throws InvalidUserDetailException {
		try {
			System.out.print("Enter Last Name : ");
			String lastName = sc.nextLine();

			if (lastName == null) {
				throw new InvalidUserDetailException(Invalid.lastName, null);
			}
			user_Data.setLastName(lastName);
		} catch (InvalidUserDetailException e) {
		}

//		boolean check = lastName.matches(NAME);
//		if (check == true) {
//	//		user_Data.setLastName(lastName);
//			System.out.println("Valid");
//		} else {
//			System.out.println("Invalid ");

	}

	public void addEmail(String emailAddress) throws InvalidUserDetailException {
		try {
			System.out.print("Enter Email : ");
			String email = emailAddress;
			if (email == null) {
				throw new InvalidUserDetailException(Invalid.email, null);
			}
			user_Data.setEmail(email);
		} catch (InvalidUserDetailException e) {
		}
	}
//		boolean check = user_Data.getEmail().matches(EMAIL);
//		if (check == true) {
//		//	user_Data.setEmail(EMAIL);
//			System.out.println("Valid");
//		} else {
//			System.out.println("Invalid");
//
//		}
//		return check;
//	}

	public void addPhoneNumber() throws InvalidUserDetailException {
		try {
			System.out.print("Enter Phone Number : ");
			String phoneNumber = sc.nextLine();
			if (phoneNumber == null) {
				throw new InvalidUserDetailException(Invalid.phoneNumber, null);
			}
			user_Data.setPhoneNumber(phoneNumber);
		} catch (InvalidUserDetailException e) {
		}
	}
//		boolean check = user_Data.getPhoneNumber().matches(PHONE_NUMBER);
//		if (check == true) {
//	//		user_Data.setPhoneNumber(PHONE_NUMBER);
//			System.out.println("Valid");
//		} else {
//			System.out.println("Invalid  ");
//
//		}

	public void addPassword() throws InvalidUserDetailException {
		try {
			System.out.print("Enter Password : ");
			String password = sc.nextLine();
			if (password == null) {
				throw new InvalidUserDetailException(Invalid.password, null);
			}
			user_Data.setPassword(password);
		} catch (InvalidUserDetailException e) {
		}
	}
//		boolean check = user_Data.getPassword().matches(PASSWORD);
//		if (check == true) {
//	//		user_Data.setPassword(PASSWORD);
//			System.out.println("Valid");
//		} else {
//			System.out.println("Invalid.");

}
