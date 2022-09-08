package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ibs.registro.dao.Skill_Repository;
import it.ibs.registro.model.Skill;

@Service
public class Skill_Service {

	@Autowired
	private Skill_Repository skill_repository;

	public void addSkill(Skill skill) {
		skill_repository.save(skill);		
	}

	public List<Skill> getAllSkills() {
		return skill_repository.findAll();
	}

	public void updateSkill(Skill skill) {
		Skill s = skill_repository.getById(skill.getId());
		s.setExam(skill.getExam());
		s.setName(skill.getName());
		s.setStudent_skill(skill.getStudent_skill());
		skill_repository.save(s);
		
	}

	public void deleteSkill(long id) {
		skill_repository.deleteById(id);		
	}

	public Skill getSkillbyId(long id) {
		return skill_repository.getReferenceById(id);
	}
	
}
