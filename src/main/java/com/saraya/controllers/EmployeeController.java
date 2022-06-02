package com.saraya.controllers;

import com.saraya.model.Department;
import com.saraya.model.Employee;
import com.saraya.services.ServiceDepartment;
import com.saraya.services.ServiceEmployee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@SessionAttributes("username")
@RequestMapping("/employees")
public class EmployeeController {

    ServiceEmployee service= new ServiceEmployee();
    ServiceDepartment departmentService = new ServiceDepartment();

    @RequestMapping("/")
    public String departments(ModelMap model) {
        model.addAttribute("employees", service.getEmployees());
        return "employee/empList";
    }

    @RequestMapping( value = "/" , method = RequestMethod.POST)
    public String create(@RequestParam String fullName, @RequestParam String hireDate, @RequestParam double salary,
                         @RequestParam boolean manager, @RequestParam String idDept) {
        LocalDate date = LocalDate.parse(hireDate);

        service.createEmployee(fullName,idDept, date, salary, manager);
        return "redirect:/employees/";
    }

    @RequestMapping(value = "/{matricule}")
    public String department(@PathVariable("matricule") String matricule, ModelMap model) {
        model.addAttribute("employee", service.getEmployee(matricule));
        return "employee/empDetail";
    }

    @RequestMapping("/new")
    public String newDepartment(ModelMap model){
        model.addAttribute("departments", departmentService.getDepartments());
        return "employee/empNew";
    }

    @RequestMapping("/update/{matricule}")
    public String update(@PathVariable("matricule") String matricule, ModelMap model){
        model.addAttribute("employee", service.getEmployee(matricule));
        model.addAttribute("departments", departmentService.getDepartments());
        return "employee/updateEmp";
    }

    @RequestMapping(value = "/update/{matricule}", method = RequestMethod.POST)
    public String updateDepartment(@RequestParam String fullName, @RequestParam String hireDate, @RequestParam double salary,
                                   @RequestParam boolean manager,
                                   @RequestParam String idDept, @PathVariable String matricule){
        LocalDate date = LocalDate.parse(hireDate);
        Employee employee = service.getEmployee(matricule);
        Department department = departmentService.getDepartment(idDept);
        employee.setDepartment(department);
        employee.setFullName(fullName);
        employee.setHireDate(date);
        employee.setSalary(salary);
        employee.setManager(manager);
        if (manager){
            department.setManager(employee);
        }
        return "redirect:/employees/";
    }

    @RequestMapping("/delete/{matricule}")
    public String delete(@PathVariable String matricule){
        Employee employee = service.getEmployee(matricule);
        service.deleteEmployee(employee);
        return "redirect:/employees/";
    }
}
