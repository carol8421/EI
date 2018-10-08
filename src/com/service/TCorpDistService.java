package com.service;

import java.util.List;

import com.pojo.TCorp;
import com.pojo.TCorpDist;
import com.pojo.TCorpDistExample;

public interface TCorpDistService {
	public List<TCorpDist> list();

	public TCorpDist findTCorpById(String uuid);

	public void updateTCorp(TCorpDist items);

	public void deleteTCorp(String uuid);

	public List<TCorpDist> list(TCorpDistExample example);
	
	/*通过分公司的uuid查询公司的信息*/
	public List<TCorp>findtcorp(String uuid);
}
