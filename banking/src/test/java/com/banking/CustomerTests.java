package com.banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTests {

    private Bank bank;
    private Customer customer;
    private String custID;
    private Account account;
    private Account savings;
    private String accountId;
	   
    // Test Fixture:
    @BeforeEach
    void setUp () {
        bank = new Bank( "CHAWInc Saving and Loan" );
        custID = bank.addCustomer("Sanders", "Charles");
        Customer customer = bank.getCustomer(custID);
        Account savings = customer.addSavingsAccount( 0.00, "Test Account" );
        accountId = account.getAccountId();
    }

    //Test get bank name
    @Test
    @DisplayName("customer.getBank Test")
    void testGetBank() {

    	String bankExp = "CHAWInc Saving and Loan";
        assertEquals( bankExp, bank, "Expected Bank name is:" + bankExp + "But Program gives:" + bank );
        
        assertFalse ( bank == null, "Result is a null string with no input ");
	}

    //Test get customer ID
    @Test
    @DisplayName("customer.getCustomerId Test")
    void testGetCustomerId() {
        String custIDExp = "Charles Sanders";
    	assertEquals( custIDExp, custID, "Expected Customer ID is:" + custIDExp + "But Program Gives:" + custID); 
    	
    	assertFalse ( custID == null, "Result is a null string with no input ");
	}

    //Test get last name
    @Test
    @DisplayName("customer.getLastName Test")
    void testGetLastName() {
        String lastNameExp = "Sanders";
        String lastName = customer.getLastName();
    	assertEquals( lastNameExp, lastName, "Expected Last Name is:" + lastNameExp + "But Program Gives:" + lastName );
    	
    	assertFalse ( lastName == null, "Result is a null string with no input ");
	}

	//Test get first name
    @Test
    @DisplayName("customer.getFirstName Test")
    void testGetFirstName() {
        String firstNameExp = "Charles";
        String firstName = customer.getFirstName();
    	assertEquals( firstNameExp, firstName, "Customer First Name is: " + firstName + "Expected Last Name is: " + firstNameExp + "But Program Gives:" + firstName  );
    	
    	assertFalse ( firstName == null, "Result is a null string with no input ");
    	
    }	
    //Test Get accounts
    @Test
    @DisplayName("customer.getCustomerAccounts Test")
    void testGetCustomerAccounts() {
        String savingsExp = "Test Account";
		assertEquals( savingsExp, savings, "Expected Account:" + savingsExp + "But Program Gives:" + savings );
		
		assertFalse ( savings == null, "Result is a null string with no input "); //If you want to keep this code, i'll add this
		
	}

    //Test Get YTD Fees
    @Test
    @DisplayName("customer.ytdFees Test")
    void testYtdFees() {
        
    	System.out.println("YTD Fees: " + customer.ytdFees() );
	}

    //Test Get YTD Fees
    @Test
    @DisplayName("customer.ytdInterest Test")
    void testYtdInterest() {
    	
    	System.out.println("YTD Interest: " + customer.ytdInterest() );
    }

    //Test add savings account
    @Test
    @DisplayName("customer.addSavingsAccount")
    void testAddSavingsAccount() {
        
    	System.out.println("Added Savings Account: " + savings + " Should be called Test Account" );
	}

    //Test get account
    @Test
    @DisplayName("customer.getAccount")  
    void testGetAccount() {
        
    	Account account = customer.getAccount("Test Account");
    	String accountExp = "Test Account";
    	assertEquals(accountExp, account, "Expected account is" + accountExp + " Program retrieved: " + account );
    	
    	assertFalse ( accountId == null, "Result is a null string with no input ");
	}
    
    //Test remove account
    @Test
    @DisplayName("customer.removeAccount")
	public final void testRemoveAccount() {
        
        customer.removeAccount("Test Account");
        Account accountTest = customer.getAccount("Test Account");
        System.out.println( "customer account should be blank: " + accountTest );
        
        assertFalse ( accountId == null, "Result is a null string with no input ");
        
	}


}
