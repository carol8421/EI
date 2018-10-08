package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mapper.TCorpDistMapper;
import com.pojo.TCorp;
import com.pojo.TCorpDist;
import com.pojo.TCorpDistExample;

@Service
public class TCorpDistServiceImp implements TCorpDistService {
	@Autowired
	private TCorpDistMapper tCorpDistMapper;

	@Override
	public List<TCorpDist> list() {
		// TODO 自动生成的方法存根
		// 如果不需要任何查询条件,直接将example对象new出来即可
		TCorpDistExample example = new TCorpDistExample();
		List<TCorpDist> list = tCorpDistMapper.selectByExample(example);
		return list;

	}

	@Override
	public void updateTCorp(TCorpDist items) {
		// TODO 自动生成的方法存根
		tCorpDistMapper.updateByPrimaryKeySelective(items);
	}

	@Override
	public void deleteTCorp(String uuid) {
		// TODO 自动生成的方法存根
		tCorpDistMapper.deleteByPrimaryKey(uuid);
	}

	@Override
	public List<TCorpDist> list(TCorpDistExample example) {
		// TODO 自动生成的方法存根
		List<TCorpDist> list = tCorpDistMapper.selectByExample(example);
		return list;
	}

	@Override
	public TCorpDist findTCorpById(String uuid) {
		// TODO 自动生成的方法存根
		TCorpDist user = tCorpDistMapper.selectByPrimaryKey(uuid);
		return user;
	}

	@Override
	public List<TCorp> findtcorp(String uuid) {
		// TODO 自动生成的方法存根
		List<TCorp> user = tCorpDistMapper.findtcorp(uuid);
		return user;
	}

}
