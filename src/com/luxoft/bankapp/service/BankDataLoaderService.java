package com.luxoft.bankapp.service;

import com.luxoft.bankapp.model.Client;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * Created by Gosh on 19.12.2016.
 * Nothing special
 */
public interface BankDataLoaderService {

    List<Map<String,String>> loadClientsDataFromFile(File file);
}
