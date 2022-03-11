package com.globant.Topic6.point2;

import com.globant.Topic6.entity.*;
import com.globant.Topic6.exception.InsufficientFundsException;
import com.globant.Topic6.exception.InvalidBillIdException;
import com.globant.Topic6.service.BillService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Date;

public class BillBankTest {
    @Mock
    BillTransaction billTransaction;

    @InjectMocks
    BillService billService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testNoFundsToTransferInSavingAccount() {
        Account originAccount = Account.builder()
                .id(1)
                .accountType(AccountType.SAVINGS_ACCOUNT)
                .userName("Miguel")
                .userSurname("Trujillo")
                .identityNumber("5647865874")
                .funds(100000.00)
                .bank(Bank.builder().id(5).name("Globant").build())
                .build();

        Bill bill = Bill.builder()
                .companyId(3)
                .billId("0059674")
                .amount(100000.00)
                .expirationDate(LocalDate.of(2022, 3, 28))
                .build();

        Mockito.when(billTransaction.originAccount()).thenReturn(originAccount);
        Mockito.when(billTransaction.bill()).thenReturn(bill);

        InsufficientFundsException ex = Assertions.assertThrows(InsufficientFundsException.class, () -> billService.payBill(originAccount, bill));

        Assertions.assertEquals("You don't have enough money to do the transaction", ex.getMessage());
    }

    @Test
    public void testNoFundsToTransferInCurrentAccount() {
        Account originAccount = Account.builder()
                .id(1)
                .accountType(AccountType.CURRENT_ACCOUNT)
                .userName("Miguel")
                .userSurname("Trujillo")
                .identityNumber("5647865874")
                .funds(90000.00)
                .bank(Bank.builder().id(5).name("Globant").build())
                .build();

        Bill bill = Bill.builder()
                .companyId(3)
                .billId("0059674")
                .amount(101000.00)
                .expirationDate(LocalDate.of(2022, 3, 28))
                .build();

        Mockito.when(billTransaction.originAccount()).thenReturn(originAccount);
        Mockito.when(billTransaction.bill()).thenReturn(bill);

        InsufficientFundsException ex = Assertions.assertThrows(InsufficientFundsException.class, () -> billService.payBill(originAccount, bill));

        Assertions.assertEquals("You don't have enough money to do the transaction", ex.getMessage());
    }

    @Test
    public void testErrorIdBill() {
        Account originAccount = Account.builder()
                .id(1)
                .accountType(AccountType.CURRENT_ACCOUNT)
                .userName("Miguel")
                .userSurname("Trujillo")
                .identityNumber("5647865874")
                .funds(90000.00)
                .bank(Bank.builder().id(5).name("Globant").build())
                .build();

        Bill bill = Bill.builder()
                .companyId(3)
                .billId("059674")
                .amount(1000.00)
                .expirationDate(LocalDate.of(2022, 3, 28))
                .build();

        Mockito.when(billTransaction.originAccount()).thenReturn(originAccount);
        Mockito.when(billTransaction.bill()).thenReturn(bill);

        InvalidBillIdException ex = Assertions.assertThrows(InvalidBillIdException.class, () -> billService.payBill(originAccount, bill));

        Assertions.assertEquals("The bill Id does not meet minimum requirements", ex.getMessage());
    }

    @Test
    public void testPaidBillSavingAccount() {
        Account originAccount = Account.builder()
                .id(1)
                .accountType(AccountType.SAVINGS_ACCOUNT)
                .userName("Miguel")
                .userSurname("Trujillo")
                .identityNumber("5647865874")
                .funds(90000.00)
                .bank(Bank.builder().id(5).name("Globant").build())
                .build();

        Bill bill = Bill.builder()
                .companyId(3)
                .billId("0059674")
                .amount(60000.00)
                .expirationDate(LocalDate.of(2022, 3, 28))
                .build();

        Mockito.when(billTransaction.originAccount()).thenReturn(originAccount);
        Mockito.when(billTransaction.bill()).thenReturn(bill);
        billService.payBill(originAccount, bill);
        Assertions.assertEquals(30000.00, originAccount.getFunds());
    }

    @Test
    public void testPaidBillCurrentAccount() {
        Account originAccount = Account.builder()
                .id(1)
                .accountType(AccountType.CURRENT_ACCOUNT)
                .userName("Miguel")
                .userSurname("Trujillo")
                .identityNumber("5647865874")
                .funds(200000.00)
                .bank(Bank.builder().id(5).name("Globant").build())
                .build();

        Bill bill = Bill.builder()
                .companyId(3)
                .billId("0059674")
                .amount(100000.00)
                .expirationDate(LocalDate.of(2022, 3, 28))
                .build();

        Mockito.when(billTransaction.originAccount()).thenReturn(originAccount);
        Mockito.when(billTransaction.bill()).thenReturn(bill);
        billService.payBill(originAccount, bill);
        Assertions.assertEquals(110000.00, originAccount.getFunds());
    }
}
