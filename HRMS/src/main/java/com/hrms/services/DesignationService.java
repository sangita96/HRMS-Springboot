package com.hrms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
