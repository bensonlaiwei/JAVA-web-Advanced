package tw.com.code.web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	

	/*
	 * 建議用ModelAndView
	 * 
	 */
	
	@RequestMapping(value="/map")
	public String getMapModel(ModelMap map) {
		map.addAttribute("key", "value");
		return "success";
	}
	
	/*
	 * session
	 * 
	 */
	
	@RequestMapping(value="/sess")
	public String getSession(HttpSession session) {
		session.setAttribute("session", "hello session");
		return "success";
	}
	
	/*
	 * application
	 * 共享數據
	 */
	@RequestMapping(value="/application")
	public String getApplication(HttpSession session) {
		ServletContext context = session.getServletContext();
		context.setAttribute("context", "context");
		return "success";
	}
	
}
