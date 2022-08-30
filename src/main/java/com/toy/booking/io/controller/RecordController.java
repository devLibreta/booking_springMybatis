package com.toy.booking.io.controller;

import com.toy.booking.io.dto.RecordDto;
import com.toy.booking.io.entity.SummaryEntity;
import com.toy.booking.io.service.RecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/record")
public class RecordController {
    private final RecordService recordService;

    // record 조회
    @GetMapping(value = "/selectRecordAll", produces = MediaType.APPLICATION_JSON_VALUE) // JSON 타입으로 응답(기본)
    public ResponseEntity<List<RecordDto>> SelectRecordAll(){
        return new ResponseEntity<>(recordService.selectRecordAll(), HttpStatus.OK);
    }
    // record 입력
    @PostMapping(value = {"/insertRecord"}, consumes = MediaType.APPLICATION_JSON_VALUE) // JSON 타입의 요청만 받음
    public ResponseEntity<Long> insertRecord(@RequestBody RecordDto recordDto){
        Long rno = recordService.insertRecord(recordDto);
        return new ResponseEntity<>(rno, HttpStatus.OK);
    }
    // record 수정
    @PostMapping(value = "/updateRecord", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateRecord(@RequestBody RecordDto recordDto){
        recordService.updateRecord(recordDto);
        return new ResponseEntity<>("success",HttpStatus.OK);

    }

    // 특정 record 삭제
    @DeleteMapping(value = {"/delete/{rno}"})
    public ResponseEntity<String> deleteById(@PathVariable Long rno){
        recordService.deleteRecord(rno);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    // 특정 record 조회
    @GetMapping(value = "/select/{rno}", produces = MediaType.APPLICATION_JSON_VALUE) // JSON 타입으로 응답(기본)
    public ResponseEntity<RecordDto> selectById(@PathVariable Long rno){
        return new ResponseEntity<>(recordService.selectById(rno),HttpStatus.OK);
    }
    // totalSumList 조회
//    @GetMapping(value = "/selectRecordSummary" , produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<SummaryEntity> selectSummary(){
//
//    }

}
