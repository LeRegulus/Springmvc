package com.saraya.controllers;

import com.saraya.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.saraya.services.ServiceDepartment;

@Controller
@SessionAttributes("username")
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    ServiceDepartment service ;

    @RequestMapping("/")
    public String departments(ModelMap model) {
        model.addAttribute("departments", service.getDepartments());
        return "department/depList";
    }

    @RequestMapping( value = "/" , method = RequestMethod.POST)
    public String create(@RequestParam String depName) {
        service.createDepartment(depName);
        return "redirect:/departments/";
    }

    @RequestMapping(value = "/{id}")
    public String department(@PathVariable("id") String id, ModelMap model) {
       model.addAttribute("department", service.getDepartment(id));
        return "department/dep";
    }

    @RequestMapping("/new")
    public String newDepartment(){
        return "department/depNew";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable("id") String id, ModelMap model){
        model.addAttribute("department", service.getDepartment(id));
        return "department/updateDept";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateDepartment(@RequestParam String depName, @PathVariable String id){
        Department department = service.getDepartment(id);
        department.setName(depName);
        return "redirect:/departments/";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable String id){
        Department department = service.getDepartment(id);
        service.deleteDepartment(department);
        return "redirect:/departments/";
    }
}
