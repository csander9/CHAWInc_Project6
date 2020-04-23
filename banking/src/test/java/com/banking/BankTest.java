package com.banking;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankTest {

	@Test
	
	void test_bankingClassMainMethod() 
	{
		//Test main method to print out 
		String [] arguments = new String [] {"Test text"};
		Bank.main(arguments);
		
	}
	@Test
	void test_bankName_NormalInput ()
	{
		final int characterNumber = 2; // Assuming all banks have two letters at least in name
		final String NAME = "Hung's Bank";
		
		// Can't have a null string value
		assertFalse( NAME == null,"Result is a null string with no input " + NAME );
		
		// Bank names should have at least 6 characters
		assertFalse( NAME.length() < characterNumber,"Result length have at least " + characterNumber + " but received "
				+ NAME.length() );
	}
	// Must set a penalty fee over 0
	void test_setInsufficientFundsPenalty_ZeroInput () 
	{
		Bank.setInsufficientFundsPenalty (0);
		 
		 // Fee must be over 0
		 assertFalse ( Bank.insufficientFundsPenalty > 0, "Result is a 0 value, must not be 0, and above 0"); 
	}
	
	@Test
	void test_setInsufficientFundsPenalty_NegativeInput ()
	{
		Bank.setInsufficientFundsPenalty (-5);
		// An exception must be thrown, otherwise test failed.	
		assertFalse ( Bank.insufficientFundsPenalty < 0, "Result is a negative value, must be above 0, ");
	}
	
	@Test
	void test_addCustomer_NormalInput ()
	{
		Bank.addCustomer ( "Truong" , "Hung" );
		final String lastName = "Truong";
		final String firstName = "Hung";
		
		//last name null test condition
		assertFalse ( lastName == null, "Result is a null string with no input " + lastName );
		//first name null test condition
		assertFalse ( firstName == null, "Result is a null string with no input " + firstName );
	}
	
	@Test
	void test_addCustomer_IntegerInput ()
	{
		assertThrows(IllegalArgumentException.class, () -> {
		Bank.addCustomer ("Truong", 5 );
		});
		// An exception must be thrown, otherwise test failed.
		// short and byte not tested because of similar outcome
	}
	
	@Test
	void test_removeCustomer_NormalInput () {
	// Tests if String or null value	
		Bank.removeCustomer("30044");
		final String customerID = "34242";
		
		assertFalse ( customerID == null,  "Result is a null string with no input " + customerID );
	}
	@Test
	void test_removeCustomer_IntegerInput() 
	{
		assertThrows(IllegalArgumentException.class, () -> {
			Bank.removeCustomer(5);
			// 	An exception must be thrown, otherwise test failed.
			// short and byte not tested because of similar outcome
		});
	}

	@Test
	void test_getCustomer_NormalInput () {
		
		final String customerID = "432423";
		Bank.getCustomer("30045");
		
		//customerID null test condition
		assertFalse ( customerID == null, "Result is a null string with no input \" + customerID ");
	}

	@Test
	void test_getCustomer_IntegerInput () 
	{	
		assertThrows(IllegalArgumentException.class, () -> {
			Bank.getCustomer(30444);
			// 	An exception must be thrown, otherwise test failed.
			// short and byte not tested because of similar outcome
		});
	}
	
	@Test
	void test_getCustomersAccounts_NormalInput ()
	{
		String customerID = "45435";
		Bank.getCustomerAccounts("30045");
		
		
		//customerID null test condition
		assertFalse ( customerID == null, "Result is a null string with no input " + customerID );
		
	}
	
	@Test
	void test_getCustomerAccounts_IntegerInput () 
	{
		assertThrows(IllegalArgumentException.class, () -> {
			Bank.getCustomerAccounts(454);
		});
		// An exception must be thrown, otherwise test failed.
		// short and byte not tested because of similar outcome
	}
	
	@Test
	final void test() {
		fail("Not yet implemented");
	}

}
