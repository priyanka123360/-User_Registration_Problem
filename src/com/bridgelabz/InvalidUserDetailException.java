package com.bridgelabz;

import com.bridgelabz.InvalidUserDetailException.Invalid;

public class InvalidUserDetailException extends Exception {
	Invalid invalid;
	enum Invalid{
		firstName, lastName, email, password, phoneNumber;
	}
	public InvalidUserDetailException (Invalid invalid, String message) {
		super(message);
		this.invalid = invalid;
		
	}
}
