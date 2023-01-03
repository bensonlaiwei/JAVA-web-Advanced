package tw.com.lccnet.spring.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import tw.com.lccnet.spring.bean.Employee;



@Repository //���[�h������
public class EmployeeDao {
	private static Map<Integer, Employee> employees=null;
	
	static {
		employees = new HashMap<Integer, Employee>();
		employees.put(1001, new Employee(1001, "tom", "tom@gmail.com", 0));
		employees.put(1002, new Employee(1002, "kc", "kc@gmail.com", 1));
		employees.put(1003, new Employee(1003, "lin", "lin@gmail.com", 0));
		employees.put(1004, new Employee(1004, "many", "many@gmail.com", 1));
		employees.put(1005, new Employee(1005, "judy", "judy@gmail.com", 0));
	}
	
	
	private static Integer initID = 1006;
	
	
	//�s�W
	public void save(Employee employee) {
		if (employee.getId()==null) {
			employee.setId(initID++);
		}
		employees.put(employee.getId(),employee);
		
	}
	
	//�R��
	public void delete(Integer id) {
		employees.remove(id);
	}
	
	//�ק�
	public Employee get(Integer id) {
		return employees.get(id);
	}
	
	
	//�d��
	
	public Collection<Employee> getAll(){
		return employees.values();
	}
	
	
	
	
	
	

}
