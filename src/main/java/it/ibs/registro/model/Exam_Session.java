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
@Table(name = "exam_session")
public class Exam_Session {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String exam_date;	

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="exam_session_id", nullable = false)
	private Student_Exam_Session student_exam_session;
			
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="exam_id", nullable = false)
	private Exam exams;
			
	public Exam_Session() {}		
	public Exam_Session(Long id, String exam_date, Student_Exam_Session student_exam_session, Exam exams) {
		this.id = id;
		this.exam_date = exam_date;
		this.student_exam_session = student_exam_session;
		this.exams = exams;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getExam_date() {
		return exam_date;
	}
	public void setExam_date(String exam_date) {
		this.exam_date = exam_date;
	}
	
	public Exam getExams() {
		return exams;
	}
	public void setExams(Exam exams) {
		this.exams = exams;
	}
	public Student_Exam_Session getStudent_exam_session() {
		return student_exam_session;
	}
	public void setStudent_exam_session(Student_Exam_Session student_exam_session) {
		this.student_exam_session = student_exam_session;
	}	
	
}
