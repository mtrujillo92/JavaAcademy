package com.globant.Topic6.service;

import com.globant.Topic6.entity.Account;
import com.globant.Topic6.entity.AccountType;
import com.globant.Topic6.entity.BankTransaction;
import com.globant.Topic6.exception.InsufficientFundsException;
import com.globant.Topic6.exception.InvalidTargetFundsException;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountService {

    @Autowired
    private BankTransaction bankTransaction;

    public void transferFunds(Account transferAccount, Account destinationAccount, Double amountToTransfer){
        transferAccount = bankTransaction.originAccount();
        destinationAccount = bankTransaction.destinationAccount();
        double MAX_TO_TRANSFER_WOUT_TAX = Double.valueOf(1500000);
        double TAX = 0.97;

        if(!isCurrentAccount(destinationAccount)){
            if(!isTheSameBank(transferAccount,destinationAccount)){
                    if(areEnoughFunds(transferAccount,(amountToTransfer+3500))){
                        transferAccount.setFunds(transferAccount.getFunds()-(amountToTransfer+3500));
                        if(amountToTransfer > MAX_TO_TRANSFER_WOUT_TAX){
                            destinationAccount.setFunds(destinationAccount.getFunds()+(amountToTransfer*0.97));
                        }else {
                            destinationAccount.setFunds(destinationAccount.getFunds()+amountToTransfer);
                        }
                }else{
                        throw new InsufficientFundsException();
                    }
            }else{
                if(areEnoughFunds(transferAccount,amountToTransfer)){
                    transferAccount.setFunds(transferAccount.getFunds()-amountToTransfer);
                    destinationAccount.setFunds(destinationAccount.getFunds()+amountToTransfer);
                }else {
                    throw new InsufficientFundsException();
                }
            }
        }else{
            if(!haveMoreThanTripleFunds(destinationAccount,amountToTransfer)){
                if(amountToTransfer > MAX_TO_TRANSFER_WOUT_TAX){
                    transferAccount.setFunds(transferAccount.getFunds()-amountToTransfer);
                    destinationAccount.setFunds(destinationAccount.getFunds()+(amountToTransfer*0.97));
                }else {
                    destinationAccount.setFunds(destinationAccount.getFunds()+amountToTransfer);
                }
            }else{
                throw new InvalidTargetFundsException();
            }

        }

    }

    private boolean areEnoughFunds(Account transferAccount, Double amountToTransfer){
        return transferAccount.getFunds() >= amountToTransfer;
    }

    private boolean isTheSameBank(Account transferAccount, Account destinationAccount){
        return transferAccount.getBank().getId() == destinationAccount.getBank().getId();
    }

    private boolean isCurrentAccount(Account destinationAccount){
        return destinationAccount.getAccountType() == AccountType.CURRENT_ACCOUNT;
    }

    private boolean haveMoreThanTripleFunds(Account destinationAccount, Double amountToTransfer){
        return destinationAccount.getFunds() > (3 * amountToTransfer);
    }

}
