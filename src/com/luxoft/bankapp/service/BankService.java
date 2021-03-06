package com.luxoft.bankapp.service;

import com.luxoft.bankapp.exceptions.ClientExistsException;
import com.luxoft.bankapp.exceptions.NotEnoughFundsException;
import com.luxoft.bankapp.exceptions.OverDraftLimitExceededException;
import com.luxoft.bankapp.model.Account;
import com.luxoft.bankapp.model.Bank;
import com.luxoft.bankapp.model.Client;

public interface BankService {
	void addClient(Bank bank, Client client)
			throws ClientExistsException;

	 void removeClient(Bank bank, Client client);

	void addAccount(Client client, Account account);

	void setActiveAccount(Client client, Account account);

	Account createAccount(Client client, String accountType);

	void deposit(Client client, float x);

	void withdraw(Client client, float x)
			throws NotEnoughFundsException;

	void saveBank(Bank bank);

	Bank readBank();

}
