package com.toy.booking.io.service;

import com.toy.booking.io.dto.RecordDto;
import com.toy.booking.io.dto.SummaryDto;
import com.toy.booking.io.entity.RecordEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public interface RecordService {

    List<RecordDto> selectRecordAll();
    Long insertRecord(RecordDto recordDto);
    void updateRecord(RecordDto recordDto);
    void deleteRecord(Long rno);
    RecordDto selectById(Long rno);

//    SummaryDto selectSummary();



    default RecordEntity dtoToEntity(RecordDto recordDto){
        LocalDateTime now = LocalDateTime.now();
        return RecordEntity.builder()
                .recordId(recordDto.getRecordId())
                .recordType(recordDto.getRecordType())
                .recordTitle(recordDto.getRecordTitle())
                .recordDetail(recordDto.getRecordDetail())
                .recordPrice(recordDto.getRecordPrice())
                .regDate(now)
                .modDate(now)
                .paymentMethod(recordDto.getPaymentMethod())
                .build();
    }

    default RecordDto entityToDto(RecordEntity recordEntity){
        return RecordDto.builder()
                .recordId(recordEntity.getRecordId())
                .recordType(recordEntity.getRecordType())
                .recordTitle(recordEntity.getRecordTitle())
                .recordDetail(recordEntity.getRecordDetail())
                .recordPrice(recordEntity.getRecordPrice())
                .paymentMethod(recordEntity.getPaymentMethod())
                .build();
    }

}
