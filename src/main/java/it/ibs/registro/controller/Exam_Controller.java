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
import it.ibs.registro.model.Exam;
import it.ibs.registro.service.Exam_Service;

@RestController
@RequestMapping("/api/v1")
public class Exam_Controller {
	
  @Autowired
  private Exam_Service exam_service;
  
	@PostMapping("/addExam")
	public void addExam(@RequestBody Exam exam) {
		exam_service.addCourse(exam);			
	}
	
	@GetMapping("/getAllExams")
	public List<Exam> getAllExams() {	
	 return exam_service.getAllExams();
	}

	@PutMapping("/updateExam")
	public void updateExam(@RequestBody Exam exam) {
		exam_service.updateExam(exam);			
	}	
		
	@DeleteMapping("/deleteExam/{id}")
		public void deleteExam(@PathVariable(name="id") long id) {
			exam_service.deleteExam(id);			
	}

}
