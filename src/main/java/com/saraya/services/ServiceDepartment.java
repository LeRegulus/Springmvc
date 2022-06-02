package com.saraya.services;

import com.saraya.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceDepartment {

	private static List<Department> departments = new ArrayList<>();
	private static int id = 0;

	static {
		departments.add(new Department(generateId(), "IT", null));
		departments.add(new Department(generateId(), "HR", null));
		departments.add(new Department(generateId(), "FINANCE", null));
		departments.add(new Department(generateId(), "NETWORKING", null));
	}

	public static String generateId(){
		return "DEPT_" + ++id;
	}

	public List<Department> getDepartments() {
		return departments;
	}
	
	public Department getDepartment(String id) {
		return departments.stream().filter(department -> department.getId().equals(id)).toList().get(0);
	}

	public void createDepartment(String name){
		departments.add(new Department(generateId(), name, null));
	}


	public void deleteDepartment(Department department) {
		departments.remove(department);
	}
}
