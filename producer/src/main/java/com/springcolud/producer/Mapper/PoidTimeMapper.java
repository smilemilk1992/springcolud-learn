package com.springcolud.producer.Mapper;

import com.springcolud.producer.Model.PoidTime;
import com.springcolud.producer.Model.PoidTimeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoidTimeMapper {
    int countByExample(PoidTimeExample example);

    int deleteByExample(PoidTimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoidTime record);

    int insertSelective(PoidTime record);

    List<PoidTime> selectByExample(PoidTimeExample example);

    PoidTime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoidTime record, @Param("example") PoidTimeExample example);

    int updateByExample(@Param("record") PoidTime record, @Param("example") PoidTimeExample example);

    int updateByPrimaryKeySelective(PoidTime record);

    int updateByPrimaryKey(PoidTime record);
}