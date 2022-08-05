package it.ibs.registro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.ibs.registro.model.Company;

@Repository
public interface Company_Repository extends JpaRepository<Company, Long> {
	
}
