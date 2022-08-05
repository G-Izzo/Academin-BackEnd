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
@Table(name = "lesson_student")
public class Lesson_Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String join_time;
	private String exit_time;
	private String daily_grade;
	
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Student> student;
	
	@OneToMany(mappedBy = "lesson", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Lesson> lesson;
	
	public Lesson_Student() {}		
	public Lesson_Student(Long id, String join_time, String exit_time, String daily_grade, List<Student> student,
			List<Lesson> lesson) {	
		this.id = id;
		this.join_time = join_time;
		this.exit_time = exit_time;
		this.daily_grade = daily_grade;
		this.student = student;
		this.lesson = lesson;
	}


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
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public List<Lesson> getLesson() {
		return lesson;
	}
	public void setLesson(List<Lesson> lesson) {
		this.lesson = lesson;
	}

}
