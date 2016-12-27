package com.luxoft.bankapp.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Gosh on 27.12.2016.
 * Nothing special
 */
public class Queue  {
    private List<Email> emailList;

    public void addMail(Email email){
        emailList = new ArrayList<>();
        emailList.add(email);
    }

    public Iterator<Email> getIterator(){return emailList.iterator();}
}
