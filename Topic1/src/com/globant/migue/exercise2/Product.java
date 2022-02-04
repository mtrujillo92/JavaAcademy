package com.globant.migue.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{
    private List<Observer> customers = new ArrayList<>();
    @Override
    public void addSubscriber(Observer customer) {
        customers.add(customer);
    }

    @Override
    public void removeSubscriber(Observer customer) {
        customers.remove(customer);
    }

    @Override
    public void notifySubscribers() {
        for(Observer customer:customers)
            customer.update("The price change, the new price is: " + price);
    }


    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public void changePrice(double price){
        this.price = price;
        notifySubscribers();
    }


}
