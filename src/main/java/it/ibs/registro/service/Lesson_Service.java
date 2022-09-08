package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ibs.registro.dao.Lesson_Repository;
import it.ibs.registro.model.Lesson;

@Service
public class Lesson_Service {

	@Autowired
	private Lesson_Repository lesson_repository;

	public void addLesson(Lesson lesson) {
		lesson_repository.save(lesson);		
	}

	public List<Lesson> getAllLessons() {
		return lesson_repository.findAll();
	}

	public void updateLesson(Lesson lesson) {
		Lesson l = lesson_repository.getById(lesson.getId());
		l.setCourse(lesson.getCourse());
		l.setDate(lesson.getDate());
		l.setLesson_student(lesson.getLesson_student());
		l.setTopics(lesson.getTopics());
		lesson_repository.save(l);
	}

	public void deleteLesson(long id) {
		lesson_repository.deleteById(id);	
	}

	public Lesson getLessonbyId(long id) {
		return lesson_repository.getReferenceById(id);
	}
	
}
