package com.luxoft.bankapp.tests;

import com.luxoft.bankapp.service.BankDataLoaderService;
import com.luxoft.bankapp.service.BankDataLoaderServiceImpl;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gosh on 19.12.2016.
 * Nothing special
 */
public class DataLoaderTest {
    private static final String FILES_TEST_PATH = "files/clients.feed";

    @Test
    public void fileLoadingTest() {
        File file = new File(FILES_TEST_PATH);
        BankDataLoaderService loaderService = new BankDataLoaderServiceImpl();
        Map<String,String> expectedData = new HashMap<>();
        expectedData.put("balance", "100");
        expectedData.put("gender", "f");
        expectedData.put("overdraft", "50");
        expectedData.put("accounttype", "c");
        expectedData.put("name", "John");
        assertEquals(expectedData, loaderService.loadClientsDataFromFile(file).get(0));

    }
}
