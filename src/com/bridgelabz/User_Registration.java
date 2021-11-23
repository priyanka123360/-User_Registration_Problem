package com.bridgelabz;

public class User_Registration { 
	public static void main(String[] args) {
		String firstName, lastName, email, password, phoneNumber;
		Pattern pattern = new Pattern();
		pattern.isValidName();
		firstName = pattern.getFirstName();
		System.out.println("First Name : "+firstName);
	}

}
