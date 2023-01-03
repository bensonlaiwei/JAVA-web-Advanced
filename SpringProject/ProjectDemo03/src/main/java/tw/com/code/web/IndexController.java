package tw.com.code.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*
 * @GetMapping 搜尋
 * @PostMapping 新增
 * @PutMapping 更新
 * @DeleteMapping 刪除
 * 
 * 
 */



@Controller
public class IndexController {
	
	//PUT請求
	@PutMapping(value = "/testPutMapping")
	public String testPutMapping() {
		return "putmapping";
	}
	
	/*
	 * params= {"name","pass=123"} 限定密碼只能為123
	 * 
	 * params= {"name","pass!=123"} 除了123以外都可以登入
	 * 
	 */
	
	
	
	//POST請求
	@PostMapping(
			value = "/testPostMapping",
			params= {"name","pass!=123"}
			)
	public String testPostMapping() {
		return "postmapping";
	}
	
	
	
	//傳送GET請求
	@GetMapping("/testGetMapping")
	public String testGetMapping() {
		return "getmapping";
	}
	
	
	
	@RequestMapping(value="/",
			method= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT}
			,headers = {"Host=localhost:8080"})
	public String home() {
		return "index";
	}
}
