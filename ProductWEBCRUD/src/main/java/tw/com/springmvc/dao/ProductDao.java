package tw.com.springmvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import tw.com.springmvc.entity.Product;

@Component
public class ProductDao {
	
	
	@Autowired //自動建立實體
	private HibernateTemplate hibernateTemplate;
	
	//新增
	@Transactional
	public void CreateProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	//取得全部資料
	public List<Product> getProducts(){
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}

	
	//刪除資料
	public void deleteProduct(Integer id) {
		Product p = this.hibernateTemplate.load(Product.class, id);
		this.hibernateTemplate.delete(p);
	}
	
	//取得單一一個Product
	@Transactional
	public Product getProduct(Integer id) {
		return this.hibernateTemplate.get(Product.class, id);
	}




}
