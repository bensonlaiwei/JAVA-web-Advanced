package tw.com.code.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;


/*
 * 網址: 虛擬目錄
 * 回傳:傳入方法傳入值
 * ModelAndView 是Model跟View都可以用
 * Model "主要用於請求域共享數據"
 * View 用於頁面進行轉跳
 * 
 * 
 */




@Controller
public class GetRextule {
	
	
	
	//ModelAndView回傳
	@RequestMapping(value="/get01")
	public ModelAndView getDemo01() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("key", "values");
		mv.setViewName("success");
		return mv;
	}
	
	
	//ModelAndView回傳
	@RequestMapping(value="/get03")
	public String getDemo03(Model model) {
		model.addAttribute("key", "value");
		return "success";
	}
	
	//Servlet回傳
	@RequestMapping(value="/get02")
	public String testServlet(HttpServletRequest req)
	{
		req.setAttribute("key", "values");
		return "success";
	}
	
	@RequestMapping(value="/map")
	public String testServlet(Map<String,String> map)
	{
		map.put("mapkey", "mapmapmap");
		return "success";
	}
	
	@RequestMapping(value="/mm")
	public String testModel(ModelMap mm)
	{
		mm.put("mm", "chockle");
		return "success";
	}


	
	
	
}
