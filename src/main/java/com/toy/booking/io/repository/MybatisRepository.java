package com.toy.booking.io.repository;

import com.toy.booking.io.entity.RecordEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MybatisRepository {

    @Select("SELECT * FROM RECORD")
    public List<RecordEntity> selectRecordAll();

    @Insert("INSERT INTO RECORD " +
            "(recordType, recordTitle, recordDetail, recordPrice, regDate," +
            " modDate, paymentMethod)" +
            " values( #{recordType}, #{recordTitle},#{recordDetail},#{recordPrice},#{regDate}," +
            " #{modDate},#{paymentMethod} )"
    )
    @Options(useGeneratedKeys = true, keyProperty = "recordId")
    public void insertRecord(RecordEntity recordEntity);

    @Update("UPDATE RECORD SET recordType= #{recordType}, recordTitle=#{recordTitle}," +
            " recordDetail=#{recordDetail}, recordPrice=#{recordPrice}," +
            " modDate=#{modDate}, paymentMethod= #{paymentMethod}" +
            " WHERE recordId = #{recordId};"+
            " COMMIT;")
    public void updateRecord(RecordEntity recordEntity);

    @Delete("DELETE FROM RECORD WHERE recordId = #{rno}")
    public void deleteById(Long rno);

    @Select("SELECT * FROM RECORD WHERE recordId = #{rno} ")
    public RecordEntity selectByID(Long rno);

//    @Select("SELECT * FROM SUMMARY-RECORD")
//    public SummaryEntity selectSummary();
}
