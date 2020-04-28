package com.banking;
import static org.junit.jupiter.api.Assertions.*;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest{
    private Bank bank;
    private Customer customer;
    private String custID;
    private Account account;
    private double initBalance;



    //Setting up mock bank
    @BeforeEach
    void setUp(){
        bank = new Bank("Walter bank");
        custID = bank.addCustomer(" Goes" + "Walter");
        Customer customer = bank.getCustomer(custID);
        account = customer.getAccount(custID);
    }

    @Test
    @DisplayName("Account.deposit Test");
    void testDeposit(){
        Double depositAmmount = 100.00;
        account.deposit(depositAmmount);
        double Balance = account.getBalance();
        assertEquals( depositAmmount, Balance, "Expected balance is:" + depositAmmount + "Actual balance is " + Balance )
    }

    //Add the moneys
    @Test
    @DisplayName
    public void deposit(int ammount) {
        if(amount < 0) {
            System.out.println("Invalid deposit ammount!");
        } else {
            balance = balance + ammount;
        }
      //Test withdraw money from account
      @Test
      @DisplayName
      public void testWithdraw() {
            // setup
            BankAccount testAccount = createTestAccount(INITIAL_BALANCE);
            bankAccounts.add(testAccount);
            bank.withdraw(testAccount.getId(), AMOUNT);
            assertEquals( testAccount.getBalance(), 0);

    }
        //test get balance
        @Test
        @DisplayName
        public void testBalance()  {
            Account instance = new Account();
            int expResult = 0;
            int result = instance.getBalance();
            assertEquals(expResult, result);


}

