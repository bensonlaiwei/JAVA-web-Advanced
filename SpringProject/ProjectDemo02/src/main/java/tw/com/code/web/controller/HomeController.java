package tw.com.code.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * 設定改變網址請求路徑
 */


//@RequestMapping("/home")
@Controller
public class HomeController {
	
	@RequestMapping(value= {"/","index"},method=RequestMethod.GET)//基本請求為get請求
//	@RequestMapping("/home")//改變網址 http://localhost:8080/ProjectDemo02/home
//	@RequestMapping("/") //網址名稱 http://localhost:8080/ProjectDemo02/
	public String index() {
		
		return "index";//發送至/WEB-INF/views/index
	}
	
	//要可以對GET跟POST都接受
	@RequestMapping(value = "/about",method= {RequestMethod.GET,RequestMethod.POST})//基本請求為get請求
//	@RequestMapping("home/about")//改變網址 http://localhost:8080/ProjectDemo02/home/about
//	@RequestMapping("/about")//網址名稱 http://localhost:8080/ProjectDemo02/about
	public String about() {
		
		return "about";//發送至/WEB-INF/views/about
	}
	
	
}
