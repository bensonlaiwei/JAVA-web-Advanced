package tw.com.lccnet.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value="/getsucc",method= {RequestMethod.POST,RequestMethod.GET})
	public String index(String uname, String pass) {
		System.out.println(uname);
		System.out.println(pass);
		
		return"success";
	}
	
	@RequestMapping(value="/p1",params= {"uname","pass"})
	public String page01() {
	
		return"success";
	}
}
