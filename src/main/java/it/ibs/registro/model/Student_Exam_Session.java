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
@Table(name="student_exam_session")
public class Student_Exam_Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String exam_files_url;
	private int grade;	
	
	@OneToMany(mappedBy = "student_exam_session", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Student> students;
	
	@OneToMany(mappedBy = "student_exam_session", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Exam_Session> exam_sessions;
	
	public Student_Exam_Session() {}
	public Student_Exam_Session(Long id, String exam_files_url, int grade, List<Student> students,
			List<Exam_Session> exam_sessions) {
		this.id = id;
		this.exam_files_url = exam_files_url;
		this.grade = grade;
		this.students = students;
		this.exam_sessions = exam_sessions;
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
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Exam_Session> getExam_sessions() {
		return exam_sessions;
	}
	public void setExam_sessions(List<Exam_Session> exam_sessions) {
		this.exam_sessions = exam_sessions;
	}	
}
