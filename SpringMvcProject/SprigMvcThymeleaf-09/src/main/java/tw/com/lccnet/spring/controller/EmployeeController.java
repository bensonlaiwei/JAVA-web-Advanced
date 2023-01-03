package tw.com.lccnet.spring.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tw.com.lccnet.spring.bean.Employee;
import tw.com.lccnet.spring.dao.EmployeeDao;

@Controller
public class EmployeeController {
	
	/*
	 * 預設案類型進行自動裝配，在容器查找匹配的bean
	 * 當有且僅有一個匹配的Bean時，Spring將其注入@Autowired的變數中
	 */
	

	@Autowired //自動注入 是由IOC容器管理(IOC:控制反轉)
	private EmployeeDao employeeDao;
	
	
	@RequestMapping(value="/employee",method = RequestMethod.GET)
	public String getAll(Model model) {
		Collection<Employee> employeelist =  employeeDao.getAll();
		model.addAttribute("employeelist", employeelist);
		System.out.println("output");
		System.out.println(employeelist); 
		
		return "employeelist";
		
	
	}
	
	
	
	
	
	
	
	
}
