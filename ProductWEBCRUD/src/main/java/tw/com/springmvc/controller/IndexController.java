package tw.com.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.view.RedirectView;

import tw.com.springmvc.dao.ProductDao;
import tw.com.springmvc.entity.Product;

@Controller
public class IndexController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping(value = {"/","/index"})
	public String home(Model m) {
		List<Product> products =productDao.getProducts();
		m.addAttribute("products", products);
		return "index";
	}
	
	
	@RequestMapping(value = {"/add-product"})
	public String addProduct(Model m) {
		m.addAttribute("title", "Add Product");
		return "add_product";
	}
	
	
	@RequestMapping(value = {"/handle-product"},method=RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		productDao.CreateProduct(product);
		//轉發頁面
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	
	@RequestMapping(value = {"/delete/{id}"})
	public RedirectView deleteProduct(@PathVariable("id") int id
			, HttpServletRequest request) {
		this.productDao.deleteProduct(id);
		//轉發頁面
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	@RequestMapping(value = {"/update/{productId}"})
	public String updateForm(@PathVariable("productId") int pid
			, Model model) {
		Product product = this.productDao.getProduct(pid);
		model.addAttribute("product", product);
		
		return "update_form";
	}
	
}
