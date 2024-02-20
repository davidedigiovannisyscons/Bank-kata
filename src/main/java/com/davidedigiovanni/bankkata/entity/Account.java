package com.davidedigiovanni.bankkata.entity;

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

	@Override
	public String toString() {
		return name + ": " + amount;
	}
}
