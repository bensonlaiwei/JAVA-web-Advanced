package tw.com.code.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RequestController {
	
	@GetMapping("/get01")
	public String getResueat01() {
		System.out.println("這是get請求-------------");
		return "getRequest";
	}

}
