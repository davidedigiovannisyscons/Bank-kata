package com.davidedigiovanni.bankkata.entity;

public class Account {

	private final Name name;
	private final Amount amount;

	public Account(String name, Double amount) {
		this.name = new Name(name);
		this.amount = new Amount(amount);
	}

	public void deposit(Double amount) {
		this.amount.deposit(amount);
	}

	public void withdrawal(Double amount) {
		this.amount.withdrawal(amount);
	}

	@Override
	public String toString() {
		return name + ": " + amount;
	}
}
