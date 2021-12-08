package com.bridgelabz;

public class InvalidUserDetailException extends Exception {
	enum Exception {
		FirstName, LastName, Email, Password, PhoneNumber
	};

	Exception exception;

	InvalidUserDetailException(String message, Exception exception) {

		super(message);
		this.exception = exception;
	}

}
