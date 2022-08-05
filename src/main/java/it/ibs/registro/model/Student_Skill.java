package it.ibs.registro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_skill")
public class Student_Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)	
    private Rating myRating;
	
	@OneToMany(mappedBy = "student_skill", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Student> students;
	
	@OneToMany(mappedBy = "student_skill", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Skill> skills;
	
	public Student_Skill() {}	
	public Student_Skill(Long id, Rating myRating, List<Student> students, List<Skill> skills) {
		this.id = id;
		this.myRating = myRating;
		this.students = students;
		this.skills = skills;
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
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
}
