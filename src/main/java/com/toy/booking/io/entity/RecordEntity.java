package com.toy.booking.io.entity;

import lombok.*;


import java.time.LocalDateTime;
import java.util.Date;

@Getter
@ToString
//@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@TypeDef(name=RecordEntity, typeClass = Jsont.class)
public class RecordEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;
    private String recordType;
    private String recordTitle;
    private String recordDetail;
    private int recordPrice;
//    @Column(name = "regDate", updatable = false )
    private LocalDateTime regDate;
    private LocalDateTime modDate;
    private String paymentMethod;
}
