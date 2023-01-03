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
}
