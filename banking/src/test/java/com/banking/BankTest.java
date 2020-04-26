package com.banking;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author HungTruong; Github: twodeflect
 */
class BankTest {

    private Bank bank;
    private final String NAME;
    private Customer customer;
    private String customerID;
    private Account account;
 	   
    // Test Fixture:
    @BeforeEach
    void setUp () {
    	bank = new Bank( "My Bank" );
    	customerID = bank.addCustomer("Piffl", "Hymie");
    	Customer customer = bank.getCustomer( customerID );
    	
    }
	void test_bankingClassMainMethod() 
	{
		//Test main method to print out 
		String [] arguments = new String [] {"Test text"};
		bank.main(arguments);
		
	}
	@Test
	void test_bankName_NormalInput ()
	{
		bank = new Bank ( "Hung's Bank" );
		
		int characterNumber = 2;
		
		// Can't have a null string value
		assertFalse( bank.getNAME() == null,"Result is a null string with no input " + bank.getNAME() );
		
		// Bank names should have at least 2 characters
		assertFalse( (bank.getNAME().length()) < characterNumber,"Result length have at least " + characterNumber + " but received "
				+ bank.getNAME().length() );
	}
	// Must set a penalty fee over 0
	void test_setInsufficientFundsPenalty_ZeroInput () 
	{
		bank.setInsufficientFundsPenalty (0);
		 
		 // Fee must be over 0
		 assertFalse ( bank.getInsufficientFundsPenalty() == 0, "Result is a 0 value, must not be 0, and above 0"); 
	}
	
	@Test
	void test_setInsufficientFundsPenalty_NegativeInput ()
	{
		bank.setInsufficientFundsPenalty (-5);
		// An exception must be thrown, otherwise test failed.	
		assertFalse ( bank.getInsufficientFundsPenalty() < 0, "Result is a negative value, must be above 0, ");
	}
	
	@Test
	void test_addCustomer_NormalInput ()
	{
		bank.addCustomer ( "Truong" , "Hung" );
		
		//null test condition
		assertFalse ( bank.getCustomer(customerID) == null, "Result is a null string with no input " );
		
	}
	
	@Test
	void test_addCustomer_IntegerInput ()
	{
		assertThrows(IllegalArgumentException.class, () -> {
		bank.addCustomer ("Truong", 5 );
		});
		// An exception must be thrown, otherwise test failed.
		// short and byte not tested because of similar outcome
	}
	
	@Test
	void test_removeCustomer_NormalInput () {
		// Tests if String or null value	
		bank.removeCustomer("30044");

		assertFalse ( customerID == null,  "Result is a null string with no input " );
	}
	@Test
	void test_removeCustomer_IntegerInput() 
	{
		assertThrows(IllegalArgumentException.class, () -> {
			bank.removeCustomer(5);
			// 	An exception must be thrown, otherwise test failed.
			// short and byte not tested because of similar outcome
		});
	}

	@Test
	void test_getCustomer_NormalInput () {
		
		bank.getCustomer("30045");
		
		//customerID null test condition
		assertFalse ( customerID == null, "Result is a null string with no input ");
	}

	@Test
	void test_getCustomer_IntegerInput () 
	{	
		assertThrows(IllegalArgumentException.class, () -> {
			bank.getCustomer(53434);
			// 	An exception must be thrown, otherwise test failed.
			// short and byte not tested because of similar outcome
		});
	}
	
	@Test
	void test_getCustomersAccounts_NormalInput ()
	{
		
		bank.getCustomersAccounts(customerID);
		
		
		//customerID null test condition
		assertFalse ( customerID == null, "Result is a null string with no input " );
		
	}
	
	@Test
	void test_getCustomerAccounts_IntegerInput () 
	{
		assertThrows(IllegalArgumentException.class, () -> {
			bank.getCustomerAccounts(454);
		});
		// An exception must be thrown, otherwise test failed.
		// short and byte not tested because of similar outcome
	}

}
