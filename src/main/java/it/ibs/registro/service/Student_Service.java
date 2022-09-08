package it.ibs.registro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ibs.registro.dao.Student_Repository;
import it.ibs.registro.model.Student;

@Service
public class Student_Service {

	@Autowired
	private Student_Repository student_repository;

	public void addStudent(Student student) {
	student_repository.save(student);
		
	}

	public List<Student> getAllStudents() {
		return student_repository.findAll();
	}

	public void updateStudent(Student student) {
		Student s = student_repository.getById(student.getId());
		s.setCv_url(student.getCv_url());
		s.setLesson_student(student.getLesson_student());
		s.setName(student.getName());
		s.setProject_allocation_date(student.getProject_allocation_date());
		s.setProject_allocation_notes(student.getProject_allocation_notes());
		s.setQualifications(student.getQualifications());
		s.setStudent_exam_session(student.getStudent_exam_session());
		s.setStudent_skill(student.getStudent_skill());
		s.setSurname(student.getSurname());
		s.setTraining_ending_date(student.getTraining_ending_date());
		s.setTraining_starting_date(student.getTraining_starting_date());
		student_repository.save(s);	
		
	}

	public void deleteStudent(long id) {
		student_repository.deleteById(id);		
	}

	public Student getStudentbyId(long id) {
	return student_repository.getReferenceById(id);
	}
	
}
