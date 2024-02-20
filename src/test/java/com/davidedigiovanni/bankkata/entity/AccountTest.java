package com.davidedigiovanni.bankkata.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

	private Account underTest;

	@BeforeEach
	void setUp() {
		underTest = new Account("John Doe", 100.0D);
	}

	@Test
	public void itShouldAddMoneyToTheOriginalAmount() {
		Double deposit = 50.0D;
		underTest.deposit(deposit);

		assertEquals("John Doe: 150.0 €", underTest.toString());
	}

	@Test
	public void itShouldSubtractsMoneyToTheOriginalAmount() {
		Double withdrawal = 20.50D;
		underTest.withdrawal(withdrawal);

		assertEquals("John Doe: 79.5 €", underTest.toString());
	}
}