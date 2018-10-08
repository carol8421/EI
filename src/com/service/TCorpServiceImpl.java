package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mapper.TCorpMapper;
import com.mapper.TMCorpCorpStockMapper;
import com.pojo.TCorp;
import com.pojo.TCorpDist;
import com.pojo.TCorpExample;
import com.pojo.TCorpPertains;
import com.pojo.TCorpStock;
import com.pojo.TMCorpCorpStock;
import com.pojo.TMCorpCorpStockExample;

@Service
public class TCorpServiceImpl implements TCorpService {
	// 企业基本信息表service
	@Autowired
	private TCorpMapper tCorpMapper;
	
	@Autowired
	private TMCorpCorpStockMapper tMCorpCorpStockMapper;

	@Override
	public List<TCorp> list() {
		// 如果不需要任何查询条件,直接将example对象new出来即可
		TCorpExample example = new TCorpExample();
		List<TCorp> list = tCorpMapper.selectByExample(example);
		return list;
	}

	@Override
	public TCorp findTCorpById(String uuid) {
		TCorp user = tCorpMapper.selectByPrimaryKey(uuid);
		return user;
	}

	@Override
	public void updateTCorp(TCorp items) {
		tCorpMapper.updateByPrimaryKeySelective(items);
	}

	@Override
	public void deleteTCorp(String uuid) {
		// TODO 自动生成的方法存根
		tCorpMapper.deleteByPrimaryKey(uuid);
	}

	@Override
	public List<TCorp> list(TCorpExample example) {
		// TODO 自动生成的方法存根

		List<TCorp> list = tCorpMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<TCorpStock> findtcorpstock(String uuid) {
		// TODO 自动生成的方法存根
		List<TCorpStock> list = tCorpMapper.findtcorpstock(uuid);
		return list;
		}

	@Override
	public List<TCorpDist> findtcorpdisk(String uuid) {
		// TODO 自动生成的方法存根
		List<TCorpDist> list = tCorpMapper.findtcorpdisk(uuid);
		return list;
	}

	@Override
	public List<TCorpPertains> findtcorppertains(String uuid) {
		// TODO 自动生成的方法存根
		List<TCorpPertains> list = tCorpMapper.findtcorppertains(uuid);
		return list;
	}

	@Override
	public List<TMCorpCorpStock> findtcorpequity(String uuid) {
		// TODO 自动生成的方法存根
		TMCorpCorpStockExample tm=new TMCorpCorpStockExample();
		TMCorpCorpStockExample.Criteria criteria = tm.createCriteria();
		criteria.andUuidEqualTo(uuid);
		List<TMCorpCorpStock> list = tMCorpCorpStockMapper.selectByExample(tm);
		return list;
	}

}
