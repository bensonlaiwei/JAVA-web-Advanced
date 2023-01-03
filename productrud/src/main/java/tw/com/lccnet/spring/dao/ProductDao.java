package tw.com.lccnet.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import tw.com.lccnet.spring.model.Product;

@Component
public class ProductDao {
	
	
	/*
	 * @Transactional 隞�銵券������澈�����
	 * 
	 * 
	 */
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//�憓�
	@Transactional 
	public void createProduct(Product product) {
		System.out.println("add");
		this.hibernateTemplate.save(product);
		
	}
	
	
	//�閰
	public List<Product> getProducts() {
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	//��
	@Transactional 
	public void deleteProduct(int id) {
		
		Product p = this.hibernateTemplate.load(Product.class,id);
		this.hibernateTemplate.delete(p);
	}
	
	//���底蝝�
	public Product getProduct(int id) {
		return this.hibernateTemplate.get(Product.class, id);
	}
}
