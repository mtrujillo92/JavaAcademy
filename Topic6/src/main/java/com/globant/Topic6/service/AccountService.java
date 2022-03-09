package com.globant.Topic6.service;

import com.globant.Topic6.entity.Account;
import com.globant.Topic6.entity.BankTransaction;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountService {

    @Autowired
    private BankTransaction bankTransaction;

    public void transferFunds(Account transferAccount, Account destinationAccount, Double amountToTransfer){
        transferAccount = bankTransaction.originAccount();
        destinationAccount = bankTransaction.destinationAccount();

        if(!isTheSameBank(transferAccount,destinationAccount)){


        }
    }

    private boolean areEnoughFunds(Account transferAccount, Double amountToTransfer){
        return transferAccount.getFunds() >= amountToTransfer;
    }

    private boolean isTheSameBank(Account transferAccount, Account destinationAccount){
        return transferAccount.getBank().getId() == destinationAccount.getBank().getId();
    }

    private boolean isCurrentAccount(Account destinationAccount){
        return destinationAccount.getAccountType().equals("CURRENT_ACCOUNT");
    }
}
