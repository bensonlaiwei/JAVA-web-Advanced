package tw.com.lccnet.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import tw.com.lccnet.spring.pojo.User;

@Controller
public class PojoController {
	
	@RequestMapping("/pojo")
	public String getPojo() {
		return "user";
	}
	
	@RequestMapping("/user")
	public String getPo(User user) {
		System.out.println(user);
		return "success";
	}
	
	@RequestMapping("/user1")
	public String getPo1(String username, String password, String email) {
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
		return "success";
	}
	
	@RequestMapping("/user2")
	public String getPo2(String username, String password, String email) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		System.out.println(user);
		return "success";
	}
}
