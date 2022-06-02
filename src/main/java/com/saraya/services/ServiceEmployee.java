package com.saraya.services;

import com.saraya.model.Department;
import com.saraya.model.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ServiceEmployee {

    static ServiceDepartment serviceDepartment = new ServiceDepartment();
    public static List<Employee> employees = new ArrayList<>();
    public static int matricule = 0;

    static {
        employees.add(new Employee(generateMatricule(), "Modou Gueye", LocalDate.of(2021, 05, 10), 600000.00, false, serviceDepartment.getDepartment("DEPT_1")));
        employees.add(new Employee(generateMatricule(), "Abdou Fall", LocalDate.of(2021, 05, 10), 600000.00, false, serviceDepartment.getDepartment("DEPT_2") ));
        employees.add(new Employee(generateMatricule(), "Fatou Diakhoumpa", LocalDate.of(2021, 05, 10), 600000.00, false, serviceDepartment.getDepartment("DEPT_3")));

    }
    public static String generateMatricule(){ return "MATN0_" + ++matricule; }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployee(String matricule) {
        return employees.stream().filter(employee -> employee.getMatricule().equals(matricule)).toList().get(0);
    }

    public void createEmployee(String fullName,  String idDept, LocalDate hireDate, Double salary,
                               boolean manager) {
        Department department = serviceDepartment.getDepartment(idDept);
        Employee emp = new Employee(generateMatricule(), fullName, hireDate, salary, manager, department);
        department.setManager(emp);
        if (manager){
            department.setManager(emp);
        }
        employees.add(emp);
    }

    public void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

}

