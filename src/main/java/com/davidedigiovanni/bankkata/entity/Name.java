package com.davidedigiovanni.bankkata.entity;

public class Name {

	private final String value;

	public Name(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
