package com.luxoft.bankapp.tests;

import com.luxoft.bankapp.exceptions.ClientExistsException;
import com.luxoft.bankapp.model.Account;
import com.luxoft.bankapp.model.Bank;
import com.luxoft.bankapp.model.Client;
import com.luxoft.bankapp.service.BankService;
import com.luxoft.bankapp.service.BankServiceImpl;
import com.luxoft.bankapp.utils.Logger;
import org.junit.Assert;
import org.junit.Test;

import static com.luxoft.bankapp.utils.Logger.*;
import static com.luxoft.bankapp.utils.Logger.log;
import static org.junit.Assert.*;

/**
 * Created by spb3 on 12/21/2016.
 * Nothing special
 */
public class BankServiceTest {

    @Test
    public void bankSerializationTest(){
        BankService bankService = new BankServiceImpl();
        Bank ubs = new Bank();
        Client client1 = new Client("Anna Smith", Client.Gender.FEMALE);
        client1.setInitialBalance(1000);
        Account account1 = bankService.createAccount(client1, "Saving");
        bankService.setActiveAccount(client1, account1);
        bankService.deposit(client1, 400);
        try {
            bankService.addClient(ubs, client1);
        } catch (ClientExistsException e) {
            log("Client with that name already exists");
        }

        bankService.saveBank(ubs);
        Bank ubsClone = bankService.readBank();

        assertEquals(ubs.toString(),ubsClone.toString());
    }

}
