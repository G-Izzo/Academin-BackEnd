package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import it.ibs.registro.dao.Course_Repository;
import it.ibs.registro.model.Course;

public class Course_Service {

	@Autowired
	private Course_Repository course_repository;

	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCourse(long id) {
		// TODO Auto-generated method stub
		
	}
	
}
