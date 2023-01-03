package tw.com.code.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtherController {
	
	@RequestMapping("/product")
	public String other() {
		return "/demo01/product";//改變目錄結構，但網址不進行修改
	}
}
