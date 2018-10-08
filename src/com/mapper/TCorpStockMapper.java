package com.mapper;

import com.pojo.TCorp;
import com.pojo.TCorpStock;
import com.pojo.TCorpStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCorpStockMapper {
    int countByExample(TCorpStockExample example);

    int deleteByExample(TCorpStockExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(TCorpStock record);

    int insertSelective(TCorpStock record);

    List<TCorpStock> selectByExample(TCorpStockExample example);

    TCorpStock selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") TCorpStock record, @Param("example") TCorpStockExample example);

    int updateByExample(@Param("record") TCorpStock record, @Param("example") TCorpStockExample example);

    int updateByPrimaryKeySelective(TCorpStock record);

    int updateByPrimaryKey(TCorpStock record);
    
    /*通过股东的uuid 查询投资的公司*/
    List<TCorp>findtcorp(String uuid);
}