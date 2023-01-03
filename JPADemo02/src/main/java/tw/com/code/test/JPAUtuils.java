package tw.com.code.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtuils {
	private static EntityManagerFactory  entityManagerFactory;
	
		static {
			entityManagerFactory=Persistence.createEntityManagerFactory("JPADemo02");
			
		}
	public static EntityManager getEntityManager () {
		return entityManagerFactory.createEntityManager();
	}

}
