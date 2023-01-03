package tw.com.lccnet.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import tw.com.lccnet.spring.dao.ProductDao;
import tw.com.lccnet.spring.model.Product;

@Controller
public class MainController {
	
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping(value={"/","/index"})
	public String home() {
		return "index";
	}
	
	@RequestMapping("/addproduct")
	public String addProduct(Model m) {
		System.out.println("���|���T");
		m.addAttribute("title", "�s�W���~");
		
		return "addProduct";
	}
	
	
	@RequestMapping(value="/header-product",method=RequestMethod.POST)
	public RedirectView headerProduct(@ModelAttribute Product prodict,
			HttpServletRequest request) {
		//�s�W
		productDao.createProduct(prodict);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		System.out.println("header-product");
		return redirectView;
	}

}
