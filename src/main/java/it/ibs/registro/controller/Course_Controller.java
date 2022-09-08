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
import it.ibs.registro.model.Course;
import it.ibs.registro.service.Course_Service;

@RestController
@RequestMapping("/api/v1")
public class Course_Controller {

	@Autowired
	private Course_Service course_service;		
	
	@PostMapping("/addCourse")
	public void addCourse(@RequestBody Course course) {
		course_service.addCourse(course);			
	}
	
	@GetMapping("/getAllCourses")
	public List<Course> getAllCourses() {	
			return course_service.getAllCourses();
	}

	@PutMapping("/updateCourse")
	public void updateCourse(@RequestBody Course course) {
		course_service.updateCourse(course);			
	}	
		
	@DeleteMapping("/deleteCourse/{id}")
		public void deleteCourse(@PathVariable(name="id") long id) {
			course_service.deleteCourse(id);			
	}
	
	@GetMapping("/getCoursebyId")
	public Course getCoursebyId(long id) {	
			return course_service.getCoursebyId(id);
	}
		
}
