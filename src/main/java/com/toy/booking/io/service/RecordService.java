package com.toy.booking.io.service;

import com.toy.booking.io.dto.RecordDto;
import com.toy.booking.io.entity.RecordEntity;
import org.springframework.stereotype.Service;

@Service
public interface IoService {
    default RecordEntity dtoToEntity(RecordDto recordDto){

    }
    default RecordDto entityToDto(RecordEntity recordEntity){

    }

}
