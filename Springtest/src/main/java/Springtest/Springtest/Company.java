package Springtest.Springtest;

import org.springframework.stereotype.Component;

@Component
public class Company {

	private int id;
	private String comp_name = "Pepsi LTD";
	private String address;
	
	public Company() {
		
	}

	public Company(int id, String comp_name, String address) {
		this.id = id;
		this.comp_name = comp_name;
		this.address = address;
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
	public String compayname() {
		return "PepsiCo";
	}
	
}
