package tw.com.lccnet.spring.pojo;

import org.springframework.stereotype.Component;


//@Component組件的意思
@Component
public class User {

	private String username;
	private String password;
	private Integer age;
	private String email;
	private String sex;
	
	public User() {
		super();
	}

	public User(String username, String password, Integer age, String email, String sex) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.email = email;
		this.sex = sex;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", age=" + age + ", email=" + email + ", sex="
				+ sex + "]";
	}

	

}
