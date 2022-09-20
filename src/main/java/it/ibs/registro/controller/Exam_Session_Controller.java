package it.ibs.registro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.ibs.registro.model.Exam_Session;
import it.ibs.registro.service.Exam_Session_Service;

@RestController
@RequestMapping("/api/v1")
public class Exam_Session_Controller {
	
	@Autowired
	private Exam_Session_Service exam_session_service;
	
	@PostMapping("/addExamSession")
	public void addExamSession(@RequestBody Exam_Session exam_session) {
		exam_session_service.addExamSession(exam_session);			
	}
	
	@GetMapping("/getAllExamSessions")
	public List<Exam_Session> getAllExamsSessions() {	
			return exam_session_service.getAllExamSessions();
	}

	@PutMapping("/updateExamSession")
	public void updateExamSession(@RequestBody Exam_Session exam_session) {
		exam_session_service.updateExamSession(exam_session);			
	}	
		
	@DeleteMapping("/deleteExamSession/{id}")
		public void deleteExamSession(@PathVariable(name="id") long id) {
			exam_session_service.deleteExamSession(id);			
	}
	
	@GetMapping("/getExamSessionbyId")
	public Exam_Session getExamSessionbyId(long id) {	
			return exam_session_service.getExamSessionbyId(id);
	}
	
}
