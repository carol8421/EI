package com.service;

import java.util.List;

import com.pojo.TCorp;
import com.pojo.TCorpDist;
import com.pojo.TCorpExample;
import com.pojo.TCorpPertains;
import com.pojo.TCorpStock;
import com.pojo.TMCorpCorpStock;

public interface TCorpService {

	public List<TCorp> list();

	public TCorp findTCorpById(String uuid);

	public void updateTCorp(TCorp items);

	public void deleteTCorp(String uuid);

	public List<TCorp> list(TCorpExample example);
	/*查询单个公司的股东详情*/
	public List<TCorpStock> findtcorpstock(String uuid);
	
	/*查询单个公司的分公司详情*/
	public List<TCorpDist> findtcorpdisk(String uuid);
	
	/*查询单个公司的高管详情*/
	public List<TCorpPertains> findtcorppertains(String uuid);
	
	/*查询单个公司的股权详情*/
	public List<TMCorpCorpStock> findtcorpequity(String uuid);

}
