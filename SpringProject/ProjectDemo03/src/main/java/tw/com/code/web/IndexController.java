package tw.com.code.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*
 * @GetMapping �j�M
 * @PostMapping �s�W
 * @PutMapping ��s
 * @DeleteMapping �R��
 * 
 * 
 */



@Controller
public class IndexController {
	
	//PUT�ШD
	@PutMapping(value = "/testPutMapping")
	public String testPutMapping() {
		return "putmapping";
	}
	
	/*
	 * params= {"name","pass=123"} ���w�K�X�u�ର123
	 * 
	 * params= {"name","pass!=123"} ���F123�H�~���i�H�n�J
	 * 
	 */
	
	
	
	//POST�ШD
	@PostMapping(
			value = "/testPostMapping",
			params= {"name","pass!=123"}
			)
	public String testPostMapping() {
		return "postmapping";
	}
	
	
	
	//�ǰeGET�ШD
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
