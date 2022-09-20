package it.ibs.registro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "lesson_student")
public class Lesson_Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String join_time;
	private String exit_time;
	private int daily_grade;
	
	@OneToMany(mappedBy = "lesson_student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Lesson> lesson_id;
	
	@OneToMany(mappedBy = "lesson_student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Student> student_id;
		
	public Lesson_Student() {}		
		public Lesson_Student(Long id, String join_time, String exit_time, int daily_grade, List<Lesson> lesson_id,
			List<Student> student_id) {
		this.id = id;
		this.join_time = join_time;
		this.exit_time = exit_time;
		this.daily_grade = daily_grade;
		this.lesson_id = lesson_id;
		this.student_id = student_id;
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

	public int getDaily_grade() {
		return daily_grade;
	}
	public void setDaily_grade(int daily_grade) {
		this.daily_grade = daily_grade;
	}
	
	public List<Lesson> getLesson_id() {
		return lesson_id;
	}
	public void setLesson_id(List<Lesson> lesson_id) {
		this.lesson_id = lesson_id;
	}
	public List<Student> getStudent_id() {
		return student_id;
	}
	public void setStudent_id(List<Student> student_id) {
		this.student_id = student_id;
	}
}
