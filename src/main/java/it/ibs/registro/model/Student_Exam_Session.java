package it.ibs.registro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="student_exam_session")
public class Student_Exam_Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String exam_files_url;
	private int grade;	
	
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Student> student;
	
	@OneToMany(mappedBy = "exam_session", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Exam_Session> exam_session;
	
	public Student_Exam_Session() {}
	public Student_Exam_Session(Long id, String exam_files_url, int grade, List<Student> student,
			List<Exam_Session> exam_session) {
		this.id = id;
		this.exam_files_url = exam_files_url;
		this.grade = grade;
		this.student = student;
		this.exam_session = exam_session;
	}	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getExam_files_url() {
		return exam_files_url;
	}
	public void setExam_files_url(String exam_files_url) {
		this.exam_files_url = exam_files_url;
	}

	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public List<Exam_Session> getExam_session() {
		return exam_session;
	}
	public void setExam_session(List<Exam_Session> exam_session) {
		this.exam_session = exam_session;
	}
	
}
