package com.hrms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hrms.models.Designation;
import com.hrms.services.DesignationService;

@RestController
public class DesignationController {
	@Autowired
	DesignationService designationService;
	
	/*ADD DESIGNATION*/
	@PostMapping("/addDesignation")
	public Designation addDesignation(@RequestBody Designation designation) {
		return designationService.addDesignation(designation);
	}
	
}
