package Springtest.Springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

	private int id;
	private String comp_name;
	private String address;

    
	@Autowired
	private Employee employee;
	
	public Company() {
		
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

	@Override
	public String toString() {
		return "Company [id=" + id + ", comp_name=" + comp_name + ", address=" + address + ", employee=" + employee
				+ "]";
	}

}