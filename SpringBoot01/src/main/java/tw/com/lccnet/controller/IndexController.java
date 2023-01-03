package tw.com.lccnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@ResponseBody//將回傳的文字，在網頁中顯示
	@RequestMapping("/")
	public String home() {
		return "this is spring boot web home page";
	}

}
