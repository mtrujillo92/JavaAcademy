package com.globant.observer;

public class PassiveCustomer implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Passive customer made note of the sale.");
    }
}
