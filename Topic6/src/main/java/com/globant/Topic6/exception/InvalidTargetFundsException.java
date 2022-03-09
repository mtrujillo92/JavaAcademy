package com.globant.Topic6.exception;

public class InvalidTargetFundsException extends RuntimeException{
    public InvalidTargetFundsException(){
        super("The target account have more than the triple in them founds");
    }
}
