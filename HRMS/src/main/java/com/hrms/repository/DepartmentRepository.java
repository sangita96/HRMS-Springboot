package com.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
