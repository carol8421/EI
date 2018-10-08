package com.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.pojo.TCorpDist;
import com.service.TCorpDistService;

@Controller
public class TCorpDistController {

	@Autowired
	private TCorpDistService tCorpDistService;

	@RequestMapping("/tcorpdistlist")
	public ModelAndView tCorpList(ModelAndView modelAndView) throws Exception {
		List<TCorpDist> list = tCorpDistService.list();
		modelAndView.addObject("tcorpdistlist", list);
		modelAndView.setViewName("TCorpDistList");
		return modelAndView;

	}

	/**
	 * springMvc中默认支持的参数类型:也就是说在controller方法中可以加入这些也可以不加, 加不加看自己需不需要,都行.
	 * HttpServletRequest HttpServletResponse HttpSession Model
	 */
	@RequestMapping("/tcorpdistedit")
	public String itemEdit(HttpServletRequest reuqest, Model model) throws Exception {
		String uuid = reuqest.getParameter("uuid");
		TCorpDist items = tCorpDistService.findTCorpById(uuid);
		// Model模型:模型中放入了返回给页面的数据
		// model底层其实就是用的request域来传递数据,但是对request域进行了扩展.
		model.addAttribute("item", items);
		// 如果springMvc方法返回一个简单的string字符串,那么springMvc就会认为这个字符串就是页面的名称
		return "TCorpDistEdit";
	}

	// springMvc可以直接接收基本数据类型,包括string.spirngMvc可以帮你自动进行类型转换.
	// controller方法接收的参数的变量名称必须要等于页面上input框的name属性值
	// public String update(Integer id, String name, Float price, String detail)
	// throws Exception{

	// spirngMvc可以直接接收pojo类型:要求页面上input框的name属性名称必须等于pojo的属性名称
	@RequestMapping("/tcorpdistupdate")
	public String update(TCorpDist tcorpdist) throws Exception {
		tCorpDistService.updateTCorp(tcorpdist);
		return "success";
	}

//	//如果Controller中接收的是Vo,那么页面上input框的name属性值要等于vo的属性.属性.属性.....
//	@RequestMapping("/search")
//	public String search(QueryVo vo) throws Exception{
//		System.out.println(vo);
//		return "";
//	}
}
