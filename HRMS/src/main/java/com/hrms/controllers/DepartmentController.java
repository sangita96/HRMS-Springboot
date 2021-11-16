package com.hrms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.models.Department;
import com.hrms.repository.DepartmentRepository;
import com.hrms.services.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/addDepartment")
	public Department addDepartment(Department department)
	{
		return departmentService.addDepartment(department);
		
	}
}
