package com.globant.Topic6.exception;

public class InsufficientFundsException extends RuntimeException{
    public InsufficientFundsException(){
        super("You don't have enough money to do the transaction");
    }
}
