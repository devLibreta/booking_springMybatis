package com.toy.booking.repository;

import com.toy.booking.io.repository.MybatisRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class MybatisRepositoryTest {
    private final MybatisRepository mybatisRepository;

    @Autowired
    public MybatisRepositoryTest(MybatisRepository mybatisRepository) {
        this.mybatisRepository = mybatisRepository;
    }
    @Test
    @Transactional // 트랜젝셔널로 지정. 예외나 에러가 발생한 경우 db 입력값을 rollback해준다.
//    @Rollback(value = false) // 트랜젝셔널로 롤백하는 것을 막으려면 false로 설정해준다.
    public void selectAllTest(){
        System.out.println(mybatisRepository.selectRecordAll());
    }

}
