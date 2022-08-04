package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import it.ibs.registro.dao.Exam_Session_Repository;
import it.ibs.registro.model.Exam_Session;

public class Exam_Session_Service {

	@Autowired
	private Exam_Session_Repository exam_session_repository;

	public void addExamSession(Exam_Session exam_session) {
		// TODO Auto-generated method stub
		
	}

	public List<Exam_Session> getAllExamSessions() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateExamSession(Exam_Session exam_session) {
		// TODO Auto-generated method stub
		
	}

	public void deleteExamSession(long id) {
		// TODO Auto-generated method stub
		
	}
	
}
