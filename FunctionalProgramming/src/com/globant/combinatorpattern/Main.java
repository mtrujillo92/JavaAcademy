package com.globant.combinatorpattern;

import java.time.LocalDate;

import static com.globant.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0898787878987",
                LocalDate.of(2020,1,1)
        );
        //System.out.println(new CustomerValidatorService().isValid(customer));
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);
        System.out.println(result);

        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
