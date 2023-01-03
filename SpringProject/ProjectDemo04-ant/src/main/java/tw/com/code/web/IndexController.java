package tw.com.code.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * ant的風格
 * 1.? : 任何單個字母
 * 2.* : 表示任何0個字母或多個字母
 * 3.**: 表示任何一層或是多層目錄
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
	
//	很常使用
	@RequestMapping(value="/succ/{id}/{name}")
	public String getMethod(@PathVariable("id")String id,@PathVariable("name")String name) {
		System.out.println(id);
		System.out.println(name);
		return "success";
	}
	
	
	
}
