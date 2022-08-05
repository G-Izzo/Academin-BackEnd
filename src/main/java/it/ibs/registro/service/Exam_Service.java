package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ibs.registro.dao.Exam_Repository;
import it.ibs.registro.model.Course;
import it.ibs.registro.model.Exam;

@Service
public class Exam_Service {

	@Autowired
	private Exam_Repository exam_repository;

	public List<Exam> getAllExams() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addCourse(Exam exam) {
		// TODO Auto-generated method stub
		
	}

	public void updateExam(Exam exam) {
		// TODO Auto-generated method stub
		
	}

	public void deleteExam(long id) {
		// TODO Auto-generated method stub
		
	}
	
}
