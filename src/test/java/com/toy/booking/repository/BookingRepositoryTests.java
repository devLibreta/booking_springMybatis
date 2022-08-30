package com.toy.booking.repository;

import com.toy.booking.io.entity.RecordEntity;
import com.toy.booking.io.repository.MybatisRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class BookingRepositoryTests {

    private MybatisRepository mybatisRepository;

    @Autowired
    public BookingRepositoryTests(MybatisRepository mybatisRepository) {
        this.mybatisRepository = mybatisRepository;
    }

    @Test
    void insertDummies() {
        IntStream.rangeClosed(1,300).forEach(i -> {
            RecordEntity recordEntity = RecordEntity.builder()
                    .recordType("INPUT"+i)
                    .recordTitle("TITLE"+i)
                    .recordDetail("Detail"+i)
                    .recordPrice(1000+i)
                    .paymentMethod("CARD"+i)
                    .build();
        });
    }
}
