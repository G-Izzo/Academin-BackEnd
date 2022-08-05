package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ibs.registro.dao.Lesson_Student_Repository;
import it.ibs.registro.model.Lesson_Student;

@Service
public class Lesson_Student_Service {

	@Autowired
	private Lesson_Student_Repository lesson_student_repository;

	public void addLessonStudent(Lesson_Student lesson_student) {
		// TODO Auto-generated method stub
		
	}

	public List<Lesson_Student> getAllLessonsStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateLessonStudent(Lesson_Student lesson_student) {
		// TODO Auto-generated method stub
		
	}

	public void deleteLessonStudent(long id) {
		// TODO Auto-generated method stub
		
	}
	
}
