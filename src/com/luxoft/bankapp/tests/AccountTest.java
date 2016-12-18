package com.luxoft.bankapp.tests;

import com.luxoft.bankapp.model.Account;
import com.luxoft.bankapp.model.CheckingAccount;
import com.luxoft.bankapp.model.SavingAccount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by Gosh on 18.12.2016.
 * Nothing special
 */
public class AccountTest {

    @Test
    public void savingAccountEqualsMethodTest() {
        Account account1 = new SavingAccount(0f);
        Account accountSameBalanceAsForTheAccount1 = new SavingAccount(0f);
        Account account2 = new SavingAccount(1f);
        assertFalse(account1.equals(accountSameBalanceAsForTheAccount1));
        assertFalse(account1.equals(account2));
    }

    @Test
    public void checkingAccountEqualsMethodTest() {

        Account account1 = new CheckingAccount(0f);
        Account accountSameOverdfaftAsForTheAccount1 = new CheckingAccount(0f);
        Account account2 = new CheckingAccount(1f);
        assertFalse(account1.equals(accountSameOverdfaftAsForTheAccount1));
        assertFalse(account1.equals(account2));
    }

    @Test
    public void decimalValueAccountMethodTest(){
        Account savingAccount = new SavingAccount(111.41111f);
        Account checkingAccount = new CheckingAccount(111.11111f,111.51111f);
        assertEquals(111, savingAccount.decimalValue());
        assertEquals(112, checkingAccount.decimalValue());

    }

}
