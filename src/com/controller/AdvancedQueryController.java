package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.TCorp;
import com.pojo.TCorpDist;
import com.pojo.TCorpDistExample;
import com.pojo.TCorpExample;
import com.pojo.TCorpPertains;
import com.pojo.TCorpPertainsExample;
import com.pojo.TCorpStock;
import com.pojo.TCorpStockExample;
import com.service.TCorpDistService;
import com.service.TCorpPertainsService;
import com.service.TCorpService;
import com.service.TCorpStockService;

/**
 * @author 18052
 *
 */
@Controller
public class AdvancedQueryController {

	@Autowired
	private TCorpService tCorpService; // 公司基本信息
	@Autowired
	private TCorpDistService tCorpDistService; // 分公司 分支机构信息表
	@Autowired
	private TCorpPertainsService tCorpPertainsService; // 公司主要人员
	@Autowired
	private TCorpStockService tCorpStockService; // 股东 发起人信息表

	@RequestMapping("/seletetcorp")
	public ModelAndView tCorpList(ModelAndView modelAndView, HttpServletRequest reuqest) throws Exception {
		// 公司基本查询
		String CORP_NAME = reuqest.getParameter("searchPlaceholder");
		String BELONG_DIST_ORG = reuqest.getParameter("province");
		String BELONG_TRADE = reuqest.getParameter("vocation");
		/*int REG_CAPI = Integer.parseInt(reuqest.getParameter("money"));
		String time = reuqest.getParameter("time");
		String time2 = reuqest.getParameter("time2");
		Date time=new Date(reuqest.getParameter("time"));
		Date time2=new Date(reuqest.getParameter("time2"));
		String CORP_STATUS = reuqest.getParameter("state");
		System.out.println(BELONG_DIST_ORG);*/
		TCorpExample example = new TCorpExample();
		TCorpExample.Criteria criteria1 = example.createCriteria();
		criteria1.andCorpNameLike("%" + CORP_NAME + "%");
		/*if (!(BELONG_DIST_ORG.isEmpty() || BELONG_DIST_ORG == null))
			criteria1.andBelongDistOrgLike(BELONG_DIST_ORG);
		if (!(BELONG_TRADE.isEmpty() || BELONG_TRADE == null))
			criteria1.andBelongTradeLike("%" + BELONG_TRADE + "%");*/
		/*if ((!(time.isEmpty() || time == null)) && (!(time2.isEmpty() || time2 == null)))
			criteria1.andStartDateBetween(time, time2);
		if (!(REG_CAPI == 0||))
			criteria1.andRegCapiEqualTo(REG_CAPI);
		 criteria1.andCorpStatusLike(CORP_STATUS);*/

		List<TCorp> list = tCorpService.list(example);
		modelAndView.addObject("tcorpList", list);
		modelAndView.setViewName("TCorpList");

		return modelAndView;

	}

