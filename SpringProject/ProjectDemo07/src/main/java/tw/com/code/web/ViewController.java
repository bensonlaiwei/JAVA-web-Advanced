package tw.com.code.web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	
	//forward�ݩ󤺳���k
	//http://localhost:8080/ProjectDemo07/view
	@RequestMapping(value="/view")
	public String getforward() {
		return "forward:/other";
	}
	
	@RequestMapping(value="/other")
	public String getSuccess() {
		
		System.out.println("��o���\");
		return "success";
	}
}
