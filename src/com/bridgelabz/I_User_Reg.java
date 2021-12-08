package com.bridgelabz;

@FunctionalInterface
public interface I_User_Reg {

	boolean compare(String inputs) throws InvalidUserDetailException;

}
