package com.luxoft.bankapp.service;

import com.luxoft.bankapp.exceptions.ClientExistsException;
import com.luxoft.bankapp.exceptions.NotEnoughFundsException;
import com.luxoft.bankapp.model.Account;
import com.luxoft.bankapp.model.Bank;
import com.luxoft.bankapp.model.Client;

import java.io.*;

public class BankServiceImpl implements BankService {

    @Override
    public void addClient(Bank bank, Client client)
            throws ClientExistsException {
        saveBank(bank);
        bank.addClient(client);
    }

    @Override
    public void removeClient(Bank bank, Client client) {
        saveBank(bank);
        bank.removeClient(client);
    }

    @Override
    public void addAccount(Client client, Account account) {
        client.addAccount(account);
    }

    @Override
    public void setActiveAccount(Client client, Account account) {
        client.setActiveAccount(account);
    }

    @Override
    public Account createAccount(Client client, String accountType) {

        return client.createAccount(accountType);
    }

    @Override
    public void deposit(Client client, float x) {
        client.deposit(x);
    }

    @Override
    public void withdraw(Client client, float x)
            throws NotEnoughFundsException {
        client.withdraw(x);
    }

    @Override
    public void saveBank(Bank bank) {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("files" + System.getProperty("file.separator") + "bank.ser"))))) {
            outputStream.writeObject(bank);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Bank readBank() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("files" + System.getProperty("file.separator") + "bank.ser"))))) {
            return (Bank) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
