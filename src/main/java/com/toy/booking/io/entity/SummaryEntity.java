package com.toy.booking.io.entity;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SummaryEntity {
    private int openingBalance;
    private int balance;
    private int totalIncome;
    private int totalExpenses;
}
