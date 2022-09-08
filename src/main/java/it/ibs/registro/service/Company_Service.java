package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ibs.registro.dao.Company_Repository;
import it.ibs.registro.model.Company;

@Service
public class Company_Service {
	
	@Autowired
	private Company_Repository company_repository;
	
	public void addCompany(Company company) {
		company_repository.save(company);		
	}
	
	public List<Company> getAllCompanies() {		
		return company_repository.findAll();
	}
	
	public void updateCompany(Company company) {
		Company c = company_repository.getById(company.getId());
		c.setCourses(company.getCourses());
		c.setName(company.getName());
		company_repository.save(c);
	}
	
	public void deleteCompany(long id) {
		company_repository.deleteById(id);
	}

	public Company getCompanybyId(long id) {		
		return company_repository.getReferenceById(id);
	}

}
