package tw.com.lccnet.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private Integer id;
	private String name;
	private String email;
	private Integer gender; //0 m - >¨k¡A1->¤k
	
	
	public Employee() {
		super();
	}
	public Employee(Integer id, String name, String email, Integer gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
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
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
	

}
