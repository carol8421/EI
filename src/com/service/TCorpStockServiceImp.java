package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mapper.TCorpStockMapper;
import com.pojo.TCorp;
import com.pojo.TCorpStock;
import com.pojo.TCorpStockExample;

@Service
public class TCorpStockServiceImp implements TCorpStockService {
	// 股东/发起人信息表
	@Autowired
	private TCorpStockMapper tCorpStockMapper;

	@Override
	public List<TCorpStock> list() {
		// TODO 自动生成的方法存根
		TCorpStockExample example = new TCorpStockExample();
		List<TCorpStock> list = tCorpStockMapper.selectByExample(example);
		return list;
	}

	@Override
	public TCorpStock findTCorpById(String uuid) {
		// TODO 自动生成的方法存根
		TCorpStock user = tCorpStockMapper.selectByPrimaryKey(uuid);
		return user;
	}

	@Override
	public void updateTCorp(TCorpStock items) {
		// TODO 自动生成的方法存根
		tCorpStockMapper.updateByPrimaryKeySelective(items);

	}

	@Override
	public void deleteTCorp(String uuid) {
		// TODO 自动生成的方法存根
		tCorpStockMapper.deleteByPrimaryKey(uuid);
	}

	@Override
	public List<TCorpStock> list(TCorpStockExample example) {
		// TODO 自动生成的方法存根
		List<TCorpStock> list = tCorpStockMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<TCorp> findtcorp(String uuid) {
		// TODO 自动生成的方法存根
		List<TCorp> list = tCorpStockMapper.findtcorp(uuid);
		return list;
	}

}
