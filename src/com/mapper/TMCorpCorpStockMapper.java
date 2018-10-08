package com.mapper;

import com.pojo.TMCorpCorpStock;
import com.pojo.TMCorpCorpStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMCorpCorpStockMapper {
    int countByExample(TMCorpCorpStockExample example);

    int deleteByExample(TMCorpCorpStockExample example);

    int insert(TMCorpCorpStock record);

    int insertSelective(TMCorpCorpStock record);

    List<TMCorpCorpStock> selectByExample(TMCorpCorpStockExample example);

    int updateByExampleSelective(@Param("record") TMCorpCorpStock record, @Param("example") TMCorpCorpStockExample example);

    int updateByExample(@Param("record") TMCorpCorpStock record, @Param("example") TMCorpCorpStockExample example);
}