package it.ibs.registro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="skill")
public class Skill {
	
	public Skill() {}		

	public Skill(Long id, String name, List<Student_Skill> student_skill, List<Exam> exam) {		
		this.id = id;
		this.name = name;
		this.student_skill = student_skill;
		this.exam = exam;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(mappedBy = "student_skill", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
		  	private List<Student_Skill> student_skill;
			  	
		  	@ManyToMany
			@JoinTable(
			  name = "exam_skill", 
			  joinColumns = @JoinColumn(name = "skill_id"), 
			  inverseJoinColumns = @JoinColumn(name = "exam_id"))
			  private List<Exam> exam;
		  	
	public List<Student_Skill> getStudent_skill() {
		return student_skill;
	}

	public void setStudent_skill(List<Student_Skill> student_skill) {
		this.student_skill = student_skill;
	}

	public List<Exam> getExam() {
		return exam;
	}

	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}
	
	
	
				  	
	
}
