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
	//�z�Lservlet api ���oRequestParam(�����h�ƭȪ��ɭԡA�|�����D�A���D�O�|�����)
	@RequestMapping("/ts1")
	public String test01(HttpServletRequest request) {
		
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String hobby = request.getParameter("hobby");
		System.out.println(name+":"+pass+":"+hobby);
		return "param";
	}
	
	//�z�LSpringMVC���oRequestParam
	@RequestMapping("/ts2")
	public String test02(String name, String pass, String[] hobby) {
		System.out.println(name+":"+pass);
		System.out.println(Arrays.toString(hobby));
		return "param";
	}
	
	//�z�LSpringMVC���oRequestParam�A��ǤJ�ѼƦW�٤��@��
	@RequestMapping("/ts3")
	public String test03(@RequestParam("username")String name, String pass, String[] hobby) {
		System.out.println(name+":"+pass);
		System.out.println(Arrays.toString(hobby));
		return "param";
	}
	
	//�z�LSpringMVC���oRequestParam�A��ǤJ�ѼƦW�٤��@�ˡArequired = true���ܤ@�w�n��Afalse�N���@�w�n��
	@RequestMapping("/ts4")
	public String test04(@RequestParam(value="username",required =false, defaultValue="username")String name, String pass, String[] hobby) {
		System.out.println(name);
		System.out.println(pass);
		System.out.println(Arrays.toString(hobby));
		return "param";
	}
	
	
	//�z�LSpringMVC ���o@RequestHeader(value,required,defaultValue)�A@CookieValue(value,required,defaultValue)
		@RequestMapping("/ts5")
		public String test05(@RequestParam(value="username",required =false, defaultValue="username")String name, String pass, String[] hobby) {
			System.out.println(name);
			System.out.println(pass);
			System.out.println(Arrays.toString(hobby));
			return "param";
		}
}
