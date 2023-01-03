package tw.com.code.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_tab")
public class Order {
	@Id
	@GeneratedValue
//	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer id;
	private String oname;
	
//	private Customer customer;
	
	
	public Order() {
		super();
	}
	
	public Order(Integer id, String oname, Customer customer) {
		super();
		this.id = id;
		this.oname = oname;
//		this.customer = customer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", oname=" + oname + ", customer=" + "]";
	}
	
	
	
	
	
	

}
