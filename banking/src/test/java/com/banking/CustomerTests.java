package com.banking;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTests {

    private Bank bank;
    private Customer customer;
    private String custID;
    private Account account;
	   
    // Test Fixture:
    @BeforeEach
    void setUp () {
        bank = new Bank( "CHAWInc Saving and Loan" );
        custID = bank.addCustomer("Sanders", "Charles");
        Customer customer = bank.getCustomer( custID );
        Account savings = customer.addSavingsAccount( 0.00, "Test Account" );
    }

    //Test get bank name
    @Test
    @DisplayName("customer.getBank Test")
    void testGetBank() {
        assertEquals( "Bank name is:", customer.getBank() );
	}

    //Test get customer ID
    @Test
    @DisplayName("customer.getCustomerId Test")
    void testGetCustomerId() {
        assertEquals( "Customer ID is:", customer.getCustomerId() ); 
	}

    //Test get last name
    @Test
    @DisplayName("customer.getLastName Test")
    void testGetLastName() {
        assertEquals( "Customer Last Name is:", customer.getLastName() );
	}

	//Test get first name
    @Test
    @DisplayName("customer.getFirstName Test")
    void testGetFirstName() {
        assertEquals( "Customer First Name is:", customer.getFirstName() );

    //Test Get accounts
    @Test
    @DisplayName("customer.getCustomerAccounts Test")
    void testGetCustomerAccounts() {
        assertEquals( "Customer Accounts:", customer.getCustomerAccounts() );
	}

    //Test Get YTD Fees
    @Test
    @DisplayName("customer.ytdFees Test")
    void testYtdFees() {
        assertEquals( "Customer YTD fees:", customer.ytdFees() ); 
	}

    //Test Get YTD Fees
    @Test
    @DisplayName("customer.ytdInterest Test")
    void testYtdInterest() {
        assertEquals( "Customer YTD fees:", customer.ytdFees() );
    }

    //Test add savings account
    @Test
    @DisplayName("customer.addSavingsAccount")
    void testAddSavingsAccount() {
        assertEquals( "Add Savings Account:", customer.addSavingsAccount(0, "savings2") ); 
	}

    //Test remove account
    @Test
    @DisplayName("customer.removeAccount")
	public final void testRemoveAccount() {
        assertEquals( "Remove Account:", customer.removeAccount("savings2") ); 
	}

    //Test get account
    @Test
    @DisplayName("customer.getAccount")  
    void testGetAccount() {
        assertEquals( "Account:", customer.getAccount("Test Account") ); 
	}

}
