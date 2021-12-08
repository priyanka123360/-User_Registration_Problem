package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class User_Reg_Test {
	static Pattern pattern;
	static User_Data user_Data;

	@BeforeClass
	public static void init() {
		System.out.println("Init");
		pattern = new Pattern();
		user_Data = new User_Data();
	}

	@Test
	public void test_Added_FistName_Should_Be_Valid() {

		I_User_Reg isvalidateFirstName = (FirstName) -> {
			System.out.println("Enter Valid First Name");
		System.out.println(user_Data.getFirstName().matches(Pattern.NAME));
		assertEquals(true, user_Data.getFirstName().matches(Pattern.NAME));
		return false;
	};
	}

//	@Test
//	public void test_Added_FistName_Should_Be_InValid() throws InvalidUserDetailException {
//		pattern.isValidName();
//		System.out.println(user_Data.getFirstName().matches(Pattern.NAME));
//		assertEquals(false, user_Data.getFirstName().matches(Pattern.NAME));
//	}

	@Test
	public void test_Added_LastName_Should_Be_Valid()  throws InvalidUserDetailException{
		I_User_Reg isvalidateLastName = (LastName) -> {
		assertEquals(true, user_Data.getLastName().matches(Pattern.NAME));
		return false;
	};
	}

//	@Test
//	public void test_Added_LastName_Should_Be_InValid()  throws InvalidUserDetailException{
//		pattern.addLastName();
//		assertEquals(false, user_Data.getLastName().matches(Pattern.NAME));
//	}

//	@Test
//	public void test_Added_Email_Should_Be_Valid() {
//		pattern.addEmail(emailAddress);
//		assertEquals(true, user_Data.getEmail().matches(Pattern.EMAIL));
//	}
//
//	@Test
//	public void test_Added_Email_Should_Be_InValid() {
//		pattern.addEmail(emailAddress);
//		assertEquals(false, user_Data.getEmail().matches(Pattern.EMAIL));
//	}

	@Test
	public void test_Added_PhoneNumber_Should_Be_Valid()  throws InvalidUserDetailException {
		I_User_Reg isvalidatePhone = (phone) -> {
		System.out.println(user_Data.getPhoneNumber().matches(Pattern.PHONE_NUMBER));
		assertEquals(true, user_Data.getPhoneNumber().matches(Pattern.PHONE_NUMBER));
		return false;
	};
	}

//	@Test
//	public void test_Added_PhoneNumber_Should_Be_InValid()  throws InvalidUserDetailException {
//		pattern.addPhoneNumber();
//		System.out.println(user_Data.getPhoneNumber().matches(Pattern.PHONE_NUMBER));
//		assertEquals(false, user_Data.getPhoneNumber().matches(Pattern.PHONE_NUMBER));
//	}

	@Test
	public void test_Added_Password_Should_Be_Valid()  throws InvalidUserDetailException {
		I_User_Reg isvalidatePassword = (pass) -> {
		assertEquals(true, user_Data.getPassword().matches(Pattern.PASSWORD));
		return false;
	};
	}

//	@Test
//	public void test_Added_Password_Should_Be_InValid()  throws InvalidUserDetailException {
//		pattern.addPassword();
//		assertEquals(false, user_Data.getPassword().matches(Pattern.PASSWORD));
//	}
}