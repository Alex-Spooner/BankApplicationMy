package com.luxoft.bankapp.model;

import java.util.UUID;

public abstract class AbstractAccount implements Account {
	protected float balance;
	UUID uuid;

	@Override
	public void printReport() {
		System.out.println("Account balance: " + balance);
	}

	@Override
	public void deposit(float x) throws IllegalArgumentException {
		if (x >= 0) {
			balance += x;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public float getBalance() {
		return balance;
	}

	@Override
	public int decimalValue() {
		return Math.round(getBalance());
	}
}
