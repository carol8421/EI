package com.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.TCorp;
import com.pojo.TCorpPertains;
import com.service.TCorpPertainsService;

@Controller
public class TCorpPertainsController {

	@Autowired
	private TCorpPertainsService tCorpPertainsService;

	@RequestMapping("/tcorppertainslist")
	public ModelAndView tCorpList(ModelAndView modelAndView) throws Exception {
		List<TCorpPertains> list = tCorpPertainsService.list();
		modelAndView.addObject("TCorpPertains", list);
		modelAndView.setViewName("TCorpPertains");
		return modelAndView;

	}

	/**
	 * springMvc中默认支持的参数类型:也就是说在controller方法中可以加入这些也可以不加, 加不加看自己需不需要,都行.
	 * HttpServletRequest HttpServletResponse HttpSession Model
	 */
	
	
	@RequestMapping("/tcorppertainsedit")
	public ModelAndView TCorpPertainsfind(String uuid, ModelAndView modelAndView) throws Exception {
		// 单个公司基本查询
		TCorpPertains items = tCorpPertainsService.findTCorpById(uuid);
		
		modelAndView.addObject("tcorppertains", items);
		modelAndView.setViewName("showTcorpPertain");
		return modelAndView;

	}
	// springMvc可以直接接收基本数据类型,包括string.spirngMvc可以帮你自动进行类型转换.
	// controller方法接收的参数的变量名称必须要等于页面上input框的name属性值
	// public String update(Integer id, String name, Float price, String detail)
	// throws Exception{

	// spirngMvc可以直接接收pojo类型:要求页面上input框的name属性名称必须等于pojo的属性名称
	@RequestMapping("/tcorppertainsupdate")
	public String update(TCorpPertains tcorpdist) throws Exception {
		tCorpPertainsService.updateTCorp(tcorpdist);
		return "success";
	}

//	//如果Controller中接收的是Vo,那么页面上input框的name属性值要等于vo的属性.属性.属性.....
//	@RequestMapping("/search")
//	public String search(QueryVo vo) throws Exception{
//		System.out.println(vo);
//		return "";
//	}
}
