package tw.code.jpa.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;



public class Main {
	
	@Test
	public void manyToOne() {
		String persistence_unit_name="JPADemo01";
		//建立工廠類
		EntityManagerFactory
		factory=Persistence.createEntityManagerFactory(persistence_unit_name);
		//建立管理類
		EntityManager manager=factory.createEntityManager();
		//開啟事務
		EntityTransaction transaction=manager.getTransaction();
		//進行動作
		transaction.begin();
		//操作持久類
		
		Customer customer=new Customer();
		customer.setName("Tom");
		customer.setEmail("tom@gmail.com");
		customer.setAge(30);
		

		Order order1=new Order();
		order1.setOname("電視");
		
		Order order2=new Order();
		order2.setOname("冰箱");
		
		order1.setCustomer(customer);
		order2.setCustomer(customer);
		
		//加入管理類
		manager.persist(customer);
		manager.persist(order1);
		manager.persist(order2);
		
		
		//提交事務
		transaction.commit();
		//關閉管理類
		manager.close();
		//關閉工廠類
		factory.close();
		}
		
	
	
	

	
	public void test01() {
	String persistence_unit_name="JPADemo01";
	//建立工廠類
	EntityManagerFactory
	factory=Persistence.createEntityManagerFactory(persistence_unit_name);
	//建立管理類
	EntityManager manager=factory.createEntityManager();
	//開啟事務
	EntityTransaction transaction=manager.getTransaction();
	//進行動作
	transaction.begin();
	//操作持久類
	Customer customer=new Customer();
	customer.setName("Tom");
	customer.setEmail("tom@gmail.com");
	customer.setAge(30);
	//加入管理類
	manager.persist(customer);
	//提交事務
	transaction.commit();
	//關閉管理類
	manager.close();
	//關閉工廠類
	factory.close();
	}
	
	
	
	public void test02() {
	String persistence_unit_name="JPADemo01";
	//建立工廠類
	EntityManagerFactory
	factory=Persistence.createEntityManagerFactory(persistence_unit_name);
	//建立管理類
	EntityManager manager=factory.createEntityManager();
	//開啟事務
	EntityTransaction transaction=manager.getTransaction();
	//進行動作
	transaction.begin();
	//操作持久類
	
	
	Order order=new Order();
	order.setOname("Demo01");
	order.setCustomer(new Customer());

	
	
	
	//加入管理類
	manager.persist(order);
	//提交事務
	transaction.commit();
	//關閉管理類
	manager.close();
	//關閉工廠類
	factory.close();
	}
}
