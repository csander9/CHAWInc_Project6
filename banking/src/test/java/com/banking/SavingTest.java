package com.banking;

/*
 * Junit 5 testing for SavingsAccount, initiated through eclipse
 * */

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SavingTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
/*
 * First test to test deposit, though i don't think this test will work well. APB
 * 
 * */
	@Test
	void test() {
		int initialBalance = 500;
		double amount = 50;
		SavingsAccount.deposit(double amount);
		Assumptions.assumeTrue( initialBalance == 550 );
		
		fail("Not yet implemented");
	}

}
