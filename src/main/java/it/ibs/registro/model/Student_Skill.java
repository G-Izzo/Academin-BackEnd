package it.ibs.registro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	
	public Student_Skill(Long studentId, Long courseId, Long id, Rating myRating, Student student, Skill skill) {
		super();
		this.studentId = studentId;
		this.courseId = courseId;
		this.id = id;
		this.myRating = myRating;
		this.student = student;
		this.skill = skill;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)	
    private Rating myRating;

	public Rating getMyRating() {
		return myRating;
	}

	public void setMyRating(Rating myRating) {
		this.myRating = myRating;
	}	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
