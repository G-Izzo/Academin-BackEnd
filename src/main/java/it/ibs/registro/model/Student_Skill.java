package it.ibs.registro.model;

import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="student_skill")
public class Student_Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)	
    private Rating myRating;
	
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Student> student;
	
	@OneToMany(mappedBy = "skill", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Skill> skill;
	
	public Student_Skill() {}	
	public Student_Skill(Long id, Rating myRating, List<Student> student, List<Skill> skill) {		
		this.id = id;
		this.myRating = myRating;
		this.student = student;
		this.skill = skill;
	}

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
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public List<Skill> getSkill() {
		return skill;
	}
	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}

  
}
