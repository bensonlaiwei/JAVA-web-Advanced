package tw.com.code.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@NamedQuery(name="AA", query="SELECT E FROM Customer E")
@NamedQuery(name="BB", query="SELECT E FROM Customer E WHERE E.sex=:M AND E.age=>:age")
@NamedQuery(name="CC", query="SELECT E FROM Customer E WHERE E.name='張三'")


//業界目前已下面這個方法為主
@NamedQuery(name="test003",query="SELECT c FROM Customer c where c.email=?1 ")
@NamedQuery(name="test002",query="SELECT c FROM Customer c where c.name=?1 ")
@NamedQuery(name="test001",query="SELECT c FROM Customer c where c.id=?1 ")
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
	
	//這個產品有多少客戶
	@JoinColumn(name="customer_id")
	@OneToMany
	private Set<Order> order = new HashSet<>();
	
	
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

	public Set<Order> getOrder() {
		return order;
	}



	public void setOrder(Set<Order> order) {
		this.order = order;
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
