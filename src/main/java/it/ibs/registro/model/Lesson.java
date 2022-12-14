package it.ibs.registro.model;

import java.util.List;

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
@Table(name = "lesson")
public class Lesson {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String date;
	private String topics;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "course_id", nullable = false)
	@JsonIgnore
	private Course course;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "lesson_id", nullable = false)
	@JsonIgnore
	private Lesson_Student lesson_student;
			   
	public Lesson() {}			
	public Lesson(Long id, String date, String topics, Course course, Lesson_Student lesson_student) {
		this.id = id;
		this.date = date;
		this.topics = topics;
		this.course = course;
		this.lesson_student = lesson_student;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getTopics() {
		return topics;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Lesson_Student getLesson_student() {
		return lesson_student;
	}
	public void setLesson_student(Lesson_Student lesson_student) {
		this.lesson_student = lesson_student;
	} 		   
}
