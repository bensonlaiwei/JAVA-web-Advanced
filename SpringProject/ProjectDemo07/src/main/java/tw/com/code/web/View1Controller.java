package tw.com.code.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class View1Controller {

	
	//重定向，內部跳轉
	@RequestMapping("/get")
	public String getRedirect() {
		return "redirect:/other1";
	}
	//http://localhost:8080/ProjectDemo07/view 轉發
	//http://localhost:8080/ProjectDemo07/other1 重定向
	@RequestMapping(value="/other1")
	public String getSuccess() {
		
		System.out.println("轉發成功");
		return "success";
	}
	
}
