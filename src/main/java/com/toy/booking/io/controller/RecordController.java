package com.toy.booking.io.controller;

import com.toy.booking.io.dto.IoDto;
import com.toy.booking.io.dto.SummaryBooking;
import com.toy.booking.io.service.IoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/record")
public class IoController {
    private final IoService ioService;

    // record 기록 조회
    @GetMapping(value = "/selectRecordAll", produces = MediaType.APPLICATION_JSON_VALUE) // JSON 타입으로 응답(기본)
    public ResponseEntity<IoDto> SelectRecordAll(){
    }
    // record 기록 입력
    @PostMapping(value = {"/insertRecord"}, consumes = MediaType.APPLICATION_JSON_VALUE) // JSON 타입의 요청만 받음
    public ResponseEntity<IoDto> insertRecord(){

    }
    // 특정 record 기록 삭제
    @DeleteMapping(value = {"/delete/{rno}"}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<IoDto> deleteById(@PathVariable Long rno){

    }

    // 특정 record 기록 조회
    @GetMapping(value = "/select/{rno}", produces = MediaType.APPLICATION_JSON_VALUE) // JSON 타입으로 응답(기본)
    public ResponseEntity<IoDto> selectById(@PathVariable Long rno){

    }
    // totalSumList 조회
    @GetMapping(value = "/selectRecordSummary" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SummaryBooking> selectSummary(){

    }

}
