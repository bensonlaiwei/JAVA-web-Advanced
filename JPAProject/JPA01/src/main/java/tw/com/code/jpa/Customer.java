package tw.com.code.jpa;



import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;




@Entity
@Table(name="JPA_Customer")
public class Customer {
	
	@Id
	@GeneratedValue
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)//Orcale 不能使用
	private Integer id;
	@Column(name="cname",unique = true, nullable = true)
	private String name;
	@Column(name="cemail",unique = false)
	private String email;
	@Column(name="cage")
	private int age;
	

	
	
	public Customer() {
		super();
	}



	public Customer(Integer id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
	//connection pool 資料池

}
