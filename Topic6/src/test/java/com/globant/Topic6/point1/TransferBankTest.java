package com.globant.Topic6.point1;

import com.globant.Topic6.entity.Account;
import com.globant.Topic6.entity.AccountType;
import com.globant.Topic6.entity.Bank;
import com.globant.Topic6.entity.BankTransaction;
import com.globant.Topic6.exception.InsufficientFundsException;
import com.globant.Topic6.exception.InvalidTargetFundsException;
import com.globant.Topic6.service.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class TransferBankTest {
    @Mock
    private BankTransaction bankTransaction;

    @InjectMocks
    private AccountService accountService;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testNoFundsToTransfer(){
        Account originAccount = Account.builder()
                .id(1)
                .accountType(AccountType.SAVINGS_ACCOUNT)
                .userName("Miguel")
                .userSurname("Trujillo")
                .identityNumber("5647865874")
                .funds(100000.00)
                .bank(Bank.builder().id(5).name("Globant").build())
                .build();

        Account destinationAccount = Account.builder()
                .id(2)
                .accountType(AccountType.SAVINGS_ACCOUNT)
                .userName("Alejandra")
                .userSurname("Lopez")
                .identityNumber("564897153")
                .funds(200000.00)
                .bank(Bank.builder().id(1).name("Bancolombia").build())
                .build();

        Mockito.when(bankTransaction.originAccount()).thenReturn(originAccount);
        Mockito.when(bankTransaction.destinationAccount()).thenReturn(destinationAccount);

        InsufficientFundsException ex = Assertions.assertThrows(InsufficientFundsException.class, () -> accountService.transferFunds(originAccount,destinationAccount,400000.00));

        Assertions.assertEquals("You don't have enough money to do the transaction", ex.getMessage());
    }

    @Test
    public void testCurrentAccountWithMoreThanTripleFunds(){
        Account originAccount = Account.builder()
                .id(1)
                .accountType(AccountType.SAVINGS_ACCOUNT)
                .userName("Miguel")
                .userSurname("Trujillo")
                .identityNumber("5647865874")
                .funds(100000.00)
                .bank(Bank.builder().id(5).name("Globant").build())
                .build();

        Account destinationAccount = Account.builder()
                .id(2)
                .accountType(AccountType.CURRENT_ACCOUNT)
                .userName("Alejandra")
                .userSurname("Lopez")
                .identityNumber("564897153")
                .funds(400000.00)
                .bank(Bank.builder().id(1).name("Bancolombia").build())
                .build();

        Mockito.when(bankTransaction.originAccount()).thenReturn(originAccount);
        Mockito.when(bankTransaction.destinationAccount()).thenReturn(destinationAccount);

        InvalidTargetFundsException ex = Assertions.assertThrows(InvalidTargetFundsException.class, () -> accountService.transferFunds(originAccount,destinationAccount,90000.00));

        Assertions.assertEquals("The target account have more than the triple in them founds", ex.getMessage());
    }

    @Test
    public void testTransferToAnotherBankLessThanOneThousandFiveHundred(){
        Account originAccount = Account.builder()
                .id(1)
                .accountType(AccountType.SAVINGS_ACCOUNT)
                .userName("Miguel")
                .userSurname("Trujillo")
                .identityNumber("5647865874")
                .funds(100000.00)
                .bank(Bank.builder().id(5).name("Globant").build())
                .build();

        Account destinationAccount = Account.builder()
                .id(2)
                .accountType(AccountType.SAVINGS_ACCOUNT)
                .userName("Alejandra")
                .userSurname("Lopez")
                .identityNumber("564897153")
                .funds(300000.00)
                .bank(Bank.builder().id(1).name("Bancolombia").build())
                .build();

        Mockito.when(bankTransaction.originAccount()).thenReturn(originAccount);
        Mockito.when(bankTransaction.destinationAccount()).thenReturn(destinationAccount);

        accountService.transferFunds(originAccount,destinationAccount,90000.00);
        Assertions.assertAll(
                () -> Assertions.assertEquals(6500.00, originAccount.getFunds()),
                () -> Assertions.assertEquals(390000.00, destinationAccount.getFunds())
        );
    }

    @Test
    public void testTransferToAnotherBankMoreThanOneThousandFiveHundred(){
        Account originAccount = Account.builder()
                .id(1)
                .accountType(AccountType.SAVINGS_ACCOUNT)
                .userName("Miguel")
                .userSurname("Trujillo")
                .identityNumber("5647865874")
                .funds(2000000.00)
                .bank(Bank.builder().id(5).name("Globant").build())
                .build();

        Account destinationAccount = Account.builder()
                .id(2)
                .accountType(AccountType.SAVINGS_ACCOUNT)
                .userName("Alejandra")
                .userSurname("Lopez")
                .identityNumber("564897153")
                .funds(0.00)
                .bank(Bank.builder().id(1).name("Bancolombia").build())
                .build();

        Mockito.when(bankTransaction.originAccount()).thenReturn(originAccount);
        Mockito.when(bankTransaction.destinationAccount()).thenReturn(destinationAccount);

        accountService.transferFunds(originAccount,destinationAccount,1600000.00);
        Assertions.assertAll(
                () -> Assertions.assertEquals((2000000.00-1603500.00), originAccount.getFunds()),
                () -> Assertions.assertEquals((1600000*.97), destinationAccount.getFunds())
        );

    }
}
