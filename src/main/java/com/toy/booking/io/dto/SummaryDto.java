package com.toy.booking.io.dto;

import lombok.Data;

@Data
public class SummaryDto {
    private int openingBalance;
    private int balance;
    private int totalIncome;
    private int totalExpenses;
}
