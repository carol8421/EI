package com.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mapper.TCorpMapper;
import com.pojo.TCorp;
import com.pojo.TCorpExample;
import com.pojo.TCorpExample.Criteria;

public class TEST {

	private ApplicationContext applicatonContext;

	@Before
	public void setUp() throws Exception {
		String configLocation = "classpath:ApplicationContext.xml";
		applicatonContext = new ClassPathXmlApplicationContext(configLocation);
	}

	@Test
	public void testFindUserById() throws Exception {
		TCorpMapper userMapper = (TCorpMapper) applicatonContext.getBean("TCorpMapper");

		TCorp user = userMapper.selectByPrimaryKey("3292d6a15a8111e8bf911cb72c2a2f9a");
		System.out.println(user.toString());
	}

	@Test
	public void testCriteria() throws Exception {
		TCorpMapper userMapper = (TCorpMapper) applicatonContext.getBean("TCorpMapper");

		// 创建UserExample对象
		TCorpExample userExample = new TCorpExample();
		// 通过UserExample对象创建查询条件封装对象(Criteria中是封装的查询条件)
		Criteria createCriteria = userExample.createCriteria();

		// 加入查询条件
		createCriteria.andAddrLike("%南京市%");
//		createCriteria.andSexEqualTo("1");

		List<TCorp> list = userMapper.selectByExample(userExample);
		for (TCorp a : list)
			System.out.println(a);
	}
}
