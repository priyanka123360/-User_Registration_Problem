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
		pattern = Pattern.getInstance();
		user_Data = User_Data.getInstance();
	}

	@Test
	public void test_Added_FistName_Should_Be_Valid() {
		pattern.isValidName();
		System.out.println(user_Data.getFirstName().matches(Pattern.NAME));
		assertEquals(true, user_Data.getFirstName().matches(Pattern.NAME));
	}

	@Test
	public void test_Added_FistName_Should_Be_InValid() {
		pattern.isValidName();
		System.out.println(user_Data.getFirstName().matches(Pattern.NAME));
		assertEquals(false, user_Data.getFirstName().matches(Pattern.NAME));
	}

	@Test
	public void test_Added_LastName_Should_Be_Valid() {
		pattern.addLastName();
		assertEquals(true, user_Data.getLastName().matches(Pattern.NAME));
	}

	@Test
	public void test_Added_LastName_Should_Be_InValid() {
		pattern.addLastName();
		assertEquals(false, user_Data.getLastName().matches(Pattern.NAME));
	}

	@Test
	public void test_Added_Email_Should_Be_Valid() {
		pattern.addEmail();
		assertEquals(true, user_Data.getEmail().matches(Pattern.EMAIL));
	}

	@Test
	public void test_Added_Email_Should_Be_InValid() {
		pattern.addEmail();
		assertEquals(false, user_Data.getEmail().matches(Pattern.EMAIL));
	}

	@Test
	public void test_Added_PhoneNumber_Should_Be_Valid() {
		pattern.addPhoneNumber();
		System.out.println(user_Data.getPhoneNumber().matches(Pattern.PHONE_NUMBER));
		assertEquals(true, user_Data.getPhoneNumber().matches(Pattern.PHONE_NUMBER));
	}

	@Test
	public void test_Added_PhoneNumber_Should_Be_InValid() {
		pattern.addPhoneNumber();
		System.out.println(user_Data.getPhoneNumber().matches(Pattern.PHONE_NUMBER));
		assertEquals(false, user_Data.getPhoneNumber().matches(Pattern.PHONE_NUMBER));
	}

	@Test
	public void test_Added_Password_Should_Be_Valid() {
		pattern.addPassword();
		assertEquals(true, user_Data.getPassword().matches(Pattern.PASSWORD));
	}

	@Test
	public void test_Added_Password_Should_Be_InValid() {
		pattern.addPassword();
		assertEquals(false, user_Data.getPassword().matches(Pattern.PASSWORD));
	}
}