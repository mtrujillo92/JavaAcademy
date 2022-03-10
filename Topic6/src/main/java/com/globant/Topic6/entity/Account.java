package com.globant.Topic6.entity;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    private Integer id;
    private AccountType accountType;
    private String userName;
    private String userSurname;
    private String identityNumber;
    private Double funds;
    private Bank bank;
}
