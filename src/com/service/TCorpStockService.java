package com.service;

import java.util.List;

import com.pojo.TCorp;
import com.pojo.TCorpStock;
import com.pojo.TCorpStockExample;

public interface TCorpStockService {

	public List<TCorpStock> list();

	public TCorpStock findTCorpById(String uuid);

	public void updateTCorp(TCorpStock items);

	public void deleteTCorp(String uuid);

	public List<TCorpStock> list(TCorpStockExample example);
	
	/*通过股东的uuid查询公司的信息*/
	public List<TCorp>findtcorp(String uuid);
}
