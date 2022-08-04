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
import it.ibs.registro.model.Student;
import it.ibs.registro.service.Student_Service;

@RestController
@RequestMapping("/api/v1")
public class Student_Controller {
	
		@Autowired
		private Student_Service student_service;
		
		@PostMapping("/addStudent")
		public void addStudent(@RequestBody Student student) {
			student_service.addStudent(student);			
		}
		
		@GetMapping("/getAllStudents")
		public List<Student> getAllStudents() {	
				return student_service.getAllStudents();
		}

		@PutMapping("/updateStudent")
		public void updateStudent(@RequestBody Student student) {
			student_service.updateStudent(student);			
		}	
			
		@DeleteMapping("/deleteStudent/{id}")
			public void deleteStudent(@PathVariable(name="id") long id) {
				student_service.deleteStudent(id);			
		}
	
}
