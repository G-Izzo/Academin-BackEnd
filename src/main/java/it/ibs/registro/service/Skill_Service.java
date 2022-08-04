package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import it.ibs.registro.dao.Skill_Repository;
import it.ibs.registro.model.Skill;

public class Skill_Service {

	@Autowired
	private Skill_Repository skill_repository;

	public void addSkill(Skill skill) {
		// TODO Auto-generated method stub
		
	}

	public List<Skill> getAllSkills() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateSkill(Skill skill) {
		// TODO Auto-generated method stub
		
	}

	public void deleteSkill(long id) {
		// TODO Auto-generated method stub
		
	}
	
}
