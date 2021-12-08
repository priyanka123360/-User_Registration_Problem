package com.bridgelabz;

import java.util.Scanner;

public class User_Data {

	public static User_Data instance;
	public String firstName, lastName, email, password, phoneNumber;

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
		System.out.println(phoneNumber);
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User_Data [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", phoneNumber=" + phoneNumber + "]";
	}

}
