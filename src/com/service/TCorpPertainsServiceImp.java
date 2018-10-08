package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.TCorpPertainsMapper;
import com.pojo.TCorp;
import com.pojo.TCorpPertains;
import com.pojo.TCorpPertainsExample;

@Service
public class TCorpPertainsServiceImp implements TCorpPertainsService {

	@Autowired
	private TCorpPertainsMapper tCorpPertainsMapper;

	@Override
	public List<TCorpPertains> list() {
		// TODO 自动生成的方法存根
		// 如果不需要任何查询条件,直接将example对象new出来即可
		TCorpPertainsExample example = new TCorpPertainsExample();
		List<TCorpPertains> list = tCorpPertainsMapper.selectByExample(example);
		return list;
	}

	@Override
	public TCorpPertains findTCorpById(String uuid) {
		// TODO 自动生成的方法存根
		TCorpPertains user = tCorpPertainsMapper.selectByPrimaryKey(uuid);
		return user;
	}

	@Override
	public void updateTCorp(TCorpPertains items) {
		// TODO 自动生成的方法存根
		tCorpPertainsMapper.updateByPrimaryKeySelective(items);
	}

	@Override
	public void deleteTCorp(String uuid) {
		// TODO 自动生成的方法存根

		tCorpPertainsMapper.deleteByPrimaryKey(uuid);
	}

	@Override
	public List<TCorpPertains> list(TCorpPertainsExample example) {
		// TODO 自动生成的方法存根
		List<TCorpPertains> list = tCorpPertainsMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<TCorp> findtcorp(String uuid) {
		// TODO 自动生成的方法存根
		List<TCorp>user=tCorpPertainsMapper.findtcorp(uuid);
		return user;
	}

}
