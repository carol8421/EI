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

import com.pojo.TCorp;
import com.pojo.TCorpDist;
import com.pojo.TCorpPertains;
import com.pojo.TCorpStock;
import com.service.TCorpService;

import net.sf.json.JSONObject;

@Controller
public class TCorpController {
	// 公司的action
	@Autowired
	private TCorpService tCorpService;

	@RequestMapping("/tcorplist")
	public ModelAndView tCorpList(ModelAndView modelAndView) throws Exception {
		List<TCorp> list = tCorpService.list();
		modelAndView.addObject("tcorpList", list);
		modelAndView.setViewName("TCorpList");
		return modelAndView;

	}

	/**
	 * springMvc中默认支持的参数类型:也就是说在controller方法中可以加入这些也可以不加, 加不加看自己需不需要,都行.
	 * HttpServletRequest HttpServletResponse HttpSession Model
	 */
	/*@RequestMapping("/tcorpedit")
	public String itemEdit(HttpServletRequest reuqest, Model model) throws Exception {

		String uuid = reuqest.getParameter("uuid");
		TCorp items = tCorpService.findTCorpById(uuid);
		JSONObject obj = JSONObject.fromObject(items);
		String jsonStr  = obj.toString();
		// Model模型:模型中放入了返回给页面的数据
		// model底层其实就是用的request域来传递数据,但是对request域进行了扩展.
		model.addAttribute("jsonStr", jsonStr);

		// 如果springMvc方法返回一个简单的string字符串,那么springMvc就会认为这个字符串就是页面的名称
		return "TcorpEdit";
	}*/
	@RequestMapping("/tcorpedit")
	@ResponseBody
	public void itemEdit(HttpServletRequest reuqest,HttpServletResponse response, ModelAndView model) throws Exception {
		response.setContentType("text/json;charset=utf-8");

		String uuid = "3292d6a15a8111e8bf911cb72c2a2f9a";
		TCorp items = tCorpService.findTCorpById(uuid);
		List<TCorpStock> stocklist=tCorpService.findtcorpstock(uuid);
		List<TCorpDist> disklist=tCorpService.findtcorpdisk(uuid);
		List<TCorpPertains> pertainslist= tCorpService.findtcorppertains(uuid);
		List< JSONObject> stocklistjson = new ArrayList< JSONObject>(); 
		List< JSONObject> disklistjson = new ArrayList< JSONObject>(); 
		List< JSONObject> pertainslistjson = new ArrayList< JSONObject>(); 
		for(TCorpStock stock:stocklist) {
			JSONObject job = new JSONObject();
			job.put("name", stock.getStockName());
			stocklistjson.add(job);
		}
		for(TCorpDist disk:disklist) {
			JSONObject job = new JSONObject();
			job.put("name", disk.getDistName());
			disklistjson.add(job);
		}
		for(TCorpPertains per:pertainslist) {
			JSONObject job = new JSONObject();
			job.put("name", per.getPersonName());
			pertainslistjson.add(job);
		}
		JSONObject obj =new JSONObject();//最后传递的json
		obj.put("name", items.getCorpName());
		obj.put("stocklistjson", stocklistjson);
		obj.put("disklistjson", disklistjson);
		obj.put("pertainslistjson", pertainslistjson);
		//JSONObject.fromObject(items);
		String jsonStr  = obj.toString();
		response.getWriter().print(jsonStr);
		System.out.println(jsonStr);  
		/*model.addObject("jsonStr", jsonStr);
		*/
		/*model.addObject("TCorpStock", stocklist);
		
		model.addObject("TCorpDisk", disklist);
		
		modelAndView.addObject("TCorpPertains", list1);
		*/
	}
	// springMvc可以直接接收基本数据类型,包括string.spirngMvc可以帮你自动进行类型转换.
	// controller方法接收的参数的变量名称必须要等于页面上input框的name属性值
	// public String update(Integer id, String name, Float price, String detail)
	// throws Exception{

	// spirngMvc可以直接接收pojo类型:要求页面上input框的name属性名称必须等于pojo的属性名称
	@RequestMapping("/tcorpupdate")
	public String update(TCorp tcorp) throws Exception {
		tCorpService.updateTCorp(tcorp);
		return "success";
	}

//	//如果Controller中接收的是Vo,那么页面上input框的name属性值要等于vo的属性.属性.属性.....
//	@RequestMapping("/search")
//	public String search(QueryVo vo) throws Exception{
//		System.out.println(vo);
//		return "";
//	}
}
