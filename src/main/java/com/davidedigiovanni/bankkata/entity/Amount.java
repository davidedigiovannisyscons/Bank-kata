package com.davidedigiovanni.bankkata.entity;

import java.util.Objects;

public class Amount {

	private Double value;

	public Amount(Double value) {
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value + " €";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Amount amount = (Amount) o;
		return Objects.equals(value, amount.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
