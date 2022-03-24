package com.globant.Thesis.service;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {

    private final String username;
    private final String firstName;
    private final String lastName;
    private final String idNumber;
    private final String address;
    private final String zipCode;
    private final String state;
    private final String country;
    private final String password;
}
