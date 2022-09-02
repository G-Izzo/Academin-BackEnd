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
		student_exam_session_repository.save(student_exam_session);		
	}

	public List<Student_Exam_Session> getAllStudentsExamsSessions() {
		return student_exam_session_repository.findAll();
	}

	public void updateStudentExamSession(Student_Exam_Session student_exam_session) {
	Student_Exam_Session ses = student_exam_session_repository.getById(student_exam_session.getId());
	ses.setExam_files_url(student_exam_session.getExam_files_url());
	ses.setExam_session(student_exam_session.getExam_session());
	ses.setGrade(student_exam_session.getGrade());
	ses.setStudent(student_exam_session.getStudent());
	student_exam_session_repository.save(ses);
	}

	public void deleteStudentExamSession(long id) {
	student_exam_session_repository.deleteById(id);
		
	}
	
}
