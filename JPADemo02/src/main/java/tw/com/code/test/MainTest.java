package tw.com.code.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Test;

import tw.com.code.entity.Customer;
import tw.com.code.entity.Order;

public class MainTest {
	
	@Test
	public void test04() {
	

		EntityManager em=JPAUtuils.getEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		//@NamedQuery
		Query query = em.createNamedQuery("test003").setParameter(1, 1);
		
		Customer customer = (Customer)query.getSingleResult();
		System.out.println("------------------------------------------------");
		System.out.println(customer);
		
		tx.commit();
		em.close();
		
		
		
	}
	
	
	
	@Test
	public void test03() {
	

		EntityManager em=JPAUtuils.getEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		
		//Query
		String jpql1 = "From Customer c where c.age>?1";
		Query query = em.createQuery(jpql1);
		
		query.setParameter(1, 1);
		
		List<Customer> list = query.getResultList();
		System.out.println("------------------------------------------------");
		System.out.println(list.size());
		
		
		tx.commit();
		em.close();
		
		
		
	}
	
	
	
	@Test
	public void test02() {

		EntityManager em=JPAUtuils.getEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		//@NamedQuery
		Query query = em.createNamedQuery("test001").setParameter(1, 1);
		
		Customer customer = (Customer)query.getSingleResult();
		System.out.println("------------------------------------------------");
		System.out.println(customer);
		

		tx.commit();
		em.close();
		
		
		
	}

	
//	@Test
	public void test01() {
		
		
		EntityManager em=JPAUtuils.getEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		Customer cus = new Customer();
		cus.setAge(10);
		cus.setEmail("123@gmail.com");
		cus.setName("Benson");
		
		Order order = new Order();
		order.setOname("AAA");
		
		
		Order order1 = new Order();
		order1.setOname("BBB");
		
		cus.getOrder().add(order);
		cus.getOrder().add(order1);
		
		em.persist(cus);
		em.persist(order);
		em.persist(order1);

		tx.commit();
		em.close();
		
	}

}
