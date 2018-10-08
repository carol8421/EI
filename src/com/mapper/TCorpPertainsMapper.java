package com.mapper;

import com.pojo.TCorp;
import com.pojo.TCorpPertains;
import com.pojo.TCorpPertainsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCorpPertainsMapper {
    int countByExample(TCorpPertainsExample example);

    int deleteByExample(TCorpPertainsExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(TCorpPertains record);

    int insertSelective(TCorpPertains record);

    List<TCorpPertains> selectByExample(TCorpPertainsExample example);

    TCorpPertains selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") TCorpPertains record, @Param("example") TCorpPertainsExample example);

    int updateByExample(@Param("record") TCorpPertains record, @Param("example") TCorpPertainsExample example);

    int updateByPrimaryKeySelective(TCorpPertains record);

    int updateByPrimaryKey(TCorpPertains record);
    
    /*通过高管的uuid 查询投资的公司*/
    List<TCorp>findtcorp(String uuid);
}