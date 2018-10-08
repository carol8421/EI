package com.mapper;

import com.pojo.TCorp;
import com.pojo.TCorpDist;
import com.pojo.TCorpDistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCorpDistMapper {
    int countByExample(TCorpDistExample example);

    int deleteByExample(TCorpDistExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(TCorpDist record);

    int insertSelective(TCorpDist record);

    List<TCorpDist> selectByExample(TCorpDistExample example);

    TCorpDist selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") TCorpDist record, @Param("example") TCorpDistExample example);

    int updateByExample(@Param("record") TCorpDist record, @Param("example") TCorpDistExample example);

    int updateByPrimaryKeySelective(TCorpDist record);

    int updateByPrimaryKey(TCorpDist record);
    
    /*通过分公司的uuid 查询投资的公司*/
    List<TCorp>findtcorp(String uuid);
}