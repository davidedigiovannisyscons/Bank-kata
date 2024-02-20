package com.davidedigiovanni.bankkata.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

	private Account underTest;

	@BeforeEach
	void setUp() {
		Name name = new Name("John Doe");
		Amount amount = new Amount(100.0D);
		underTest = new Account(name, amount);
	}

	@Test
	public void itShouldAddMoneyToTheOriginalAmount() {
		Amount deposit = new Amount(50.0D);
		underTest.deposit(deposit);

		Amount expectedResult = new Amount(150.0D);

		assertEquals(expectedResult, underTest.getAmount());
	}

	@Test
	public void itShouldSubtractsMoneyToTheOriginalAmount() {
		Amount withdrawal = new Amount(20.50D);
		underTest.withdrawal(withdrawal);

		Amount expectedResult = new Amount(79.50D);

		assertEquals(expectedResult, underTest.getAmount());
	}

	@Test
	public void itShouldWithdrawalFromUnderTestAccountAndDepositToOtherAccount() {
		Name otherName = new Name("Jane Doe");
		Amount otherAmount = new Amount(250.0D);
		Account otherAccount = new Account(otherName, otherAmount);
		Amount amountToTransfer = new Amount(20.0D);
		underTest.transfer(otherAccount, amountToTransfer);

		Amount expectedUnderTestAmount = new Amount(80.0D);
		Amount expectedOtherAccountAmount = new Amount(270.0D);

		assertEquals(expectedUnderTestAmount, underTest.getAmount());
		assertEquals(expectedOtherAccountAmount, otherAccount.getAmount());
	}
}