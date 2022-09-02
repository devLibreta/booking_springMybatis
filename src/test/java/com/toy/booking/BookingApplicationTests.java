package com.toy.booking;

import com.toy.booking.io.dto.RecordDto;
import com.toy.booking.io.entity.RecordEntity;
import com.toy.booking.io.entity.UserInfo;
import com.toy.booking.io.repository.MybatisRepository;
import com.toy.booking.io.service.RecordService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootTest
//@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Log4j2
class BookingApplicationTests {
    @Autowired
    private MybatisRepository mybatisRepository;

    @Autowired
    private RecordService recordService;

    @Test
    void selectUpdateCheck() {
        System.out.println("-----------SELECT ALL TEST-------------------------------");
        IntStream.rangeClosed(1, 10).forEach(i -> {
            RecordDto recordDto = RecordDto.builder()
                    .recordType("input"+i)
                    .recordTitle("shop"+i)
                    .recordDetail("something"+i)
                    .recordPrice(999+i)
                    .paymentMethod("card"+i)
                    .build();
            recordService.insertRecord(recordDto);
        });
        mybatisRepository.selectRecordAll().forEach(System.out::println);


        System.out.println("-----------UPDATE TEST-------------------------------");
        RecordDto updateSample = RecordDto.builder()
            .recordType("input@@@@@@@@@")
            .recordTitle("shop@@@@@@@@@")
            .recordDetail("something@@@@@@")
            .recordPrice(111)
            .paymentMethod("card@@@@@@@")
            .recordId(1L)
            .build();
        recordService.updateRecord(updateSample);
        mybatisRepository.selectRecordAll().forEach(System.out::println);
        System.out.println("-----------SELECT TEST-------------------------------");
        System.out.println(mybatisRepository.selectByID(1L));
    }
}
