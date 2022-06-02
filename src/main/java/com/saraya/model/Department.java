package com.saraya.model;

import java.util.Objects;

public class Department {

	private String id;
	private String name;
	private Employee manager;
	

	public Department(String id, String name, Employee manager) {
		this.id = id;
		this.name = name;
		this.manager = manager;
	}

	public Department() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Department{" +
				"id= " + id + " " +
				", name= " + name + " " +
				", manager= " + manager +
				"}";
	}
}
