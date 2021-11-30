package com.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.models.Department;
import com.hrms.models.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Integer> {
	Designation findById(int id);

}
