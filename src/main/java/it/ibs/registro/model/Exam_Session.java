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
@Table(name = "exam_session")
public class Exam_Session {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String exam_date;	

	@OneToMany(mappedBy = "student_exam_session", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Student_Exam_Session> student_exam_session;
			
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="exam_id", nullable = false)
	private Exam exam;
			
	public Exam_Session() {}	
	public Exam_Session(Long id, String exam_date, List<Student_Exam_Session> student_exam_session, Exam exam) {	
		this.id = id;
		this.exam_date = exam_date;
		this.student_exam_session = student_exam_session;
		this.exam = exam;
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
		
	public List<Student_Exam_Session> getStudent_exam_session() {
		return student_exam_session;
	}
	public void setStudent_exam_session(List<Student_Exam_Session> student_exam_session) {
		this.student_exam_session = student_exam_session;
	}

	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}	
}
