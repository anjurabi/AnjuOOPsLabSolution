package com.anju.model;

public class Employee {
	private String firstName;
	private String lastName;
    
	public String getFirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName= firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName= lastName;
	}
	public Employee(String firstName, String lastname) {
		this.firstName= firstName;
		this.lastName= lastName;

	}
	
}
