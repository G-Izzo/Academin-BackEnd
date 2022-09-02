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
		return exam_repository.findAll();
	}

	public void addCourse(Exam exam) {
		exam_repository.save(exam);
	}

	public void updateExam(Exam exam) {
		Exam e = exam_repository.getById(exam.getId());
		e.setExam_session(exam.getExam_session());
		e.setName(exam.getName());
		e.setSkill(exam.getSkill());
		e.setUrl(exam.getUrl());
		exam_repository.save(e);
	}

	public void deleteExam(long id) {
		exam_repository.deleteById(id);
	}
	
}
