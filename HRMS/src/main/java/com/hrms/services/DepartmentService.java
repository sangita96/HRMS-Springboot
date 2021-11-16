package com.hrms.services;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.models.Department;
import com.hrms.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentrepo;
	
	GeneralServices gen=new GeneralServices();
	
	/*ADD DEPARTMENT*/
	public Department addDepartment(Department department) {
		
        department.setCreatedAt(gen.getCurrentTimestamp());
		departmentrepo.save(department);
		return department;
	}
	
	/*FIND ALL DEPARTMENT*/
	public List<Department> findAllDepartment() {
		return departmentrepo.findAll();
	}
	
	/*FIND  DEPARTMENT BY ID*/
	public Department findDepartmentById(int id) {
		return departmentrepo.findById(id);
	}
	
	/*Delete Department*/
	public Department deleteDepartment(int id) {
		Department d=departmentrepo.findById(id);
		d.setIsDelete(1);
		d.setDeletedAt(gen.getCurrentTimestamp());
		departmentrepo.save(d);
		return d;
	}
	
	/*Update Department*/
	public Department updateDepartment(Department dept) {
		Department d=departmentrepo.findById(dept.getId());
		d.setName(dept.getName());
		d.setModifiedAt(gen.getCurrentTimestamp());
		departmentrepo.save(d);
		return d;
	}
}
