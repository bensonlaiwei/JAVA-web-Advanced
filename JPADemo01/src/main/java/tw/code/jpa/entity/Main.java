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
		//�إߤu�t��
		EntityManagerFactory
		factory=Persistence.createEntityManagerFactory(persistence_unit_name);
		//�إߺ޲z��
		EntityManager manager=factory.createEntityManager();
		//�}�Ҩư�
		EntityTransaction transaction=manager.getTransaction();
		//�i��ʧ@
		transaction.begin();
		//�ާ@���[��
		
		Customer customer=new Customer();
		customer.setName("Tom");
		customer.setEmail("tom@gmail.com");
		customer.setAge(30);
		

		Order order1=new Order();
		order1.setOname("�q��");
		
		Order order2=new Order();
		order2.setOname("�B�c");
		
		order1.setCustomer(customer);
		order2.setCustomer(customer);
		
		//�[�J�޲z��
		manager.persist(customer);
		manager.persist(order1);
		manager.persist(order2);
		
		
		//����ư�
		transaction.commit();
		//�����޲z��
		manager.close();
		//�����u�t��
		factory.close();
		}
		
	
	
	

	
	public void test01() {
	String persistence_unit_name="JPADemo01";
	//�إߤu�t��
	EntityManagerFactory
	factory=Persistence.createEntityManagerFactory(persistence_unit_name);
	//�إߺ޲z��
	EntityManager manager=factory.createEntityManager();
	//�}�Ҩư�
	EntityTransaction transaction=manager.getTransaction();
	//�i��ʧ@
	transaction.begin();
	//�ާ@���[��
	Customer customer=new Customer();
	customer.setName("Tom");
	customer.setEmail("tom@gmail.com");
	customer.setAge(30);
	//�[�J�޲z��
	manager.persist(customer);
	//����ư�
	transaction.commit();
	//�����޲z��
	manager.close();
	//�����u�t��
	factory.close();
	}
	
	
	
	public void test02() {
	String persistence_unit_name="JPADemo01";
	//�إߤu�t��
	EntityManagerFactory
	factory=Persistence.createEntityManagerFactory(persistence_unit_name);
	//�إߺ޲z��
	EntityManager manager=factory.createEntityManager();
	//�}�Ҩư�
	EntityTransaction transaction=manager.getTransaction();
	//�i��ʧ@
	transaction.begin();
	//�ާ@���[��
	
	
	Order order=new Order();
	order.setOname("Demo01");
	order.setCustomer(new Customer());

	
	
	
	//�[�J�޲z��
	manager.persist(order);
	//����ư�
	transaction.commit();
	//�����޲z��
	manager.close();
	//�����u�t��
	factory.close();
	}
}
