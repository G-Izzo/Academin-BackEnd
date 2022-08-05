package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import it.ibs.registro.dao.Company_Repository;
import it.ibs.registro.model.Company;

public class Company_Service {
	
@Autowired
private Company_Repository company_repository;

public void addCompany(Company company) {
	// TODO Auto-generated method stub
	
}

public List<Company> getAllCompanies() {
	// TODO Auto-generated method stub
	return null;
}

public void updateCompany(Company company) {
	// TODO Auto-generated method stub
	
}

public void deleteCompany(long id) {
	// TODO Auto-generated method stub
	
}

}
