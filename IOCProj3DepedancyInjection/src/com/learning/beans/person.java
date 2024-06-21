package com.learning.beans;

public class person {

	private int id;
	private String name;
	private String address;
	private float salary;

	//setters injection  Alt + shif + s , r
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
//Alt + shif + s , s
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	

}
