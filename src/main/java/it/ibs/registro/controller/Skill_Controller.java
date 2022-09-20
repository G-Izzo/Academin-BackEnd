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
import it.ibs.registro.model.Skill;
import it.ibs.registro.service.Skill_Service;

@RestController
@RequestMapping("/api/v1")
public class Skill_Controller {
	
	@Autowired
	private Skill_Service skill_service;
	
	@PostMapping("/addSkill")
	public void addSkill(@RequestBody Skill skill) {
		skill_service.addSkill(skill);			
	}
	
	@GetMapping("/getAllSkills")
	public List<Skill> getAllSkills() {	
			return skill_service.getAllSkills();
	}

	@PutMapping("/updateSkill")
	public void updateSkill(@RequestBody Skill skill) {
		skill_service.updateSkill(skill);			
	}	
		
	@DeleteMapping("/deleteSkill/{id}")
		public void deleteSkill(@PathVariable(name="id") long id) {
			skill_service.deleteSkill(id);			
	}
	
	@GetMapping("/getSkillbyId")
	public Skill getSkillbyId(long id) {	
			return skill_service.getSkillbyId(id);
	}
	
}
