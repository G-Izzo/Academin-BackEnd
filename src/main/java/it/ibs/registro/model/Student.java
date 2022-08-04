package it.ibs.registro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	public Student() {}	

	public Student(Long id, String name, String surname, String cv_url, String qualifications,
			String training_starting_date, String training_ending_date, String project_allocation_date,
			String project_allocation_notes, List<Lesson_Student> lesson_student,
			List<Student_Exam_Session> student_exam_session, List<Student_Skill> student_skill) {	
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.cv_url = cv_url;
		this.qualifications = qualifications;
		this.training_starting_date = training_starting_date;
		this.training_ending_date = training_ending_date;
		this.project_allocation_date = project_allocation_date;
		this.project_allocation_notes = project_allocation_notes;
		this.lesson_student = lesson_student;
		this.student_exam_session = student_exam_session;
		this.student_skill = student_skill;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String surname;
	private String cv_url;
	private String qualifications;
	private String training_starting_date;
	private String training_ending_date;
	private String project_allocation_date;
	private String project_allocation_notes;	
	
	public String getTraining_starting_date() {
		return training_starting_date;
	}

	public void setTraining_starting_date(String training_starting_date) {
		this.training_starting_date = training_starting_date;
	}

	public String getTraining_ending_date() {
		return training_ending_date;
	}

	public void setTraining_ending_date(String training_ending_date) {
		this.training_ending_date = training_ending_date;
	}

	public String getProject_allocation_date() {
		return project_allocation_date;
	}

	public void setProject_allocation_date(String project_allocation_date) {
		this.project_allocation_date = project_allocation_date;
	}

	public String getProject_allocation_notes() {
		return project_allocation_notes;
	}

	public void setProject_allocation_notes(String project_allocation_notes) {
		this.project_allocation_notes = project_allocation_notes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCv_url() {
		return cv_url;
	}

	public void setCv_url(String cv_url) {
		this.cv_url = cv_url;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	
	@OneToMany(mappedBy = "lesson_student", fetch = FetchType.LAZY,
			   cascade = CascadeType.ALL)
			   private List<Lesson_Student> lesson_student;
	
	@OneToMany(mappedBy = "student_exam_session", fetch = FetchType.LAZY,
				cascade = CascadeType.ALL)
				private List<Student_Exam_Session> student_exam_session;
	
	@OneToMany(mappedBy = "student_skill", fetch = FetchType.LAZY,
				cascade = CascadeType.ALL)
			  	private List<Student_Skill> student_skill;

	public List<Lesson_Student> getLesson_student() {
		return lesson_student;
	}

	public void setLesson_student(List<Lesson_Student> lesson_student) {
		this.lesson_student = lesson_student;
	}

	public List<Student_Exam_Session> getStudent_exam_session() {
		return student_exam_session;
	}

	public void setStudent_exam_session(List<Student_Exam_Session> student_exam_session) {
		this.student_exam_session = student_exam_session;
	}

	public List<Student_Skill> getStudent_skill() {
		return student_skill;
	}

	public void setStudent_skill(List<Student_Skill> student_skill) {
		this.student_skill = student_skill;
	}
	
	
			  	
}
