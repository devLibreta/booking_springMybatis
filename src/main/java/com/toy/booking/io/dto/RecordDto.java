package com.toy.booking.io.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecordDto {
    private Long recordId;
    private String recordType;
    private String recordTitle;
    private String recordDetail;
    private int recordPrice;
    private String paymentMethod;

}
