package tw.com.code.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManyController {
	
	//�h�ӽШD�������]�w
	@RequestMapping(name="apage", value= {"/a","/aa"})
	public String getA() {
		return "a";
		
	}
}
