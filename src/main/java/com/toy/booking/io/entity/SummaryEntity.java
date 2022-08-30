package com.toy.booking.io.dto;

import lombok.Data;

@Data
public class SummaryBooking {
    private int openingBalance;
    private int balance;
    private int totalIncome;
    private int totalExpenses;
}
