package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.echarts.EchartsData;
import com.echarts.Links;
import com.echarts.Nodes;
import com.echarts.Piedata;
import com.pojo.TCorp;
import com.pojo.TCorpDist;
import com.pojo.TCorpPertains;
import com.pojo.TCorpStock;
import com.pojo.TMCorpCorpStock;
import com.service.TCorpDistService;
import com.service.TCorpService;
import com.service.TCorpStockService;

import net.sf.json.JSONObject;

@Controller
public class EchartsDisplayAction {

	@Autowired
	private TCorpService tCorpService;

	@Autowired
	private TCorpStockService tCorpStockService;
	
	@Autowired
	private TCorpDistService tCorpDistService;

	private static final long serialVersionUID = 1L;
	private EchartsData echartsData = new EchartsData();

	@RequestMapping("/echar")
	@ResponseBody
	public void itemEdit(HttpServletRequest reuqest, ModelAndView model, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/json;charset=utf-8");
		String uuid = reuqest.getParameter("uuid");
		System.out.println(uuid);
		TCorp items = tCorpService.findTCorpById(uuid);
		List<TCorpStock> stocklist = tCorpService.findtcorpstock(uuid);
		List<TCorpDist> disklist = tCorpService.findtcorpdisk(uuid);
		List<TCorpPertains> pertainslist = tCorpService.findtcorppertains(uuid);

		List<Nodes> nodes = new ArrayList<Nodes>();
		List<Links> links = new ArrayList<Links>();
		
		int id = 0;
		Nodes node1 = new Nodes();
		node1.setName(items.getCorpName());
		node1.setId(id);
		node1.setCategory(0);
		nodes.add(node1);
		
		Nodes node2 = new Nodes();
		Links link2 = new Links();
		node2.setName("股东");
		node2.setId(1);
		node2.setCategory(1);
		nodes.add(node2);
		link2.setName("股东");
		link2.setSource(1);
		link2.setTarget(0);
		links.add(link2);
		
		Nodes node3 = new Nodes();
		Links link3 = new Links();
		node3.setName("高管");
		node3.setId(2);
		node3.setCategory(2);
		nodes.add(node3);
		link3.setName("高管");
		link3.setSource(2);
		link3.setTarget(0);
		links.add(link3);
		
		Nodes node4 = new Nodes();
		Links link4 = new Links();
		node4.setName("分公司");
		node4.setId(3);
		node4.setCategory(3);
		nodes.add(node4);
		link4.setName("分公司");
		link4.setSource(3);
		link4.setTarget(0);
		links.add(link4);
		id=3;
		for (TCorpStock stock : stocklist) {
			id++;
			Nodes node = new Nodes();
			Links link = new Links();
			node.setName(stock.getStockName());
			node.setId(id);
			node.setCategory(1);
			link.setName("股东");
			link.setSource(id);
			link.setTarget(1);
			nodes.add(node);
			links.add(link);
		}
		for (TCorpDist disk : disklist) {
			id++;
			Nodes node = new Nodes();
			Links link = new Links();
			node.setName(disk.getDistName());
			node.setId(id);
			node.setCategory(3);
			link.setName("分公司");
			link.setSource(id);
			link.setTarget(3);
			nodes.add(node);
			links.add(link);
		}
		for (TCorpPertains per : pertainslist) {
			id++;
			Nodes node = new Nodes();
			Links link = new Links();
			node.setName(per.getPersonName());
			node.setId(id);
			node.setCategory(2);
			link.setName("高管");
			link.setSource(id);
			link.setTarget(2);
			nodes.add(node);
			links.add(link);
		}
		echartsData.setNodes(nodes);
		echartsData.setLinks(links);
		JSONObject obj = new JSONObject();// 最后传递的json
		obj.put("echartsData", echartsData);
		String jsonStr = obj.toString();
		response.getWriter().print(jsonStr);
		System.out.println(jsonStr);
		/* model.setViewName("test2"); */

	}

	@RequestMapping("/pie")
	@ResponseBody
	public void pieCharts(HttpServletRequest reuqest, ModelAndView model, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/json;charset=utf-8");
		String uuid = reuqest.getParameter("uuid");
		System.out.println(uuid);
		TCorp items = tCorpService.findTCorpById(uuid);
		List<TMCorpCorpStock> tccplist = tCorpService.findtcorpequity(uuid);
		JSONObject obj = new JSONObject();// 最后传递的json
		obj.put("name", items.getCorpName());
		List<Piedata> data = new ArrayList<Piedata>();
		for (TMCorpCorpStock tccp : tccplist) {
			Piedata pd = new Piedata();
			TCorpStock ts = tCorpStockService.findTCorpById(tccp.getSubUuid());
			pd.setName(ts.getStockName());
			pd.setEquity(tccp.getEquity().doubleValue());
			data.add(pd);
		}

		obj.put("data", data);
		String jsonStr = obj.toString();
		System.out.println(jsonStr);
		response.getWriter().print(jsonStr);
	}
	@RequestMapping("map")
	@ResponseBody
	public void mapchart(HttpServletRequest reuqest, ModelAndView model, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/json;charset=utf-8");
		String uuid = reuqest.getParameter("uuid");
		System.out.println(uuid);
		TCorp items = tCorpService.findTCorpById(uuid);
		List<TCorpDist> disklist = tCorpService.findtcorpdisk(uuid);
		JSONObject obj = new JSONObject();// 最后传递的json
		obj.put("name", items.getCorpName());
		List<Piedata> data = new ArrayList<Piedata>();
		int i=0;
		Piedata pd = new Piedata();
		for (TCorpDist tccp : disklist) {
			i++;
			
			pd.setName("江苏");
			pd.setEquity(i);
			
		}
		data.add(pd);
		obj.put("data", data);
		String jsonStr = obj.toString();
		System.out.println(jsonStr);
		response.getWriter().print(jsonStr);
	}

	public EchartsData getEchartsData() {
		return echartsData;
	}

	public void setEchartsData(EchartsData echartsData) {
		this.echartsData = echartsData;
	}



}
