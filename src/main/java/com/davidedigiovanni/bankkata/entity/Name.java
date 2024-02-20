package com.davidedigiovanni.bankkata.entity;

public class Name {

	private final String value;

	public Name(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return value;
	}
}
