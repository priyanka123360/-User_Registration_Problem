package com.bridgelabz;

import java.util.Scanner;

public class Pattern {
	private String firstName, lastName, email, password, phoneNumber;

	Scanner sc = new Scanner(System.in);

	public void isValidName() {

		System.out.print("Enter First Name : ");
		firstName = sc.nextLine();
		boolean check = firstName.matches("^([A-Z]{1}+[a-z]{2,})*$");
		if (check == true) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid Add again");
			isValidName();
		}
	}
		public void addLastName() {

			System.out.print("Enter Last Name : ");
			lastName = sc.nextLine();
			boolean check = lastName.matches("^([A-Z]{1}+[a-z]{2,})*$");
			if (check == true) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid Add again");
				addLastName();
			}
	}
		
		public void addEmail() {
			System.out.print("Enter Email : ");
			email = sc.nextLine();
			boolean check = email.matches("^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]*.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$");
			if (check == true) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid Email Add again");
				addEmail();
			}
		}
		
		public void addPhoneNumber() {
			System.out.print("Enter Phone Number : ");
			phoneNumber = sc.nextLine();
			boolean check = phoneNumber.matches("^([0-9]{1,2})\\s([0-9]{10})$");
			if (check == true) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid Phone Number ");	
				addPhoneNumber();
			}
		}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
}


