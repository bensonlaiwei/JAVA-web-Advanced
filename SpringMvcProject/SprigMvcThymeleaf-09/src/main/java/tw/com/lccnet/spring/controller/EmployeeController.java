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
	 * �w�]�������i��۰ʸ˰t�A�b�e���d��ǰt��bean
	 * ���B�Ȧ��@�Ӥǰt��Bean�ɡASpring�N��`�J@Autowired���ܼƤ�
	 */
	

	@Autowired //�۰ʪ`�J �O��IOC�e���޲z(IOC:�������)
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
