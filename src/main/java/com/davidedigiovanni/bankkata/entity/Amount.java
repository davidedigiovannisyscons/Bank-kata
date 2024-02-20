package com.davidedigiovanni.bankkata.entity;

public class Amount {

	private Double value;

	public Amount(Double value) {
		this.value = value;
	}

	public void deposit(Double amount) {
		value += amount;
	}

	public void withdrawal(Double amount) {
		value -= amount;
	}

	@Override
	public String toString() {
		return value + " €";
	}
}
