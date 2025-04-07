package Springtest.Springtest;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int stud_id;
	private String stud_Name;
	private String Address;

	public Student() {

	}

	public Student(int stud_id, String stud_Name, String Address) {
		this.stud_id = stud_id;
		this.stud_Name = stud_Name;
		this.Address = Address;

	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_Name() {
		return stud_Name;
	}

	public void setStud_Name(String stud_Name) {
		this.stud_Name = stud_Name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String studentName() {
		return"The student nam is Student";
	}
}
