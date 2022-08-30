package com.toy.booking.io.dto;

import lombok.Data;

import java.util.Date;

@Data
public class IoDto {
    private Long recordId;
    private String recordType;
    private String recordTitle;
    private String recordDetail;
    private int recordPrice;
    private String paymentMethod;

}
