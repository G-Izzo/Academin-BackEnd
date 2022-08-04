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
@Table(name = "lesson_student")
public class Lesson_Student {
	
	public Lesson_Student() {}	
	

	public Lesson_Student(Long id, String join_time, String exit_time, String daily_grade, Lesson lesson,
			Student student) {	
		this.id = id;
		this.join_time = join_time;
		this.exit_time = exit_time;
		this.daily_grade = daily_grade;
		this.lesson = lesson;
		this.student = student;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String join_time;
	private String exit_time;
	private String daily_grade;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJoin_time() {
		return join_time;
	}

	public void setJoin_time(String join_time) {
		this.join_time = join_time;
	}

	public String getExit_time() {
		return exit_time;
	}

	public void setExit_time(String exit_time) {
		this.exit_time = exit_time;
	}

	public String getDaily_grade() {
		return daily_grade;
	}

	public void setDaily_grade(String daily_grade) {
		this.daily_grade = daily_grade;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="lesson_id", nullable = false)
	private Lesson lesson;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="student_id", nullable = false)
	private Student student;

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
	
	
}
