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

import it.ibs.registro.model.Lesson_Student;
import it.ibs.registro.service.Lesson_Student_Service;

@RestController
@RequestMapping("/api/v1")	
public class Lesson_Student_Controller {
		
	@Autowired
	private Lesson_Student_Service lesson_student_service;
	
	@PostMapping("/addLessonStudent")
	public void addCourse(@RequestBody Lesson_Student lesson_student) {
		lesson_student_service.addLessonStudent(lesson_student);			
	}
	
	@GetMapping("/getAllLessonsStudents")
	public List<Lesson_Student> getAllLessonsStudents() {	
			return lesson_student_service.getAllLessonsStudents();
	}

	@PutMapping("/updateLessonStudent")
	public void updateLessonStudent(@RequestBody Lesson_Student lesson_student) {
		lesson_student_service.updateLessonStudent(lesson_student);			
	}	
		
	@DeleteMapping("/deleteLessonStudent/{id}")
		public void deleteLessonStudent(@PathVariable(name="id") long id) {
			lesson_student_service.deleteLessonStudent(id);			
	}
	
}
