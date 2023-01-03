package tw.com.code.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * ant������
 * 1.? : �����Ӧr��
 * 2.* : ��ܥ���0�Ӧr���Φh�Ӧr��
 * 3.**: ��ܥ���@�h�άO�h�h�ؿ�
 * 
 * 
 */


@Controller
public class IndexController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String Home() {
		return "index";
		
	}
	
	@RequestMapping(value="/a?a/testant")
	public String homeAnt() {
		return "success";
	}
	
	@RequestMapping(value="/a*/testant1")
	public String homeAnt1() {
		return "success";
	}
	
	@RequestMapping(value="**/testant2")
	public String homeAnt2() {
		return "success";
	}
	
//	�ܱ`�ϥ�
	@RequestMapping(value="/succ/{id}/{name}")
	public String getMethod(@PathVariable("id")String id,@PathVariable("name")String name) {
		System.out.println(id);
		System.out.println(name);
		return "success";
	}
	
	
	
}
