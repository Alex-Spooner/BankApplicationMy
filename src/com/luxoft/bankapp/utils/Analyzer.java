package com.luxoft.bankapp.utils;

import java.util.Arrays;

import static com.luxoft.bankapp.utils.Logger.*;

/**
 * Created by Gosh on 28.12.2016.
 * Nothing special
 */
public class Analyzer {
    private Class clazz;


    public Analyzer(Class clazz){
        this.clazz=clazz;
    }

    public void displayClassInfo(){
        log("Class name: " + clazz.getName());
    }

    public void displayParents(){
        log("Class parent: " + clazz.getSuperclass().getName());
    }

    public void displayInterfaces(){
        log("Class interfaces: " + Arrays.toString(clazz.getInterfaces()));
    }

    public  void displyaFields(){
        log("Class fields: " + Arrays.toString(clazz.getDeclaredFields()));
    }

    public void displayMethods(){
        log("Class methods: " + Arrays.toString(clazz.getDeclaredMethods()));
    }

    public void displayMainInfo(){
        displayClassInfo();
        displayParents();
        displayInterfaces();
        displyaFields();
        displayMethods();
    }

}
