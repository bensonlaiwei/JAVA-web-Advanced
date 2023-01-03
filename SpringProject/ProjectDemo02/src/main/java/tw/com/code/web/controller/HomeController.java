package tw.com.code.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * �]�w���ܺ��}�ШD���|
 */


//@RequestMapping("/home")
@Controller
public class HomeController {
	
	@RequestMapping(value= {"/","index"},method=RequestMethod.GET)//�򥻽ШD��get�ШD
//	@RequestMapping("/home")//���ܺ��} http://localhost:8080/ProjectDemo02/home
//	@RequestMapping("/") //���}�W�� http://localhost:8080/ProjectDemo02/
	public String index() {
		
		return "index";//�o�e��/WEB-INF/views/index
	}
	
	//�n�i�H��GET��POST������
	@RequestMapping(value = "/about",method= {RequestMethod.GET,RequestMethod.POST})//�򥻽ШD��get�ШD
//	@RequestMapping("home/about")//���ܺ��} http://localhost:8080/ProjectDemo02/home/about
//	@RequestMapping("/about")//���}�W�� http://localhost:8080/ProjectDemo02/about
	public String about() {
		
		return "about";//�o�e��/WEB-INF/views/about
	}
	
	
}
