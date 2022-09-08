package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ibs.registro.dao.Course_Repository;
import it.ibs.registro.model.Course;

@Service
public class Course_Service {

	@Autowired
	private Course_Repository course_repository;

	public void addCourse(Course course) {
		course_repository.save(course);		
	}

	public List<Course> getAllCourses() {
		return course_repository.findAll();
	}

	public void updateCourse(Course course) {
		Course c = course_repository.getById(course.getId());
		c.setCompany(course.getCompany());
		c.setEnding_date(course.getEnding_date());
		c.setLessons(course.getLessons());
		c.setName(course.getName());
		c.setStarting_date(course.getStarting_date());
		course_repository.save(c);
	}

	public void deleteCourse(long id) {
		course_repository.deleteById(id);
	}

	public Course getCoursebyId(long id) {		
		return course_repository.getReferenceById(id);
	}
	
}
