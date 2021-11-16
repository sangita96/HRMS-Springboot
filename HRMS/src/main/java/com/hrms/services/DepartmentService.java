package com.hrms.services;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.models.Department;
import com.hrms.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentrepo;
	
	public Department addDepartment(Department department) {
		Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime());  
        System.out.println(ts);
        department.setCreatedAt(ts);
		departmentrepo.save(department);
		return department;
	}
}
