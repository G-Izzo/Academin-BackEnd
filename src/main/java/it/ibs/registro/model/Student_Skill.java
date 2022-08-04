package it.ibs.registro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="student_skill")
public class Student_Skill {
	
	 @Column(name = "student_id")
	 Long studentId;

	 @Column(name = "skill_id")
	 Long courseId; 

	public Student_Skill() {}	
		
	public Student_Skill(Long studentId, Long courseId, Rating myRating, Student student, Skill skill) {
		super();
		this.studentId = studentId;
		this.courseId = courseId;
		this.myRating = myRating;
		this.student = student;
		this.skill = skill;
	}

	@Enumerated(EnumType.STRING)	
    private Rating myRating;

	public Rating getMyRating() {
		return myRating;
	}

	public void setMyRating(Rating myRating) {
		this.myRating = myRating;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="student_id", nullable = false)
	private Student student;
	  
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="skill_id", nullable = false)
	private Skill skill;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	
	  
}
