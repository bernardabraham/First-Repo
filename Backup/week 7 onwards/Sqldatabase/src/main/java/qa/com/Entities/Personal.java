package qa.com.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Personal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regNo;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	public Personal() {
		super();
	}
	public Personal(int regNo, String name, String address) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.address = address;
	}
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
