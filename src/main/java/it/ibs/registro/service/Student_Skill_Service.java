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
		student_skill_repository.save(student_skill);
	}

	public List<Student_Skill> getAllStudentsSkills() {
		return student_skill_repository.findAll();
	}

	public void updateStudentSkill(Student_Skill student_skill) {
		Student_Skill ss = student_skill_repository.getById(student_skill.getId());
		ss.setMyRating(student_skill.getMyRating());
		ss.setSkill(student_skill.getSkill());
		ss.setStudent(student_skill.getStudent());
		student_skill_repository.save(ss);
	}

	public void deleteStudentSkill(long id) {
	student_skill_repository.deleteById(id);		
	}
	
}
