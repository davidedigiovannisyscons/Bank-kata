package com.davidedigiovanni.bankkata.entity;

import java.util.Objects;

public class Account {

	private final Name name;
	private final Amount amount;

	public Account(Name name, Amount amount) {
		this.name = name;
		this.amount = amount;
	}

	public Amount getAmount() {
		return amount;
	}

	public void deposit(Amount deposit) {
		Double actualAmount = amount.getValue();
		Double depositAsDouble = deposit.getValue();
		Double newAmount = actualAmount + depositAsDouble;
		amount.setValue(newAmount);
	}

	public void withdrawal(Amount withdrawal) {
		Double actualAmount = amount.getValue();
		Double withdrawalAsDouble = withdrawal.getValue();
		Double newAmount = actualAmount - withdrawalAsDouble;
		amount.setValue(newAmount);
	}

	public void transfer(Account otherAccount, Amount transfer) {
		this.withdrawal(transfer);
		otherAccount.deposit(transfer);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Account account = (Account) o;
		return Objects.equals(name, account.name) && Objects.equals(amount, account.amount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, amount);
	}

	@Override
	public String toString() {
		return name + ": " + amount;
	}
}
