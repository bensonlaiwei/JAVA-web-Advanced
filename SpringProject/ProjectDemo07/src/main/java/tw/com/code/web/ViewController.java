package tw.com.code.web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	
	//forward屬於內部轉法
	//http://localhost:8080/ProjectDemo07/view
	@RequestMapping(value="/view")
	public String getforward() {
		return "forward:/other";
	}
	
	@RequestMapping(value="/other")
	public String getSuccess() {
		
		System.out.println("轉發成功");
		return "success";
	}
}
