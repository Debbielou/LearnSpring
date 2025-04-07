package Springtest.Springtest;

import org.springframework.stereotype.Component;

@Component
public class Patient {
	private int Pid;
	private String Name;
	private String Address;
	
	public Patient() {
		
		
	}
	
	public Patient(int Pid,String Name, String Address){
		this.Pid = Pid;
		this.Name = Name;
		this.Address = Address;
		
	}
	
	

	public int getPid() {
		return Pid;
	}



	public void setPid(int pid) {
		Pid = pid;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}

	public String myName() {
		return" My Name is the patient bean";
		
	}

}
