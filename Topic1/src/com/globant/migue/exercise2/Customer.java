package com.globant.migue.exercise2;

public class Customer implements Observer{


    @Override
    public void update(String message) {
        System.out.println(message);
    }

}
