package com.toy.booking.io.service;

import com.toy.booking.io.dto.RecordDto;
import com.toy.booking.io.dto.SummaryDto;
import com.toy.booking.io.entity.RecordEntity;
import com.toy.booking.io.entity.SummaryEntity;
import com.toy.booking.io.repository.MybatisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@Service
@RequiredArgsConstructor
public class RecordServiceImpl implements RecordService{
    private final MybatisRepository mybatisRepository;

    @Override
    public List<RecordDto> selectRecordAll() {
        List<RecordEntity> recordEntityList = mybatisRepository.selectRecordAll();
        return recordEntityList.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    @Override
    public Long insertRecord(RecordDto recordDto) {
        RecordEntity recordEntity = dtoToEntity(recordDto);
        mybatisRepository.insertRecord(recordEntity);
        return recordEntity.getRecordId();
    }

    @Override
    public void updateRecord(RecordDto recordDto) {
        RecordEntity recordEntity = dtoToEntity(recordDto);
        mybatisRepository.updateRecord(recordEntity);
    }

    @Override
    public void deleteRecord(Long rno) {
        mybatisRepository.deleteById(rno);
    }

    @Override
    public RecordDto selectById(Long rno) {
        RecordEntity recordEntity = mybatisRepository.selectByID(rno);
        return entityToDto(recordEntity);
    }

//    @Override
//    public SummaryDto selectSummary(SummaryDto summaryDto) {
//        SummaryEntity summaryEntity = mybatisRepository.selectSummary();
//        entityToDto(summaryEntity);
//
//        return null;
//    }
}
