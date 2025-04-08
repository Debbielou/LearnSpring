package Springtest.Springtest;

import org.springframework.stereotype.Component;

@Component
public class Employee {


	private int employeeId;
	private String name;

	
	
	public Employee() {

	}

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public void overtime(){
		System.out.println("You will be paid overtime");
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}

}

	