package tw.com.springmvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import tw.com.springmvc.entity.Product;

@Component
public class ProductDao {
	
	
	@Autowired //�۰ʫإ߹���
	private HibernateTemplate hibernateTemplate;
	
	//�s�W
	@Transactional
	public void CreateProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	//���o�������
	public List<Product> getProducts(){
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}

	
	//�R�����
	public void deleteProduct(Integer id) {
		Product p = this.hibernateTemplate.load(Product.class, id);
		this.hibernateTemplate.delete(p);
	}
	
	//���o��@�@��Product
	@Transactional
	public Product getProduct(Integer id) {
		return this.hibernateTemplate.get(Product.class, id);
	}




}
