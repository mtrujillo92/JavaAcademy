package com.globant.observer;

public class App {
    public static void main(String[] args) {
        Subject fashionChainStores = new Store();
        Observer customer1 = new PassiveCustomer();
        Observer customer2 = new ShopaholicCustomer();
        Observer customer3 = new ShopaholicCustomer();

        fashionChainStores.addSubscriber(customer1);
        fashionChainStores.addSubscriber(customer2);

        fashionChainStores.notifySubscribers();

        fashionChainStores.removeSubscriber(customer1);

        fashionChainStores.addSubscriber(customer3);

        fashionChainStores.notifySubscribers();

    }
}
