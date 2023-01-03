package tw.com.jpa.entity;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.jupiter.api.Test;



public class Main{
	
	@Test
	public void test01() {
	String persistence_unit_name="JPA01";
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
}
