package com.service;

import java.util.List;

import com.pojo.TCorp;
import com.pojo.TCorpPertains;
import com.pojo.TCorpPertainsExample;

public interface TCorpPertainsService {

	public List<TCorpPertains> list();

	public TCorpPertains findTCorpById(String uuid);

	public void updateTCorp(TCorpPertains items);

	public void deleteTCorp(String uuid);

	public List<TCorpPertains> list(TCorpPertainsExample example);
	
	/*通过高管的uuid查询公司的信息*/
	public List<TCorp>findtcorp(String uuid);
}
