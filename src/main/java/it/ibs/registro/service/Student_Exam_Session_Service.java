package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ibs.registro.dao.Student_Exam_Session_Repository;
import it.ibs.registro.model.Student_Exam_Session;

@Service
public class Student_Exam_Session_Service {

	@Autowired
	private Student_Exam_Session_Repository student_exam_session_repository;

	public void addStudentExamSession(Student_Exam_Session student_exam_session) {
		// TODO Auto-generated method stub
		
	}

	public List<Student_Exam_Session> getAllStudentsExamsSessions() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateStudentExamSession(Student_Exam_Session student_exam_session) {
		// TODO Auto-generated method stub
		
	}

	public void deleteStudentExamSession(long id) {
		// TODO Auto-generated method stub
		
	}
	
}
