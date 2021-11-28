package com.bridgelabz;

public class User_Registration { 
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.getInstance();
		User_Data user_Data = User_Data.getInstance();
	
		pattern.isValidName();
		user_Data.firstName = user_Data.getFirstName();
	
		
		pattern.addLastName();
		user_Data.lastName = user_Data.getLastName();
		
		
		pattern.addEmail();
		user_Data.email = user_Data.getEmail();
		
		
		pattern.addPhoneNumber();
		user_Data.phoneNumber = user_Data.getPhoneNumber();
		
		
		pattern.addPassword();
		user_Data.password = user_Data.getPassword();
		
	}

}
