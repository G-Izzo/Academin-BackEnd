package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ibs.registro.dao.Student_Skill_Repository;
import it.ibs.registro.model.Student_Skill;

@Service
public class Student_Skill_Service {

	@Autowired
	private Student_Skill_Repository student_skill_repository;

	public void addStudentSkill(Student_Skill student_skill) {
		// TODO Auto-generated method stub
		
	}

	public List<Student_Skill> getAllStudentsSkills() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateStudentSkill(Student_Skill student_skill) {
		// TODO Auto-generated method stub
		
	}

	public void deleteStudentSkill(long id) {
		// TODO Auto-generated method stub
		
	}
	
}
