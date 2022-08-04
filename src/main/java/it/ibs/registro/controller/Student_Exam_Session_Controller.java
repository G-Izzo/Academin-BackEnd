package it.ibs.registro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.ibs.registro.model.Student_Exam_Session;
import it.ibs.registro.service.Student_Exam_Session_Service;

@RestController
@RequestMapping("/api/v1")
public class Student_Exam_Session_Controller {
	
	@Autowired
	private Student_Exam_Session_Service student_exam_session_service;
	
	@PostMapping("/addStudentExamSession")
	public void addStudentExamSession(@RequestBody Student_Exam_Session student_exam_session) {
		student_exam_session_service.addStudentExamSession(student_exam_session);			
	}
	
	@GetMapping("/getAllStudentsExamsSessions")
	public List<Student_Exam_Session> getAllStudentsExamsSessions() {	
			return student_exam_session_service.getAllStudentsExamsSessions();
	}

	@PutMapping("/updateStudentExamSession")
	public void updateStudentExamSession(@RequestBody Student_Exam_Session student_exam_session) {
		student_exam_session_service.updateStudentExamSession(student_exam_session);			
	}	
		
	@DeleteMapping("/deleteStudentExamSession/{id}")
		public void deleteStudentExamSession(@PathVariable(name="id") long id) {
			student_exam_session_service.deleteStudentExamSession(id);			
	}
	
}
