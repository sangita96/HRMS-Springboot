package com.hrms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	

	/*FIND ALL DESIGNATION*/
	@GetMapping("/findAllDesignation")
	public List<Designation> findAllDesignation() {
		 return designationService.findAllDesignation();
		 
	}
	
	/*FIND  DESIGNATION BY ID*/
	@GetMapping("/findDesignationById/{id}")
	public Designation findDesignationById(@PathVariable int id) {
		return designationService.findDesignationById(id);
	}
	
	/*DELETE  DESIGNATION BY ID*/
	@PostMapping("/deleteDesignation/{id}")
	public Designation deleteDesignation(@PathVariable int id) {
		return designationService.deleteDesignation(id);
	}
	
	/*UPDATE  DESIGNATION */
	@PostMapping("/updateDesignation/{id}")
	public Designation updateDesignation(Designation designation) {
		return designationService.updateDesignation(designation);
	}
}
