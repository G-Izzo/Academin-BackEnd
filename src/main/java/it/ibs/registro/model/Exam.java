package it.ibs.registro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "exam")
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String url;
	
	@OneToMany(mappedBy = "exam_session", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Exam_Session> exam_session;
			
	@ManyToMany
	@JoinTable(name = "exam_skill", 
				joinColumns = @JoinColumn(name = "exam_id"),
				inverseJoinColumns = @JoinColumn(name = "skill_id"))
	private List<Skill> skill;
			
	public Exam() {}	
	public Exam(Long id, String name, String url, List<Exam_Session> exam_session, List<Skill> skill) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.exam_session = exam_session;
		this.skill = skill;
	}	
	
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
	
	public String getUrl() {
		return url;
	}	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public List<Exam_Session> getExam_session() {
		return exam_session;
	}
	public void setExam_session(List<Exam_Session> exam_session) {
		this.exam_session = exam_session;
	}

	public List<Skill> getSkill() {
		return skill;
	}
	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}
}
