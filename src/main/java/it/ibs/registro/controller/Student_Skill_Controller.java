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
import it.ibs.registro.model.Student_Skill;
import it.ibs.registro.service.Student_Skill_Service;

@RestController
@RequestMapping("/api/v1")
public class Student_Skill_Controller {
	
	@Autowired
	private Student_Skill_Service student_skill_service;
	
	@PostMapping("/addStudentSkill")
	public void addStudentSkill(@RequestBody Student_Skill student_skill) {
		student_skill_service.addStudentSkill(student_skill);			
	}
	
	@GetMapping("/getAllStudentsSkills")
	public List<Student_Skill> getAllStudentsSkills() {	
			return student_skill_service.getAllStudentsSkills();
	}

	@PutMapping("/updateStudentSkill")
	public void updateStudentSkill(@RequestBody Student_Skill student_skill) {
		student_skill_service.updateStudentSkill(student_skill);			
	}	
		
	@DeleteMapping("/deleteStudentSkill/{id}")
		public void deleteStudentSkill(@PathVariable(name="id") long id) {
			student_skill_service.deleteStudentSkill(id);			
	}
	
}
