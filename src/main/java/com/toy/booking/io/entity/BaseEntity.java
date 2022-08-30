package com.toy.booking.io.entity;

import lombok.Getter;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EntityListeners;
//import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

//@MappedSuperclass // 해당 어노테이션이 적용한 클래스는 테이블을 생성하지 않는다.
//@EntityListeners(value={AuditingEntityListener.class}) // 인티티 객체가 생성/변경되는것을 감지한다.
@Getter
abstract class BaseEntity {

//    @CreatedDate
//    @Column(name = "regDate", updatable = false) // update 시 변경되지 않는다
    private LocalDateTime redDate;

//    @LastModifiedDate
//    @Column(name = "modDate")
    private LocalDateTime modDate;
}
