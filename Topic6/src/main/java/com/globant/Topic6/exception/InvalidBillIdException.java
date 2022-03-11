package com.globant.Topic6.exception;

public class InvalidBillIdException extends RuntimeException{
    public InvalidBillIdException(){
        super("The bill Id does not meet minimum requirements");
    }
}
