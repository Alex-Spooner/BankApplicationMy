package com.luxoft.bankapp.tests;

import com.luxoft.bankapp.model.Account;
import com.luxoft.bankapp.model.CheckingAccount;
import com.luxoft.bankapp.model.SavingAccount;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Created by Gosh on 18.12.2016.
 * Nothing special
 */
public class AccountTest {

    @Test
    public void SavingAccountEqualsMethodTest() {
        Account account1 = new SavingAccount(0f);
        Account accountSameBalanceAsForTheAccount1 = new SavingAccount(0f);
        Account account2 = new SavingAccount(1f);
        assertFalse(account1.equals(accountSameBalanceAsForTheAccount1));
        assertFalse(account1.equals(account2));
    }

    @Test
    public void CheckingAccountEqualsMethodTest() {

        Account account1 = new CheckingAccount(0f);
        Account accountSameOverdfaftAsForTheAccount1 = new CheckingAccount(0f);
        Account account2 = new CheckingAccount(1f);
        assertFalse(account1.equals(accountSameOverdfaftAsForTheAccount1));
        assertFalse(account1.equals(account2));
    }

}
