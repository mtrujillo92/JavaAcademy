package com.globant.exercise2;

public class App {

    public static void main(String[] args) {
        Product product1 = new Product("PC",500000);
        Product product2 = new Product("USB",600000);
        Product product3 = new Product("Monitor",900000);


        Observer customer1 = new Customer();
        Observer customer2 = new Customer();
        Observer customer3 = new Customer();
        Observer customer4 = new Customer();
        Observer customer5 = new Customer();
        product2.addSubscriber(customer3);
        product2.addSubscriber(customer2);
        product3.addSubscriber(customer3);
        product1.changePrice(5000);
    }
    //customer is the Observer
    //product is the Subject


}
