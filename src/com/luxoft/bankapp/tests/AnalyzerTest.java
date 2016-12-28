package com.luxoft.bankapp.tests;

import com.luxoft.bankapp.model.Account;
import com.luxoft.bankapp.model.CheckingAccount;
import com.luxoft.bankapp.utils.Analyzer;
import org.junit.Test;

/**
 * Created by Gosh on 28.12.2016.
 * Nothing special
 */
public class AnalyzerTest {

    @Test
    public void displayMainInfoTest(){
        new Analyzer(CheckingAccount.class).displayMainInfo();
    }
}
