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
		// TODO Auto-generated method stub
		
	}

	public List<Lesson> getAllLessons() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateLesson(Lesson lesson) {
		// TODO Auto-generated method stub
		
	}

	public void deleteLesson(long id) {
		// TODO Auto-generated method stub
		
	}
	
}
