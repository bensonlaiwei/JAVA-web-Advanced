package tw.com.code.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManyController {
	
	//多個請求的頁面設定
	@RequestMapping(name="apage", value= {"/a","/aa"})
	public String getA() {
		return "a";
		
	}
}