	@RequestMapping("/seletetcorpstock")
	public ModelAndView tcorpstocklist(ModelAndView modelAndView, HttpServletRequest reuqest) throws Exception {
		// 股东基本信息查询
		String STOCK_NAME = reuqest.getParameter("searchPlaceholder");
		String COUNTRY = reuqest.getParameter("nation");
		/*int REG_CAPI=Integer.parseInt(reuqest.getParameter("money"));
		String STOCK_TYPE = reuqest.getParameter("STOCK_TYPE");
		String time2=reuqest.getParameter("time2");*/
		TCorpStockExample example = new TCorpStockExample();
		TCorpStockExample.Criteria criteria = example.createCriteria();
		if (!(STOCK_NAME.isEmpty() || STOCK_NAME == null))
			criteria.andStockNameLike("%" + STOCK_NAME + "%");
		/*if (!(COUNTRY.isEmpty() || COUNTRY == null))
			criteria.andCountryLike("%" + COUNTRY + "%");
		if (!(STOCK_TYPE.isEmpty() || STOCK_TYPE == null))
			criteria.andStockTypeLike("%" + STOCK_TYPE + "%");*/
		List<TCorpStock> list = tCorpStockService.list(example);
		modelAndView.addObject("tCorpStockList", list);
		modelAndView.setViewName("TCorpStockList");

		return modelAndView;
	}
	@RequestMapping("/seletetcorpdisk")
	public ModelAndView tcorpdistlist(ModelAndView modelAndView, HttpServletRequest reuqest) throws Exception {
		// 分公司 分支结构
		String DIST_NAME = reuqest.getParameter("searchPlaceholder");
		/*String BELONG_DIST_ORG = reuqest.getParameter("province");
		String BELONG_TRADE = reuqest.getParameter("vocation");
		int REG_CAPI = Integer.parseInt(reuqest.getParameter("money"));
		String time = reuqest.getParameter("time");
		String time2 = reuqest.getParameter("time2");
		Date time=new Date(reuqest.getParameter("time"));
		Date time2=new Date(reuqest.getParameter("time2"));
		String CORP_STATUS = reuqest.getParameter("state");
		System.out.println(BELONG_DIST_ORG);*/
		TCorpDistExample example = new TCorpDistExample();
		TCorpDistExample.Criteria criteria1 = example.createCriteria();
		criteria1.andDistNameLike("%"+DIST_NAME+"%");
		/*criteria1.andBelongDistOrgLike(BELONG_DIST_ORG);
		criteria1.andBelongTradeLike(BELONG_TRADE);
		criteria1.andStartDateBetween(time, time2);
		criteria1.andRegCapiEqualTo(REG_CAPI);
		criteria1.andCorpStatusLike(CORP_STATUS);*/

		List<TCorpDist> list = tCorpDistService.list(example);
		modelAndView.addObject("TCorpStock", list);
		modelAndView.setViewName("CorpDist");

		return modelAndView;

	}

	@RequestMapping("/seletetcorppertains")
	public ModelAndView tcorppertainslist(ModelAndView modelAndView, HttpServletRequest reuqest) throws Exception {
		// 公司主要成员
		String NAME = reuqest.getParameter("searchPlaceholder");
		/*String PERSON_TYPE = reuqest.getParameter("duty");
		String SEX = reuqest.getParameter("sex");
		int REG_CAPI=Integer.parseInt(reuqest.getParameter("money"));
		String time2=reuqest.getParameter("time2");*/
		TCorpPertainsExample example = new TCorpPertainsExample();
		TCorpPertainsExample.Criteria criteria = example.createCriteria();
		if (!(NAME.isEmpty() || NAME == null))
			criteria.andPersonNameLike("%" + NAME + "%");
		/*if (!(PERSON_TYPE.isEmpty() || PERSON_TYPE == null))
			criteria.andPersonTypeLike("%" + PERSON_TYPE + "%");
		if (!(SEX.isEmpty() || SEX == null))
			criteria.andSexLike("%" + SEX + "%");*/
		List<TCorpPertains> list = tCorpPertainsService.list(example);
		modelAndView.addObject("TCorpPertains", list);
		modelAndView.setViewName("TCorpPertains");

		return modelAndView;

	}

	@RequestMapping("/AdvancedQuery")
	public ModelAndView panduan(ModelAndView modelAndView, HttpServletRequest reuqest) {
		System.out.println("success");
		String select_value = reuqest.getParameter("select_value");
		System.out.println(select_value);
		switch (select_value) {
		case "公司":
			try {
				tCorpList(modelAndView, reuqest);
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} finally {

			}
			return modelAndView;
		case "股东":
			try {
				tcorpstocklist(modelAndView, reuqest);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

			}

			return modelAndView;
		case "高管":
			try {
				tcorppertainslist(modelAndView, reuqest);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

			}

			return modelAndView;
		case "TCorpPertains":
			try {
				tcorppertainslist(modelAndView, reuqest);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

			}

			return modelAndView;
		default:
			return modelAndView;
		}

	}
}
