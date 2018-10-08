package com.mapper;

import com.pojo.TMCorpCorpPertains;
import com.pojo.TMCorpCorpPertainsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMCorpCorpPertainsMapper {
    int countByExample(TMCorpCorpPertainsExample example);

    int deleteByExample(TMCorpCorpPertainsExample example);

    int insert(TMCorpCorpPertains record);

    int insertSelective(TMCorpCorpPertains record);

    List<TMCorpCorpPertains> selectByExample(TMCorpCorpPertainsExample example);

    int updateByExampleSelective(@Param("record") TMCorpCorpPertains record, @Param("example") TMCorpCorpPertainsExample example);

    int updateByExample(@Param("record") TMCorpCorpPertains record, @Param("example") TMCorpCorpPertainsExample example);
}