package com.globant.Topic6.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Bill {
    private Integer companyId;
    private String billId;
    private LocalDate expirationDate;
    private Double amount;

}
