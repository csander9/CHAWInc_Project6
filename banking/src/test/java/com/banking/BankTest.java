package com.banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTest {

	@Test
	
	void test_bankingClassMainMethod() 
	{
		//Test main method to print out 
		System.out.println( "This is a customer ID number " + getCustomer("30045") + "." );
		
	}
	@Test
	void test_bankName_NormalInput ()
	{
		final int characterNumber = 2; // Assuming all banks have two letters at least in name
		final String NAME = "Hung's Bank";
		
		// Can't have a null string value
		assertFalse( "Result is a null string with no input " + NAME, NAME == null );
		
		// Bank names should have at least 6 characters
		assertFalse( "Result length have at least " + characterNumber + " but received "
				+ NAME.length(), NAME.length() < characterNumber );
	}
	// Must set a penalty fee over 0
	void test_setInsufficientFundsPenalty_ZeroInput () 
	{
		setInsufficientFundsPenalty (0);
		 
		 // Fee must be over 0
		 assertFalse ( "Result is a 0 value, must not be 0, and above 0",
				 insufficientFundsPenalty > 0 ); 
	}
	
	@Test(expected = IllegalArgumentException.class)
	void test_setInsufficientFundsPenalty_NegativeInput ()
	{
		setInsufficientFundsPenalty (-5);
		// An exception must be thrown, otherwise test failed.	
	}
	
	@Test
	void test_addCustomer_NormalInput ()
	{
		addCustomer ( "Truong" , "Hung" );
		
		//last name null test condition
		assertFalse ( "Result is a null string with no input \" + lastName, lastName == null ");
		//first name null test condition
		assertFalse ( "Result is a null string with no input \" + firstName, firstName == null ");
	}
	
	@Test(expected = IllegalArgumentException.class)
	void test_addCustomer_IntegerInput ()
	{
		addCustomer ("Truong", 5 );
		// An exception must be thrown, otherwise test failed.
		// short and byte not tested because of similar outcome
	}
	
	@Test
	void test_removeCustomer_NormalInput () {
	// Tests if String or null value	
		removeCustomer("30044");
		
		assertFalse (  "Result is a null string with no input " + customerID, customerID == null );
	}
	@Test(expected = IllegalArgumentException.class)
	void test_removeCustomer_IntegerInput() 
	{
		removeCustomer(5);
		// An exception must be thrown, otherwise test failed.
		// short and byte not tested because of similar outcome
	}

	@Test
	void test_getCustomer_NormalInput () {
		getCustomer("30045");
		
		//customerID null test condition
		assertFalse ( "Result is a null string with no input \" + customerID, customerID == null ");
	}

	@Test(expected = IllegalArgumentException.class)
	void test_getCustomer_IntegerInput () 
	{
		getCustomer(30444);
		// An exception must be thrown, otherwise test failed.
		// short and byte not tested because of similar outcome
		
	}
	
	@Test
	void test_getCustomersAccounts_NormalInput ()
	{
		getCustomerAccounts("30045");
		
		//customerID null test condition
		assertFalse ( "Result is a null string with no input \" + customerID, customerID == null ");
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	void test_getCustomerAccounts_IntegerInput () 
	{
		getCustomerAccounts(454);
		// An exception must be thrown, otherwise test failed.
		// short and byte not tested because of similar outcome
	}
	
	@Test
	final void test() {
		fail("Not yet implemented");
	}

}
