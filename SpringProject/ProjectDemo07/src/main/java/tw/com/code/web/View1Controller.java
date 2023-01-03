package tw.com.code.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class View1Controller {

	
	//���w�V�A��������
	@RequestMapping("/get")
	public String getRedirect() {
		return "redirect:/other1";
	}
	//http://localhost:8080/ProjectDemo07/view ��o
	//http://localhost:8080/ProjectDemo07/other1 ���w�V
	@RequestMapping(value="/other1")
	public String getSuccess() {
		
		System.out.println("��o���\");
		return "success";
	}
	
}
