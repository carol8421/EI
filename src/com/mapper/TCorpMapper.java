package com.mapper;

import com.pojo.TCorp;
import com.pojo.TCorpDist;
import com.pojo.TCorpExample;
import com.pojo.TCorpPertains;
import com.pojo.TCorpStock;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCorpMapper {
    int countByExample(TCorpExample example);

    int deleteByExample(TCorpExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(TCorp record);

    int insertSelective(TCorp record);

    List<TCorp> selectByExample(TCorpExample example);

    TCorp selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") TCorp record, @Param("example") TCorpExample example);

    int updateByExample(@Param("record") TCorp record, @Param("example") TCorpExample example);

    int updateByPrimaryKeySelective(TCorp record);

    int updateByPrimaryKey(TCorp record);
    
   /* 通过公司的uuid 查询该公司所有的股东*/
    List<TCorpStock> findtcorpstock(String uuid);
   /* 通过公司uuid查询该公司的所有分公司*/
    List<TCorpDist> findtcorpdisk(String uuid);
    /* 通过公司uuid查询该公司的所有高管*/
    List<TCorpPertains> findtcorppertains(String uuid);
}