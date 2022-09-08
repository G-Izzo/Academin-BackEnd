package it.ibs.registro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.ibs.registro.model.Company;
import it.ibs.registro.service.Company_Service;

@RestController
@RequestMapping("/api/v1")
public class Company_Controller {

	@Autowired
	private Company_Service company_service;	
	
	@PostMapping("/addCompany")
	public void addCompany(@RequestBody Company company) {
		company_service.addCompany(company);			
	}
	
	@GetMapping("/getAllCompanies")
	public List<Company> getAllCompanies() {	
			return company_service.getAllCompanies();
	}

	@PutMapping("/updateCompany")
	public void updateCompany(@RequestBody Company company) {
		company_service.updateCompany(company);			
	}	
		
	@DeleteMapping("/deleteCompany/{id}")
		public void deleteCompany(@PathVariable(name="id") long id) {
			company_service.deleteCompany(id);			
	}
	
	@GetMapping("/getCompanybyId")
	public Company getCompanybyId(long id) {	
			return company_service.getCompanybyId(id);
	}
		
	
}
