package tw.com.code.web;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	//透過servlet api 取得RequestParam(接受多數值的時候，會有問題，問題是會取單個)
	@RequestMapping("/ts1")
	public String test01(HttpServletRequest request) {
		
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String hobby = request.getParameter("hobby");
		System.out.println(name+":"+pass+":"+hobby);
		return "param";
	}
	
	//透過SpringMVC取得RequestParam
	@RequestMapping("/ts2")
	public String test02(String name, String pass, String[] hobby) {
		System.out.println(name+":"+pass);
		System.out.println(Arrays.toString(hobby));
		return "param";
	}
	
	//透過SpringMVC取得RequestParam，當傳入參數名稱不一樣
	@RequestMapping("/ts3")
	public String test03(@RequestParam("username")String name, String pass, String[] hobby) {
		System.out.println(name+":"+pass);
		System.out.println(Arrays.toString(hobby));
		return "param";
	}
	
	//透過SpringMVC取得RequestParam，當傳入參數名稱不一樣，required = true的話一定要填，false就不一定要填
	@RequestMapping("/ts4")
	public String test04(@RequestParam(value="username",required =false, defaultValue="username")String name, String pass, String[] hobby) {
		System.out.println(name);
		System.out.println(pass);
		System.out.println(Arrays.toString(hobby));
		return "param";
	}
	
	
	//透過SpringMVC 取得@RequestHeader(value,required,defaultValue)，@CookieValue(value,required,defaultValue)
		@RequestMapping("/ts5")
		public String test05(@RequestParam(value="username",required =false, defaultValue="username")String name, String pass, String[] hobby) {
			System.out.println(name);
			System.out.println(pass);
			System.out.println(Arrays.toString(hobby));
			return "param";
		}
}
