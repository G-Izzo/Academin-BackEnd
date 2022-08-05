package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import it.ibs.registro.dao.Student_Repository;
import it.ibs.registro.model.Student;

public class Student_Service {

	@Autowired
	private Student_Repository student_repository;

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		
	}
	
}
