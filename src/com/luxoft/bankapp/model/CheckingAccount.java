package com.luxoft.bankapp.model;

import com.luxoft.bankapp.exceptions.OverDraftLimitExceededException;

import java.util.UUID;

public class CheckingAccount extends AbstractAccount {
	private float overdraft;

	public CheckingAccount(float overdraft) throws IllegalArgumentException {
		if (overdraft >= 0) {
			this.overdraft = overdraft;
			uuid= UUID.randomUUID();
            balance=0;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void setOverdraft(float x) throws IllegalArgumentException {
		if (x >= 0) {
			overdraft = x;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void withdraw(float x) throws OverDraftLimitExceededException {
		if (balance + overdraft > x) {
			balance -= x;
		} else {
			throw new OverDraftLimitExceededException(getAccountName(), balance
					+ overdraft);
		}
	}

	public String getAccountName() {
		return "Checking Account";
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CheckingAccount)) return false;

        CheckingAccount that = (CheckingAccount) o;

        return that.uuid.equals(uuid) && Float.compare(that.overdraft, overdraft) == 0;

    }

    @Override
    public int hashCode() {
        return 31*Float.floatToIntBits(overdraft) + uuid.hashCode();
    }
}
