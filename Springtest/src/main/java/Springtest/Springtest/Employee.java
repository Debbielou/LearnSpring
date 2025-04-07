package Springtest.Springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;

	private Company company;

	/*
	 * Company comp = new Company();
	 * 
	 * public String emp_Address() { return comp.compayname();
	 * 
	 * }
	 */

	public Employee() {

	}

	@Autowired
	public Employee(@Value("${employee.id}") int id, @Value("${employee.name}") String name, Company company) {
		this.id = id;
		this.name = name;
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String myCompany() {
		return company.compayname();
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * Employee emp = new Employee(); System.out.println(emp.emp_Address());
	 * 
	 * }
	 */

}
