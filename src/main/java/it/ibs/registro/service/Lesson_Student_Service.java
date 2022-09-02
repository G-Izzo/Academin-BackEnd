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
	lesson_student_repository.save(lesson_student);		
	}

	public List<Lesson_Student> getAllLessonsStudents() {
		return lesson_student_repository.findAll();
	}

	public void updateLessonStudent(Lesson_Student lesson_student) {
		Lesson_Student ls = lesson_student_repository.getById(lesson_student.getId());
		ls.setDaily_grade(lesson_student.getDaily_grade());
		ls.setExit_time(lesson_student.getExit_time());
		ls.setJoin_time(lesson_student.getJoin_time());
		ls.setLesson(lesson_student.getLesson());
		lesson_student_repository.save(ls);
	}

	public void deleteLessonStudent(long id) {
		lesson_student_repository.deleteById(id);
	}
	
}
