package com.luxoft.bankapp.model;

import com.luxoft.bankapp.exceptions.NotEnoughFundsException;

public interface Account extends Report {
	String getAccountName();

	float getBalance();

	void deposit(float x) throws IllegalArgumentException;

	void withdraw(float x) throws NotEnoughFundsException;

	int decimalValue();
	
}
