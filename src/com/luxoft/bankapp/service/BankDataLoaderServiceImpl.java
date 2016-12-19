package com.luxoft.bankapp.service;

import com.luxoft.bankapp.utils.Logger;

import java.io.*;
import java.util.*;

/**
 * Created by Gosh on 19.12.2016.
 * Nothing special
 */
public class BankDataLoaderServiceImpl implements BankDataLoaderService {

    @Override
    public List<Map<String, String>> loadClientsDataFromFile(File file) {

        List<String> clientStringList = readFile(file);
        List<Map<String, String>> clientsDataMapList = new ArrayList<>();
        assert clientStringList != null;
        for (String clientString : clientStringList) {
            clientsDataMapList.add(getClientMap(clientString));
        }
        return clientsDataMapList;
    }

    private Map<String, String> getClientMap(String clientString) {
        String delimiter = ";";
        Scanner scanner = new Scanner(clientString);
        scanner.useDelimiter(delimiter);
        Map<String, String> dataMap = new HashMap<>();
        while (scanner.hasNext()) {
            String[] buf = scanner.next().split("=");
            dataMap.put(buf[0], buf[1]);
        }
        return dataMap;
    }

    private List<String> readFile(File file) {

        try (LineNumberReader reader = new LineNumberReader(new BufferedReader(new FileReader(file)))) {
            List<String> stringList = new ArrayList<>();
            String s;
            while ((s = reader.readLine()) != null) {
                stringList.add(s);
            }
            return stringList;
        } catch (IOException e) {
            Logger.log(e.getMessage());
        }
        return null;
    }
}
