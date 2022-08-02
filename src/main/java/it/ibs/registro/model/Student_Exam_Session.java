package it.ibs.registro.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student_exam_session")
public class Student_Exam_Session {
	
	public Student_Exam_Session() {}
	
	public Student_Exam_Session(String exam_files_url, int grade) {
		super();
		this.exam_files_url = exam_files_url;
		this.grade = grade;
	}
	//foreign keys!!

	private String exam_files_url;
	private int grade;
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
	
	
}
