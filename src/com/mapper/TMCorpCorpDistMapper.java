package com.mapper;

import com.pojo.TMCorpCorpDist;
import com.pojo.TMCorpCorpDistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMCorpCorpDistMapper {
    int countByExample(TMCorpCorpDistExample example);

    int deleteByExample(TMCorpCorpDistExample example);

    int insert(TMCorpCorpDist record);

    int insertSelective(TMCorpCorpDist record);

    List<TMCorpCorpDist> selectByExample(TMCorpCorpDistExample example);

    int updateByExampleSelective(@Param("record") TMCorpCorpDist record, @Param("example") TMCorpCorpDistExample example);

    int updateByExample(@Param("record") TMCorpCorpDist record, @Param("example") TMCorpCorpDistExample example);
}