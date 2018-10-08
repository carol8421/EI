package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.pojo.TCorp;
import com.pojo.TCorpDist;
import com.pojo.TCorpPertains;
import com.pojo.TCorpStock;
import com.service.TCorpService;

/**
 * @author 18052
 *
 */
@Controller
public class MapController {

	@Autowired
	private TCorpService tCorpService;
	/*@Autowired
	private TCorpStockService tCorpStockService;
	@Autowired
	private TCorpDistService tCorpDistService;
	@Autowired
	private TCorpPertainsService tCorpPertainsService;

	@Autowired
	private TMCorpCorpStockMapper tmCorpCorpStockMapper;

	@Autowired
	private TMCorpCorpDistMapper tmCorpCorpDistMapper;

	@Autowired
	private TMCorpCorpPertainsMapper tmCorpCorpPertainsMapper;
*/
	@RequestMapping("/seletecorp")
	public ModelAndView tCorpList(String uuid, ModelAndView modelAndView) throws Exception {
		// 单个公司基本查询
		TCorp tCorp = new TCorp();
		tCorp = tCorpService.findTCorpById(uuid);
		modelAndView.addObject("tCorp", tCorp);
		modelAndView.setViewName("showTcorp");
		return modelAndView;

	}

	/**
	 * @param uuid
	 * @param modelAndView
	 * @return
	 * @throws Exception
	 */
	/**
	 * @param uuid
	 * @param modelAndView
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/seletecorpstock")
	public ModelAndView tCorpStockList(String uuid, ModelAndView modelAndView) throws Exception {
		// 单个公司的股东查询
		/*TMCorpCorpStockExample example = new TMCorpCorpStockExample();
		TMCorpCorpStockExample.Criteria criteria = example.createCriteria();
		criteria.andUuidEqualTo(uuid);

		List<TMCorpCorpStock> list = tmCorpCorpStockMapper.selectByExample(example);

		List<TCorpStock> list1 = new ArrayList<TCorpStock>();

		for (TMCorpCorpStock a : list) {

			list1.add(tCorpStockService.findTCorpById(a.getSubUuid()));
		}
*/
		List<TCorpStock> list1=tCorpService.findtcorpstock(uuid);
		modelAndView.addObject("tCorpStockList", list1);
		modelAndView.setViewName("showTcorpStocks");
		return modelAndView;

	}

	@RequestMapping("/seletecorpdisk")
	public ModelAndView tCorpdiskList(String uuid, ModelAndView modelAndView) throws Exception {
		// 单个公司的分公司查询
		/*TMCorpCorpDistExample example = new TMCorpCorpDistExample();
		TMCorpCorpDistExample.Criteria criteria = example.createCriteria();
		criteria.andUuidEqualTo(uuid);
		List<TMCorpCorpDist> list = tmCorpCorpDistMapper.selectByExample(example);

		List<TCorpDist> list1 = new ArrayList<TCorpDist>();

		for (TMCorpCorpDist a : list) {

			list1.add(tCorpDistService.findTCorpById(a.getSubUuid()));
		}*/
		List<TCorpDist> list1=tCorpService.findtcorpdisk(uuid);
		modelAndView.addObject("TCorpDisk", list1);
		modelAndView.setViewName("TCorpDiskList");
		return modelAndView;

	}

	@RequestMapping("/seletecorppertains")
	public ModelAndView tCorpdPertainsList(String uuid, ModelAndView modelAndView) throws Exception {
		// 单个公司的高管查询
		/*TMCorpCorpPertainsExample example = new TMCorpCorpPertainsExample();
		TMCorpCorpPertainsExample.Criteria criteria = example.createCriteria();
		criteria.andUuidEqualTo(uuid);
		List<TMCorpCorpPertains> list = tmCorpCorpPertainsMapper.selectByExample(example);

		List<TCorpPertains> list1 = new ArrayList<TCorpPertains>();
		for (TMCorpCorpPertains a : list) {
			list1.add(tCorpPertainsService.findTCorpById(a.getSubUuid()));
		}*/
		List<TCorpPertains> list1 = tCorpService.findtcorppertains(uuid);
		modelAndView.addObject("TCorpPertains", list1);
		modelAndView.setViewName("showTcorpPertains");
		return modelAndView;

	}
	@RequestMapping("/seletemenu")
	public ModelAndView tCorpMenu(String uuid, ModelAndView modelAndView) throws Exception {
		// 单个公司的高管查询
		
		TCorp tCorp = new TCorp();
		tCorp = tCorpService.findTCorpById(uuid);
		modelAndView.addObject("tCorp", tCorp);
		modelAndView.setViewName("menu");
		return modelAndView;

	}
}
