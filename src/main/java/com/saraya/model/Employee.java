package com.saraya.model;

import java.time.LocalDate;

public class Employee {

    private String matricule;
    private String fullName;
    private Department department;
    private LocalDate hireDate;
    private Double salary;
    private Boolean manager;
    private Double prime;


    public Employee(String matricule, String fullName, LocalDate hireDate, Double salary, Boolean manager, Department department) {
        this.matricule = matricule;
        this.fullName = fullName;
        this.hireDate = hireDate;
        this.salary = salary;
        this.manager = manager;
        this.prime = 0.00;
        this.department = department;
    }

    public Employee(String matricule, String fullName, Department department) {
        this.matricule = matricule;
        this.fullName = fullName;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getManager() {
        return manager;
    }

    public void setManager(Boolean manager) {
        this.manager = manager;
    }

    public Double getPrime() {
        return prime;
    }

    public void setPrime(Double prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "matricule= " + matricule + " " +
                ", fullName= " + fullName + " " +
                ", department= " + department +
                ", hireDate= " + hireDate +
                ", salary= " + salary +
                ", manager= " + manager +
                ", prime= " + prime +
                "}";
    }
}
