package com.globant.Topic6.service;

import com.globant.Topic6.entity.Account;
import com.globant.Topic6.entity.AccountType;
import com.globant.Topic6.entity.Bill;
import com.globant.Topic6.entity.BillTransaction;
import com.globant.Topic6.exception.InsufficientFundsException;
import com.globant.Topic6.exception.InvalidBillIdException;
import org.springframework.beans.factory.annotation.Autowired;

public class BillService {
    @Autowired
    BillTransaction billTransaction;

    private Double DISCOUNT_PERCENT = 0.9;
    private Double PERCENT_TO_CHECK = 1.2;

    public void payBill(Account originAccount, Bill bill){
        Double amount = bill.getAmount();

        originAccount = billTransaction.originAccount();
        bill = billTransaction.bill();

        if(isValidBillId(bill)){
            if(!isCurrentAccount(originAccount)){
                if(areEnoughFundsInSavingAccount(originAccount, amount)){
                    originAccount.setFunds(originAccount.getFunds()-amount);
                } else {
                    throw new InsufficientFundsException();
                }
            } else {
                if(areEnoughFundsInCurrentAccount(originAccount,amount)){
                    originAccount.setFunds(originAccount.getFunds()-(amount * DISCOUNT_PERCENT));
                }else{
                    throw new InsufficientFundsException();
                }
            }
        }else{
            throw new InvalidBillIdException();
        }
    }

    private boolean areEnoughFundsInSavingAccount(Account originAccount, Double amount){
        return originAccount.getFunds()  >= (amount * PERCENT_TO_CHECK);
    }

    private boolean areEnoughFundsInCurrentAccount(Account originAccount, Double amount){
        return originAccount.getFunds() >= (amount * DISCOUNT_PERCENT);
    }

    private boolean isCurrentAccount(Account originAccount){
        return originAccount.getAccountType() == AccountType.CURRENT_ACCOUNT;
    }

    private boolean isValidBillId(Bill bill){
        return bill.getBillId().startsWith("00") && bill.getBillId().length() == 7;
    }
}
