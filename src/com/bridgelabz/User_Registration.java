package com.bridgelabz;

public class User_Registration { 
	public static void main(String[] args) {
		String firstName, lastName, email, password, phoneNumber;
		Pattern pattern = new Pattern();
		pattern.isValidName();
		firstName = pattern.getFirstName();
		System.out.println("First Name : "+firstName);
		
		pattern.addLastName();
		lastName = pattern.getLastName();
		System.out.println("Last Name : " + lastName);
		
		pattern.addEmail();
		email = pattern.getEmail();
		System.out.println("Email : " + email);
	}

}
