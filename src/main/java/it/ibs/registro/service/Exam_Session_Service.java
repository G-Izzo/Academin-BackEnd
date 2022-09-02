package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ibs.registro.dao.Exam_Session_Repository;
import it.ibs.registro.model.Exam_Session;

@Service
public class Exam_Session_Service {

	@Autowired
	private Exam_Session_Repository exam_session_repository;

	public void addExamSession(Exam_Session exam_session) {
	exam_session_repository.save(exam_session);
		
	}

	public List<Exam_Session> getAllExamSessions() {
		return 	exam_session_repository.findAll();
	}

	public void updateExamSession(Exam_Session exam_session) {
	Exam_Session es = exam_session_repository.getById(exam_session.getId());
	es.setExam_date(exam_session.getExam_date());
	es.setExams(exam_session.getExams());
	es.setStudent_exam_session(exam_session.getStudent_exam_session());
	exam_session_repository.save(es);
		
	}

	public void deleteExamSession(long id) {
		exam_session_repository.deleteById(id);
	}
	
}
