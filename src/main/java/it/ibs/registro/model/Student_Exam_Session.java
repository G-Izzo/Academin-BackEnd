package it.ibs.registro.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="student_id", nullable = false)
	private Student student_id;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="exam_session_id", nullable = false)
	private Exam_Session exam_session_id;
	
	public Student_Exam_Session() {}
	public Student_Exam_Session(Long id, String exam_files_url, int grade, Student student_id,
			Exam_Session exam_session_id) {
		this.id = id;
		this.exam_files_url = exam_files_url;
		this.grade = grade;
		this.student_id = student_id;
		this.exam_session_id = exam_session_id;
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
	
	public Student getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Student student_id) {
		this.student_id = student_id;
	}

	public Exam_Session getExam_session_id() {
		return exam_session_id;
	}
	public void setExam_session_id(Exam_Session exam_session_id) {
		this.exam_session_id = exam_session_id;
	}	
}
