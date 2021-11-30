package com.hrms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.models.Department;
import com.hrms.models.Designation;
import com.hrms.repository.DesignationRepository;

@Service
public class DesignationService {
	@Autowired
	DesignationRepository designationrepo;
	GeneralServices gen=new GeneralServices();
	
	/*ADD DESIGNATION*/
	public Designation addDesignation(Designation designation) {
		designation.setCreatedAt(gen.getCurrentTimestamp());
		 return designationrepo.save(designation);
		 
	}
	
	/*FIND ALL DESIGNATION*/
	public List<Designation> findAllDesignation() {
		 return designationrepo.findAll();
		 
	}
	
	/*FIND  DESIGNATION BY ID*/
	public Designation findDesignationById(int id) {
		return designationrepo.findById(id);
	}

	/*Delete DESIGNATION*/
	public Designation deleteDesignation(int id) {
		Designation d=designationrepo.findById(id);
		d.setIsDelete(1);
		d.setDeletedAt(gen.getCurrentTimestamp());
		designationrepo.save(d);
		return d;
	}
	
	/*Update Department*/
	public Designation updateDesignation(Designation desg) {
		Designation d=designationrepo.findById(desg.getId());
		d.setDesignationName(desg.getDesignationName());
		d.setModifiedAt(gen.getCurrentTimestamp());
		designationrepo.save(d);
		return d;
	}
}
