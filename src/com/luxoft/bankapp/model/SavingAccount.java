package com.luxoft.bankapp.model;

import com.luxoft.bankapp.exceptions.NotEnoughFundsException;

import java.util.UUID;

public class SavingAccount extends AbstractAccount {

    public SavingAccount(float initialBalance) throws IllegalArgumentException {
        if (initialBalance >= 0) {
            balance = initialBalance;
            uuid = UUID.randomUUID();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void withdraw(float x) throws NotEnoughFundsException {
        if (balance >= x)
            balance -= x;
        else
            throw new NotEnoughFundsException(x);
    }

    public String getAccountName() {
        return "Saving Account";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SavingAccount)) return false;

        SavingAccount that = (SavingAccount) o;

        return that.uuid.equals(uuid) && Float.compare(that.balance, balance) == 0;

    }

    @Override
    public int hashCode() {
        return 31*Float.floatToIntBits(balance) + uuid.hashCode();
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        final StringBuffer sb = new StringBuffer("SavingAccount{");
        sb.append("balance =").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
