package com.hrms.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.models.Department;
import com.hrms.repository.DepartmentRepository;
import com.hrms.services.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/addDepartment")
	public Department addDepartment(@RequestBody Department department)
	{
		return departmentService.addDepartment(department);
		
	}
	
	/*FIND ALL DEPARTMENT*/
	@GetMapping("/findAllDepartment")
	public List<Department> findAllDepartment() {
		return departmentService.findAllDepartment();
	}
	
	/*FIND  DEPARTMENT BY ID*/
	@GetMapping("/findDepartmentById/{id}")
	public Department findDepartmentById(@PathVariable int  id) {
		return departmentService.findDepartmentById(id);
	}
	
	/*Delete Department*/
	@PostMapping("/deleteDepartment/{id}")
	public Department deleteDepartment(@PathVariable int  id) {
		return departmentService.deleteDepartment(id);
	}
	
	/*Delete Department*/
	@PutMapping("/updateDepartment")
	public Department updateDepartment(Department department) {
		return departmentService.updateDepartment(department);
	}
}
